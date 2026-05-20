array =[1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0];

function lot (slotnumber,add,remove, array){

 

    for(let index=0; index<array.length; index++){
        
        if(array[slotnumber]==0 && add==1){
            array[slotnumber]=1;
            return "slotnumber "+slotnumber+" is now occupied";
            

         } else if(array[slotnumber]==1 && add==1){
           return "slotnumber is occupied you can't add";
           
         }

       if(array[remove]==1){
       array[slotnumber]=0;
       return "it is no longer occupied";
      
    }

  
}

 
 


//module.exports = { lot };

//console.log(lot(1,2,0,array))
