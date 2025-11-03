import tensorflow_model_optimization as tfmot

# Load the original model
model = load_model('my_model.h5')

# Apply pruning
pruned_model = tfmot.sparsity.keras.strip_pruning(model)

# Save the pruned model
pruned_model.save('my_pruned_model.h5')
