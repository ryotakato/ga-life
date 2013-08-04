import java.awt.Color;

import processing.core.*;


class Main extends PApplet {
  
  def balls = []

  void setup(){
    // create dispaly
    size 500,500
    
    frameRate 60
  }

  void draw() {
    background 150

    if (random(1) < 0.01) {
      balls.add([x: random(200), y: 0])
    }
    balls.each {
      it.y++
      ellipse(it.x, it.y, 10, 10)
    }
  }

  static main(args) {
    PApplet.main("Main")
  }
}

