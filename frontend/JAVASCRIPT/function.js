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

// let a = () => {
//   console.log(arguments[0]); //? arguments array are not present for the arrow function
// };

// a(10, 20, 30);

//! Nested function
//? Writing a function inside the function
//? function creates inside the another function and need to call ins

// function parent() {
//   console.log("Parent function");

//   function child() {
//     console.log("child function");
//   }

//   child(); //? Child fuction needs to call in the parent function only
// }

// parent();
// //child(); error

// let parent = () => {
//   console.log("Parent functio");

//   let child = () => {
//     console.log("Child function");
//   };

//   child();
// };

// parent();

//! Higher Order and CallBack Function

//* Approach 1
// function demo(a, b, c) { //? c -> is the call back function ==> an parameter ic call to another function is called as callback function
//   console.log(a);
//   console.log(b);
//   c();
// }

// demo(100, true, function () {  //? A fucntion which contain function in argument is calles as higher order function
//   console.log("function excuted");
// });

// let demo = (a, b, c) => {
//   console.log(a);
//   console.log(b);
//   c();
// };

// demo(89, false, () => {
//   console.log("function excuted");
// });

//*Approach 2
// let demo1 = (a, b) => {
//   console.log("demo1 is excuted", a);
//   b();
// };

// let demo2 = () => {
//   console.log("demo2 is excuted");
// };

// demo1(200, demo2);

//! task 2
// let demo = (a, b, c) => {
//   console.log(c(a, b));
// };

// demo(5, 10, (x, y) => {
//   return x + y;
// });

//! task 3
// let demo = (a) => {
//   a();
//   a();
//   a();
// };

// demo(() => {
//   console.log("Excuted");
// });

//! task 4
// let demo = (a, b) => {
//   if (a > 50) {
//     b();
//   }
// };

// demo(51, () => {
//   console.log("Number is greater than 50 ");
// });

//! task 5

// let demo = (a, b) => {
//   a();
//   b();
// };

// demo(
//   () => {
//     console.log("Callback 1");
//   },
//   () => {
//     console.log("callback 2");
//   },
// );

//! task 6
// let demo = (a, b) => {
//   b(a);
// };

// demo(50, (x) => {
//   console.log(x);
// });

//! task 7

// let demo = (a, b, c) => {
//   return c(a, b);
// };

// console.log(
//   demo(100, 200, (x, y) => {
//     return x + y;
//   }),
// );

//! task 8

//! task 9

// let demo = (a, b, c) => {
//   if (a % 2 == 0 && b % 2 == 0) {
//     c();
//   } else {
//     console.log("Both numbers are not even");
//   }
// };

// demo(100, 198, () => {
//   console.log("Both the numbers are even");
// });

//! task 10

//! Pure & Improve function
//? funnction which should not modify the oustide variables

// //* Impure
// let x = 10;
// function demo1(a, b) {
//   x++;
//   return a + b;
// }

// demo1(10, 890);

// //* pure
// function demo2(a, b) {
//   return a + b;
// }

// demo2(100, 200);
// demo2(10, 20);

//! Generator function

function* demo() {
  yield 100;
  yield 200;
  return 300;
}

let result = demo();

let a = console.log(result.next().value);
console.log(result.next().value);
console.log(result.next().value);
