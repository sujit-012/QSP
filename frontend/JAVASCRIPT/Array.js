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
// let cart = [];

// let showCart = () => console.log(cart);

// let addProduct = () => {
//   let pro = document.getElementById("product").value;

//   if (pro) {
//     cart.push(pro);
//     console.log("Product added");
//   } else {
//     alert("Enter a product first");
//   }
// };

let fruits = ["Mango", "Apple", "Banana", "Graph", "Orange"];

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

let arr = [10, 20, 30, 40, 50, 60, 70, 80];

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
arr.forEach((ele, idx) => {
  console.log(ele, idx, arr);
});
