/*
Rewrite "if" into "switch"
importance: 4
Rewrite the code below using a single switch statement:

let a = +prompt('a?', '');

if (a == 0) {
  alert( 0 );
}
if (a == 1) {
  alert( 1 );
}

if (a == 2 || a == 3) {
  alert( '2,3' );
}
*/
// Simulate the value of 'a' (replace this with an actual value for testing)
let a = 2;

switch (a) {
  case 0:
    console.log(0);
    break;
  case 1:
    console.log(1);
    break;
  case 2:
  case 3:
    console.log('2,3');
    break;
  default:
    console.log('Invalid value of a');
    break;
}
