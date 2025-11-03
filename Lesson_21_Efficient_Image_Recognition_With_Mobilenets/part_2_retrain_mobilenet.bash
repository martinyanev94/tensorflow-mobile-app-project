python tensorflow/examples/image_retraining/retrain.py \
  --output_graph=/tf_files/my_retrained_model.pb \
  --output_labels=/tf_files/my_retrained_labels.txt \
  --image_dir ~/path/to/my/images \
  --bottleneck_dir=/tf_files/bottleneck \
  --architecture mobilenet_1.0_224
