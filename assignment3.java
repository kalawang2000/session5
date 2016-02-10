class ComputeArea
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }

}
class assignment3 
{
     public static void main(String args[]) 
	{
	   ComputeArea a = new ComputeArea();
	   a.area(5);
	   a.area(11,12);
        }
}