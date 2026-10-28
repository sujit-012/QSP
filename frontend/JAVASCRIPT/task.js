// function demo() {
//   let num1 = Number(document.getElementById("num1").value);
//   let num2 = Number(document.getElementById("num2").value);

//   if (num1 && num2) {
//     console.log(num1 + num2);
//     console.log(num1 - num2);
//     console.log(num1 * num2);
//   } else {
//     alert("Please Enter a valid numbers ");
//   }
// }

let count = 0;
let quantity = document.getElementById("quantity");

function increment() {
  //   console.log("increment");
  if (count <= 4) {
    count++;
    quantity.innerText = count;
    if (count == 5) {
      alert("Maximum limit reached");
    }
  } else {
    alert("Maximum limit reached");
  }
}

function decrement() {
  if (count - 1 >= 0) {
    count--;
    quantity.innerText = count;
  } else {
    alert("Quantity can't be negetive ");
  }
}

function reset() {
  count = 0;
  quantity.innerText = count;
}
