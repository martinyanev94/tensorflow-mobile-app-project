float[][] output = new float[1][NUM_CLASSES]; 
tflite.run(inputBuffer, output);
for (int i = 0; i < NUM_CLASSES; i++) {
    Log.d("Inference Result", "Class " + i + " probability: " + output[0][i]);
}
