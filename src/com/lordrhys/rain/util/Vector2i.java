package com.lordrhys.rain.util;

/**
 * Rain Created by Frank on 5/27/2015.
 */
public class Vector2i {

  private int x, y;

  public Vector2i() {
    set(0, 0);
  }

  public Vector2i(Vector2i vector) {
    set(vector.x, vector.y);
  }

  public Vector2i(int x, int y) {
    set(x, y);
  }

  private void set(int i, int i1) {
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Vector2i add(Vector2i vector){
    this.x += vector.x;
    this.y += vector.y;
    return this;
  }

  public Vector2i subtract(Vector2i vector){
    this.x -= vector.x;
    this.y -= vector.y;
    return this;
  }

  public Vector2i setX(int x) {
    this.x = x;
    return this;
  }

  public Vector2i setY(int y) {
    this.y = y;
    return this;
  }
}
