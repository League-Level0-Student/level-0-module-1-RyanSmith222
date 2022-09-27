PImage pepperoni;
 PImage mushroom;
 PImage olive;
 
void setup() {
  
size(700,700);
noStroke();
fill(196,164,132);
ellipse(350,350,500,500);
fill(155,0,0,100);
ellipse(350,350,400,400);
fill(255,255,0,150);
ellipse(350,350,350,350);

pepperoni = loadImage("pepperoni.png");
mushroom = loadImage("mushroom.png");
olive = loadImage("olive.png");

}
void draw() {
 pepperoni.resize(70,70);
 olive.resize(50,50);
mushroom.resize(70,70);

if(mousePressed){
image(pepperoni,300,200);
image(olive,360,430);
image(mushroom, 200,400);
image(pepperoni,420, 358);
image(olive,420,250);
image(mushroom,350,290);
image(pepperoni,220,300);
}
}
