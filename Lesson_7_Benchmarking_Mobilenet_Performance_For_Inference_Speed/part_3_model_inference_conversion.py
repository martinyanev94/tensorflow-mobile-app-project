import time

# Timing the inference
start_time = time.time()

# Run inference
output = model(input_tensor)

# Calculate the elapsed time
elapsed_time = time.time() - start_time
print(f"Inference time: {elapsed_time:.5f} seconds")
converter = tf.lite.TFLiteConverter.from_saved_model("dog_retrained_mobilenet10_224.pb")
tflite_model = converter.convert()

# Save the model
with open("dog_retrained_mobilenet10_224.tflite", "wb") as f:
    f.write(tflite_model)
