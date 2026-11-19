//console.log(Math);
// console.log(Math.E);
// console.log(Math.PI);

// //! floor
// let x = 100.4;

// console.log(Math.floor(x));
// //? Math.floor It will retrun always down value by removing decimals

// //! Ceil
// console.log(Math.ceil(x));
// //? Math.ceil It will return always upper value by removing decimals

// //!round
// console.log(Math.round(x));
// //? Math.round It will return always nearest valus by removing decimals

// //! trunc

// let y = x / 10;
// console.log(y);
// console.log(Math.trunc(y));
// //? It is used to remove the decimals values

// //! sign
// let x = 2784;
// console.log(Math.sign(x));
// //? Math.sign is used to tell the number is positive or ngetive or zero or NaN
// //* for pisitive it will return 1 as output
// //* for negetive it will return -1 as output
// //* for Zero it will return 0 as output
// //* for String it will return NaN as output

// //! abs
// console.log(Math.abs(x));
// //? Math.abs is used to return the positive number as output

// //! sqrt
// console.log(Math.sqrt(25));

// //! pow
// console.log(Math.pow(5, 2));

// console.log(Math.round(Math.hypot(5, 10)));

// //! random

// console.log(Math.trunc(Math.random() * 9000) + 1000);

// console.log(Math.trunc(Math.random() * 900000) + 100000);

let b = null;

function genOtp() {
  let x = Number(prompt("Enter a number : "));

  if (x > 999999999 && x <= 9999999999) {
    b = Math.trunc(Math.random() * 9000) + 1000;
    console.log(`Your otp is : ${b}`);
  } else {
    alert("Enter a valid number ");
    genOtp();
  }
}

function verify() {
  let a = Number(document.getElementById("input").value);

  if (b === a) {
    console.log("Otp Verified Successfully");
  } else {
    console.log("Wrong otp");
  }
}
