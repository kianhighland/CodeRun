import java.awt.*;

public class Block {
	int x;
	int y;
	int w;
	int h;
	public Block(int xPos, int yPos, int width, int height) {
		x = xPos;
		y = yPos;
		w  = width;
		h = height;
	}
	Block b1 = new Block(100, 100, 100, 100);
	public void Draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.drawRect(b1.x, b1.y, b1.w, b1.h);
	}
}
