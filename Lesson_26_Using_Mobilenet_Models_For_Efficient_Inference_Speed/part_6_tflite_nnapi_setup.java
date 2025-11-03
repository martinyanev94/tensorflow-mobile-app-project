TensorFlowLite.Options options = new TensorFlowLite.Options();
options.setUseNNAPI(true);
Interpreter tflite = new Interpreter(loadModelFile(), options);
