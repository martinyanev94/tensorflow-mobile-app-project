private float[][] output = new float[1][NUM_CLASSES]; // NUM_CLASSES being the number of pet types
tflite.run(inputData, output);
