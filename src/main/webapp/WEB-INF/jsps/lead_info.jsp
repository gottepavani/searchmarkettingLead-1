<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lead Information</title>
</head>
<body>
<h2>Lead Details</h2>
Id : ${leadDto.id}<br/>
FirstName : ${leadDto,firstName}<br/>
LastName : ${leadDto.lastName}<br/>
email : ${leadDto.email}<br/>
mobile : ${leadDto.mobile}<br/>

</body>
</html>