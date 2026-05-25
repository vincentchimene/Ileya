def get_split_array(array):
    split_array = [[], []]

    for index in range(len(array)):
        if index % 2 == 0:
            split_array[0].append(array[index])  
        else:
            split_array[1].append(array[index])
            
    return split_array


