array =[1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0]

def parking (slotnumber,add,remove, array):

 

    for index in range(1,len(array)):
        
        if array[slotnumber]==0 and add==1:
            array[slotnumber]=1;
            return "slotnumber "+slotnumber+" is now occupied";
            

        elif(array[slotnumber]==1 and add==1):
           return "slotnumber is occupied you can't add";
           
         

        if(array[remove]==1):
           array[slotnumber]=0;
           return "it is no longer occupied";
          
    

  

