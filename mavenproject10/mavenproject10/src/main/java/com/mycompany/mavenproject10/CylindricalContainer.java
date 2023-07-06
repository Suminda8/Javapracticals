
package com.mycompany.mavenproject10;


public class CylindricalContainer {
     private double height,radius;
 public CylindricalContainer(double height,double radius)
 {
 this.height=height;
 this.radius=radius;
 }
 public double volume()
 {
 return 3.1459f*radius*radius*height;
 }
}
