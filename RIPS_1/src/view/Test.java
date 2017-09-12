package view;
import controller.*;

public class Test {
    public static void main(String[] args) {
        Arrays.generateRandomVectors(12);
        Arrays.printGenerated();
        testVectors();
    }

    private static void testModule() {
        System.out.println("Count module for vector: " + Arrays.getVectors().get(0));
        System.out.println("Result: " + Arrays.getVectors().get(0).countModule());
        System.out.println();
    }

    private static void testScalarProduct() {
        System.out.println("Count scalar product for vectors: " + Arrays.getVectors().get(1) + ",   " + Arrays.getVectors().get(2));
        System.out.println("Result: " + Arrays.getVectors().get(1).scalarProduct(Arrays.getVectors().get(2)));
        System.out.println();
    }

    private static void testSum() {
        System.out.println("Count sum for vectors: " + Arrays.getVectors().get(3) + ",   " + Arrays.getVectors().get(4));
        System.out.println("Result: " + Arrays.getVectors().get(3).sum(Arrays.getVectors().get(4)));
        System.out.println();
    }

    private static void testSub() {
        System.out.println("Count sub for vectors: " + Arrays.getVectors().get(5) + ",   " + Arrays.getVectors().get(6));
        System.out.println("Result: " + Arrays.getVectors().get(5).sub(Arrays.getVectors().get(6)));
        System.out.println();
    }

    private static void testMulByConst() {
        int n = 10;
        System.out.println("Count multiplication for vector: " + Arrays.getVectors().get(7) + " and const n = " + n);
        System.out.println("Result: " + Arrays.getVectors().get(7).mulByConst(n));
        System.out.println();
    }

    private static void testCollinear() {
        System.out.println("Are vectors " + Arrays.getVectors().get(8) + " and " + Arrays.getVectors().get(9) + " collinear?");
        System.out.println("Result: " + Arrays.getVectors().get(8).isCollenear(Arrays.getVectors().get(9)));
        System.out.println();
    }

    private static void testOrtogonal() {
        System.out.println("Are vectors " + Arrays.getVectors().get(8) + " and " + Arrays.getVectors().get(9) + " ortogonal?");
        System.out.println("Result: " + Arrays.getVectors().get(10).isCollenear(Arrays.getVectors().get(11)));
        System.out.println();
    }

    private static void testVectors() {
        System.out.println("\n ================= TEST RESULTS  ================= \n");
        testModule();
        testScalarProduct();
        testSum();
        testSub();
        testMulByConst();
        testCollinear();
        testOrtogonal();
    }
}