bazel-bin/tensorflow/tools/graph_transforms/transform_graph \
--in_graph=/tf_files/dog_retrained_mobilenet10_224.pb \
--out_graph=/tf_files/dog_retrained_mobilenet10_224_quantized.pb \
--transforms='quantize_weights'
