package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255, 109, 182);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		//StdDraw.clear();
		
		double[] x = { 0.4, 0.5, 0.6, 0.5 };
		double[] y = { 0.5, 0.6, 0.5, 0.4 };
		StdDraw.setPenColor(109, 182, 255);
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(255, 109, 182);
		double[] x2 = {0.45, 0.5, 0.55, 0.5};
		double[] y2 = {0.55, 0.6, 0.55, 0.5};
		StdDraw.filledPolygon(x2,y2);
		
		StdDraw.setPenColor(255, 255, 255);
		Font font = new Font("Comfortaa", Font.BOLD, 40);
		StdDraw.setFont(font);
		StdDraw.text(0.5, 0.6, "Studio 4");
		
		 StdDraw.setPenRadius(0.05);
		 StdDraw.setPenColor(0, 0, 0);
		 StdDraw.line(0.2, 0.3, 0.2, 0.7);
		 StdDraw.line(0.2, 0.7, 0.8, 0.7);
		 StdDraw.line(0.8, 0.7, 0.8, 0.3);
		 StdDraw.line(0.8, 0.3, 0.2, 0.3);
		 
	}
}