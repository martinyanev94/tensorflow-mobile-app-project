long totalTime = 0;
int iterations = 10;

for (int i = 0; i < iterations; i++) {
    long startTime = System.nanoTime();
    model.runInference(sampleInput);
    long elapsedTime = System.nanoTime() - startTime;
    totalTime += elapsedTime;
}

double averageTime = (totalTime / iterations) / 1e6; // Convert to milliseconds
System.out.println("Average inference time: " + averageTime + " ms");
