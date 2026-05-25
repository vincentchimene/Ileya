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
    result = []  
    for index in range(len(array)):
        if not is_perfect_square(array[index]):
            result.append(-1)
        else:
            result.append(array[index])
            
    return result


