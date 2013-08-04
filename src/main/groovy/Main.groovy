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
      plants.add([x: random(500), y: random(500), c:Color.GREEN])
    }
    10.times {
      herbivores.add([x: random(500), y: random(500), c:Color.YELLOW])
    }
    10.times {
      carnivores.add([x: random(500), y: random(500), c:Color.RED])
    }
  }

  void draw() {
    background(Color.BLACK.getRGB())

    plants.each {
      it.x++;
      it.y++;
      stroke(it.c.getRGB());
      fill(it.c.getRGB());
      ellipse(it.x as float, it.y as float, 10, 10);
    }
    herbivores.each {
      it.x++;
      it.y++;
      stroke(it.c.getRGB());
      fill(it.c.getRGB());
      ellipse(it.x as float, it.y as float, 10, 10);
    }
    carnivores.each {
      it.x++;
      it.y++;
      stroke(it.c.getRGB());
      fill(it.c.getRGB());
      ellipse(it.x as float, it.y as float, 10, 10);
    }
  }

}

