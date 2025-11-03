pip install tensorflow
bazel build -c opt tensorflow/tools/benchmark:benchmark_model
bazel-bin/tensorflow/tools/benchmark/benchmark_model \
--graph=/tf_files/quantized_stripped_dogs_retrained.pb \
--input_layer="Mul" \
--input_layer_shape="1,299,299,3" \
--input_layer_type="float" \
--output_layer="final_result" \
--show_run_order=false \
--show_time=false \
--show_memory=false \
--show_summary=true
bazel-bin/tensorflow/tools/benchmark/benchmark_model \
--graph=/tf_files/dog_retrained_mobilenet10_224.pb \
--input_layer="Mul" \
--input_layer_shape="1,224,224,3" \
--input_layer_type="float" \
--output_layer="final_result" \
--show_run_order=false \
--show_time=false \
--show_memory=false \
--show_summary=true
