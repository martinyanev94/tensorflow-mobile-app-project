import tensorflow as tf
from tensorflow.keras.applications import MobileNetV1
from tensorflow.keras.preprocessing.image import ImageDataGenerator

# Load the MobileNet model with pre-trained weights
base_model = MobileNetV1(weights='imagenet', include_top=False, input_shape=(224, 224, 3))

# Freeze the base model
base_model.trainable = False

# Add a custom classification layer on top
model = tf.keras.Sequential([
    base_model,
    tf.keras.layers.GlobalAveragePooling2D(),
    tf.keras.layers.Dense(256, activation='relu'),
    tf.keras.layers.Dense(10, activation='softmax')  # Assume 10 classes for example
])
