from unittest import TestCase
from array_splitter import *

class ArraySplitter(TestCase):
    def test_that_get_split_array_splits_given_array_into_a_2D_array_of_even_and_odd_position(self):
        array =[45, 60, 3, 10, 9, 22]
        expected = get_split_array(array)
        actual = [[45, 3, 9], [60, 10, 22]]
        self.assertEqual(actual, expected)

