

array=[5,-9,3,-6,2,-11]




def negative_removed(array):

    
    newArr=  []

    for index in range( len(array)):

        if array[index]<0:

            newArr.append(0);
        else:
            newArr.append(array[index]);


    return newArr;








print(negative_removed(array))
 


  


    
