package com.ifpb.modelo;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

public class App {

    public static void main(String[] args) {

        WKTReader reader = new WKTReader();

        Geometry g1 = null;
        Geometry g2 = null;

        try {
            g1 = reader.read("POLYGON" +
                    "((10 10, 10 40, 30 10, 10 10), " +
                    "(15 15, 15 20, 20 20, 20 15, 15 15))");

            g2 = reader.read("POLYGON" +
                    "((25 15, 40 40, 40 15, 25 15))");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(g1.intersects(g2));


    }

}
