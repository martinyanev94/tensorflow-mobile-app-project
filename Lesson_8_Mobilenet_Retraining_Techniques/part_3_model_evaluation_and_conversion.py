# Evaluate the model
loss, accuracy = final_model.evaluate(validation_generator)
print(f'Validation accuracy: {accuracy * 100:.2f}%')

# Save the retrained model
final_model.save('retrained_mobilenet_model.h5')
converter = tf.lite.TFLiteConverter.from_saved_model('retrained_mobilenet_model.h5')
tflite_model = converter.convert()

# Save the model to a .tflite file
with open('retrained_mobilenet_model.tflite', 'wb') as f:
    f.write(tflite_model)
