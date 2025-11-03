# Convert the model to a TFLite model and apply quantization
converter = tf.lite.TFLiteConverter.from_keras_model(model)
converter.optimizations = [tf.lite.Optimize.DEFAULT]
tflite_model = converter.convert()

# Save the quantized model
with open('dog_retrained_mobilenet10_224_quant.tflite', 'wb') as f:
    f.write(tflite_model)
