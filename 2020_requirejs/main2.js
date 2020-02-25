

require.config({
    paths: {
        jquery: 'jquery-3.1.0',
        underscore: 'underscore-min',
        text: 'text.min'
    }
});


//-------------- config의 순서와 주입순서가 동일해야함  -------//
require(['jquery' ,'underscore' ,'text!template.html'], function($, _, tpl ) {

    $(document).ready(function () {
        $('#app').html('require + jquery loaded');
        console.log(tpl);
        $('#tpl').html(tpl);

        var templateText = $('script[type="text/template"]').text(); 
        var template = _.template(templateText); 

        var result = template({ 
          title: "underscore", 
          items: ["aaaa", "bbb", "cccc"] 
      });
   
   
      //컴파일된 결과를 jQuery로 body에 삽입 
      $('#sample').html(result); 

    });
});

