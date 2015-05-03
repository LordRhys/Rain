package com.lordrhys.rain.level.tile;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;
import com.lordrhys.rain.level.tile.spawn_level.*;

/**
 * Created by hbao506 on 4/27/2015.
 */
public class Tile {

  public int x, y;
  public Sprite sprite;

  public static Tile grass = new GrassTile(Sprite.grass);
  public static Tile flower = new FlowerTile(Sprite.flower);
  public static Tile rock = new RockTile(Sprite.rock);
  public static Tile voidTile = new VoidTile(Sprite.voidTile);

  public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
  public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
  public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
  public static Tile spawn_wall1 = new SpawnWallTile(Sprite.spawn_wall1);
  public static Tile spawn_wall2 = new SpawnWallTile(Sprite.spawn_wall2);
  public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);

  public static final int col_spawn_grass = 0xFF00C600;
  public static final int col_spawn_hedge = 0xFF8AC44C; //unused for now
  public static final int col_spawn_water = 0xFF0026FF; //unused for now
  public static final int col_spawn_wall1 = 0xFF808080;
  public static final int col_spawn_wall2 = 0xFF303030;
  public static final int col_spawn_floor = 0xFF4A280C;

  public Tile(Sprite sprite) {
    this.sprite = sprite;
  }

  public void render(int x, int y, Screen screen){
  }

  public boolean solid(){
    return false;
  }

}
