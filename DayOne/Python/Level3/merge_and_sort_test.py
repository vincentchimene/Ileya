from unittest import TestCase
from merge_and_sort import get_merged_and_sorted


class TestMergeAndSort(TestCase):

    def test_that_already_sorted_arrays_merges_and_sort(self):
        first_array = [1, 2, 3]
        second_array = [4, 5, 6]

        expected = get_merged_and_sorted(first_array, second_array)

        self.assertEqual(expected, [1, 2, 3, 4, 5, 6])


    def test_that_arrays_with_duplicates_merge_and_sort(self):
        first_array = [1, 2, 2]
        second_array = [2, 3, 3]

        expected = get_merged_and_sorted(first_array, second_array)

        self.assertEqual(expected, [1, 2, 2, 2, 3, 3])


    def test_that_with_an_empty_array_it_merges_and_sorts(self):
        first_array = []
        second_array = [2, 1, 3]
        expected = get_merged_and_sorted(first_array, second_array)
        self.assertEqual(expected, [1, 2, 3])
        
        first_array = [9, 7, 8]
        second_array = []
        expected = get_merged_and_sorted(first_array, second_array)
        self.assertEqual(expected, [7, 8, 9])

