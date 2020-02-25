

requirejs.config({
    paths: {
        jquery: 'jquery-3.1.0',
        text: 'text.min',
        underscore: 'underscore-min'
    }
});


define('Calculator', [], function() {
    return {
      add: function(a,b) {
        return a+b;
      }
    }
  });

  define('Flower', [], function() {
    return {
      bloom: function(a,b) {
        return a * a;
      }
    }
  });



requirejs(['jquery'
            ,'text!sample1.html'
            ,'text!sample2.html'
            ,'text!sample3.html'
            ,'js/player'
            ,'Calculator'
            ,'Flower'
    ], function($,template1, template2, template3,player,Calculator, flower) {

    $(document).ready(function () {
        $('#app').html('require + jquery loaded');

        player.myfunc2();
        var _add_ = Calculator.add(1,2); console.log(_add_);
        var _bloom_ = flower.bloom(1,2); console.log(_bloom_);
        console.log("///////////////////////////////////////////////////////");

        $.ajax({
            url: "js/data.json",
            success: function (response) {
                $.each(response.data, function (indexInArray, valueOfElement) { 
                    $('#sample').html("seq is " + valueOfElement.seq);
               });
            }
        });

        //---------------------------
        $('[name="btn1"]').on('click', function() {
            $('#sample').html(template1);
        })
        $('[name="btn2"]').on('click', function() {
            $('#sample').html(template2);
        })
        $('[name="btn3"]').on('click', function() {
            $('#sample').html(template3);
        })
    });
});

