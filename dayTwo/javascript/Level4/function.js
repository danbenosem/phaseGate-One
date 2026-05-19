


function add(number1,number2){

    return number1 + number2
}


console.log(add (1,2))




function even(number){

   if(number%2==0){
     console.log("it is even");
    
}else{
  console.log("it is not even");
}

}
even(2)



function square( number){


   return number*number;

}


console.log(square(2))




function celsius( number){

   

     let fah = (number * 9/5) + 32;

  return fah;




}


console.log(celsius(4))




function rectangle(length, width){

   

     let area = length * width;

  return area;




}

 
console.log(rectangle(4,4)) 





function  prime( number){

   let isbool=true;

   for(let index=2; index<number; index++){
      
    if (number% index==0){
        isbool= false;
      console.log("not prime");
        break
      
      
    }

   
   
}

   if (isbool==true){

  console.log("prime");
   }


}


prime(10)



function interest(principal,  rate,  time){


let simple= (principal * rate * time)/100;

return simple;



}

console.log(interest(12,12,12))







function maximum(firstNum, secondNum,  thirdNum){

    let maximum=0;

    if(firstNum>maximum){

        maximum = firstNum;
    
}

  if(secondNum>maximum){

        maximum = secondNum;
    
}


  if(thirdNum>maximum){

        maximum = thirdNum;
    
}


return maximum;






}




console.log(maximum(1,2,3))



















