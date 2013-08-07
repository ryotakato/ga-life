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
    float move = count as float

    if (disp.random(1) < 0.5) {
      if (this.x + move < 0 || World.WIDTH < this.x + move) {
        move = move * -1
      }
      this.x = this.x + move


    } else {
      if (this.y + move < 0 || World.HEIGHT < this.y + move) {
        move = move * -1
      }
      this.y = this.y + move
    }
  }
}
