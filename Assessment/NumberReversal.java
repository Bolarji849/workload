import java.util.Arrays;
public class NumberReversal{

public static int[] inverseNumber(int [] number){
 int [] inverse = new int[number.length];
int value = number.length -1;

for(int index = 0; index<number.length; index++){
inverse[value] = number[index];
value--;

}
return inverse;
}

public static void main(String[] args){
int [] userInput = {1,2,5,6,3,8,7};
System.out.print(Arrays.toString(inverseNumber(userInput)));
}


}