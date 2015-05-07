package com.lordrhys.rain.entity.spawner;

import com.lordrhys.rain.entity.Entity;
import com.lordrhys.rain.entity.particle.Particle;
import com.lordrhys.rain.level.Level;

import java.util.ArrayList;
import java.util.List;

/**
 * Rain Created by Frank on 5/6/2015.
 */
public class Spawner extends Entity {

  public enum Type {
    MOB,
    PARTICLE;
  }

  private  Type type;

  public Spawner(int x, int y, Type type, int amount, Level level){
    init(level);
    this.x = x;
    this.y = y;
    this.type = type;
  }
}
