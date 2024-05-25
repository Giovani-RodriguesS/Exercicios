import java.awt.*;
import java.util.Random;

public class Shape extends {
    private Color color;
    private double X;
    private double Y;
    private double speedY;
    private double speedX;

    Random r = new Random();

    public Shape () {
        this.color = this.colorGenerate();
        this.X = r.nextInt(256);
        this.Y = r.nextInt(256);
        this.speedY = r.nextInt(10)+1;
        this.speedX = r.nextInt(10)+1;

    }

    private Color colorGenerate() {
        Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        return c;
    }

    public void move () {
        this.Y = speedY;
        this.X = speedX;

    }

    public Color getColor() {
        return color;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getSpeedY() {
        return speedY;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }
    //public abstract void draw (Graphics g){

    }
}
