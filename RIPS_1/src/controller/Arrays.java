package controller;
import model.*;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {
    private static ArrayList<Vector> vectors = new ArrayList<>();

    public static void generateRandomVectors(int n) {
        Random random  = new Random();
        for (int i = 0; i < n; i++) {
            double x = (1 + random.nextInt(100)) / 10.0;
            double y = (1 + random.nextInt(100)) / 10.0;
            double z = (1 + random.nextInt(100)) / 10.0;

            Vector v = new Vector(x, y, z);
            vectors.add(v);
        }
    }

    public static void printGenerated() {
        System.out.println("Vector generated: ");
        for (Vector vector : vectors) {
            System.out.println(vector);
        }
    }

    public static ArrayList<Vector> getVectors() {
        return vectors;
    }
}