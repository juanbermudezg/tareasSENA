/*
Rewrite the function using '?' or '||'
importance: 4
The following function returns true if the parameter age is greater than 18.

Otherwise it asks for a confirmation and returns its result.

function checkAge(age) {
  if (age > 18) {
    return true;
  } else {
    return confirm('Did parents allow you?');
  }
}
Rewrite it, to perform the same, but without if, in a single line.

Make two variants of checkAge:

Using a question mark operator ?
Using OR ||
*/
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function checkAge(age) {
  return (age > 18) || confirm('Did parents allow you?');
}
function checkAge2(age) {
    return (age > 18) ? true : confirm('Did parents allow you?');
}

rl.question('¿Cuál es tu edad? ', (answer) => {
  let userAge = parseInt(answer);

  if (checkAge(userAge)) {
    console.log('Eres mayor de 18 años o tienes permiso de tus padres.');
  } else {
    console.log('Eres menor de 18 años y no tienes permiso de tus padres.');
  }

  rl.close();
});