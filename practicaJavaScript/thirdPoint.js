/*
Function pow(x,n)
importance: 4
Write a function pow(x,n) that returns x in power n. Or, in other words, multiplies x by itself n times and returns the result.

pow(3, 2) = 3 * 3 = 9
pow(3, 3) = 3 * 3 * 3 = 27
pow(1, 100) = 1 * 1 * ...* 1 = 1
Create a web-page that prompts for x and n, and then shows the result of pow(x,n).

Run the demo

P.S. In this task the function should support only natural values of n: integers up from 1.
*/
function pow(x, n) {
    if (n === 0) {
      return 1;
    } else {
      return x * pow(x, n - 1); 
    }
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
  
      const result = pow(num1, num2);
      console.log(`El resultado es: ${result}`);
  
      rl.close();
    });
  });