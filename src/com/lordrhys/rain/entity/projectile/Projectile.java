package com.lordrhys.rain.entity.projectile;

import com.lordrhys.rain.entity.Entity;
import com.lordrhys.rain.graphics.Sprite;

import java.util.Random;

/**
 * Created by Frank on 5/2/2015.
 */
public abstract class Projectile extends Entity {

  protected final int xOrigin, yOrigin;
  protected double angle;
  protected Sprite sprite;
  protected double x, y;
  protected double nx, ny;
  protected double distance;
  protected double speed, range, damage;

  protected final Random random = new Random();

  public Projectile(int x, int y, double dir) {
    xOrigin = x;
    yOrigin = y;
    angle = dir;
    this.x = x;
    this.y = y;
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
