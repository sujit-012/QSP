//!scope => area or block of code

//! 1. Global Scope

// var x = 100;
// let y = 200;
// const z = 300;

// console.log(x, y, z);

// function demo() {
//   console.log(x, y, z);
// }

// demo();

//? Global variable is access evrywhere in the code

//! 2. Function or local Scope

// function demo() {
//   var x = 100;
//   let y = 200;
//   const z = 300;
//   console.log(x, y, z);
// }

// function demo2() {
//   console.log(x, y, z); //*Error
// }

// demo();
// demo2();
// console.log(x, y, z); //* Error

//? Local variable is only accessible only in its function means accessible only in local scope or function scope

// var x = 18;
// let y = 20;
// const z = 30;

// function demo() {
//   var x = 100;
//   let y = 200;
//   const z = 300;
//   console.log(x, y, z);
// }

// function demo2() {
//   console.log(x, y, z);
// }

// demo();
// demo2();
// console.log(x, y, z);

//? Variable shadowing => local or global variable created of the same name then the preference is given to the local variable

//! 3. Block Scope
// for (let i = 1; i <= 100; i++) {
//   console.log(i);
//   //? Block Scope
// }

// if (true) {
//   var x = 100;
//   let y = 200;
//   const z = 300;
// }

// console.log(x); //? only var is the access outside the the block scope => var is block Scope
// //console.log(y); //* Error
// //console.log(z); //* Error

//! 4. Lexical Scope
//? The area which belongs to the parent called as lexical area
// let x = 100;
// function parent() {
//   let y = 200;
//   function child() {
//     let z = 300;
//     console.log(x);
//     console.log(y);
//     console.log(z);
//   }
//   console.log(z);

//   child();
// }

// //? Scope Chaining => first child sercah in its area then search in parent then search in global scope
// parent();
