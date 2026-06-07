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
            letter = alphabet[new_position]
            
        new_word += letter
    return new_word

user_input = input("Enter your text")
shift = int(input("Enter number for shift"))
mode = input("Enter mode ()")
word = user_input.lower()
print(get_letter(word,shift))

