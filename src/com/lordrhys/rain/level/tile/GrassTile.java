package com.lordrhys.rain.level.tile;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;

/**
 * Created by hbao506 on 4/27/2015.
 */
public class GrassTile extends Tile{

  public GrassTile(Sprite sprite) {
    super(sprite);
  }

  public void render(int x, int y, Screen screen){
    screen.renderTile(x << 4, y << 4, Sprite.grass);
  }
}
