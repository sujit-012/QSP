// let a = [10, 20, 30, 40];

// console.log(a);

// let b = [];
// b[0] = 10;
// b[1] = 20;
// b[5] = 50;
// console.log(b);

// let fruits = ["Mango", "Apple", "Banana", "Graph", "Orange"];

// console.log(fruits[0]);
// fruits[3] = "Kiwi";
// console.log(fruits.length);

// fruits[10] = "Grapes";
// fruits[5] = "Watermelon";
// console.log(fruits);

// let arr = [10, "Mango", true, 20, "Apple", false];
// console.log(arr);

// let animals = ["Lion", "tiger"];
// // animals.push("Rabit");
// // animals.push("Elephant");
// // animals.push("Dog", "Wolf");

// animals.unshift("Rabit");
// animals.unshift("Elephant");
// animals.unshift("Dog", "Wolf");

// // animals.pop();
// // animals.pop();

// // animals.shift();
// // animals.shift();

// console.log(animals);
// // animals.splice(2, 2);

// //animals.splice(3, 0, "Monkey");

// //? pop
// animals.splice(animals.length - 1, 1);

// //? shift
// animals.splice(0, 1);

// //? unshift
// // animals.splice(0, 0, "Monkey");
// // //? push
// // animals.splice(animals.length, 0, "Monkey");
// console.log(animals);

// //! task
let cart = [];

let showCart = () => console.log(cart);

let addProduct = () => {
  let pro = document.getElementById("product").value;

  if (pro) {
    cart.push(pro);
    alert("Product added");
  } else {
    alert("Enter a product first");
  }
};

// let fruits = ["Mango", "Apple", "Banana", "Graph", "Orange"];

// let subar = fruits.slice(1, 3);

// console.log(fruits);
// console.log(subar); // ['Apple', 'Banana']

// console.log(fruits.slice(1)); // ['Apple', 'Banana', 'Graph', 'Orange']

// for (let i = 0; i < fruits.length; i++) {
//   console.log(fruits[i]);
//}

// fruits.forEach((ele, idx) => {
//   console.log(ele, idx);
// });

//let arr = [10, 20, 30, 40, 50, 60, 70, 80];

// for (let i = 0; i < arr.length; i++) {
//   console.log(arr[i], i);
// }

//? forEachImplementation
// function printElements(ele, idx) {
//   console.log(ele, idx);
// }

// for (let i = 0; i < arr.length; i++) {
//   printElements(arr[i], i);
// }
// arr.forEach((ele, idx) => {
//   console.log(ele, idx, arr);
// });

// function demo(cb) {
//   cb(10);
// }

// demo((a) => {
//   console.log(a);
// });

// function demo() {
//   let a = 10 + 20;
// }

// let y = demo();
// console.log(y);

// function demo(cb) {
//   let x = cb(10);
//   return x;
// }

// let y = demo((a) => {
//   return a;
// });

// console.log(y);

// //? Internal implementation of forEcah functio
// function forEcah(cb) {
//   for (let i = 0; i < arr.length; i++) {
//     cb(arr[i], i);
//   }
// }

// forEcah((ele, idx) => {
//   console.log(ele, idx);
//});

// let x = arr.map((ele, idx, arr) => {
//   return ele * 2;
// });

// console.log(x);
// console.log(arr);

//! Internal implementation of map method
// function demo(cb) {
//   let arr2 = [];

//   for (let i = 0; i < arr.length; i++) {
//     let x = cb(arr[i], i, arr);
//     arr2.push(x);
//   }

//   return arr2;
// }

// let y = demo((ele, idx, arr) => {
//   return ele * 2;
// });

// console.log(y);
// console.log(arr);

// let fruits = ["Mango", "Apple", "Banana", "Graph", "Orange"];

// fruits.map((ele) => {});

// let arr = [10, 100, 50, 200, 300, 90];
// let newArr = [];

// for (let i = 0; i < arr.length; i++) {
//   if (arr[i] > 100) {
//     newArr.push(arr[i]);
//   }
// }

// console.log(newArr);

// function filter(cb) {
//   let ans = [];
//   for (let i = 0; i < arr.length; i++) {
//     if (cb(arr[i])) {
//       ans.push(arr[i]);
//     }
//   }
//   return ans;
// }

// let newArr = arr.filter((ele) => {
//   return ele > 100;
// });

// let newArr = filter((ele) => {
//   return ele > 100;
// });

// let ans = filter((ele) => {
//   return ele % 3 === 0;
// });

let fruits = ["Mango", "Apple", "Banana", "Grapes", "Orange"];

// let ans = fruits.filter((ele) => {
//   return ele.length > 5;
// });

// let ans = fruits.filter((ele) => {
//   return ele.startsWith("A") || ele.startsWith("a");
// });

// let flowers = [
//   "Lilly",
//   "Rose",
//   "Lotus",
//   "SunFlower",
//   "MariGold",
//   "RedRose",
//   "Lavendor",
// ];

// let ans = flowers.filter((ele) => {
//   return ele.length > 5 && (ele.startsWith("L") || ele.startsWith("l"));
// });

// let str = flowers.join(" ");

// let str = "Hello";

// // let strArr = str.split("");
// // strArr.reverse();
// // let str2 = strArr.join("");

// let str2 = str.split("").reverse().join("");

//?===========================================================================================================================================
// console.log(str2);
// console.log(str);

// let flowers = [
//   "Lilly",
//   "Rose",
//   "Lotus",
//   "SunFlower",
//   "MariGold",
//   "RedRose",
//   "Lavendor",
// ];

// flowers.sort();
// console.log(flowers);

// let arr = [10, 100, 50, 200, 300, 90];

// // arr.sort();
// // console.log(arr);

// // arr.sort((a, b) => {
// //   return a - b;
// // });

// let x = arr.every((ele) => {
//   return ele > 50;
// });

// console.log(x);

// let y = arr.some((ele) => {
//   return ele > 5;
// });

// console.log(y);

// console.log(arr);

// let arr = [10, 20, 30, 40];

// let x = arr.reduce((acc, cu) => {
//   return (acc = acc + cu);
// }, 0);

// console.log(x);

// let flowers = [
//   "Lilly",
//   "Rose",
//   "Lotus",
//   "SunFlower",
//   "MariGold",
//   "RedRose",
//   "Lavendor",
// ];

// let x = flowers.reduce((acc, cu) => {
//   return (acc = acc + cu);
// });

// console.log(x);

// let arr = [10, 20, 30, 40];

// let x = arr.reduce((acc, cu) => {
//   return acc;
// }, 0);

// console.log(x);

// let arr = [10, 20, [30, 40]];

// console.log(arr);

// let arr = [10, 20, [30, 40, [50, [60, [70]]]]];
// console.log(arr);

// let x = arr.flat(Infinity);
// console.log(x);

// let arr = [10, 20, 30, 40, 30];

// let ans = (arr) => {
//   let arr2 = [];
//   let v = new Array(arr.length).fill(false);

//   for (let i = 0; i < arr.length; i++) {
//     if (v[i]) {
//       continue;
//     }

//     for (let j = i + 1; j < arr.length; j++) {
//       if (arr[i] === arr[j])
//         v[j] = true;
//       }
//     }

//     arr2.push(arr[i]);
//   }

//   return arr2;
// };

// console.log(ans(arr));

// let arr = [10, 20, 30, 40, 30];

// let x = arr.includes(30);
// console.log(x);

// delete arr[2];
// console.log(arr);
// console.log(arr.length);

// console.log(true + 1); //2
// console.log(false + 1); //1
// console.log(null + 1); // 1
// console.log(Number(null)); //0
// console.log([] + 1); //1
// console.log(typeof ([] + 1)); //string
console.log([10, 20] + 1); //10, 201 ==> "10, 20" + 1

console.log([10, 20] + [30, 40]); //10, 2030, 40 ==> "10, 20" + "30, 40"

console.log("10" - 1);
