# Evaluate the model on the test set
test_datagen = ImageDataGenerator(rescale=1./255)
test_generator = test_datagen.flow_from_directory(
    'path_to_test_data',
    target_size=(224, 224),
    batch_size=32,
    class_mode='categorical')

loss, accuracy = model.evaluate(test_generator)
print(f'Test accuracy: {accuracy:.2f}')
