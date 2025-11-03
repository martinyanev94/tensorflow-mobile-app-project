Interpreter tflite = new Interpreter(loadModelFile(context, "retrained_mobilenet_model.tflite"));

// Prepare your input and output arrays
float[][] input = new float[1][224 * 224 * 3];
float[][] output = new float[1][10];  // Assuming 10 classes

// Run inference
tflite.run(input, output);
