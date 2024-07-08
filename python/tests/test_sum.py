import unittest
from sum import sum

class TestSum(unittest.TestCase):

    def test_sum_zero(self):
        self.assertEqual(sum(0,0), 0)

    def test_sum_three(self):
        self.assertEqual(sum(1,2), 3)

if __name__ == '__main__':
    unittest.main()