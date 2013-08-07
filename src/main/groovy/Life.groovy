import java.awt.Color;
import processing.core.PApplet;

import ext.IntRangeExt

class Life {

  float x
  float y
  float w
  float h
  Color c
  float pace
  boolean direction

  Life() {
    
    this.w = 10
    this.h = 10

    use(IntRangeExt) {
      this.pace = (0..10).random() - 5 // max:5, min:-5
    }
  }
  

  void walk() {

    use(IntRangeExt) {
      veer((0..100).random() < 5) // 5%
      reverse((0..100).random() < 5) // 5%
    }

    if (direction) {
      this.x = move(this.x, World.WIDTH)
    } else {
      this.y = move(this.y, World.HEIGHT)
    }
  }


  int move(float before, int limit) {
    float after = before + this.pace
    if (after < 0 || limit < after) {
      reverse(true)
    }
    return before + this.pace
  }

  void reverse(cond) {
    if (cond) {
      this.pace = this.pace * -1
    }
  }

  void veer(cond) {
    if (cond) {
      this.direction = !this.direction
    }
  }
}
