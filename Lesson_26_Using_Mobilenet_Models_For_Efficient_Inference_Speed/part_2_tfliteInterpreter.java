try {
    Interpreter tflite = new Interpreter(loadModelFile());
} catch (Exception e) {
    e.printStackTrace();
}
