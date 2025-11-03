import android.graphics.Bitmap;

public float[][] preprocessImage(Bitmap bitmap) {
    Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true);
    int[] intValues = new int[224 * 224];
    resizedBitmap.getPixels(intValues, 0, resizedBitmap.getWidth(), 0, 0, resizedBitmap.getWidth(), resizedBitmap.getHeight());
    
    float[][] input = new float[1][224 * 224 * 3];
    for (int i = 0; i < intValues.length; ++i) {
        final int val = intValues[i];
        input[0][i * 3] = ((val >> 16) & 0xFF) / 255.0f; // Red
        input[0][i * 3 + 1] = ((val >> 8) & 0xFF) / 255.0f; // Green
        input[0][i * 3 + 2] = (val & 0xFF) / 255.0f; // Blue
    }
    return input;
}
