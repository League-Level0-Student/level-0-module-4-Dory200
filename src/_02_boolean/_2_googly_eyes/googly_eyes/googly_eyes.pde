
void setup() {
  PImage face;
  face = loadImage("kanye.jpg");
  size(800,600);
  face.resize(800,600);
}

void draw() {
  fill(#FFFFFF);
  println(mouseX, mouseY);
}
