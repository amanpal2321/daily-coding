let signUpBtn = document.querySelector(".signupbtn");
let signInBtn = document.querySelector(".signinbtn");
let nameField = document.querySelector(".namefield");
let title = document.querySelector(".title");
let underline = document.querySelector(".underline");
let text = document.querySelector(".text");


signInBtn.addEventListener('click', ()=>{
    nameField.style.maxHeight = '0px';
    form.classList.add('sign-in');
    title.innerHTML = 'sign-In';
    text.innerHTML = 'Forgot Password?';
    signInBtn.classList.remove('disable');
    signUpBtn.classList.add('disable');
    underline.style.transform = 'translateX(35px)';
});
signUpBtn.addEventListener('click', ()=>{
    nameField.style.maxHeight = '60px';
    form.classList.remove('sign-up');
    title.innerHTML = 'sign-Up';
    text.innerHTML = 'Password Suggestions';
    signInBtn.classList.add('disable');
    signUpBtn.classList.remove('disable');
    underline.style.transform = 'translateX(0px)';
});