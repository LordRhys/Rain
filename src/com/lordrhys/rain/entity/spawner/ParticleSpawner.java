package com.lordrhys.rain.entity.spawner;

import com.lordrhys.rain.entity.particle.Particle;
import com.lordrhys.rain.level.Level;

/**
 * Rain Created by Frank on 5/6/2015.
 */
public class ParticleSpawner extends Spawner {

  private int life;

  public ParticleSpawner(int x, int y, int life, int amount, Level level) {
    super(x, y, Type.PARTICLE, amount, level);
    this.life = life;
    for (int i = 0; i < amount; i++){
      level.add(new Particle(x, y, life));
    }
  }
}
