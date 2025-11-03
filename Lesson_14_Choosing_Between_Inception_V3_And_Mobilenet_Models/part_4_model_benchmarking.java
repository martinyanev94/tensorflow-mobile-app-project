// Benchmarking the Inception V3 Model
String[] inceptionParams = new String[]{
    "--graph=" + MODEL_PATH + "/inception_v3.tflite",
    "--input_layer=input",
    "--input_layer_shape=1,299,299,3",
    "--output_layer=final_result"
};

// Execute Inception V3 Benchmark
runBenchmark(inceptionParams);

// Benchmarking the MobileNet Model
String[] mobileNetParams = new String[]{
    "--graph=" + MODEL_PATH + "/mobilenet_v1.tflite",
    "--input_layer=input",
    "--input_layer_shape=1,224,224,3",
    "--output_layer=final_result"
};

// Execute MobileNet Benchmark
runBenchmark(mobileNetParams);
