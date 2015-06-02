package com.lordrhys.rain.level;

import com.lordrhys.rain.util.Vector2i;

/**
 * Created by hbao506 on 6/2/2015.
 */
public class Node {

  public Vector2i tile;
  public Node parent;
  public double fCost, gCost, hCost;

  public Node(Vector2i tile, Node parent, double gCost, double hCost) {
    this.tile = tile;
    this.parent = parent;
    this.gCost = gCost;
    this.hCost = hCost;
    this.fCost = this.gCost + this.hCost;
  }

}
