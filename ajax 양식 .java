$(document)
.on('click','#btnLogin',function(){
	$.ajax({
	  url:'MethodServlet',//ȣ��� ������ ���(�̸�)
	  method:'get',//������ ���۹�� get/post
	  data:'userid=+$('input[name=userid]'.val()+'&passwd='+$('input[name=passwd]').val(),//querystring=data
	  dataType:'text'//��ȯ���� ������ Ÿ�� 
	  beforeSend:function(txt){}
	  success:function(txt){//ȣ�� �����ؼ� �Ϸ��ϸ� 
		alert(txt);
	},
	complete:function(){
	} //ȣ���� �����ϵ� �����ϵ� �������� ���� 
	
    })
  })
