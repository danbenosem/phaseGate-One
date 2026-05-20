import unittest
from parkinglot import*

class TestMultiply(unittest.TestCase):

    def thatyoucantadd(self):
         array =[1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0];
         expected = "slotnumber is occupied you can't add"
           
         self.assertEqual(expected,parkinglot(1,1,0,array))


    def itIsOccupied(self):
    
       array =[1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0]
       expected = "slotnumber 7 is now occupied";
           
       self.assertEqual(expected,parkinglot(7,1,0,array))


    
