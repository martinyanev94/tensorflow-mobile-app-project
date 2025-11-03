long startTime = System.nanoTime();
tflite.run(input, output);
long endTime = System.nanoTime();

double inferenceTime = (endTime - startTime) / 1000000.0; // Convert nanoseconds to milliseconds
System.out.println("Inference time: " + inferenceTime + " ms");
