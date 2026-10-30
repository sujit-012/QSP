//* function is a block of code is used to perform the specific task again and again

//? there are manu=y types of function

//! 1. function declaration => fuction which is creates using the function keyword -> they are like hoisted

// function demo() {
//   console.log("Hello Sujit !!");
// }

// demo(); //! fuction calling statement

// function addition(a, b) {
//   console.log(a);
//   console.log(b);

//   console.log(`addtion is ${a + b} \n \n`);
// }

// addition(10, 20);
// addition(50, 40);
// addition(100);

// function employeeSalary(empName, empSal = 0, empBonus = 0) {
//   let totalSalary = empSal + empBonus;
//   console.log(`${empName} is getting the salary is ${totalSalary}`);
// }

// employeeSalary("Kunal", 2500000, 100000);
// employeeSalary("Pappu", 250000);

// function EvenOrOdd(a) {
//   if (a % 2 == 0) {
//     console.log(`${a} is even number`);
//   } else {
//     console.log(`${a} is not a Even number `);
//   }
// }

// EvenOrOdd(Number(prompt("Enter a number : ")));

//function demo() {
//   console.log("From demo function");
//   console.log(arguments);
// }

// demo(10, 20, 30, 40, 50);

//! 2. Function Expression
//? a function which is stored in a variable is called as function expression and that type of function call by the

// let a = function demo() {
//   console.log("Function Expression");
// };

// a();

// let a = function demo(a, b) {
//   console.log(`Addition is ${a + b}`);
// };

// a(10, 20);

// function btn() {
//   console.log("Button Clicked");
// }

// let button = document.getElementsByTagName("button")

//! ANONYMOUS FUNCTION
//? Function which doesn't have any name or identifier and store inside the variable

// let a = function () {
//   console.log("Anonymous Function");
// };

// let a = function (a, b) {
//   console.log(a, b);
//   console.log("Anonymous Function");
// };

// a(10, 20);

//! Immediate Invoke Function
// (function demo() {
//   console.log("Immediate Invoke Function");
// })();

// (function demo(a, b) {
//   return a + b;
//   console.log("Immediate Invoke Function");
// })(10, 20);

//! return

//? void funnction will not return a undefined value

//! Arrow Function

// let a = () => {
//   console.log("Arrow Functions");
// };

// a();

// let a = (a, b) => {
//   console.log("Arrow Functions");
// };

// a(10, 20);

// let a = (a) => {
//   console.log(a);
// };

// a(10);  //? If We pass only single argument them we can nremove the parenthesis in arrow funtion

//? No function key word is present

// let a = (a) => a + a;

// console.log(a(10)); //? when returning single line we can ignore return key word and curly braces

let a = () => {
  console.log(arguments[0]); //? arguments array are not present for the arrow function
};

a(10, 20, 30);
