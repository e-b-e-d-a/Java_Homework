package ru.ebeda.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTest {

  Point p1 = new Point(1,0);
  Point p2 = new Point(0,0);

  @Test
  public void testX(){

    Assert.assertEquals(Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)), 4.0);

  }

  @Test
  public void testY(){

    Assert.assertEquals(Math.sqrt((p1.y-p2.y)*(p1.y-p2.y)), 0.0);

  }

  @Test
  public void testNotNull(){

    Assert.assertNotEquals(p1.distance(p2),0.0);
  }
}
