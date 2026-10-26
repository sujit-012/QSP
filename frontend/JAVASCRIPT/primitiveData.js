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

// if (userName && password) {      //   //truthy and falsy values are used here
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

// let x = Number(prompt("Enter a number1 :"));
// let y = Number(prompt("Enter a number2 :"));
// console.log(x + y);
// console.log(x - y);
// console.log(x * y);
// console.log(x / y);
// console.log(x % y);

// let a = 10;
// let b = 20;

// console.log("The sum of " + a + " and " + b + " is " + (a + b));
// console.log(`The sum of ${a} and ${b} is ${a + b}`);

// let c = "Hello \njavaScript";
// console.log(c);

// let d = `
// Hello
// JavaScript`; //Backtick is used to create the template literals

// console.log(d);

// console.log(10 - "10"); //0 built - in it 10 - Number("10") => 10 - 10 = 0 autmoatically this will happen it is known as type coercion
// console.log(10 * "10"); //1000 built - in it 10 * Number("10") => 10 * 10 = 100 autmoatically this will happen it is known as type coercion
// console.log("10" - "10"); //0 => number(10) - number(10) => 10 - 10;
// console.log("10" - "js"); //NaN => js in not a number => Number(10) - NUmber("js") => js is not a number

//truthy and falsy value

// let x = " ";
// if (x) {
//   console.log("truthy");
// } else {
//   console.log("falsy");
// }

// console.log(Boolean(0)); //FALSE
// console.log(Boolean(1)); //TRUE
//falsy values => 0, -0, 0n, "", NaN, false, null, undefined => insted of false we can use these values in conditions
//truthy Values => rest all are truthy values

// for (let i = 0; i <= 5; i++) {
//   console.log(i);
// }

// let i = 0;
// while (i <= 5) {
//   console.log(i);
//   i++;
// }

// for (let i = 1; i <= 100; i++) {
//   if (i % 2 == 0) {
//     console.log(i);
//   }
// }

// for (let i = 2; i <= 100; i++) {
//   let isPrime = true;
//   for (let j = 2; j <= i / 2; j++) {
//     if (i % 2 == 0) {
//       isPrime = false;
//     }
//   }

//   if (isPrime) {
//     console.log(i);
//   }
// }

let count = 0;
let num = Number(prompt("Enter a number : "));

while (num > 0) {
  count++;
  num = Math.trunc(num / 10);
}

console.log(count);
