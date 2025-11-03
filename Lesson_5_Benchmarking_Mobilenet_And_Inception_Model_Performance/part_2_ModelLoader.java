import org.tensorflow.lite.Interpreter;
import java.io.FileInputStream;
import java.io.IOException;

public class ModelLoad {
    private Interpreter tflite;

    public void loadModel(String modelPath) throws IOException {
        tflite = new Interpreter(new FileInputStream(modelPath));
    }
}
import TensorFlowLite

class ModelLoader {
    var interpreter: Interpreter!

    func loadModel(modelPath: String) throws {
        interpreter = try Interpreter(modelPath: modelPath)
    }
}
