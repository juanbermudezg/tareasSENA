/*
Function min(a, b)
importance: 1
Write a function min(a,b) which returns the least of two numbers a and b.

For instance:

min(2, 5) == 2
min(3, -1) == -1
min(1, 1) == 1
*/
function min(a, b) {
    return a < b ? a : b;
}
  
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.question('Dime un número: ', (answer) => {
  const num1 = parseInt(answer); 
  rl.question('Dime otro número: ', (answer2) => {
    const num2 = parseInt(answer2); 

    const minValue = min(num1, num2);
    console.log(`El número más pequeño es: ${minValue}`);

    rl.close();
  });
});