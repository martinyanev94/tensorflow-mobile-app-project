# Assuming interpreter has already been invoked
output_data = interpreter.get_tensor(output_details[0]['index'])

# Get the predicted class with the highest probability
predicted_class = np.argmax(output_data[0])
print(f"Predicted class: {predicted_class}")
