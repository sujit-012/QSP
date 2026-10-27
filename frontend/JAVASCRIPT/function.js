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
