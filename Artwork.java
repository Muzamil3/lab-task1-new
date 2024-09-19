class Artwork
{
private String title;
private int year;
private Artist artist;
Artwork(String title, int year)
{
this.title=title;
this.year=year;
artist=new Artist("Unknown");
}
Artwork(String title, int year, Artist artist)
{
this.title=title;
this.year=year;
this.artist=artist;
}
public String gettitle()
{
return title;
}
public int getyear()
{
return year;
}
public Artist getartist()
{
return artist;
}
public void settitle(String title)
{
this.title=title;
}
public void setyear(int year)
{
this.year=year;
}
public void displayinfo()
{
System.out.println("Title:"+title);
System.out.println("Year:"+year);
artist.display();
}
}