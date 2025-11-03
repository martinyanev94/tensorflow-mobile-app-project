try (Interpreter tflite = new Interpreter(loadModelFile())) {
    float[][] input = new float[1][224 * 224 * 3]; // Your input data
    float[][] output = new float[1][NUM_CLASSES];
    tflite.run(input, output);
}
