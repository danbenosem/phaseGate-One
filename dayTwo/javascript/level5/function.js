function NegativeArray(array){

    
let  newArr=  [array.length];

for (let index=0; index<array.length; index++){

    if(array[index]<0){

        newArr[index]=0;
    }else{
       newArr[index]=array[index];
}
  
}

return newArr;




}



let array =[5,-9,3,-6,2,-11];

console.log(NegativeArray(array))
 


  


    
