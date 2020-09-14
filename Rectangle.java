
/**
 * Rectangle 클래스
 *
 * @author (2019315011 조은채)
 * @version (2020.09.14)
 */
public class Rectangle
{
    // Rectangle 객체의 너비와 높이
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
     * 두 Rectangle 객체의 면적이 같은지 판단하는 메소드
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
