float[][] output = new float[1][NUM_CLASSES];
tflite.run(input, output);

int topIndex = -1;
float maxConfidence = 0.0f;

for (int i = 0; i < NUM_CLASSES; i++) {
    if (output[0][i] > maxConfidence) {
        maxConfidence = output[0][i];
        topIndex = i;
    }
}
