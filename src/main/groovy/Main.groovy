import java.awt.Color;

import processing.core.*;


class Main extends PApplet {

  static main(args) {
    PApplet.main("Main")
  }


  def plants = []
  def herbivores = []
  def carnivores = []

  void setup(){
    // create dispaly
    size 500,500
    frameRate 60
    
    // create life
    10.times {
      plants << new Life(disp: this, x: random(500), y: random(500), c:Color.GREEN)
    }
    10.times {
      herbivores << new Life(disp: this, x: random(500), y: random(500), c:Color.YELLOW)
    }
    10.times {
      carnivores << new Life(disp: this, x: random(500), y: random(500), c:Color.RED)
    }
  }

  void draw() {
    background(Color.BLACK.getRGB())

    plants.each {
      it.walk random(5)
      it.draw()
    }
    herbivores.each {
      it.walk random(5)
      it.draw()
    }
    carnivores.each {
      it.walk random(5)
      it.draw()
    }
  }

}

