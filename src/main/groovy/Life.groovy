import java.awt.Color;
import processing.core.PApplet;

import ext.IntRangeExt

class Life {

  float x
  float y
  Color c
  float move
  boolean direction
  PApplet disp

  Life() {
    
    use(IntRangeExt) {
      this.move = (0..10).random() - 5
    }
  }

  void draw() {
    disp.stroke(this.c.getRGB());
    disp.fill(this.c.getRGB());
    disp.ellipse(this.x, this.y, 10, 10);
  }
  
  void walk() {

    use(IntRangeExt) {
      if ((0..100).random() < 5) {
        this.direction = !this.direction
      }

      if ((0..100).random() < 5) {
        reverse()
      }
    }

    if (direction) {
      if (this.x + this.move < 0 || World.WIDTH < this.x + this.move) {
        reverse()
      }
      this.x = this.x + this.move

    } else {
      if (this.y + this.move < 0 || World.HEIGHT < this.y + this.move) {
        reverse()
      }
      this.y = this.y + this.move
    }
  }

  void reverse() {
    this.move = this.move * -1
  }
}
