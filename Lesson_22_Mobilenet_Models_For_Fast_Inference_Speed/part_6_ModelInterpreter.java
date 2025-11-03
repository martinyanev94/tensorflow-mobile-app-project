public class ModelInterpreter {
    private Interpreter tflite;

    public ModelInterpreter(String modelPath) {
        try {
            tflite = new Interpreter(loadModelFile(modelPath)); // Load model
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float[] classify(float[][] input) {
        float[][] output = new float[1][NUM_CLASSES]; // Replace NUM_CLASSES with your output size
        tflite.run(input, output); // Run inference
        return output[0];
    }
}
