import org.tensorflow.lite.Interpreter;

public class TFLiteModel {
    private Interpreter interpreter;

    public TFLiteModel(String modelPath) {
        interpreter = new Interpreter(loadModelFile(modelPath));
    }

    private MappedByteBuffer loadModelFile(String modelPath) {
        AssetFileDescriptor fileDescriptor = this.getAssets().openFd(modelPath);
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    public float[][] classify(float[][] input) {
        float[][] output = new float[1][1001]; // For 1001 classes in MobileNet
        interpreter.run(input, output);
        return output;
    }
}
