<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ������</title>
<style type="text/css">
/*  .id_check{position: absolute; */
/*         left: 1110px; */
/*         top: 95px; */
/*         } */
</style>
</head>
<body>
	<center>
		<h1>ȸ������</h1>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<hr>
		<form action="joinUser.do" method="post">
			<table border="1" cellpadding="7" cellspacing="5">
				<tr>
					<td bgcolor="orange">���̵�</td>
					<td><input width="250" type="text" name="id" id="id" /> <button id="id_check" type="button">�ߺ�üũ</button>
					<div>�ڸ�</div></td>
				</tr>
				<tr>
					<td bgcolor="orange">��й�ȣ</td>
					<td><input width="250" type="password" name="password" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">��й�ȣ Ȯ��</td>
					<td><input width="250" type="password"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">�̸�</td>
					<td><input width="250" type="text" name="name" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="ȸ������"/>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertUser.jsp">ȸ������</a>
	</center>
	
</body>
</html>