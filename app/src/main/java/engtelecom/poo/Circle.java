package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.Color;

public class Circle {

  private int x;
  private int y;
  private int radius;
  private Colors color;

  public Circle(int x, int y, int radius, Colors color) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getRadius() {
    return radius;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public void draw(Draw canvas) {
    canvas.setPenColor(color.color);

    canvas.filledCircle(x, y, radius);
  }

}
