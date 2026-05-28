def get_merged_and_sorted(first_array, second_array):
    merged_array = first_array + second_array

    for count in range(len(merged_array) - 1):
        for index in range(len(merged_array) - 1 - count):
            if merged_array[index] > merged_array[index + 1]:
                temp = merged_array[index +1]
                merged_array[index + 1] = merged_array[index]
                merged_array[index] = temp
    return merged_array
                 
first_array = [3, 5, 1]
second_array = [2, 4, 6]
print(get_merged_and_sorted(first_array, second_array))
