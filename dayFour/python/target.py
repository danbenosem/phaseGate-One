array1= [8,-2,4]

def array (array1, number):

    sum=0

    nArr=  []
    for value in array1:
        for value2 in array1:
 
            sum= value + value2
            if sum==number:
                nArr.append(value)
                
                break;

               
            
         

    return nArr;


print(array(array1,6));





