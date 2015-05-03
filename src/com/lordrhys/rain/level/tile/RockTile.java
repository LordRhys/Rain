package com.lordrhys.rain.level.tile;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by Frank on 4/29/2015.
 */
public class RockTile extends Tile {

  public RockTile(Sprite sprite) {
    super(sprite);
  }

  public void render(int x, int y, Screen screen){
    screen.renderTile(x << 4, y << 4, Sprite.rock);
  }

  public boolean solid(){
    return true;
  }

}
