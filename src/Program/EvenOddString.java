package Program;

public class EvenOddString {

	public static void main(String[] args) {
		
String str = "3500";
int position;
int length;
int stringLength = str.length();
//System.out.println(stringLength);

if(stringLength%2==0)
{  
System.out.println("even");

 position = str.length() / 2 - 1;
 System.out.println(position);
 length = 2;


	}
else
{
    position = str.length() / 2;
    System.out.println(position);
    length = 1;
}
 System.out.println(str.substring(position, position + length));

	}

}
