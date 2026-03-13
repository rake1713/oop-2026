public class Sphere extends Shape3D{
    private double radius;
    public Sphere(double r){
        this.radius=r;
    }
    @Override
    public double volume(){
        return (Math.pow(radius, 3)*Math.PI)*(4.0/3.0);
    }
    @Override
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double getRadius() {
        return radius;
    }
    public String toString() {
        return "Sphere volume is "+volume()+", surface area is "+surfaceArea();
    }
}