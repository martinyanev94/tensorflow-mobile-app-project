long startTime = System.nanoTime();
tflite.run(input, output);
long endTime = System.nanoTime();
Log.d("Inference Time", "Time taken: " + (endTime - startTime) + "ns");
