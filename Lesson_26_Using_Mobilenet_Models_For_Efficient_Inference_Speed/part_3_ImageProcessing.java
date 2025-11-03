Bitmap image = BitmapFactory.decodeFile(imagePath);
Bitmap resizedImage = Bitmap.createScaledBitmap(image, 224, 224, false);
ByteBuffer inputBuffer = convertBitmapToByteBuffer(resizedImage);
private ByteBuffer convertBitmapToByteBuffer(Bitmap bitmap) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4 * 224 * 224 * 3);
    byteBuffer.order(ByteOrder.nativeOrder());
    
    int[] intValues = new int[224 * 224];
    bitmap.getPixels(intValues, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
    
    for (int pixelValue : intValues) {
        byteBuffer.putFloat(((pixelValue >> 16) & 0xFF) / 255.0f);
        byteBuffer.putFloat(((pixelValue >> 8) & 0xFF) / 255.0f);
        byteBuffer.putFloat((pixelValue & 0xFF) / 255.0f);
    }
    
    return byteBuffer;
}
