package Ex1;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){};

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    private double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    private double getArea(){
        return Math.pow(this.radius, 2)* Math.PI;
    }
    public void callGetArea(){
        System.out.println(getArea());
    }
    public void callGetRadius(){
        System.out.println(getRadius());
    }
}
