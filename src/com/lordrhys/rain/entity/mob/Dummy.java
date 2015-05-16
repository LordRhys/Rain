package com.lordrhys.rain.entity.mob;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by hbao506 on 5/15/2015.
 */
public class Dummy extends Mob {

  public Dummy(int x, int y) {
    this.x = x << 4;
    this.y = y << 4;
    sprite = Sprite.player_back;
  }

  public void update() {

  }

  public void render(Screen screen) {
    screen.renderMob(x, y, sprite);
  }
}
