import random

number=0;
score=0;


randomNum= random.randint(1,100)
while True:
   
    
    user= int(input("guess the random number"))

    if user<randomNum:
        print("number is lower")
        
        score+=1

    elif user> randomNum:
        print("number is higer")
        
        score+=1

    elif user==randomNum:
        print("it is correct");
        score+=1
        break


    elif user> 100 or user<1:
        print(" ERROR")
        score+=1
    
    else:
        print("not a number");
        score+=1
    

    
    if score ==5:
        break;





if score==1:
    print(f"Final summary is correct number {randomNum} , attempts number: {score}")
    print("Rating: Lengendary")
elif score==2:

   print(f"Final summary is correct number {randomNum} , attempts number: {score}")
   print("Rating: Excellent")

elif score==3 or score ==4:
      print(f"Final summary is correct number {randomNum} , attempts number: {score}")
      print("Rating: Good")

elif score==5:

     print(f"Final summary is correct number {randomNum} , attempts number: {score}")
     print("Rating: Close")

else:
    print(f"Final summary is correct number {randomNum} , attempts number: {score}")
    print("Rating: Better Luck");






























