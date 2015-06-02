package com.lordrhys.rain.entity.mob;

import com.lordrhys.rain.graphics.AnimatedSprite;
import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;
import com.lordrhys.rain.graphics.SpriteSheet;

import java.util.List;

/**
 * Created by hbao506 on 5/21/2015.
 */
public class Chaser extends Mob {

  private AnimatedSprite down  = new AnimatedSprite(SpriteSheet.dummy_down,32, 32, 3);
  private AnimatedSprite up  = new AnimatedSprite(SpriteSheet.dummy_up,32, 32, 3);
  private AnimatedSprite left  = new AnimatedSprite(SpriteSheet.dummy_left,32, 32, 3);
  private AnimatedSprite right  = new AnimatedSprite(SpriteSheet.dummy_right,32, 32, 3);

  private AnimatedSprite animSprite = down;
  private int time = 0;
  private double xa = 0;
  private double ya = 0;
  private double speed = 0.8;

  public Chaser(int x, int y) {
    this.x = x << 4;
    this.y = y << 4;
    sprite = Sprite.dummy;
  }

  public void update() {
    move();
    if (walking) animSprite.update();
    else animSprite.setFrame(0);
    if (ya < 0) {
      animSprite = up;
      dir = Direction.UP;
    }else if (ya > 0) {
      animSprite = down;
      dir = Direction.DOWN;
    }
    if (xa < 0) {
      animSprite = left;
      dir = Direction.LEFT;
    }else if (xa > 0) {
      animSprite = right;
      dir = Direction.RIGHT;
    }

  }

  private void move() {
    xa = 0;
    ya = 0;
    List<Player> players = level.getPlayers(this, 80);

    if (players.size() > 0) {
      Player player = players.get(0);
      if (x < player.getX()) xa += speed;
      if (x > player.getX()) xa -= speed;
      if (y < player.getY()) ya += speed;
      if (y > player.getY()) ya -= speed;
    }

    if (xa != 0 || ya != 0){
      move(xa, ya);
      walking = true;
    }
    else {
      walking = false;
    }
  }

  public void render(Screen screen) {
    sprite = animSprite.getSprite();
    screen.renderMob((int)(x - 24), (int)(y - 32), this);
  }
}
