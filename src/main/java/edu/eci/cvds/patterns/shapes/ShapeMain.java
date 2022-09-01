package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.concrete.ShapeEdges;

public class ShapeMain {
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }try {
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            ShapeEdges shape = ShapeFactory.create(type);
            System.out.printf("Successfully created a %s with %s sides.%n", type,shape.getNumberOfEdges());
        } catch (IllegalArgumentException ex) {
            System.err.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}
