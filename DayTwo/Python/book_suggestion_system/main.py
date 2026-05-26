from book_suggestion_system import *

message = """   Welcome to the Book Suggestion System!  
    1. Get Suggestions
    2. Add Book
    3. Remove Book
    4. Update book
    5. Show books
    
    Enter 1 - 5 to select an operation.
    
    
    """
while True:
    user_input = input(message)
    match user_input:
        case "1":
            get_suggestions()
        case "2":
            name = input("Enter the book title: ")
            pages = input("Enter the number of pages: ")
            add_book(name, pages)
        case "3":
            name = input("Enter the book title to remove: ")
            remove_book(name)
        case "4":
            old_name = input("Enter the old title: ")
            new_name = input("Enter the new title: ")
            update_book(old_name, new_name)
        case "5":
            show_books()
        

