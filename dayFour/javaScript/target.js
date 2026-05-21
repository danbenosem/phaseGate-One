array1= [8,-2,4]

function  array (array1, number){

let sum=0;

 nArr=  [];

    for(let index=0; index<array.length; index++){

        for(let index2=0; index2<array.length; index2++){
                
                sum= array1[index]+ array1[index2];
                if(sum==number){
            
                    nArr[1]=(array1[index]);
                    nArr[0]=(array1[index2]);
                    break;

         }

          }
     

    }


return nArr;



}

module.exports = { array };
