bazel build -c opt tensorflow/tools/benchmark:benchmark_model
bazel-bin/tensorflow/tools/benchmark/benchmark_model \
--graph=/tf_files/my_retrained_model.pb \
--input_layer="Mul" \
--input_layer_shape="1,224,224,3" \
--input_layer_type="float" \
--output_layer="final_result" \
--show_run_order=false \
--show_time=false \
--show_memory=false \
--show_summary=true
