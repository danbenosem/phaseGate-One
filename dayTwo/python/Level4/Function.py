


def add(number1,number2):
    return number1 + number2


print(add(1,2))    


def even (number):
    if number % 2==0:
        print("it is even")
    else:
        print("not even")

even(2)



def square (number):
    return number * number




print(square(2))



def celsius (number):
    fah= (number*9/5) + 32
    return fah




print(celsius(4))




def prime (number):
    isbool=True;

    for index in range(2,number):
      
        if number% index==0:
            isbool= False;
            return "not prime"
            break
          
      
    

   
   


    if isbool==True:

        return "prime"
       





print(prime(13))





def largest(firstNum,secondNum,thirdNum):
    maximum=0


    if firstNum>maximum:

        maximum = firstNum



    if secondNum>maximum:

        maximum = secondNum;




    if thirdNum>maximum:

        maximum = thirdNum;




    return maximum;









print(largest(1,2,3))




def interest(principal,  rate,  time):


    simple= (principal * rate * time)/100;

    return simple;





print(interest(12,12,12))




def area(length,width):
    return length* width


print(area(2,1))



















