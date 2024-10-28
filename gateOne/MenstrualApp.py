import datetime

def get_menu():
    menu = """
    ***********************************

    >> 1 Check Next Menstrual Period
    >> 2 Check Ovulation Date    
    >> 3 Check Fertility Period
    ***********************************
    """
    print(menu)

    try:
        user_input = int(input("Enter your number of choice please: "))

        if user_input == 1:
            last_period_day = input("Enter last period full details in this format (\"dd/MM/yyyy\"): ")
            date = datetime.datetime.strptime(last_period_day, "%d/%m/%Y").date()
            length_cycle = int(input("Enter length cycle: "))

            if length_cycle < 21 or length_cycle > 35:
                print("Please see a doctor; this is not a normal cycle length")
            else:
                next_period_date = date + datetime.timedelta(days=length_cycle)
                print("Your next menstrual date is:", next_period_date)

        elif user_input == 2:
            last_period_day = input("Enter last period full details in this format (\"dd/MM/yyyy\"): ")
            date = datetime.datetime.strptime(last_period_day, "%d/%m/%Y").date()
            length_cycle = int(input("Enter length cycle: "))
            ovulation = length_cycle // 2
            date_of_ovulation = date + datetime.timedelta(days=ovulation)
            print("Your ovulation date is:", date_of_ovulation)

        elif user_input == 3:
            length_cycle = int(input("Enter length cycle: "))
            ovulation = length_cycle // 2
            fertility_start = ovulation - 3
            fertility_end = ovulation + 3
            print("Your fertility period starts:", fertility_start)
            print("Your fertility period ends:", fertility_end)

    except Exception:
        print("Please check your input and enter the correct format")

get_menu()
