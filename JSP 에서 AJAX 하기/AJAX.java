<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
//AJAX
$(document)
.on('click','#btnLogin',function(){
	$.ajax({
	  url:'MethodServlet',//ȣ��� ������ ���(�̸�)
	  method:'post',//������ ���۹�� get/post
	  data:'userid='+$('input[name=userid]').val()+'&passwd='+$('input[name=passwd]').val(),//querystring=data;
	  dataType:'text',//��ȯ���� ������ Ÿ�� 
	  beforeSend:function(){},
	  success:function(txt){//ȣ�� �����ؼ� �Ϸ��ϸ� 
		alert(txt);
	},
	complete:function(){
	} //ȣ���� �����ϵ� �����ϵ� �������� ���� 
	
    })
  })

</script>