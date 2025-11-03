import tensorflow as tf
import time

# Load the TFLite model and allocate tensors.
interpreter = tf.lite.Interpreter(model_path="dog_retrained_mobilenet10_224.tflite")
interpreter.allocate_tensors()

# Get input and output tensors.
input_details = interpreter.get_input_details()
output_details = interpreter.get_output_details()

# Prepare input data, here you'd put your actual image data
input_shape = input_details[0]['shape']
input_data = np.array(np.random.random_sample(input_shape), dtype=np.float32)

# Measure inference time
interpreter.set_tensor(input_details[0]['index'], input_data)
start_time = time.time()
interpreter.invoke()
end_time = time.time()

print(f"Inference time: {end_time - start_time} seconds")
