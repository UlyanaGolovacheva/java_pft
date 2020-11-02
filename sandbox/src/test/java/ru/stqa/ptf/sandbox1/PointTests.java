package ru.stqa.ptf.sandbox1;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox1.Point;

@Test
public class PointTests {
  public void testBetweenPointsZero() {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    //assert s.area() == 25;
    Assert.assertEquals(p1.BetweenPoints(p2), 0);
  }

  @Test
  public void testBetweenPointsAtOnePoint() {
    Point p1 = new Point(5, 3);
    Point p2 = new Point(5, 3);
    //assert s.area() == 25;
    Assert.assertEquals(p1.BetweenPoints(p2), 3);
  }

  @Test
    public void testBetweenPointsDistance() {
      Point p1 = new Point(5, -1);
      Point p2 = new Point(5, 1);
      //assert s.area() == 25;
      Assert.assertEquals(p1.BetweenPoints(p2), 2);
    }
}