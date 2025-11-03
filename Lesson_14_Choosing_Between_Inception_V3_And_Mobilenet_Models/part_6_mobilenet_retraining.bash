python tensorflow/examples/image_retraining/retrain.py \
  --output_graph=/tf_files/my_mobilenet_retrained.pb \
  --output_labels=/tf_files/my_mobilenet_labels.txt \
  --image_dir ~/Downloads/MyImages \
  --architecture mobilenet_1.0_224
