//There are 7 primitive datatypes in js
//number
//String
//null
//undefined
//BigInt
//Boolean
//Symbol

// //Number
// let x = 10;
// let a = 10.33;
// let b = -12;

// console.log(typeof x, x);
// console.log(typeof a, a);
// console.log(typeof b, b);

// //boolean
// let x = true;
// let a = false;

// console.log(typeof x, x);
// console.log(typeof a, a);

// //Null
// let x = null; //type of null is object
// console.log(typeof x, x);

// let a = 10;
// a = null;
// console.log(typeof a, a);

// //Undefined
// let x;
// console.log(typeof x, x); //null and undefined difference

// //String
// let x = "sujit"; //Double Quotes
// console.log(typeof x, x);

// let a = 'sujit'; //Single Quotes
// console.log(typeof a, a);

// let b = `sujit`; Backticks
// console.log(typeof b, b);

// //bigInt
// let x = 70924872407329723490572345072589720375207935759723n;
// console.log(typeof x, x);

// let a = 12n;
// console.log(typeof a, a);

// let b = Number.MAX_SAFE_INTEGER;
// console.log(typeof b, b);

// //Symbol
// let x = Symbol(10);
// let y = Symbol(10);
// console.log(typeof x, x);
// console.log(typeof y, y);

// console.log(x == y); //False

// //NaN -> Not a Number
// let x = 10;
// let y = "Hello";

// let z = x * y;
// console.log(typeof z, z);

// let x = 10;
// let y = "10";

// console.log(x == y);
// console.log(x === y);

// console.log(console);

//alert("Warnig !!");
// let x = confirm("LogOut");
// console.log(x);

// let x = prompt("Enter a name");
// console.log(x);

// if (false) {
//   console.log("If block");
// } else {
//   console.log("Else block");
// }

// let x = 100;
// if (x > 200) {
//   console.log("yes");
// } else {
//   console.log("No");
// }

// let y = prompt("Enter a number");
// if (y % 2 === 0) {
//   console.log("Even");
// } else {
//   console.log("odd");
// }

// let userName = prompt("Enter username");
// let password = prompt("Enter password");

// if (userName && password) {
//   console.log("Login Successfull");
// } else {
//   alert("Enter a both the field");
// }

// let x = prompt("Enter a number :");
// let y = Number(x);
// console.log(typeof y, y);

// let x = Number(prompt("Enter a number :"));
// console.log(typeof x, x);

// let y = Number(prompt("Enter a number"));
// if (y % 2 === 0) {
//   console.log("Even");
// } else {
//   console.log("odd");
// }

let x = Number(prompt("Enter a number1 :"));
let y = Number(prompt("Enter a number2 :"));
console.log(x + y);
console.log(x - y);
console.log(x * y);
console.log(x / y);
console.log(x % y);
