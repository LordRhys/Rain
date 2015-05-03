package com.lordrhys.rain.level.tile;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by hbao506 on 4/28/2015.
 */
public class VoidTile extends Tile{

  public VoidTile(Sprite sprite) {
    super(sprite);
  }

  public void render(int x, int y, Screen screen){
    screen.renderTile(x << 4, y << 4, Tile.voidTile);
  }

}
