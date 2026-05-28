def array_flatner(arrays):
    flattened_array = []
    for array in arrays:
        flattened_array += array
    return flattened_array

arrays = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]
print(array_flatner(arrays))

