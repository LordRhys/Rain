package com.lordrhys.rain.level.tile;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by Frank on 4/29/2015.
 */
public class FlowerTile extends Tile {

  public FlowerTile(Sprite sprite) {
    super(sprite);
  }

  public void render(int x, int y, Screen screen){
    screen.renderTile(x << 4, y << 4, Sprite.flower);
  }
}
