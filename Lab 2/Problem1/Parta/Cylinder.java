public class Cylinder extends Shape3D{
    private double radius,height;
    public Cylinder(double r, double h){
        this.radius=r;
        this.height=h;
    }
    @Override
    public double volume(){
        return radius*radius*height*Math.PI;
    }
    @Override
    public double surfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Cylinder volume is "+volume()+", surface area is "+surfaceArea();
    }
}