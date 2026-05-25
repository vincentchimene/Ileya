from unittest import TestCase
from perfect_square import *

class PerfectSquareTest(TestCase):


    def test_that_is_perfect_confirms_if_a_number_is_a_perfect_number(self):
    number = 36
    expected = is_perfect_square(number)
    actual = True
    self.assertEqual(actual, expected)
    
    def test_that_is_perfect_confirms_if_a_number_is_not_a_perfect_number(self):
    number = 48
    expected = is_perfect_square(number)
    actual = False
    self.assertEqual(actual, expected)
    
    def test_tha_negatives_numbers_are_not_counted_as_perfect_squares(self):
    array =[14, 9, 6, -9, -25, 36]
    expected = get_perfect_square(array)
    actual = [9, 36]
    self.assertEqual(actual, expected)
    
    
    def test_that_get_perfect_square_returns_an_array_of_perfect_squares(self):
    array =[45, 0, 8, 0, 45]
    expected = get_perfect_square(array)
    actual = True
    self.assertEqual(actual, expected)
    
