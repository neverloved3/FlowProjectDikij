public class Calculator {
        public int sum(int a, int b) {
            return a + b;
        }
        public double rubToDollar(double rubles) {
            return rubles * 0.013;
        }
        public int countWeight(int height) {
            return height - 110;
        }
    public double calculateSquareArea(double side) {
        return side * side;
        }
    public double calculatePyramidVolume(double base, double height) {
        return (base * base * height) / 3;
        }
    public double calculateSphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
        }
    }
