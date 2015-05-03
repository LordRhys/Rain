package com.lordrhys.rain.entity.projectile;

import com.lordrhys.rain.entity.Entity;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by Frank on 5/2/2015.
 */
public abstract class Projectile extends Entity {

  protected final int xOrigin, yOrigin;
  protected double angle;
  protected Sprite sprite;
  protected double nx, ny;
  protected double speed, rateOfFire, range, damage;

  public Projectile(int x, int y, double dir) {
    xOrigin = x;
    yOrigin = y;
    angle = dir;
    this.x = x - 12;
    this.y = y - 12;
  }

  public Sprite getSprite() {
    return sprite;
  }

  public int getSpriteSize() {
    return sprite.SIZE;
  }

  protected void move(){

  }
}
