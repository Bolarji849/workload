def add_all_index(digit):
    total = 0
    for counter in range(len(digit)):
        total += digit[counter]
    return total

def split_double_numbers(number):
    for index in range(len(number)):
        if number[index] > 9:
            sum_value = (number[index] // 10) + (number[index] % 10)
            number[index] = sum_value
    return number

def multiply_all_index(card):
    product = [0] * len(card)
    if len(card) % 2 == 0:
        for index in range(len(card)):
            if index % 2 == 0:
                card[index] = card[index] * 2
    if len(card) % 2 == 1:
        for index in range(len(card)):
            if index % 2 == 1:
                card[index] = card[index] * 2
    return card

def covert_from_string_to_integer(card_number):
    converted_value = [0] * len(card_number)
    for count in range(len(converted_value)):
        converted_value[count] = int(card_number[count])
    return converted_value

def check_string_is_digit(string):
        return string.isdigit()


card_number = input("Hello, Kindly Enter Card details to verify: ")

if not check_string_is_digit(card_number):
            raise ValueError("Card Number Must Be Digit Only")

length_size = len(card_number)
if length_size < 13 or length_size > 16:
            raise ValueError("Card Number Must Be Within 13-16")

converted_numbers = covert_from_string_to_integer(card_number)
multiplied_numbers = multiply_all_index(converted_numbers)
double_splited_numbers = split_double_numbers(multiplied_numbers)
result = add_all_index(double_splited_numbers)

if result % 10 == 0:
    print("**Credit Card Validity Status: Valid")
else:
    print("**Credit Card Validity Status: Invalid")



if card_number.startswith("4"):
    print("**Credit Card Type: VisaCard")
elif card_number.startswith("5"):
    print("**Credit Card Type: MasterCard")
elif card_number.startswith("37"):
    print("**Credit Card Type: American Express Card")
else:
    if card_number.startswith("6"):
        print("**Credit Card Type: Discover Card")


print("**Credit Card Digit length: " + str(length_size))
print("**Credit Card Number: " + card_number)









