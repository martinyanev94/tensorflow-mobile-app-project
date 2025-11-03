Interpreter tflite = new Interpreter(loadModelFile("dog_retrained_mobilenet10_224.tflite"));
float[][] result = new float[1][NUM_CLASSES]; // Assume NUM_CLASSES is set correctly
tflite.run(inputData, result);
Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true);
ByteBuffer inputData = ByteBuffer.allocateDirect(4 * 224 * 224 * 3);
inputData.order(ByteOrder.nativeOrder());
for (int i = 0; i < 224; i++) {
    for (int j = 0; j < 224; j++) {
        int pixelValue = resizedBitmap.getPixel(i, j);
        inputData.putFloat(((Color.red(pixelValue) - 128) / 128));
        inputData.putFloat(((Color.green(pixelValue) - 128) / 128));
        inputData.putFloat(((Color.blue(pixelValue) - 128) / 128));
    }
}
