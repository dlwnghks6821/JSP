<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="MethodServlet" id="frmSignin"> 
 <table>
   <tr><td align=right>���̵�</td><td><input type=text  name=userid size=12></td>
   <tr><td align=right>��й�ȣ</td><td><input type=text  name=passwd1 size=12></td>
   <tr><td align=right>��й�ȣȮ��</td><td><input type=text  name=passwd2 size=12></td>
   <tr><td align=right>�Ǹ�</td><td><input type=text  name=username size=12></td>
   <tr><td align=right>�������</td><td><input type=date name=birth></td>
   <tr><td align=right>����</td><td><input type=radio name=gender value=female>����
                           <input type=radio name=gender value=male>����</td>
   <tr><td align=right>�����</td><td><input type=phone  name=mobile></td>
   <tr><td align=right>��������</td><td><select name=selArea multiple>
                              <option value='����'>����</option>
                              <option value='���'>���</option>
                              <option value='�泲'>�泲</option>
                              <option value='���'>���</option>
                              <option value='����'>����</option>
                              <option value='����'>����</option>
                              </select></td>
   <tr><td align=right>���ɺо�</td><td><input type=checkbox name=interest value="��ġ">��ġ
                              <input type=checkbox name=interest value="����">����
                              <input type=checkbox name=interest value="������">������<br>
                              <input type=checkbox name=interest value="����">����
                              <input type=checkbox name=interest value="��ȸ">��ȸ
                              <input type=checkbox name=interest value="����">����<br>
                              <input type=checkbox name=interest value="����">����
                              <input type=checkbox name=interest value="�ε���">�ε���
                              <input type=checkbox name=interest value="�ֽ�">�ֽ�
   </td>
   
   </table>
 
  <input type="button" id="btnSignin value="����">
  
</form>
<br><br>
<form method="post" action="MethodServlet">
<input type="text" name="first" ><br>
<input type="text" name="second" ><br>
 <input type="submit" value="post������� ȣ��">
</form>
</body>
<script src="https://code.jquery.com/jquery.3.5.0.js"></script>
<script>
//�������� ��ȿ�� �˻��ϴ� ��ſ� Ŭ���̾�Ʈ�ʿ��� �˻�//
//submit ��ư�� ��ü�޴�//
$(document)
.on('click','#btnSignin',function(){
	//������� ���� ��й�ȣ ��ġ���� ����� ��ȣ ���� üũ //
	if($('input[name=birth]').val()){
		return false;
	}
	$('#frmSignin').submit();
	
})
.on('click','#btnSignin',function(){
	
})

</script>
</html>