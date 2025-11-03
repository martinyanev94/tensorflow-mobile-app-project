python tensorflow/examples/image_retraining/retrain.py \
--output_graph=/tf_files/mobilenet_quantized.pb \
--output_labels=/tf_files/mobilenet_labels_quantized.txt \
--image_dir ~/path/to/your/images \
--bottleneck_dir=/tf_files/mobilenet_bottleneck \
--architecture mobilenet_1.0_224_quantized
