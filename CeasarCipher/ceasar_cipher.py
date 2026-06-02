def get_letter(word, shift, mode = "encript"):
    if mode == "decript":
        shift = -shift        
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    position = 0;
    new_word = ""
    for letter in word:
        if letter in alphabet:
            position = alphabet.index(letter)  
            new_position = (position + shift)%26
        new_word += alphabet[new_position]
    return new_word

user_input = input("Enter your text")
shift = int(input("Enter number for shift"))
word = user_input.lower()
print(get_letter(word,shift)
