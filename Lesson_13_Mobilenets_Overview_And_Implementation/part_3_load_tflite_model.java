import org.tensorflow.lite.Interpreter;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

// Load your model file
private MappedByteBuffer loadModelFile(File modelFile) throws IOException {
    FileInputStream inputStream = new FileInputStream(modelFile);
    FileChannel fileChannel = inputStream.getChannel();
    long startOffset = 0;
    long declaredLength = modelFile.length();
    return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
}

// Initialize Interpreter
Interpreter tflite = new Interpreter(loadModelFile(new File("path_to_mobilenet_model.tflite")));

// Now you can run inference on input data
