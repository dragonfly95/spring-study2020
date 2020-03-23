$(document).ready(function () {
      
    $('#dg').datagrid({
        url:'datagrid_data.json',
        columns:[[
            {field:'id',title:'id',width:100},
            {field:'firstname',title:'firstname',width:100},
            {field:'lastname',title:'lastname',width:100},
            {field:'phone',title:'phone',width:100},
            {field:'email',title:'email',width:100,align:'right'}
        ]],
        pagination: true,
        method: 'get',
        height: 550,
        pageList: [12,100,400]
    });

    $('.btn1').on('click', function() {
      var row = $('#dg').datagrid('getSelected');
      debugger
    });
    
  });