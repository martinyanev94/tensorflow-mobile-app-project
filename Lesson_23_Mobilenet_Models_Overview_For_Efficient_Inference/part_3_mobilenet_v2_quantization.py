import tensorflow as tf
from tensorflow_model_optimization.sparsity import keras as sparsity

# Load your existing MobileNet model
model = tf.keras.applications.MobileNetV2(weights='imagenet')

# Convert the model to a quantized version
converter = tf.lite.TFLiteConverter.from_keras_model(model)
converter.optimizations = [tf.lite.Optimize.DEFAULT]
tflite_model = converter.convert()

# Save the quantized model
with open('mobilenet_v2_quantized.tflite', 'wb') as f:
    f.write(tflite_model)
