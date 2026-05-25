def is_palindromic(array):
    check = True

    for index in range(len(array) // 2):
        if array[index] != array[len(array) - 1 - index]:
            check = False
            break
            
    return check


