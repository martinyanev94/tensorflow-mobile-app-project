predictions = model.predict(img_array)
decoded_predictions = decode_predictions(predictions, top=3)[0]

for i, (imagenet_id, label, score) in enumerate(decoded_predictions):
    print(f"{i + 1}: {label} ({score:.2f})")
├── dogs/
    │   ├── breed1/
    │   │   ├── img1.jpg
    │   │   ├── img2.jpg
    │   └── breed2/
    │       ├── img1.jpg
    │       ├── img2.jpg
python tensorflow/examples/image_retraining/retrain.py \
  --output_graph=/tf_files/dog_retrained_mobilenet10_224.pb \
  --output_labels=/tf_files/dog_retrained_labels_mobilenet.txt \
  --image_dir ~/path_to_your_dataset \
  --bottleneck_dir=/tf_files/bottlenecks \
  --architecture mobilenet_1.0_224
