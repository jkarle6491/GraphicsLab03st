// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.

import java.awt.*;
import java.applet.*;

public class GraphicsLab01st extends Applet {

	public void paint(Graphics g) {
		// DRAW CUBE
		g.drawRect(50, 50, 300, 300);
		g.drawRect(200, 200, 300, 300);
		g.drawLine(200, 200, 50, 50);
		g.drawLine(350, 350, 500, 500);
		g.drawLine(500, 200, 350, 50);
		g.drawLine(200, 500, 50, 350);
		// DRAW SPHERE
		g.drawOval(125, 125, 300, 300);
		g.drawOval(150, 125, 250, 300);
		g.drawOval(175, 125, 200, 300);
		g.drawOval(200, 125, 150, 300);
		g.drawOval(225, 125, 100, 300);
		g.drawOval(250, 125, 50, 300);
		g.drawOval(125, 150, 300, 250);
		g.drawOval(125, 175, 300, 200);
		g.drawOval(125, 200, 300, 150);
		g.drawOval(125, 225, 300, 100);
		g.drawOval(125, 250, 300, 50);
		// DRAW TRIANGLE
		g.drawLine(600, 500, 800, 500);
		g.drawLine(600, 500, 700, 400);
		g.drawLine(800, 500, 700, 400);
		g.drawLine(700, 400, 700, 500);
		g.drawLine(600, 500, 750, 450);
		g.drawLine(800, 500, 650, 450);
		// Draw 3D Octagon
		g.drawLine(850, 50, 1000, 50);
		g.drawLine(1000, 50, 1100, 150);
		g.drawLine(1100, 150, 1100, 300);
		g.drawLine(1100, 300, 1000, 400);
		g.drawLine(850, 400, 1000, 400);
		g.drawLine(850, 50, 750, 150);
		g.drawLine(750, 150, 750, 300);
		g.drawLine(750, 300, 850, 400);
		g.drawLine(850, 50, 850, 400);
		g.drawLine(1000, 50, 1000, 400);
		g.drawLine(750, 150, 1100, 150);
		g.drawLine(750, 300, 1100, 300);
		
	}

}
