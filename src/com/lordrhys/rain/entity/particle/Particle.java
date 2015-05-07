package com.lordrhys.rain.entity.particle;

import com.lordrhys.rain.entity.Entity;
import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

import java.util.ArrayList;
import java.util.List;

/**
 * Rain Created by Frank on 5/6/2015.
 */
public class Particle extends Entity {

  private Sprite sprite;

  private int life;
  private int time = 0;

  protected  double xx, yy, xa, ya;

  public Particle(int x, int y, int life){
    this.x = x;
    this.y = y;
    this.xx = x;
    this.yy = y;
    this.life = life + random.nextInt(25) - 10;
    sprite = Sprite.particle_normal;

    this.xa = random.nextGaussian();
    this.ya = random.nextGaussian();
  }



  public void update(){
    time++;
    if (time >= 7400) time = 0;
    if (time > life) remove();
    this.xx += xa;
    this.yy += ya;
  }

  public void render(Screen screen) {
    screen.renderSprite((int)xx, (int)yy, sprite, true);
  }


}
