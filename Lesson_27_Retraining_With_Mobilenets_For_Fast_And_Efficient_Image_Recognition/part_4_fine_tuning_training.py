base_model.trainable = True
# Compile the model again with a lower learning rate
model.compile(optimizer=tf.keras.optimizers.Adam(1e-5),
              loss='categorical_crossentropy',
              metrics=['accuracy'])

# Continue training
fine_tune_epochs = 10
total_epochs = 10 + fine_tune_epochs

history_fine = model.fit(
    train_generator,
    steps_per_epoch=train_generator.samples // 32,
    epochs=total_epochs,
    validation_data=validation_generator,
    validation_steps=validation_generator.samples // 32)
