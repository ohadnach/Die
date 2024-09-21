
public class Die
{
private int num;
public  Die ()
{
	this.num = (int)(Math.random()*6+1);
}
public void roll ()
{
	this.num = (int)(Math.random()*6+1);
}

public int getNum ()
{
	return this.num ;
}
public String toString()
{
	return "The number is :" + this.num;
}

}
