converter = tf.lite.TFLiteConverter.from_keras_model(model)
converter.optimizations = [tf.lite.Optimize.DEFAULT]
tflite_model_quantized = converter.convert()

with open('mobilenet_quantized.tflite', 'wb') as f:
    f.write(tflite_model_quantized)
