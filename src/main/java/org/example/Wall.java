package org.example;

public class Wall {

    private double width;
    private double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;

    }
    public double getWidth(){
        return  width;

    }
    public double getHeight(){
        return  height;

    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }
    public void setHeight(double height){
        this.height = (height < 0) ? 0 : width;
    }
    public double getArea(){
        return height*width;
    }
}
