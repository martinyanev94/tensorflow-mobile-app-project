public void displayResults(float mobileNetTime, float inceptionTime, float mobileNetAccuracy, float inceptionAccuracy) {
    System.out.println("Results:");
    System.out.println("MobileNet Time: " + mobileNetTime + " ms, Accuracy: " + mobileNetAccuracy + "%");
    System.out.println("Inception Time: " + inceptionTime + " ms, Accuracy: " + inceptionAccuracy + "%");
}
func displayResults(mobileNetTime: Double, inceptionTime: Double, mobileNetAccuracy: Float, inceptionAccuracy: Float) {
    print("Results:")
    print("MobileNet Time: \(mobileNetTime) ms, Accuracy: \(mobileNetAccuracy)%")
    print("Inception Time: \(inceptionTime) ms, Accuracy: \(inceptionAccuracy)%")
}
