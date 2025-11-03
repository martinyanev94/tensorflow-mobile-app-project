python tensorflow/examples/image_retraining/retrain.py \
--output_graph=/tf_files/mobilenet_retrained.pb \
--output_labels=/tf_files/mobilenet_labels.txt \
--image_dir ~/path/to/your/images \
--bottleneck_dir=/tf_files/mobilenet_bottleneck \
--architecture mobilenet_1.0_224
bazel-bin/tensorflow/examples/label_image/label_image \
--graph=/tf_files/mobilenet_retrained.pb \
--image=/path/to/your/test_image.jpg \
--input_layer=input \
--output_layer=final_result \
--labels=/tf_files/mobilenet_labels.txt \
--input_height=224 \
--input_width=224 \
--input_mean=128 \
--input_std=128
