long startTime = System.currentTimeMillis();
tflite.run(input, output);
long endTime = System.currentTimeMillis();
Log.d("InferenceTime", "Inference took: " + (endTime - startTime) + " ms");
