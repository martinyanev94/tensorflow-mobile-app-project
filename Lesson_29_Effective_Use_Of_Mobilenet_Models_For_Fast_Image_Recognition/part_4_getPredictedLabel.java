public String getPredictedLabel(float[][] output, String[] labels) {
    int maxIndex = 0;
    float maxProb = output[0][0];

    for (int i = 1; i < output[0].length; i++) {
        if (output[0][i] > maxProb) {
            maxProb = output[0][i];
            maxIndex = i;
        }
    }
    return String.format("Predicted: %s with probability %.2f", labels[maxIndex], maxProb);
}
