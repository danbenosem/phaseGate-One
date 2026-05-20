array=["dan"]
def (array):

    
for(let index=0; index<array.length; index++){
 
  if(array[index]==("")){

        return "no one likes this";
   }else {

        return array[index] + " and likes this";
    }

}

 return "null";

}

module.exports = { Like };

console.log(Like(array));

