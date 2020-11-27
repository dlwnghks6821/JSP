<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>���̹� �α���</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
.login-form{
	margin:0 auto;
	width:470px;
}
.naver-items{
	text-align:center;
	margin-top:100px;
	margin-bottom:60px;
	
	
	
}
.naver-items img{
	width:50%;
}
.login-buttons{
	text-align:center;
	line-height:54px;
	
	color:white;
	
}
.button-items{
	height:54px;
	background-color:#03c75a;
	cursor:pointer;
	
	
}


</style>
</head>
<body>

<div class="login-form">
<div class="naver-items">
<img src="https://ssl.pstatic.net/static/nid/login/m_logo_naver.png">

</div>
<div class="input-items">
<div class="input-group mb-3">
  <div class="input-group-prepend">
  </div>
  <input type="text" id="id" name="id" class="form-control" placeholder="���̵�" aria-label="Username" aria-describedby="basic-addon1">
</div>


<div class="input-group mb-3">
  <div class="input-group-prepend">
    
  </div>
  <input type="password" id="password" name="password" class="form-control" placeholder="��й�ȣ" aria-label="Username" aria-describedby="basic-addon1">
</div>

</div>
<div class="button-items">
<div class="login-buttons">
�α���


</div>


</div>



</div>

</body>

<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">
$(document)
.on("click",".login-buttons",function(){
	if($('#id').val()==""){
		alert("���̵���� �������� �Ѽ������ϴ�.")
		return false
	}
	if($('#password').val()==""){
		alert("��и�ȣ���� �������� �Ѽ������ϴ�.")
		return false
	}
	
	$.ajax({

		  url:'naverlogin',//ȣ��� ������ ���(�̸�)
		  method:'get',//������ ���۹�� get/post
		  //������ ������(������Ʈ��)//
		  data:'id='+$('input[name=id]').val()+'&password='+$('input[name=password]').val(),
		  dataType:'text',//��ȯ���� ������ Ÿ�� 
		  beforeSend:function(){},
		  success:function(txt){//ȣ�� �����ؼ� �Ϸ��ϸ� 
			  if(txt=="0"){
				  alert("���������ʴ� �����Դϴ�.")
				  return false
			  }else{
				  alert("�α��εǾ����ϴ�.")
				  return false
				 
			  }
		  	
			
		},
		complete:function(){
			
		} 
		
	  })
	
})








</script>

</html>