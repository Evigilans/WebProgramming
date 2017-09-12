package model;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector() {
        new Vector(0, 0, 0);
    }

    /**
     * Constructor of 3 coord vector.
     * @param x is 1st coord of vector
     * @param y is 2nd coord of vector
     * @param z is 3rd coord of vector
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Count module of current vector
     * @return double value
     */
    public double countModule() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * Count scalar product of two vectors
     * @param b is second vector
     * @return double value
     */
    public double scalarProduct(Vector b) {
        return x * b.getX() + y * b.getY() + z * b.getZ();
    }

    /**
     * Add to the current vector another
     * @param b is vector that we add
     * @return new vector (this + b)
     */
    public Vector sum(Vector b) {
        return new Vector(x + b.getX(), y + b.getY(), z + b.getZ());
    }

    /**
     * Substruct two vectors
     * @param b is 2nd vector
     * @return new vector (this - b)
     */
    public Vector sub(Vector b) {
        return new Vector(x - b.getX(), y - b.getY(), z - b.getZ());
    }

    /**
     * Multiply current vecotr by const value
     * @param c is const
     * @return new vector c*v
     */
    public Vector mulByConst(double c) {
        return new Vector(x * c, y * c, z * c);
    }

    /**
     * Check if two vectors are collinear
     * @param b is second vector
     * @return boolean value
     */
    public boolean isCollenear(Vector b) {
        double n = x / b.getX();
        return x == n * b.getX() && y == n * b.getY() && z == n * b.getZ();
    }

    /**
     * Check if two vectors are ortogonal
     * @param b is second vector
     * @return boolean value
     */
    public boolean isOrtogonal(Vector b) {
        return x * b.getX() + y * b.getY() + z * b.getZ() == 0;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Generate string value for current vector
     * @return String value
     */
    @Override
    public String toString() {
        return "{" + x + ", " + y + ", " + z + "}";
    }

    /**
     * Check if two vector are equals
     * @param o is compared vector
     * @return boolean value
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Vector compared = (Vector)o;
        return compared.getX() == this.getX() && compared.getY() == this.getY() && compared.getZ() == this.getZ();
    }

    /**
     * Get hash code of current vector
     * @return int value
     */
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}