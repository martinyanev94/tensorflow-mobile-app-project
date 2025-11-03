python tensorflow/examples/image_retraining/retrain.py \
  --output_graph=/tf_files/pet_retrained_mobilenet.pb \
  --output_labels=/tf_files/pet_retrained_labels.txt \
  --image_dir /path_to_your_images \
  --bottleneck_dir=/tf_files/pet_bottleneck_dir \
  --architecture mobilenet_1.0_224
