from unittest import TestCase
from book_suggestion_system import *

class TestBookSuggestionSystem(TestCase):

    def test_that_add_book_function_adds_book(self):
        books.clear()
        books.extend([
            {"name": "Money Man", "pages": 98},
            {"name": "Jungle Boy", "pages": 79},
            {"name": "Happy Life", "pages": 110}
        ])
        add_book("Ijorabi", 95)
        self.assertEqual(len(books), 4)
        self.assertEqual(books[-1]["name"], "Ijorabi")
     
    def test_that_add_book_function_does_not_add_an_existing_book(self):
        books.clear()
        books.extend([
            {"name": "Money Man", "pages": 98},
            {"name": "Jungle Boy", "pages": 79},
            {"name": "Happy Life", "pages": 110}
        ])
        add_book("Money Man", 98)
        self.assertEqual(len(books), 3)
        self.assertEqual(books[-1]["name"], "Happy Life")
        
    def test_that_get_suggestions_returns_name_and_page(self):
        name, page = get_suggestions()
        self.assertIsInstance(name, str)
        self.assertIsInstance(page, int)
      
    def test_that_remove_book_removes_an_existing_book(self): 
        books.clear()
        books.extend([
            {"name": "Money Man", "pages": 98},
            {"name": "Jungle Boy", "pages": 79},
            {"name": "Happy Life", "pages": 110}
        ])
        remove_book("Jungle Boy")
        self.assertEqual(len(books), 2)
        self.assertEqual(books, [{"name": "Money Man", "pages": 98}, {"name": "Happy Life", "pages": 110}])
        
    def test_remove_non_existing_book(self):
        remove_book("Life Of Ayo")
        self.assertEqual(len(books), 3)
        
    def test_update_book(self):
        books.clear()
        books.extend([
            {"name": "Money Man", "pages": 98},
            {"name": "Jungle Boy", "pages": 79},
            {"name": "Happy Life", "pages": 110}
        ])
        update_book("Money Man", "Onye Ego")
        self.assertEqual(books, [{"name": "Onye Ego", "pages": 98}, {"name": "Jungle Boy", "pages": 79}, {"name": "Happy Life", "pages": 110}])

    def test_update_non_existing_book(self):
        books.clear()
        books.extend([
            {"name": "Money Man", "pages": 98},
            {"name": "Jungle Boy", "pages": 79},
            {"name": "Happy Life", "pages": 110}
        ])
        update_book("Big Lie", "Lagos Nights")
        self.assertEqual(books, [{"name": "Money Man", "pages": 98},
            {"name": "Jungle Boy", "pages": 79},
            {"name": "Happy Life", "pages": 110}])
        self.assertEqual(len(books), 3)


        
        
        
        
        
