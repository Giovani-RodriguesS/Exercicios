import java.awt.*;
import java.util.Random;

public abstract class Shape {
    private Color color;
    private int X;
    private int Y;
    private int speedY;
    private int speedX;

    Random r = new Random();

    public Shape () {
        this.color = this.colorGenerate();
        this.X = r.nextInt(256);
        this.Y = r.nextInt(256);
        this.speedY = r.nextInt(10)+1;
        this.speedX = r.nextInt(10)+1;
    }
    public Shape (Color color, int X, int Y, int speedX, int speedY ){
        this.speedY = speedY;
        this.color = color;
        this.speedX = speedX;
        this.Y = Y;
        this.X = X;
    }

    private Color colorGenerate() {
        Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        return c;
    }

    public void move (int screenWidth, int screenHeight) {
        this.Y += speedY;
        this.X += speedX;

    }
    public abstract void draw (Graphics g);

    public Color getColor() {
        return color;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getSpeedY() {
        return speedY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }
}
