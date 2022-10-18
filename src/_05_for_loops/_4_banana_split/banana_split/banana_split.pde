
int x = 250;
int y = 200;

size(800,800);

  
fill(90,200,40);
rect(0,0,800,800);
fill(255,0,0);
textSize(100);


fill(255,75,150);
textSize(100);
 for(int iceCream = 0; iceCream < 3; iceCream += 1) {
   text("Ice Cream", x, y);
   y += 200;
 }

text("Banana", x, 800);
