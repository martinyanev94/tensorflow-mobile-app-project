from tensorflow_model_optimization.sparsity import keras as sparsity

# Define the pruning configuration
pruning_schedule = sparsity.Preachers.schedule(
    initial_sparsity=0.0,
    final_sparsity=0.5,
    begin_step=0,
    end_step=1000,
    frequency=100
)

# Apply pruning to the model
pruned_model = sparsity.prune_low_magnitude(model, pruning_schedule=pruning_schedule)

# Compile and fit the pruned model
pruned_model.compile(optimizer='adam',
                     loss='sparse_categorical_crossentropy',
                     metrics=['accuracy'])
history = pruned_model.fit(train_dataset, validation_data=val_dataset, epochs=5)
