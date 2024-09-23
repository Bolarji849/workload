import java.util.Arrays;
public class OddNumber{



public static int[] inverseNumber(int [] number){
int value = number.length / 2;

if(number.length % 2 == 1){
value =  value +1 ;

}
 int [] element = new int[value];

for(int index = 1,count = 0; index<number.length; index+=2, count++){
element[count] = number[index];


}
return element;
}

public static void main(String[] args){
int [] userInput = {1,2,5,6,3,8,7,90,10};
System.out.print(Arrays.toString(inverseNumber(userInput)));
}


}