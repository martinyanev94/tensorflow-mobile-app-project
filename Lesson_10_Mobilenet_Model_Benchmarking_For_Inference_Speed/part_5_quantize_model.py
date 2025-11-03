import tensorflow as tf

# Convert the model
converter = tf.lite.TFLiteConverter.from_saved_model("path/to/saved_model")
converter.optimizations = [tf.lite.Optimize.DEFAULT]  # Default optimization includes quantization
tflite_model = converter.convert()

# Save the model
with open("model_quantized.tflite", "wb") as f:
    f.write(tflite_model)
