from PIL import Image
import numpy as np

def preprocess_image(image_path):
    # Load image
    image = Image.open(image_path)
    image = image.resize((224, 224))  # Resize to match model input
    image = np.array(image) / 255.0  # Normalize pixel values
    image = image.astype(np.float32)  # Convert to float32
    return np.expand_dims(image, axis=0)  # Add batch dimension

# Example usage
image_data = preprocess_image("your_image.jpg")
interpreter.set_tensor(input_details[0]['index'], image_data)
