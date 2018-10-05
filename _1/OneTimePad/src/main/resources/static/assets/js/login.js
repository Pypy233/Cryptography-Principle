$("#btn").on('click', function () {
    encode();
});

$("#btn1").on('click', function () {
    decode();
});



function encode() {
    var msg = $('#username').val();
 //   var password = $('#password').val();
    $.ajax({
        type: "POST",
        url: "/encode",
        dataType: "json",
        data: {
            msg: msg
        },

        success: function (data) {
            if (data.success) {
                alert(data.data);
                var strArray = data.data.split(" ");
                document.getElementById('password').value = strArray[1] ;
                document.getElementById('result').value = strArray[0];
            }
            else
                alert("Error!");
        },
        error: function () {
            alert("Network warning");
        }
    });
}


function decode() {
    var msg = $('#username').val();
    var randomUnicode = document.getElementById('password').value;
    $.ajax({
        type: "POST",
        url: "/decode",
        dataType: "json",
        data: {
            cipher: msg,
            randomUnicode: randomUnicode
        },

        success: function (data) {
            if (data.success) {
                alert(data.data);
                document.getElementById('result').value = data.data
            }
            else
                alert("Error!");
        },
        error: function () {
            alert("Network warning");
        }
    });
}