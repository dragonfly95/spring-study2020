

requirejs.config({
    paths: {
        jquery: 'jquery-3.1.0',
        text: 'text.min'
    }
});

requirejs(['jquery'
            ,'text!sample1.html'
            ,'text!sample2.html'
            ,'text!sample3.html'
            ,'text!js/data.json'
    ], function($,template1, template2, template3,data) {

    $(document).ready(function () {
        $('#app').html('require + jquery loaded');
        $('#sample').html(data);
        debugger
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

