package Constructer;



public class CopyConstructer
{int rn;
String name;
int marks;
public CopyConstructer(CopyConstructer c)
{
	super();
	this.rn = c.rn;
	this.name =c. name;
	this.marks = c.
			marks;
}
public CopyConstructer(int rn,String name,int marks)
{
	this.rn=rn;
	this.name=name;
	this.marks=marks;
}
void print()
{
	System.out.println(rn+" "+name+" "+marks);
}
public static void main(String[] args)
{
	CopyConstructer c1= new CopyConstructer(1,"shilpa",50);
	c1.print();
	CopyConstructer c2= new CopyConstructer(c1);
	c2.print();
}
}
