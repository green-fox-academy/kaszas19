package com.zoli.weak02.day05;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void drawImage(Graphics graphics) {
    // Draw a box that has different colored lines on each edge

    graphics.setColor(Color.BLUE);
    graphics.drawLine(25,25,25,50);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(25,25,50,25);

    graphics.setColor(Color.RED);
    graphics.drawLine(50,25,50,50);

    graphics.setColor(Color.BLACK);
    graphics.drawLine(50,50,25,50);

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}