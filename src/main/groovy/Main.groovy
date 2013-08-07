import java.awt.Color;

import processing.core.*;


class Main extends PApplet {

  static main(args) {
    PApplet.main("Main")
  }

  int HEIGHT = World.HEIGHT
  int WIDTH = World.WIDTH

  def plants = []
  def herbivores = []
  def carnivores = []

  void setup(){
    // create dispaly
    size WIDTH,HEIGHT
    // set world speed
    frameRate World.SPEED
    
    // create life
    10.times {
      plants << new Life(disp: this, x: random(WIDTH), y: random(HEIGHT), c:Color.GREEN, pace:0)
    }
    10.times {
      herbivores << new Life(disp: this, x: random(WIDTH), y: random(HEIGHT), c:Color.YELLOW)
    }
    10.times {
      carnivores << new Life(disp: this, x: random(WIDTH), y: random(HEIGHT), c:Color.RED)
    }
  }

  void draw() {
    background(Color.BLACK.getRGB())

    [plants, herbivores, carnivores].each {
      it.each {
        it.walk()
        drawLife(it)
      }
    }
  }

  void drawLife(l) {
    this.stroke(l.c.getRGB());
    this.fill(l.c.getRGB());
    this.ellipse(l.x, l.y, l.w, l.h);
  }

}

