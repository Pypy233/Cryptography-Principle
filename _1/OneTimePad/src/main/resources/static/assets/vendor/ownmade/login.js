// $(function () {
//         $("#btn").click(function () {
//             var user = $('#username').val();
//             var password = $('#password').val();
//             $.ajax({
//                 type:"GET",
//                 url:"/login",
//                 dataType:"json",
//                 data : {
//                     user: user,
//                     password: password
//                 },
//
//                 success : function (data) {
//                     if(data.success){
//                         alert("Success!");
//                     }else
//                         alert("Error!");
//                 },
//                 error : function () {
//                     alert("Network warning");
//                 }
//             });
//         });
//
//         // $("#btn2").click(function () {
//         //     var user = $('#username').val();
//         //     var password = $('#password').val();
//         //     $.ajax({
//         //         type:"POST",
//         //         url:"/register",
//         //         dataType:"json",
//         //         data : {
//         //             user: user,
//         //             password: password
//         //         },
//         //         success : function (data) {
//         //             if(data.success){
//         //                 alert("Success!");
//         //             }else
//         //                 alert("Error!");
//         //         },
//         //         error : function () {
//         //             alert("Network warning");
//         //         }
//         //     });
//         // });
//     }
// );