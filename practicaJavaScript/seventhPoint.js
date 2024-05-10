/*
Repeat until the input is correct
importance: 5
Write a loop which prompts for a number greater than 100. If the visitor enters another number – ask them to input again.

The loop must ask for a number until either the visitor enters a number greater than 100 or cancels the input/enters an empty line.

Here we can assume that the visitor only inputs numbers. There’s no need to implement a special handling for a non-numeric input in this task.
*/
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
const askForNumber = () => {
  rl.question('Please enter a number greater than 100: ', (answer) => {
    const number = Number(answer);
    if (number > 100) {
      console.log('You entered a valid number greater than 100. Thank you!');
      rl.close();
    } else {
      console.log('Enter a number greater than 100!');
      askForNumber();
    }
  });
};
askForNumber();
