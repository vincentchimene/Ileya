from unittest import TestCase
from non_perfect_square_replaced import *

class NonPerfectSquareTest(TestCase):
    def test_that_negative_numbers_are_not_counted_as_perfect_squares(self):
    array =[14, 9, 6, -9, -25, 36]
    expected = get_perfect_square(array)
    actual = [-1, 9, -1, -1, -1, 36]
    self.assertEqual(actual, expected)
    
    
    def test_that_get_perfect_returns_perfect_squares_and_minus_1_for_non_pefect_squares(self):
    array =[14, 9, 6, 0, 25, 36]
    expected = get_perfect_square(array)
    actual = [-1, 9, -1, 0, 25, 36]
    self.assertEqual(actual, expected)
    
