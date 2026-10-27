// //Prime
// let a = Number(prompt("Enter a number : "));

// let isPrime = true;

// for (let i = 2; i <= Math.trunc(a / 2); i++) {
//   if (a % i == 0) {
//     isPrime = false;
//   }
// }

// if (isPrime) {
//   console.log(`${a} is a prime number`);
// } else {
//   console.log(`${a} is not a prime number `);
// }

////factors
// let a = Number(prompt("Enter a number : "));

// for (let i = 1; i <= a; i++) {
//   if (a % i == 0) {
//     console.log(i);
//   }
// }

// //Perfect
// let a = Number(prompt("Enter a number : "));
// let sum = 0;

// for (let i = 1; i <= Math.trunc(a / 2); i++) {
//   if (a % i == 0) {
//     sum += i;
//   }
// }

// if (sum == a) {
//   console.log(`${a} is a perfect Number`);
// } else {
//   console.log(`${a} is not a perfect Number`);
// }

// //power
// let base = Number(prompt("Enter a base number : "));
// let pow = Number(prompt("Enter a power number : "));
// let ans = 1;

// while (pow > 0) {
//   ans *= base;
//   pow--;
// }

// console.log(ans);

// //factorial
// let a = Number(prompt("Enter a number : "));
// let ans = 1;
// for (let i = 1; i <= a; i++) {
//   ans *= i;
// }

// console.log(ans);

////pelindrome
// let a = Number(prompt("Enter a number : "));
// let temp = a;
// let rev = 0;

// while (a != 0) {
//   rev = rev * 10 + (a % 10);
//   a = Math.trunc(a / 10);
// }

// if (temp == rev) {
//   console.log(`${temp} is Pelindrome number `);
// } else {
//   console.log(`${temp} is not a pelindrome number `);
// }

//Strong
let a = Number(prompt("Enter a number : "));
let sum = 0;
let temp = a;

while (a > 0) {
  let dig = a % 10;
  let ans = 1;

  for (let i = 1; i <= dig; i++) {
    ans *= i;
  }

  sum += ans;

  a = Math.trunc(a / 10);
}

console.log(temp == sum);
