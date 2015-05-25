package com.lordrhys.rain.level;

import com.lordrhys.rain.entity.mob.Chaser;
import com.lordrhys.rain.entity.mob.Dummy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Frank on 4/29/2015.
 */
public class SpawnLevel extends Level{

  public SpawnLevel(String path) {
    super(path);
  }

  protected void loadLevel(String path) {
    try {
      BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
      int w = width = image.getWidth();
      int h = height = image.getHeight();
      tiles = new int[w * h];
      image.getRGB(0, 0, w, h, tiles, 0, w);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Exception! could not load Level file!");
    }
    add(new Chaser(25, 40));
    for (int i = 0; i < 3; i++) {
      add(new Dummy(20, 40));
    }
  }


  protected void generateLevel(){
  }

}
