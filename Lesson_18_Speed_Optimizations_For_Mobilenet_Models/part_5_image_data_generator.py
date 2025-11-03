from tensorflow.keras.preprocessing.image import ImageDataGenerator

# Define the data generator with target size adjustment
datagen = ImageDataGenerator(rescale=1.0/255.0)

train_dataset = datagen.flow_from_directory(
    'path_to_train_data',
    target_size=(160, 160),
    batch_size=32,
    class_mode='sparse'
)
