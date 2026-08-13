

function login(){

    let username =
    document.getElementById("username").value;

    let password =
    document.getElementById("password").value;

    if(username === "aman" &&
       password === "12345")
    {
        document.getElementById("message")
        .innerHTML = "Login Successful";
    }
    else
    {
        document.getElementById("message")
        .innerHTML = "Invalid Credentials";
    }
}
