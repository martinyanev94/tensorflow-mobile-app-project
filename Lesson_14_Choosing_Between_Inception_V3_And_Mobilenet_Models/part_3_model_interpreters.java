// Load Inception V3 Model
Interpreter inceptionInterpreter = new Interpreter(loadModelFile("inception_v3.tflite"));

// Load MobileNet V1 Model
Interpreter mobileNetInterpreter = new Interpreter(loadModelFile("mobilenet_v1.tflite"));
