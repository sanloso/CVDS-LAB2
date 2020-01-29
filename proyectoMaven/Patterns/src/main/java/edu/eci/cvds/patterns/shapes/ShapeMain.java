package edu.eci.cvds.patterns.shapes;

public class ShapeMain {
    private static ShapeFactory shapeFactory;
    public static void main(String[] args) {
      shapeFactory= null;
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }
        try {

            shapeFactory= new ShapeFactory();
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = ShapeFactory.create(type);

            System.out.println(String.format("Successfully created a %s with %s sides.", type, shape.getNumberOfEdges()));

        } catch (IllegalArgumentException ex) {
            System.err.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}
