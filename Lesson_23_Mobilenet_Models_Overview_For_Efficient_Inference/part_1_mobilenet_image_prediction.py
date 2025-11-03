import tensorflow as tf

# Load the MobileNet model
model = tf.keras.applications.MobileNetV2(weights='imagenet', input_shape=(224, 224, 3))

# Preprocess an image for prediction
def preprocess_image(image_path):
    img = tf.keras.preprocessing.image.load_img(image_path, target_size=(224, 224))
    img_array = tf.keras.preprocessing.image.img_to_array(img)
    img_array = tf.expand_dims(img_array, axis=0)
    img_array = tf.keras.applications.mobilenet_v2.preprocess_input(img_array)
    return img_array

# Make a prediction
def predict_image(image_path):
    img_array = preprocess_image(image_path)
    predictions = model.predict(img_array)
    return tf.keras.applications.mobilenet_v2.decode_predictions(predictions, top=5)

# Example usage
predictions = predict_image('path/to/your/image.jpg')
print(predictions)
