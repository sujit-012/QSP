// let str = "Hello javaScript from XYZ";
// // console.log(str.charAt());

// // console.log(str.indexOf("p"));
// // console.log(str.lastIndexOf("l", 565));

// // console.log(str.substring(7, -5));

// // let arr = str.split("a", 4);
// // console.log(arr);

// // let arr = str.includes("l", -4);
// // console.log(arr);

// // let x = str.replace("l", "");
// // console.log(x);

// // let x = str.replaceAll("a", "");
// // console.log(x);

// // let x = str.repeat(4);
// // console.log(x);

// // let x = str.padStart(30, "sujithuu");
// // console.log(x);

// let x = str.padEnd(30, "*");
// console.log(x);

let arr = [50, 10, 60, 20, 30, 40];

// console.log(arr);
// arr.push(70, 80);
// console.log(arr);
// arr.pop();
// arr.pop();
// console.log(arr);
// arr.unshift(70, 80);
// console.log(arr);
// arr.shift();
// arr.shift();
// console.log(arr);
// arr.splice(1, 2);
// console.log(arr);

// let x = arr.slice(1, 4);
// console.log(x);

// arr.forEach((ele) => {
//   console.log(ele * 2);
// });

// let x = arr.map((ele) => {
//   return ele * 2;
// });

// console.log(x);

// let x = arr.filter((ele) => {
//   return ele > 30;
// });

// console.log(x);

// let x = arr.find((ele) => {
//   return ele > 30;
// });

// console.log(x);

// let x = arr.filter((ele) => {
//   return ele > 30;
// });

// console.log(x);

// arr.reverse();
// console.log(arr);

// let x = arr.join();

// console.log(x);

// arr.sort((a, b) => {
//   return b - a;
// });
// console.log(arr);

// let x = arr.every((ele) => {
//   return ele > 50;
// });

// console.log(x);

// let x = arr.some((ele) => {
//   return ele > 50;
// });

// console.log(x);

// let x = arr.reduce((acc, curr) => {
//   return acc + curr;
// }, 100);

// console.log(x);

let str = "Hello Web Tech";

let x = str
  .split(" ")
  .map((ele) => {
    return ele.split("").reverse().join("");
  })
  .join(" ");

console.log(x);
