public class Rectangle  {
    private int length;
    public int width;

    public Rectangle(int rectLength, int rectWidth) {
        length = rectLength;
        width = rectWidth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int area() {
        return width * length;
    }

    public void printArea() {
        int area = length * width;
        System.out.println("The area is " + area);
    }
}

