
void setup() {
PImage face = loadImage("Cat5.jpeg");  
size(800,500);
face.resize(800,500);
image(face,0,0);
  
}
void draw() {
if(mousePressed) {
  println("Mouse's X position: " + mouseX + " Mouse's Y position: " + mouseY);
}

noStroke();


fill(mouseX,mouseY,260);
  ellipse(316, 182, 65, 65);
  ellipse(493, 175, 65, 65);
fill(0,0,0);
ellipse(316,182,20,20);
ellipse(493,175,20,20);
}
