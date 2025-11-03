public void benchmarkModel() {
    long startTime = System.nanoTime();
    tflite.run(inputData, outputData);
    long duration = System.nanoTime() - startTime;

    System.out.println("Inference Time (ms): " + duration / 1000000);
}
func benchmarkModel(inputData: Data) -> Double {
    let startTime = DispatchTime.now()

    do {
        try interpreter?.copy(inputData, toInputAt: 0)
        try interpreter?.invoke()
    } catch {
        print("Error during model execution: \(error)")
    }

    let endTime = DispatchTime.now()
    let duration = endTime.uptimeNanoseconds - startTime.uptimeNanoseconds
    return Double(duration) / 1_000_000 // Convert to milliseconds
}
