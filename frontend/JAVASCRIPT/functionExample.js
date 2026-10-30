//! 1. Prime
// let a = Number(prompt("Enter a number : "));

// function isPrime(a) {
//   if (a <= 1) {
//     return false;
//   }

//   for (let i = 2; i <= a / 2; i++) {
//     if (a % i == 0) {
//       return false;
//     }
//   }

//   return true;
// }

// console.log(isPrime(a));

//! 2. factors
// let a = Number(prompt("Enter a number : "));

// function factors(a) {
//   for (let i = 1; i <= a; i++) {
//     if (a % i == 0) {
//       console.log(i);
//     }
//   }
// }
// factors(a);

//! 3. Perfect
// let a = Number(prompt("Enter a number : "));

// function isPerfect(a) {
//   let sum = 0;

//   for (let i = 1; i <= Math.trunc(a / 2); i++) {
//     if (a % i == 0) {
//       sum += i;
//     }
//   }

//   return sum == a;
// }

// console.log(isPerfect(a));

//! 4. power
// let base = Number(prompt("Enter a base number : "));
// let pow = Number(prompt("Enter a power number : "));

// function power(base, pow) {
//   let ans = 1;

//   while (pow > 0) {
//     ans *= base;
//     pow--;
//   }

//   return ans;
// }

// console.log(power(base, pow));

//! 5. factorial
// let a = Number(prompt("Enter a number : "));

// function factorial(a) {
//   let ans = 1;
//   for (let i = 1; i <= a; i++) {
//     ans *= i;
//   }

//   return ans;
// }

// console.log(factorial(a));

//! 6. pelindrome
// let a = Number(prompt("Enter a number : "));

// function isPalindrome(a) {
//   let temp = a;
//   let rev = 0;

//   while (a != 0) {
//     rev = rev * 10 + (a % 10);
//     a = Math.trunc(a / 10);
//   }

//   return temp == rev;
// }

// console.log(isPalindrome(a));

//! 7. Strong
// let a = Number(prompt("Enter a number : "));
// function isStrong(a) {
//   let sum = 0;
//   let temp = a;

//   while (a > 0) {
//     let dig = a % 10;
//     let ans = 1;

//     for (let i = 1; i <= dig; i++) {
//       ans *= i;
//     }

//     sum += ans;

//     a = Math.trunc(a / 10);
//   }

//   return temp == sum;
// }

// console.log(isStrong(a));

//! 8. Spy Number
// let a = Number(prompt("Enter a number : "));

// function isSpy(a) {
//   let sum = 0;
//   let pro = 1;

//   while (a > 0) {
//     sum += a % 10;
//     pro *= a % 10;

//     a = Math.trunc(a / 10);
//   }

//   return sum == pro;
// }

// console.log(isSpy(a));

//! 9. Neon Number
// let a = Number(prompt("Enter a number : "));

// function isNeon(a) {
//   let sq = a * a;
//   let sum = 0;

//   while (sq > 0) {
//     sum += sq % 10;
//     sq = Math.trunc(sq / 10);
//   }

//   return a == sum;
// }

// console.log(isNeon(a));

//! 10. Pronic number

// let num = Number(prompt("Enter a number : "));

// function isPronic(a) {
//   for (let i = 1; i * (i + 1) <= num; i++) {
//     if (i * (i + 1) == num) {
//       return true;
//     }
//   }

//   return false;
// }

// console.log(isPronic(num));

//! 11. reverse
// let num = Number(prompt("Enter a number : "));

// function reverse(a) {
//   let rev = 0;

//   while (num > 0) {
//     rev = rev * 10 + (num % 10);
//     num = Math.trunc(num / 10);
//   }

//   return rev;
// }

// console.log(reverse(num));

//! 12.Perfect Square
// let a = Number(prompt("Enter a number : "));

// function isPerfectSq(a) {
//   for (let i = 1; i * i <= a; i++) {
//     if (i * i == a) {
//       return true;
//     }
//   }

//   return false;
// }

// console.log(isPerfectSq(a));

//! 13.LCM
// let n1 = Number(prompt("Enter a number 1 : "));
// let n2 = Number(prompt("Enter a number 2 : "));

// function LCM(a) {
//   let large = n1 > n2 ? n1 : n2;

//   for (let i = 1; ; i++) {
//     if ((large * i) % n1 == 0 && (large * i) % n2 == 0) {
//       return large * i;
//     }
//   }
// }

// console.log(LCM(n1, n2));

//! 14.HCf
// let n1 = Number(prompt("Enter a number 1 : "));
// let n2 = Number(prompt("Enter a number 2 : "));

// function HCF(a) {
//   let small = n1 < n2 ? n1 : n2;

//   while (true) {
//     if (n1 % small == 0 && n2 % small == 0) {
//       return small;
//     }
//     small--;
//   }
// }

// console.log(HCF(n1, n2));

//! 15. Harshad Number
// let n = Number(prompt("Enter a number : "));

// function isHarshad(a) {
//   let temp = n;
//   let sum = 0;

//   while (n > 0) {
//     sum += n % 10;
//     n = Math.trunc(n / 10);
//   }

//   return temp % sum == 0;
// }

// console.log(isHarshad(n));

//! 16. Sunny Number
// let a = Number(prompt("Enter a number : "));

// function isSunny(a) {
//   let num = a + 1;

//   for (let i = 1; i * i <= num; i++) {
//     if (i * i == num) {
//       return true;
//     }
//   }

//   return false;
// }

// console.log(isSunny(a));

//! 17. Happy Number
let num = Number(prompt("Enter a number : "));

function isHappy(num) {
  while (num != 1 && num != 4) {
    let sum = 0;

    while (num > 0) {
      let dig = num % 10;
      sum += dig * dig;
      num = Math.trunc(num / 10);
    }

    num = sum;
  }

  return num == 1;
}

console.log(isHappy(19));

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
// let num = Number(prompt("Enter a numer : "));

// for (let i = 0; i <= 9; i++) {
//   let count = 0;
//   let temp = num;

//   while (temp > 0) {
//     if (temp % 10 == i) {
//       count++;
//     }

//     temp = Math.trunc(temp / 10);
//   }

//   if (count > 0) {
//     console.log(`${i} ==> ${count}`);
//   }
// }
