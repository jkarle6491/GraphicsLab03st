// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.
// 14x and 9y

import java.awt.*;
import java.applet.*;

public class GraphicsLab02nd extends Applet {
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 10;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10, 10, width, height);
		{
			for (x1 = 10; x1 < 980; x1 += 14) {
				y2 = y2 - 9;
				g.drawLine(x1, 640, x2, y2);

				y1 = y1 + 9;
				g.drawLine(x1, 10, x2, y1);
			}
		}
		{
			for (x2 = 990; x2 > 10; x2 -= 14) {
				y2 = y2 + 9;
				g.drawLine(x2, 10, 10, y2);
				
				y1 = y1 - 9;
				g.drawLine(x2, 640, 10, y1);
			}
		}
		g.drawRect(265, 165, 470, 320);
		int x3 = 265;
		int x4 = 735;
		int y3 = 165;
		int y4 = 485;
		{
			for (x3 = 265; x3 < 735; x3 += 14) {
				y4 = y4 - 9;
				g.drawLine(x3, 485, x4, y4);

				y3 = y3 + 9;
				g.drawLine(x3, 165, x4, y3);
			}
		}
		{
			for (x4 = 735; x4 > 265; x4 -= 14) {
				y4 = y4 + 9;
				g.drawLine(x4, 165, 265, y4);
				
				y3 = y3 - 9;
				g.drawLine(x4, 485, 265, y3);
			}
		}
	}
}
