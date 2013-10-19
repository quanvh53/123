import itertools
from input import *
import unittest

def readInput():
    data = main.__doc__
    list = data.split('\n')
    list.pop(0)
    list.pop()
    result = []
    for i in list :
        a = []
        temp =''
        temp = temp +i[i.find('[')+1:]
        temp  = temp.split('[')
        for section in temp:
            sect = ''
            sect = section[: -1]
            sect = sect.split(';')
            a.append(sect)
        result.append(a)
    return result


def createTests():
    list = readInput()
    list1 = []
    testList=[]
    for i in list:
        list2= []
        for j in i: 
            ave = (int(j[0]) + int(j[1]))/2
            list2.append(ave)
        list1.append(list2)
    for element in itertools.product(*list1):
        testList.append(element)
    return testList

def check(a =[]) :
    for i in a :
        for k in i :
            if (k[0] > k[1]) : return True
    return False

if check(readInput()) :
    raise Exception("wrong input");

class myTest(unittest.TestCase):
    pass
    
def call_test(a, b):
    def test(self):
        self.assertEqual(a,b)
    return test

if __name__ == '__main__':
    list = createTests()
    for i in range(0,len(list)):
        test_name = 'test_%s' %i
        test = call_test(main(*list[i]),None)
        setattr(myTest, test_name, test)

unittest.main()
