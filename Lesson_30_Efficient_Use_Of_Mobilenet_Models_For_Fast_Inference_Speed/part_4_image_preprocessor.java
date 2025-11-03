private float[][][][] preprocessImage(Bitmap bitmap) {
    Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true);
    float[][][][] input = new float[1][224][224][3];

    for (int y = 0; y < 224; y++) {
        for (int x = 0; x < 224; x++) {
            int pixel = resizedBitmap.getPixel(x, y);
            input[0][y][x][0] = ((Color.red(pixel) / 255.0f) - 0.5f) * 2; // Normalize to [-1, 1]
            input[0][y][x][1] = ((Color.green(pixel) / 255.0f) - 0.5f) * 2;
            input[0][y][x][2] = ((Color.blue(pixel) / 255.0f) - 0.5f) * 2;
        }
    }
    return input;
}
