public class Program {
    public static void main(String[] args) {
        Point2d myOtherPoint2d = new Point2d(5,3);
        System.out.printf("x: %f \ty: %f\n", myOtherPoint2d.getX(), myOtherPoint2d.getY());

        Point3d myOtherPoint3d = new Point3d(10, 7, 19);
        System.out.printf("x: %f \ty: %f \tz: %f\n", myOtherPoint3d.getX(), myOtherPoint3d.getY(), myOtherPoint3d.getZ());

        myOtherPoint3d.setZ(20);
        System.out.printf("x: %f \ty: %f \tz: %f\n", myOtherPoint3d.getX(), myOtherPoint3d.getY(), myOtherPoint3d.getZ());

        Point2d upcasting = myOtherPoint3d;
        System.out.printf("x: %f \ty: %f\n", upcasting.getX(), upcasting.getY());

        Point3d downcasting = new Point3d(myOtherPoint2d.getX(), myOtherPoint2d.getY(), 0);
        System.out.printf("x: %f \ty: %f \tz: %f\n", downcasting.getX(), downcasting.getY(), downcasting.getZ());

        myOtherPoint2d.typeHello();
        myOtherPoint3d.typeHello();

        System.out.println(upcasting instanceof Point3d);
    }
}

class Point2d {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** Конструктор инициализации **/
    public Point2d (double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    /** Конструктор по умолчанию. **/
    public Point2d () {
        this(0, 0);
    }
    /** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }

    void typeHello() {
        System.out.println("Hello From Point2d! :D");
    }
}

class Point3d extends Point2d {
    /** координатa Z **/
    double zCoord;
    /** Конструктор по умолчанию. **/
    public Point3d() {
        this (0,0,0);
    }
    /** Конструктор инициализации **/
    public Point3d (double x, double y, double z){
        super (x, y);
        zCoord = z;
    }
    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты Z. **/
    public void setZ (double val) {
        zCoord = val;
    }

    @Override // Нужен, чтобы показать компилятору, что я меняю метод и супер-класса. Иначе, если такого
              // метода нет в супер-классе, то выдаст ошибку.
    void typeHello() {
        System.out.println("Hello From Point3d! :D");
    }
}
