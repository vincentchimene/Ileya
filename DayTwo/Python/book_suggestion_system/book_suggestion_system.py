import random
books = [
    {"name": "Money Man", "pages": 98},
    {"name": "Jungle Boy", "pages": 79},
    {"name": "Happy Life", "pages": 110}
]

def add_book(name, pages):
    check = False
    for book in books:
        if book["name"] == name:
            check = True
    if check is False:
        books.append({"name": name, "pages": pages})
        print("Book added successfully!")
    else:
        print("Book already exists")
        
  
def get_suggestions():
    suggested_book = random.choice(books)
    page = random.randint(1, suggested_book["pages"])
    print(suggested_book["name"], "page", page)
    return suggested_book["name"], page
    

def  remove_book(name):
    check = False
    for book in books:
        if book["name"] == name:
            check = True
            books.remove(book)
            print(book["name"] + " removed successfully!")
    if check == False:
        print("Book is not available")
        
        
def update_book(old_name, new_name):
    check = False
    for book in books:
        if book["name"] == old_name:
            check = True
            book["name"] = new_name
            print("Book updated successfully!")
    if check == False:
        print("Book does not exist!")


def show_books():
    print(books)
    
            
            
            
            

