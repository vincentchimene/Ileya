import math

def is_perfect_square(number):
    check = False
    if number < 0:
        check = False
        return check 
    square_root = int(math.sqrt(number))
    if square_root * square_root == number:
        check = True
        
    return check

def get_perfect_square(array):
    perfect_square_array = []
    for index in range(len(array)):
        if is_perfect_square(array[index]):
            perfect_square_array.append(array[index])
            
    return perfect_square_array


