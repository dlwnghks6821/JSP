	  	//===>select<===//
 $(document)
.on('click','#btnGet',function(){
	//console.log('btnGet1')
	$.get('selectServlet',{},function(data){
		//json���//
		console.log('btnGet2')
		console.log(data);
		$.each(data,function(ndx,value){
			//�������� ���ش�� ���� ���ش�.//
			name='<tr><td>'+value['emp_id']+'</td><td>'+value['emp_name']+'</td><td>'+value['man_id']+'</td></tr>';
			$('#tblData').append(name);
			console.log('btnGet3')
		})
		
		/*
		alert("�۾��� �����մϴ�.");
		ar = txt.split(',');
		for(i=0;i<ar.length;i++){
			//<tr><td>John</td></tr>�̷������� �ְԵȴ�.//
			name = '<tr><td>'+ar[i]+'</td></tr>';
			$('#tblData').append(name);
		}*/
		
	},'json');//===>2���̻� Ÿ�� �� json �̶��Ѵ�.//text�� �ϳ�//
	return false;
});
	  