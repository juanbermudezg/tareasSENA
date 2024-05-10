/*
Rewrite the "switch" into an "if"
importance: 5
Write the code using if..else which would correspond to the following switch:

switch (browser) {
  case 'Edge':
    alert( "You've got the Edge!" );
    break;

  case 'Chrome':
  case 'Firefox':
  case 'Safari':
  case 'Opera':
    alert( 'Okay we support these browsers too' );
    break;

  default:
    alert( 'We hope that this page looks ok!' );
}
*/
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.question("Please enter your browser name: ", (browser) => {
  if (browser === 'Edge') {
    console.log("You've got the Edge!");
  } else if (browser === 'Chrome' || browser === 'Firefox' || browser === 'Safari' || browser === 'Opera') {
    console.log('Okay we support these browsers too');
  } else {
    console.log('We hope that this page looks ok!');
  }
  rl.close();
});
