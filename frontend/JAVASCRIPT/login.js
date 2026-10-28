function login() {
  //   console.log("Login button clicked");
  let username = document.getElementById("username").value;
  let pass = document.getElementById("pass").value;

  if (username && pass) {
    console.log("Login Successfull !!");
    window.location.href = "home.html";
  } else {
    alert("Invalid credentials");
  }
}
