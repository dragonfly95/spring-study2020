<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>
  
  <input type="button" name="btn" value="test">

  <script src="https://code.jquery.com/jquery-3.1.0.js"></script>
  <script>
  $(document).ready(function () {
    

    var obj = {
      "test1":"test1",
      "test2":"test2"
    }

    $('[name="btn"]').on('click', function() {
        $.ajax({
        type: "post",
        url: "/first/test.do",
        data: obj,
        success: function (response) {
          debugger
        }
      });
    })

  });
  </script>
</body>
</html>