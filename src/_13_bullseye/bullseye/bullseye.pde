int size = 450;
void setup() {
  size(500, 500);
}
void draw() {
  if (size > 0) {
    if ((size/50) % 2 == 0) {
      fill(0,0,0);
    }
    else {
      fill(255,0,0);
    }
    size = size - 50;
    ellipse(250, 250, size, size);
  }
}
