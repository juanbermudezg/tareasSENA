/*
Rewrite with arrow functions
Replace Function Expressions with arrow functions in the code below:

function ask(question, yes, no) {
  if (confirm(question)) yes();
  else no();
}

ask(
  "Do you agree?",
  function() { alert("You agreed."); },
  function() { alert("You canceled the execution."); }
);
*/
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const ask = (question, yes, no) => {
  rl.question(question + ' (yes/no) ', (answer) => {
    if (answer.toLowerCase() === 'yes') {
      yes();
    } else {
      no();
    }
    rl.close();
  });
};

ask(
  "Do you agree?",
  () => console.log("You agreed."),
  () => console.log("You canceled the execution.")
);

  