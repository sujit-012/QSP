// //!task1
// let arr = [2, 5, 10, 7];

// let ans = arr.map((ele) => {
//   return ele * 2;
// });

// console.log(ans);

// //!task 2
// let name = ["akash", "kiran", "sita"];

// let a = name.map((ele) => {
//   return ele.toUpperCase();
// });

// console.log(a);

// //!task3
// let fruits = ["apple", "orange", "kiwi"];

// let b = fruits.map((ele) => {
//   return ele.length;
// });

// console.log(b);

// //! taks 4
// let arr1 = [10, 20, 30];

// let c = arr1.map((ele) => {
//   return ele + 5;
// });

// console.log(c);

// //! task 5
// let arr2 = [100, 200, 350];

// let d = arr2.map((ele) => {
//   return ele + ele * (18 / 100);
// });

// console.log(d);

// //!task6
// let city = ["chennai", "Delhi", "Mumbai"];

// let ans = city.map((ele) => {
//   return ele.substring(0, 2);
// });

// console.log(ans);
// console.log(city);

// //!task 7

// let mark = [90, 65, 40];

// let ans1 = mark.map((ele) => {
//   if (ele >= 80) {
//     return "A";
//   } else if (ele >= 60) {
//     return "B";
//   } else {
//     return "C";
//   }
// });

// console.log(ans1);

// //!task8
// let number = [5, 12, 7, 20];

// let ans2 = number.map((ele) => {
//   if (ele % 2 == 0) {
//     return "even";
//   } else {
//     return "odd";
//   }
// });

// console.log(ans2);

// //!task 9
// let price = [250, 500, 1000];

// let ans3 = price.map((ele) => {
//   return ele + 100;
// });

// console.log(ans3);

// //! task 10;

// let city = ["Hydrabad", "Chennai", "Mumbai"];

// let ans = city.map((ele) => {
//   return ele.substring(ele.length - 3);
// });

// console.log(ans);

//! Filter

// //!task 1

// let number = [10, 55, 40, 90, 75];

// let ans = number.filter((ele) => {
//   return ele > 50;
// });

// console.log(ans);

// //!task 2

// let name = ["Akash", "Sita", "Ajay", "Ram"];

// let ans1 = name.filter((ele) => {
//   return ele.startsWith("A");
// });

// console.log(ans1);

// //!task 3
// let num = [11, 20, 31, 42, 55];

// let ans2 = num.filter((ele) => {
//   return ele % 2 == 0;
// });

// console.log(ans2);

// //! task 4
// let fruits = ["apple", "kiwi", "pear", "banana"];

// let ans3 = fruits.filter((ele) => {
//   return ele.length > 4;
// });

// console.log(ans3);

// //!task 5
// let no = [9, 10, 12, 17, 21];

// let ans4 = no.filter((ele) => {
//   return ele % 3 == 0;
// });

// console.log(ans4);

// //!task 6
// let num1 = [10, 25, 40, 50];

// let ans5 = num1.filter((ele) => {
//   return ele <= 30;
// });

// console.log(ans5);

// //!task 7

// let fru = ["apple", "kiwi", "banana"];

// let ans6 = fru.filter((ele) => {
//   let x = ele.indexOf("a");

//   if (x == -1) {
//     return false;
//   }
//   return true;
//
// });

// console.log(ans6);

// //!task 8

//? Mixed Question

//!task1
//? double number ==> filter > 10 ===> find first > 20;
let num = [5, 8, 12, 4];

let x = num
  .map((ele) => ele * 2)
  .filter((ele) => ele > 10)
  .find((ele) => ele > 20);

console.log(x);

//!task 2

let name = ["rakesh", "sita", "ajay"];

let a = name
  .map((ele) => ele.toUpperCase())
  .filter((ele) => ele.length > 4)
  .find((ele) => ele[0] == "A");
console.log(a);

//!task 3

let price = [400, 600, 900, 1200];

let b = price
  .map((ele) => ele + ele * (10 / 100))
  .filter((ele) => ele > 500)
  .find((ele) => ele < 1000);

console.log(b);

//!task 4

let city = ["Mumbai", "Delhi", "Madurai"];

let c = city
  .map((ele) => ele.slice(0, 2))
  .filter((ele) => ele[0] == "M")
  .find((ele) => ele.length == 2);

console.log(c);

//!task 5
let number = [5, 10, 15, 20];

let d = number
  .map((ele) => ele * 2)
  .filter((ele) => ele % 2 == 0)
  .sort((a, b) => b - a);

console.log(d);
