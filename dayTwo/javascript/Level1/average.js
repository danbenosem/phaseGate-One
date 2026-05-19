const prompt = require('prompt-sync')();



let first_number = Number(prompt(" Enter the first number: "))

let second_number= Number(prompt(" Enter the second number: "))

let third_number= Number(prompt(" Enter the third number: "))

let sum= first_number + second_number + third_number

let average = sum/3

console.log(`The average is ${average } `)
 
