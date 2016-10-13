
// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class GraphicsLab03st extends Applet {

	public void paint(Graphics g) {
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		Random rnd = new Random(1234);

		// Draw Random Lines
		for (int k = 1; k <= 10000; k++) {
			int x1 = rnd.nextInt(390) + 10;
			int y1 = rnd.nextInt(290) + 10;
			int x2 = rnd.nextInt(390) + 10;
			int y2 = rnd.nextInt(290) + 10;
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red, green, blue));
			g.drawLine(x1, y1, x2, y2);
		}

		// Draw Random Squares
		for (int k = 1; k <= 10000; k++) {
			int x = rnd.nextInt(340) + 400;
			int y = rnd.nextInt(240) + 10;
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red, green, blue));
			g.fillRect(x, y, 50, 50);
		}
		// Draw Random Circles
		for (int k = 1; k <= 10000; k++) {
			int x2 = rnd.nextInt(200);
			int x1 = rnd.nextInt(390 - x2) + 10;
			int y1 = rnd.nextInt(290 - x2) + 300;
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x1, y1, x2, x2);
		}
		// Draw 3-D Box
		Polygon left = new Polygon();
		left.addPoint(550, 350);
		left.addPoint(550, 450);
		left.addPoint(600, 500);
		left.addPoint(600, 400);
		
		Polygon right = new Polygon();
		right.addPoint(650, 350);
		right.addPoint(650, 450);
		right.addPoint(700, 500);
		right.addPoint(700, 400);
		
		//back
		g.setColor(Color.yellow);
		g.fillRect(550, 350, 100, 100);
		//right
		g.setColor(Color.blue);
		g.fillPolygon(right);
		//left
		g.setColor(Color.green);
		g.fillPolygon(left);
		//front
		g.setColor(Color.red);
		g.fillRect(600, 400, 100, 100);

	}

}
