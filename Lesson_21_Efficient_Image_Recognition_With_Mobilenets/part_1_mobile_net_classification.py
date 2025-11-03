import tensorflow as tf
from tensorflow import keras

# Load the pre-trained MobileNetV2 model and specify that we do not want to include the top layers
base_model = keras.applications.MobileNetV2(input_shape=(224, 224, 3), include_top=False, weights='imagenet')

# Add classification layers on top of the base model
model = keras.Sequential([
    base_model,
    keras.layers.GlobalAveragePooling2D(),
    keras.layers.Dense(10, activation='softmax')  # assuming we have 10 classes
])

# Compile the model
model.compile(optimizer='adam', loss='sparse_categorical_crossentropy', metrics=['accuracy'])
