# Load a smaller MobileNet model
model = tf.keras.applications.MobileNetV2(weights='imagenet', input_shape=(224, 224, 3), alpha=0.25)
