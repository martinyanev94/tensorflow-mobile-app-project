public void evaluateAccuracy(float[] predictions, float[] actualOutputs) {
    int correctPredictions = 0;
    for (int i = 0; i < predictions.length; i++) {
        if (predictions[i] == actualOutputs[i]) {
            correctPredictions++;
        }
    }
    float accuracy = (float) correctPredictions / predictions.length * 100;
    System.out.println("Model Accuracy: " + accuracy + "%");
}
func evaluateAccuracy(predictions: [Float], actualOutputs: [Float]) -> Float {
    var correctPredictions = 0

    for (index, prediction) in predictions.enumerated() {
        if prediction == actualOutputs[index] {
            correctPredictions += 1
        }
    }

    return Float(correctPredictions) / Float(predictions.count) * 100
}
