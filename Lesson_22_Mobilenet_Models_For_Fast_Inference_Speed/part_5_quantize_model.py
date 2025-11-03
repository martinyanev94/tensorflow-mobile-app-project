converter = tf.lite.TFLiteConverter.from_keras_model(your_keras_model)
converter.optimizations = [tf.lite.Optimize.DEFAULT]
tflite_model = converter.convert()

# Save the quantized model
with open('quantized_dog_mobilenet.tflite', 'wb') as f:
    f.write(tflite_model)
