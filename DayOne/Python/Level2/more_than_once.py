def get_more_than_once(array):
    if len(array) < 2:
        return []
    array.sort()
    result = []
  
    for index in range(1, len(array)):
        if array[index] == array[index - 1]:
              if index == 1 or array[index] != array[index - 2]:
                result.append(array[index])              
    return result

array = [9, 9, 6, -9, 5, 9, 9, -25, -25]
print(get_more_than_once(array))

