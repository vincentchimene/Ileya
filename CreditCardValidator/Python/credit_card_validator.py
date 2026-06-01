def get_sum_every_second_digit_doubled(string_digits):
    total_sum = 0
    index = len(string_digits) - 2
    while index >= 0:
        doubled = int(string_digits[index]) * 2
        if doubled >= 10:
            total_sum += ((doubled // 10) + (doubled % 10))
        else:
            total_sum += doubled           
        index -= 2
    return total_sum


def get_sum_of_digits_in_odd_indices(string_digits):
    total_odd_sum = 0
    index = len(string_digits) - 1
    while index >= 0:
        digit = int(string_digits[index])
        total_odd_sum += digit     
        index -= 2    
    return total_odd_sum


def total_sum(first_number, second_number):
    return first_number + second_number


def get_card_validity(string_digits, number):
    if len(string_digits) < 13 or len(string_digits) > 16:
        return "Invalid"
    if number % 10 == 0:
        return "Valid"
    else:
        return "Invalid"

def check_card_type(string_digits):
    if len(string_digits) == 0:
        return "Invalid Card Type"
    if string_digits[0] == "4":
        return "Visa Card"
    elif string_digits[0] == "5":
        return "MasterCard"
    elif string_digits[0] == "6":
        return "Discover Card"
    elif len(string_digits) > 1 and string_digits[0] == "3" and string_digits[1] == "7":
        return "American Express Card"
    else:
        return "Invalid Card Type"



