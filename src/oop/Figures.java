package oop;

public class Figures {
    public static void main(String[] args) {

        class Square {
            double areaS(double a, double s) {
                return s = Math.pow(a, 2);
            }
            double perimetrS(double a, double p) {
                return p = a * 4;
            }
        }

        class Rectangle {
            double areaR(double a, double b, double s) {
                return s = a * b;
            }
            double perimetrP(double a, double b, double p) {
                return p = 2 * (a + b);
            }
        }

        class Parallelogram {
            double areaP(double a, double b, double s, double k) {
                return s = a * b * Math.sin(Math.PI * k / 180 );
            }
            double perimetrP(double a, double b, double p) {
                return p = 2 * (a + b);
            }
        }

        class Triangle {
            double areaT(double a, double b, double s, double k) {
                return s = ((a * b) / 2) * Math.sin(Math.PI * k / 180);
            }
            double perimetrimetrT(double a, double b, double c, double p) {
                return p = a + b + c;
            }
        }

        class Diamond {
            double areaD(double a, double s, double k) {
                return s = Math.pow(a, 2) * Math.sin(Math.PI * k / 180);
            }
            double perimetrD(double a, double p) {
                return p = a * 4;
            }
        }

        class Quadrangle {
            double areaQ(double a, double b, double d1, double d2, double k, double s) {
                d1 = Math.sqrt(a * a + b * b - 2 * a *b * Math.cos(Math.PI * k / 180));
                d2 = Math.sqrt(a * a + b * b + 2 * a *b * Math.cos(Math.PI * k / 180));
                return s = ((d1 * d2) / 2) * Math.sin(Math.PI * k / 180);
            }
            double perimetrQ(double a, double b, double c, double d, double p) {
                return p = a + b + c + d;
            }

        }

        class Circle {
            double areaC(double s, double r) {
                return s = Math.PI * r;
            }
            double perimetrC(double r, double p) {
                return p = 2 * Math.PI * r;
            }
        }
    }
}
