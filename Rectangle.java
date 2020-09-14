
/**
 * Rectangle 클래스
 *
 * @author (2019315011 조은채)
 * @version (2020.09.14)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  obj  Rectangle 클래스의 객체
     * @return    treue or false
     */
    public boolean equals(Object obj)
    {
        Rectangle r = (Rectangle)obj;
        if((this.width * this.height) == (r.width * r.height))
            return true;
        else
            return false;
    }
}
