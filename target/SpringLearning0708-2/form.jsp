<%--
  Created by IntelliJ IDEA.
  User: WEI
  Date: 2022/7/18
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="FALSE" %>
<html>
<head>
    <title>Title</title>
    <form action="${pageContext.request.contextPath}/user/quick13" method="post">
        <%--表明第几个user对象的name，第几个对象的age--%>
        <input type="text" name="userList[0].username"><br/> <input type="text" name="userList[0].age"><br/>
        <input type="text" name="userList[1].username"><br/> <input type="text" name="userList[1].age"><br/>
        <input type="submit">
    </form>
</head>
<body>

</body>
</html>
