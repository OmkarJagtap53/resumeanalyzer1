document.addEventListener("DOMContentLoaded", function () {

    console.log("Dashboard Loaded Successfully");

    const welcome = document.getElementById("welcomeMessage");

    if (welcome) {
        welcome.innerHTML = "Welcome to AI Resume Analyzer";
    }

});
