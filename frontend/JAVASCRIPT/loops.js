//! 1. Prime
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

//! 2. factors
// let a = Number(prompt("Enter a number : "));

// for (let i = 1; i <= a; i++) {
//   if (a % i == 0) {
//     console.log(i);
//   }
// }

//! 3. Perfect
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

//! 4. power
// let base = Number(prompt("Enter a base number : "));
// let pow = Number(prompt("Enter a power number : "));
// let ans = 1;

// while (pow > 0) {
//   ans *= base;
//   pow--;
// }

// console.log(ans);

//! 5. factorial
// let a = Number(prompt("Enter a number : "));
// let ans = 1;
// for (let i = 1; i <= a; i++) {
//   ans *= i;
// }

// console.log(ans);

//! 6. pelindrome
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

//! 7. Strong
// let a = Number(prompt("Enter a number : "));
// let sum = 0;
// let temp = a;

// while (a > 0) {
//   let dig = a % 10;
//   let ans = 1;

//   for (let i = 1; i <= dig; i++) {
//     ans *= i;
//   }

//   sum += ans;

//   a = Math.trunc(a / 10);
// }

// console.log(temp == sum);

//! 8. Spy Number
// let a = Number(prompt("Enter a number : "));
// let sum = 0;
// let pro = 1;

// while (a > 0) {
//   sum += a % 10;
//   pro *= a % 10;

//   a = Math.trunc(a / 10);
// }

// console.log(sum == pro);

//! 9. Neon Number
// let a = Number(prompt("Enter a number : "));
// let sq = a * a;
// let sum = 0;

// while (sq > 0) {
//   sum += sq % 10;
//   sq = Math.trunc(sq / 10);
// }

// console.log(a == sum);

//! 10. Pronic number

// let num = Number(prompt("Enter a number : "));
// let isPronic = false;

// for (let i = 1; i * (i + 1) <= num; i++) {
//   if (i * (i + 1) == num) {
//     isPronic = true;
//   }
// }

// console.log(isPronic);

//! 11. reverse
// let num = Number(prompt("Enter a number : "));
// let rev = 0;

// while (num > 0) {
//   rev = rev * 10 + (num % 10);
//   num = Math.trunc(num / 10);
// }

// console.log(rev);

//! 12.Perfect Square
// let a = Number(prompt("Enter a number : "));
// let perSq = false;

// for (let i = 1; i * i <= a; i++) {
//   if (i * i == a) {
//     perSq = true;
//   }
// }

// console.log(perSq);

//! 13.LCM
// let n1 = Number(prompt("Enter a number 1 : "));
// let n2 = Number(prompt("Enter a number 2 : "));

// let large = n1 > n2 ? n1 : n2;

// for (let i = 1; ; i++) {
//   if ((large * i) % n1 == 0 && (large * i) % n2 == 0) {
//     console.log(large * i);
//     break;
//   }
// }

//! 14.HCf
// let n1 = Number(prompt("Enter a number 1 : "));
// let n2 = Number(prompt("Enter a number 2 : "));

// let small = n1 < n2 ? n1 : n2;

// while (true) {
//   if (n1 % small == 0 && n2 % small == 0) {
//     console.log(small);
//     break;
//   }
//   small--;
// }

//! 15. Harshad Number
// let n = Number(prompt("Enter a number : "));
// let temp = n;
// let sum = 0;

// while (n > 0) {
//   sum += n % 10;
//   n = Math.trunc(n / 10);
// }

// console.log(temp % sum == 0);

//! 16. Sunny Number
// let a = Number(prompt("Enter a number : "));
// let num = a + 1;
// let sunny = false;

// for (let i = 1; i * i <= num; i++) {
//   if (i * i == num) {
//     sunny = true;
//   }
// }

// console.log(sunny);

//! 17. Happy Number
// let num = Number(prompt("Enter a number : "));

// while (num != 1 && num != 4) {
//   let sum = 0;

//   while (num > 0) {
//     let dig = num % 10;
//     sum += dig * dig;
//     num = Math.trunc(num / 10);
//   }

//   num = sum;
// }

// console.log(num == 1);

//! 18. Magic Number
// let num = Number(prompt("Enter a number : "));

// while (num > 9) {
//   let sum = 0;

//   while (num > 0) {
//     sum += num % 10;
//     num = Math.trunc(num / 10);
//   }

//   num = sum;
// }

// console.log(num == 1);

//! 19. ugly Number
// let num = Number(prompt("Enter a number : "));

// while (num % 2 == 0) {
//   num /= 2;
// }

// while (num % 3 == 0) {
//   num /= 3;
// }

// while (num % 5 == 0) {
//   num /= 5;
// }

// console.log(num == 1);

//! 20. frequency of Digit
let num = Number(prompt("Enter a numer : "));

for (let i = 0; i <= 9; i++) {
  let count = 0;
  let temp = num;

  while (temp > 0) {
    if (temp % 10 == i) {
      count++;
    }

    temp = Math.trunc(temp / 10);
  }

  if (count > 0) {
    console.log(`${i} ==> ${count}`);
  }
}
