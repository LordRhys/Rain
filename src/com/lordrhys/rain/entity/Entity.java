package com.lordrhys.rain.entity;

import com.lordrhys.rain.graphics.Screen;
import com.lordrhys.rain.graphics.Sprite;
import com.lordrhys.rain.level.Level;

import java.util.Random;

/**
 * Created by hbao506 on 4/28/2015.
 */
public class Entity {

  protected int x, y;
  protected Sprite sprite;
  private boolean removed = false;
  protected Level level;
  protected final Random random = new Random();

  /*public Entity(int x, int y, Sprite sprite) {
    this.x = x;
    this.y = y;
    this.sprite = sprite;
  }*/

  public void update(){
  }

  public void render(Screen screen){
    if (sprite != null) screen.renderSprite(x,y,sprite,true);
  }

  public void remove(){
    //TODO: Remove from level
    removed = true;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public Sprite getSprite(){
    return sprite;
  }

  public boolean isRemoved(){
    return removed;
  }

  public void init(Level level){
    this.level = level;
  }

}
