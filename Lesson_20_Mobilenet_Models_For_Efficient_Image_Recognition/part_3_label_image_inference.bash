bazel-bin/tensorflow/examples/label_image/label_image \
--graph=/tf_files/dog_retrained_mobilenet10_224.pb \
--image=/path_to_test_image.jpg \
--input_layer=input \
--output_layer=final_result \
--labels=/tf_files/dog_retrained_labels_mobilenet.txt \
--input_height=224 \
--input_width=224 \
--input_mean=128 \
--input_std=128
