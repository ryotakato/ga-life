import java.awt.Color;
import processing.core.PApplet;

class Life {
  float x
  float y
  Color c
  PApplet disp

  void draw() {
    disp.stroke(this.c.getRGB());
    disp.fill(this.c.getRGB());
    disp.ellipse(this.x, this.y, 10, 10);
  }
  
  void walk(count) {
    if (disp.random(1) < 0.5) {
      this.x = this.x + count as float
    } else {
      this.y = this.y + count as float
    }
  }
}
