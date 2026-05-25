from unittest import TestCase
from palindromic import *

class PalindromicTest(TestCase):
    def test_that_is_palindromic_returns_false_for_non_palindromic_array(self):
    array =[14, 9, 6, 5, 8, 10]
    expected = is_palindromic(array)
    actual = False
    self.assertEqual(actual, expected)
    
    
    def test_that_is_palindromic_returns_true_for_palindromic_array(self):
    array =[45, 0, 8, 0, 45]
    expected = is_palindromic(array)
    actual = True
    self.assertEqual(actual, expected)
    
