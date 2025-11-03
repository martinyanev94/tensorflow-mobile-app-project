bazel-bin/tensorflow/examples/label_image/label_image \
  --graph=/tf_files/dog_retrained_mobilenet10_224.pb \
  --image=/tmp/lab1.jpg \
  --input_layer=input \
  --output_layer=final_result \
  --labels=/tf_files/dog_retrained_labels_mobilenet.txt \
  --input_height=224 \
  --input_width=224 \
  --input_mean=128 \
  --input_std=128
n02099601 golden retriever (64): 0.144245
n02104029 kuvasz (76): 0.0103533
n02087394 rhodesian ridgeback (105): 0.00528782
n02090379 redbone (32): 0.0035457
