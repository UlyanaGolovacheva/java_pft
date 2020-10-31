package ru.stqa.pft.sandbox1;

public class MyFirstHomeWork {
  public static void main(String[] args) {

    Point z = new Point(-1,-1,12,3);
        System.out.println("Расстояние между точками " + "А(" + z.x1 + ";" + z.y1 + ")" + " и " +
            "В(" + z.x2 + ";" + z.y2 + ")" + " = " + z.BetweenPoints());
  }
}