import tensorflow as tf
from tensorflow.keras.applications import MobileNet

# Load the MobileNet model, pretrained on ImageNet
base_model = MobileNet(weights='imagenet', include_top=False, input_shape=(224, 224, 3))

# Add custom layers on top
x = base_model.output
x = tf.keras.layers.GlobalAveragePooling2D()(x)
x = tf.keras.layers.Dropout(0.5)(x)
predictions = tf.keras.layers.Dense(1, activation='sigmoid')(x)

# Final model
model = tf.keras.Model(inputs=base_model.input, outputs=predictions)
