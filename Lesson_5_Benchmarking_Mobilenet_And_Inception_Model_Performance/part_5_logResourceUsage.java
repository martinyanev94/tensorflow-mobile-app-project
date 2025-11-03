import android.os.Debug;

public void logResourceUsage() {
    long memUsage = Debug.getNativeHeapAllocatedSize();
    System.out.println("Memory Usage (bytes): " + memUsage);
}
func logResourceUsage() {
    let memoryFootprint = taskInfo.physicalFootprint / 1024 // Convert to KB
    print("Memory Usage (KB): \(memoryFootprint)")
}
