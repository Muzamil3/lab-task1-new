public class Main
{
public static void main(String arg[])
{
Artist A= new Artist("Muzamil");
Artwork A1 = new Artwork("Park",2020,A);
Artwork A2 = new Artwork("Mountain",2019);
A1.settitle("Moon");
A1.setyear(2021);
A1.displayinfo();
A2.displayinfo();
}
}