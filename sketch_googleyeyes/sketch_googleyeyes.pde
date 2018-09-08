
void setup(){
size(800,600);










}
void draw(){
  fill(255,255,255);
  ellipse(250,260,130,100);
fill(255,255,255);
ellipse(540,260,130,100);
fill(10,10,10);
ellipse(mouseX,mouseY,55,55);
fill(10,10,10);
ellipse(537,260,55,55);
if(mouseX<204){
mouseX=204;}
 if(mouseY<229){mouseY=229;}
  if(mousePressed){
println(mouseX+""+mouseY);}

}