<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>��������</title>
</head>
<body>
<h2>��������</h2>
<form action=research.jsp method=post>
   <table>
   <tr>
      <td>�̸�</td><td><input type=text name=username size=12>
   </tr>
   <tr>
      <td>����</td><td><input type=radio name=gender value=female>����
                  <input type=radio name=gender value=male>����</td>
   </tr>
   <tr>
      <td>�����ϴ� ����</td><td>
      <input type=checkbox name=season value=spring>��
      <input type=checkbox name=season value=summer>����
      <input type=checkbox name=season value=fall>����
      <input type=checkbox name=season value=winter>�ܿ�
   </tr>
   <tr>
      <td colspan=2>
         <input type=submit value="����">
         <input type=reset value='���'>
      </td>
   </tr>
   </table>
</form>
</body>
</html>