import tensorflow as tf
import numpy as np

# Load the trained model
model = tf.keras.models.load_model('/tf_files/dog_retrained_mobilenet10_224.pb')

# Preprocess input image for prediction
input_image = tf.keras.preprocessing.image.load_img('/tmp/lab1.jpg', target_size=(224, 224))
input_array = tf.keras.preprocessing.image.img_to_array(input_image)
input_array = np.expand_dims(input_array, axis=0)

# Predict
predictions = model.predict(input_array)
print(predictions)
