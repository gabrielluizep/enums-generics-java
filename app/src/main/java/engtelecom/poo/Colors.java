package engtelecom.poo;

import java.awt.Color;

public enum Colors {
  RED(Color.RED),
  BLUE(Color.BLUE),
  GREEN(Color.GREEN),
  BLACK(Color.BLACK);

  public final Color color;

  Colors(Color color) {
    this.color = color;
  }
}
