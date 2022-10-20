package com.javaWebtech.h1dd3n.task2;

import java.awt.*;
import java.util.Scanner;

public class ZoneAffiliator {

    private static final Point POINT1X= new Point(-4, 4 );
    private static final Point POINT1Y = new Point(0, 5 );
    private static final Point POINT2X = new Point(-6, 6 );
    private static final Point POINT2Y = new Point(-3, 0 );

    private static boolean doesPointBelongInArea(final Point point) {
        return (point.x >= POINT1X.x && point.x <= POINT1X.y) && (point.y >= POINT1Y.x && point.y <= POINT1Y.y) ||
                (point.x >= POINT2X.x && point.x <= POINT2X.y) && (point.y >= POINT2Y.x && point.y <= POINT2Y.y);
    }

    public static void main(String[] args) {
        System.out.println("Enter x and y");
        Scanner sc =new Scanner(System.in);
        Point point = new Point(sc.nextInt(), sc.nextInt());
        System.out.println(doesPointBelongInArea(point));
    }
}