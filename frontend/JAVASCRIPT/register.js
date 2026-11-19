function sendOtp() {
  let user = document.getElementById("username").value;
  let mob = document.getElementById("mobile").value;
  if (
    user.length >= 5 &&
    mob.length == 10 &&
    (mob.startsWith("6") ||
      mob.startsWith("7") ||
      mob.startsWith("8") ||
      mob.startsWith("9"))
  ) {
    window.location.href = "otp.html";
  } else if (user.length < 5) {
    alert("Enter a valid username");
  } else {
    alert("Enter a valid number");
  }
}
