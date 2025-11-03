history = model.fit(
    train_generator,
    steps_per_epoch=train_generator.samples // 32,
    epochs=10,
    validation_data=validation_generator,  # Assuming you have validation data set up
    validation_steps=validation_generator.samples // 32)
