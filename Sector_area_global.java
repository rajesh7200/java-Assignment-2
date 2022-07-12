class Sector_area_global
{
	static double redius=10,angle=30,area=0;
	public static void main(String []args)
	{ 
		area=0.5*redius*redius*(angle/360);
		System.out.println("The area of Sector is "+area);
	}
}