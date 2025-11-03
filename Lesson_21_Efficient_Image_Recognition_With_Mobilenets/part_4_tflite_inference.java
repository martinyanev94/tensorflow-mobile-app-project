try {
    Interpreter tflite = new Interpreter(loadModelFile(activity.getAssets(), "my_retrained_model.tflite"));
    
    // Preparing input and output arrays
    float[][][][] input = new float[1][224][224][3];
    float[][] output = new float[1][10]; // assuming 10 classes

    // Run inference
    tflite.run(input, output);
    
    // Post-processing to interpret the output
    int predictedClass = argmax(output[0]);
} catch (Exception e) {
    e.printStackTrace();
}
