let otpGenerate = () => {
  return Math.floor(Math.random() * 9000) + 1000;
};

let a = otpGenerate();
alert(`your otp is ${a}`);

let resendOtp = () => {
  a = otpGenerate();
  alert(`your otp is ${a}`);
};

let verify = () => {
  let userOtp = document.getElementById("otp").value;

  if (a == userOtp) {
    alert("Login sucessful");
  } else {
    alert("Enter a valid Otp ");
  }
};
