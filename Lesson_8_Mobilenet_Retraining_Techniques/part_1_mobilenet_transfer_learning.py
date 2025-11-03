import tensorflow as tf
from tensorflow.keras.applications import MobileNet

# Load the MobileNet model pre-trained on ImageNet data
model = MobileNet(weights='imagenet', include_top=False)

# Add additional layers for our specific retraining task
x = model.output
x = tf.keras.layers.GlobalAveragePooling2D()(x)
x = tf.keras.layers.Dense(1024, activation='relu')(x)
predictions = tf.keras.layers.Dense(10, activation='softmax')(x)  # for 10 classes

# Final model with the added layers for transfer learning
final_model = tf.keras.models.Model(inputs=model.input, outputs=predictions)
# Freezing the base layers
for layer in model.layers:
    layer.trainable = False

# Compile the model with an appropriate optimizer and loss function
final_model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
