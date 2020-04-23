void setup() {
  size(1500,500);
  background(200,200,200);
}

void draw() {
  fill(200,200,200);
  int locationA = 250;
  int locationB = 1250;
  int size = 500;
   while() {
     
     for(int i = 0; i < 50; i++) {
       size = size - 10;
       ellipse(locationA, 250, size, size);
       ellipse(locationB, 250, size, size);
     }
   }
}
