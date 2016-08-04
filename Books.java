
public class Books {
int serialid;
String bookname;
String author;
double price;

public void setBooks(int sid,String bname,String auth,double p)
{
	serialid=sid;
	bookname=bname;
	author=auth;
	price=p;
}
void printBook()
{
	System.out.println("The serial:\n"+serialid+"\n");
	System.out.println("The bookname:\n"+bookname+"\n");
	System.out.println("The author:\n"+author+"\n");
	System.out.println("The Price:\n"+price+"\n");
}

}
