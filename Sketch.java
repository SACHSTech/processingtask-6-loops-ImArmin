import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
  * Called once at the beginning of execution, put your size all in this method
  */
  public void settings() {
  // put your size call here
    size(400, 400);
  }

  /** 
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
  
    for (int lineX = 20; lineX <= 180; lineX += 20) {
        line(lineX, 0, lineX, height);
    }
    for (int lineY = 20; lineY <= 180; lineY += 20) {
        line(0, lineY, height, lineY);
    }

    fill(255, 255, 255);
    rect(200, 0, 200, 200);

    for (int circleY = 20; circleY <= 200; circleY +=40) {
      for (int circleX = 220; circleX <= 400; circleX +=40) {
        fill(255, 102, 102);
        ellipse(circleX, circleY, 25, 25);
      }
    }

    fill(255, 255, 255);
    rect(0, 200, 200, 200);

    /**
    background(100);
    stroke(255);
  
    for(int i = 0.03); i <= 12; i+= 0.005) {
      strokeWeight(i * 1);

      int lineX = i * 200;
      line(lineX, 0, lineX, height);
    }
    

    
    fill(0, 102, 0);
    ellipse(300, 300, 40, 40);

    translate(width/2, height/2);
    rotate(PI/3.0);
    fill(255, 102, 0);
    ellipse(-104, -104, 208, 208);
    */



  }
}