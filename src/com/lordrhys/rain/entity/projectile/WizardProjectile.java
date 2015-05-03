package com.lordrhys.rain.entity.projectile;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by Frank on 5/2/2015.
 */
public class WizardProjectile extends Projectile {

  public WizardProjectile(int x, int y, double dir) {
    super(x, y, dir);
    range = 200;
    speed = 2;
    damage = 20;
    rateOfFire = 10;
    sprite = Sprite.projectile_wizard;

    nx = speed * Math.cos(angle);
    ny = speed * Math.sin(angle);
  }

  public void update(){
    move();
  }

  protected void move(){
    x += nx;
    y += ny;
  }

  public void render(Screen screen){
    screen.renderProjectile(x, y, this);
  }
}
