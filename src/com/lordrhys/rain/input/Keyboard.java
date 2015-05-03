package com.lordrhys.rain.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Frank on 4/26/2015.
 */
public class Keyboard implements KeyListener{

  private boolean[] keys = new boolean[125];
  public boolean up,down,left,right;

  public void update(){
    up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
    down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
    left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
    right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
  }

  public void keyTyped(KeyEvent e) {

  }

  public void keyPressed(KeyEvent e) {
    keys[e.getKeyCode()] = true;
  }

  public void keyReleased(KeyEvent e) {
    keys[e.getKeyCode()] = false;
  }
}
