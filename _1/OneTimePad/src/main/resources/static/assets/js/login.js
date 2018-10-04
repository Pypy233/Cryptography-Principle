$("#btn").on('click', function () {
    login();
});

$(document).keydown(function (event) {
    if (event.keyCode == 13) {
        login();
    }
});

function login() {
    var user = $('#username').val();
    var password = $('#password').val();
    $.ajax({
        type: "GET",
        url: "/login",
        dataType: "json",
        data: {
            user: user,
            password: password
        },

        success: function (data) {
            if (data.success) {
                setCookie("username", user, 1, "/");
                setCookie("password", password, 1, "/");

                if (user == "admin")
                    window.location.href = "gentelella/admin/project_detail.html";
                else {
                    $.ajax({
                        type: "GET",
                        url: "/getUserInfo",
                        dataType: "json",
                        data: {
                            userName: user
                        },
                        success: function (data) {

                            var userType = data.data.userType;

                            if (userType == "Worker")
                                window.location.href = "gentelella/worker/projects-taskMarket.html";
                            else if (userType == "Requester")
                                window.location.href = "gentelella/requester/projects-taskMarket.html";
                            else
                                alert("Login Error!")
                        }

                    })
                }
            } else
                alert("Error!");
        },
        error: function () {
            alert("Network warning");
        }
    });
}