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
    frameRate 60
    
    // create life
    10.times {
      plants << new Life(disp: this, x: random(WIDTH), y: random(HEIGHT), c:Color.GREEN)
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
        it.draw()
      }
    }
  }

}

