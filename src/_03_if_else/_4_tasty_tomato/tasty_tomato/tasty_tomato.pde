void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(160,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(60,60,0);
    rect(176, 103, 12, 32);
    fill(200,200,200);
    if(mousePressed){
    ellipse(77,200,30,30);
    }
}
