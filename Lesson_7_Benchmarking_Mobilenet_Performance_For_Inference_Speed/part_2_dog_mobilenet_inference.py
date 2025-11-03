import tensorflow as tf

# Load the retrained MobileNet model
model = tf.saved_model.load("dog_retrained_mobilenet10_224.pb")

# Prepare an example input tensor
input_shape = (1, 224, 224, 3)  # (batch_size, height, width, channels)
input_tensor = tf.random.uniform(input_shape)
