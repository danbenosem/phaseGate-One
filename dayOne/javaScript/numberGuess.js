const prompt= require("prompt-sync")();






let score=0;

let num= Math.random()*100
let randomNum = Math.floor(num)

console.log(randomNum)




while (true){
   
    let user= prompt ("enter the guess:")

    if (user<randomNum){
        console.log("number is lower")
        
        score++
}
    else if (user> randomNum){
        console.log("number is higer")
        
        score++
}
    else if (user==randomNum){
        console.log("it is correct");
        score+=1
        break

}
    else if (user> 100 || user<1){
        console.log(" ERROR")
        score+=1
    }


    else{
        console.log("not a number");
        score+=1
    
}

    
    if (score ==5){

        break;
}

}


  if (score==1){
    console.log(`final summary is correct number ${randomNum}, attempted number: ${score}`)
    
   console.log("Rating: Lengendary");
} else   if (score==2){

 console.log(`final summary is correct number ${randomNum}, attempted number: ${score}`)
   console.log ("Rating: Excellent");

} else   if (score==3|| score ==4){
  console.log(`final summary is correct number ${randomNum}, attempted number: ${score}`)
   console.log("Rating: Good");

} else   if (score==5){

  console.log(`final summary is correct number ${randomNum}, attempted number: ${score}`)
   console.log("Rating: Close");
}else {
   console.log(`final summary is correct number ${randomNum}, attempted number: ${score}`);
   console.log("Rating: Better Luck");

}




























