$("#register").on('click', function () {
    if ($("#password").val() != $("#surePassword").val())
        alert("Please enter the same password");
    else {

        var user = $('#username').val();
        var password = $('#password').val();
        //var email = $('#email').val();
        var code = $('#activateCode').val();
        var role = $('#role').val();

        $.ajax({
            type: "POST",
            url: "/register",
            dataType: "json",
            data: {
                user: user,
                password: password,
              //  email: email,
                code: code,
                userType: role
            },

            success: function (data) {
                if (data.success) {
                    window.location.href = "index.html";
                } else
                    alert(data.message);
            },
            error: function (data) {
                alert(data.message);
            }
        });
    }
});
//
// $("#sendEmail").on('click', function(){
//     var email = $('#email').val();
//     $.ajax({
//         type: "POST",
//         url: "/email",
//         dataType: "json",
//         data:{
//             email: email
//         },
//
//         success: function (data) {
//             if (data.success) {
//                alert(data.message);
//             } else
//                 alert(data.message);
//         },
//         error: function (data) {
//             alert(data.message);
//         }
//     })
// })