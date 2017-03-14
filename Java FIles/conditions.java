public class conditions
{
public static void main (String args[])
{
int test = 6;

if (test == 9)
// !=, <= ,>=
//If test is 9 then the statement inside the if statement runs
{System.out.println("Yes");
}
else
{System.out.println("False");
}
System.out.println("Thank you")// Prints despite the if statements

//Multiple Tests
int boy, girl;
boy = 18;
girl = 68;

if(boy>10 && girl < 60 )// if boy is greater than 10 and girl is less than 60 
// || Stands for the or statement. If boy is greater than 10 or if girl is less than 60
{System.out.println("You can enter")}
else
(System.out.println("You cannot enter"))

//Switch statement
//Tests one variable and gives multiple choices

int age=3;

swtich (age)
{
case 1: // Makes different cases
System.out.println("You can crawl");
break;
case 2:
System.out.println("You can talk");
break;
case 3;
System.out.println("You can get in trouble");
break;

default:
//If none true then does a default statement
System.out.println("I do not know how old you are");


}




}

}