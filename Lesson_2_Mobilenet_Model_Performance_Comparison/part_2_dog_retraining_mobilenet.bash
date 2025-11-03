python tensorflow/examples/image_retraining/retrain.py \
  --output_graph=/tf_files/dog_retrained_mobilenet10_224.pb \
  --output_labels=/tf_files/dog_retrained_labels_mobilenet.txt \
  --image_dir ~/Downloads/Images \
  --bottleneck_dir=/tf_files/dogs_bottleneck_mobilenet \
  --architecture mobilenet_1.0_224
