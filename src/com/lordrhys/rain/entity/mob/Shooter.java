package com.lordrhys.rain.entity.mob;

import com.lordrhys.rain.entity.Entity;
import com.lordrhys.rain.graphics.AnimatedSprite;
import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;
import com.lordrhys.rain.graphics.SpriteSheet;
import com.lordrhys.rain.util.Vector2i;

import java.util.List;

/**
 * Created by hbao506 on 6/5/2015.
 */
public class Shooter extends Mob {

  private AnimatedSprite down  = new AnimatedSprite(SpriteSheet.dummy_down,32, 32, 3);
  private AnimatedSprite up  = new AnimatedSprite(SpriteSheet.dummy_up,32, 32, 3);
  private AnimatedSprite left  = new AnimatedSprite(SpriteSheet.dummy_left,32, 32, 3);
  private AnimatedSprite right  = new AnimatedSprite(SpriteSheet.dummy_right,32, 32, 3);

  private AnimatedSprite animSprite = down;
  private int time = 0;
  private double xa = 0;
  private double ya = 0;
  private double speed = 0.8;

  private Entity rand = null;

  public Shooter(int x, int y) {
    this.x = x << 4;
    this.y = y << 4;
    sprite = Sprite.dummy;
  }

  public void update() {
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
      //move(xa, ya);
      walking = true;
    }
    else {
      walking = false;
    }
    shootRandom();
  }

  private void shootRandom() {
    List<Entity> entities = level.getEntities(this,500);
    entities.add(level.getClientPlayer());
    if (time % (30 + random.nextInt(91)) == 0) {

      int index = random.nextInt(entities.size());
      rand = entities.get(index);
    }

    if (rand != null) {
      double dx = rand.getX() - x;
      double dy = rand.getY() - y;
      double dir = Math.atan2(dy, dx);
      shoot(x, y, dir);
    }
  }

  private void shootClosest(){
    List<Entity> entities = level.getEntities(this,50);
    entities.add(level.getClientPlayer());

    double min = 0;
    Entity closest = null;

    for (int i = 0; i < entities.size(); i++){
      Entity e = entities.get(i);
      double distance = Vector2i.getDistance(new Vector2i((int)x, (int)y), new Vector2i((int)e.getX(), (int)e.getY()));
      if (i == 0 || distance < min) min = distance;
      closest = e;
    }
    if (closest != null) {
      double dx = closest.getX() - x;
      double dy = closest.getY() - y;
      double dir = Math.atan2(dy, dx);
      shoot(x, y, dir);
    }
  }

  public void render(Screen screen) {
    screen.renderMob((int)(x - 24), (int)(y - 32), this);
  }
}
