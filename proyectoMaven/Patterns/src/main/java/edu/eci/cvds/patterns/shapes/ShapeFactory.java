package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	Triangle triangulo;
	
	public static void create (RegularShapeType type) {
		switch (type) {
			case Triangle:
				Triangle triangulo = new Triangle();
		}
		
	}
	
}
