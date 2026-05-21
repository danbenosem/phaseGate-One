
import unittest
from target import*

class TestNumber(unittest.TestCase):

    
    def test_positive_numbers(self):
        array1= [8,-2,4]
        actual= array(array1,6)
        self.assertEqual(actual,[8,-2])

  
 
