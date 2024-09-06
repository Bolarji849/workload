import java.util.Scanner;

public class ChristMasSongApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;

        String menu = """
        ++++++++++++++++++++++++++++++++++

        Welcome to the Christmas Song App
        
        Please enter a number from 1 - 12 
        
        To select a song of your choice

        Enter 0 to exit.
        ++++++++++++++++++++++++++++++++++
        """;

        do {
            System.out.print(menu);
            System.out.print("Please enter a number of your choice of song: ");
            userInput = scan.nextInt();

            switch (userInput) {
                case 12:
                  System.out.print("""
				      On the twelfth day of Christmas,
                                     "my true love gave to me
                                     "Twelve drummers drumming,
                                     "Eleven pipers piping,
                                     "Ten lords a-leaping,
                                     "Nine ladies dancing,
                                     "Eight maids a-milking,
                                     "Seven swans a-swimming,
                                     "Six geese a-laying,
                                     "Five golden rings,
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree!
									""");

                    break;

                case 11:
                    System.out.print("""
				      On the eleventh day of Christmas,
                                     "my true love gave to me
                                     "Eleven pipers piping,
                                     "Ten lords a-leaping,
                                     "Nine ladies dancing,
                                     "Eight maids a-milking,
                                     "Seven swans a-swimming,
                                     "Six geese a-laying,
                                     "Five golden rings,
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.
									""");

                    break;

                case 10:
                   System.out.print("""
					 On the tenth day of Christmas,
                                        my true love gave to me
                                       "Ten lords a-leaping,
                                       "Nine ladies dancing,
                                       "Eight maids a-milking,
                                       "Seven swans a-swimming,
                                       "Six geese a-laying,
                                       "Five golden rings,
                                       "Four calling birds,
                                       "Three French hens,
                                       "Two turtle doves,
                                       "And a partridge in a pear tree. 
									""");

                    break;

                case 9:
                    System.out.print("""

				     On the ninth day of Christmas,
                                     "my true love gave to me
                                     "Nine ladies dancing,
                                     "Eight maids a-milking,
                                     "Seven swans a-swimming,
                                     "Six geese a-laying,
				     "Five golden rings,
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.
									""");
                    break;

                case 8:
                    System.out.print("""
				      On the eighth day of Christmas,
                                     "my true love gave to me
                                     "Eight maids a-milking,
                                     "Seven swans a-swimming,
                                     "Six geese a-laying,
                                     "Five golden rings,
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.
									""");
                    break;

                case 7:
                    System.out.print("""
				      On the seventh day of Christmas, 
                                     "my true love gave to me
                                     "Seven swans a-swimming,
                                     "Six geese a-laying,
                                     "Five golden rings,
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.
									""");
                    break;

                case 6:
                    System.out.print("""
					On the sixth day of Christmas, 
                                     "my true love gave to me 
                                     "Six geese a-laying, 
                                     "Five golden rings, 
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.
									""");

                    break;

                case 5:
                    System.out.print("""
					On the fifth day of Christmas,
                                     "my true love gave to me
                                     "Five golden rings,
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.

									""");
                    break;

                case 4:
                    System.out.print("""
					On the fourth day of Christmas,
                                     "my true love gave to me
                                     "Four calling birds,
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree
								     """);
                    break;

                case 3:
                    System.out.print("""
					On the third day of Christmas, 
                                     "my true love gave to me
                                     "Three French hens,
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.
									""");
                    break;

                case 2:
                    System.out.print("""
					On the second day of Christmas, 
                                     "my true love gave to me
                                     "Two turtle doves,
                                     "And a partridge in a pear tree.

									""");
                    break;
		case 1:
                    System.out.print("""
					On the first day of Christmas,
                                     "my true love gave to me
                                     "A partridge in a pear tree,
									""");

                    break;

                case 0:
                    System.out.print("Thank you for using this app.\n");
                    break;

                default:
                    System.out.print("Invalid input. Please enter a number from 1 to 12.\n");
                    break;
            }

        } while (userInput != 0); 

        
    }
}