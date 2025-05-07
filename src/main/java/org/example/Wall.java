package org.example;

public class Wall {
    double width;
    double height;
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(int value) {
        if (value < 0) {
            this.width = 0;
        } else {
            this.width = value;
        }
    }
    public void setHeight(double value) {
        if (value < 0) {
            this.height = 0;
        } else {
            this.height = value;
        }
    }
    public double getArea(){
        return this.height*this.width;
    }


}
