bazel-bin/tensorflow/tools/benchmark/benchmark_model \
  --graph=/path_to_your_model.pb \
  --input_layer="Mul" \
  --input_layer_shape="1,224,224,3" \
  --output_layer="final_result" \
  --show_summary=true
