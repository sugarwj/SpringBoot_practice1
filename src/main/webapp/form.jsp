<%@ page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false"%>
<html>
<head>
</head>
<body>
   <form action="${pageContext.request.contextPath}/receive/r3" method="post">
       用户名 <input type="text" name="username" /> <br/>
       密码   <input type="password" name="password" /> <br/>
       电话   <input type="text" name="phone" /> <br/>
       邮箱   <input type="email" name="email" /> <br/>
       sources   <input type="text" name="sources" /> <br/>
       IP   <input type="text" name="ip" /> <br/>
       状态   <input type="text" name="status" />
       <input type="submit" value="提交" />
   </form>
</body>
</html>