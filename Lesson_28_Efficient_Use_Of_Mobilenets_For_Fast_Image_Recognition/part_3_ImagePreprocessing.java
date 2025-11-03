Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true);
float[] input = new float[1][224][224][3];
for (int y = 0; y < 224; y++) {
    for (int x = 0; x < 224; x++) {
        int pixelValue = resizedBitmap.getPixel(x, y);
        input[0][y][x][0] = (Color.red(pixelValue) / 255.0f);
        input[0][y][x][1] = (Color.green(pixelValue) / 255.0f);
        input[0][y][x][2] = (Color.blue(pixelValue) / 255.0f);
    }
}
