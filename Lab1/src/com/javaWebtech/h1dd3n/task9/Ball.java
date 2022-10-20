package com.javaWebtech.h1dd3n.task9;

public record Ball(double weight, BallColors color) {

    public double getWeight() {
        return weight;
    }

    public BallColors getColor() {
        return color;
    }

}