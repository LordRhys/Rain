package com.lordrhys.rain.level.tile.spawn_level;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;
import com.lordrhys.rain.level.tile.Tile;

/**
 * Created by Frank on 4/30/2015.
 */
public class SpawnFloorTile extends Tile {

  public SpawnFloorTile(Sprite sprite) {
    super(sprite);
  }

  public void render(int x, int y, Screen screen){
    screen.renderTile(x << 4, y << 4, this);
  }

}
