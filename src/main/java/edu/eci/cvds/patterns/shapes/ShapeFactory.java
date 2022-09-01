package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.concrete.*;

import java.awt.Shape;

public class ShapeFactory {
    public static ShapeEdges create(RegularShapeType shape){
        ShapeEdges rta = null;
        switch (shape){
            case Triangle:
                rta = new Triangle();
                break;
            case Quadrilateral:
                rta = new Quadrilateral();
                break;
            case Pentagon:
                rta = new Pentagon();
                break;
            case Hexagon:
                rta = new Hexagon();
                break;
        }
        return rta;
    }
}
