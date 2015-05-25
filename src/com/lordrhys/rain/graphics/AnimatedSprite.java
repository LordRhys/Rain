package com.lordrhys.rain.graphics;

/**
 * Rain Created by Frank on 5/13/2015.
 */
public class AnimatedSprite extends Sprite {

  public int frame = 0;
  private Sprite sprite;
  private int rate = 15;
  private int time = 0;
  private int length = -1;

  public AnimatedSprite(SpriteSheet sheet, int width, int height, int length) {
    super(sheet, width, height);
    this.length = length;
    sprite = sheet.getSprites()[0];
    if (length > sheet.getSprites().length) System.err.println("Error! length of animation is too long!");
  }

  public void update(){
    time++;
    if (time % rate == 0) {
      if (frame >= length) frame = 0;
      //else frame++;
      sprite = sheet.getSprites()[frame];
      frame++;
    }
  }

  public Sprite getSprite(){
    return sprite;
  }

  public void setFrameRate(int frames){
    rate = frames;
  }

  public void setFrame(int index) {
    if (index > sheet.getSprites().length - 1) {
      System.err.println("Index out of bounds in " + this);
      return;
    }
    sprite = sheet.getSprites()[index];
  }
}
