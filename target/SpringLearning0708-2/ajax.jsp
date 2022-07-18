<%--
  Created by IntelliJ IDEA.
  User: WEI
  Date: 2022/7/18
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="FALSE" %>
<html>

<head>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script>
        var userList = new Array();
        userList.push({username: "张三", age: 21});
        userList.push({username: "毕成", age: 22});
        $.ajax(
            {
                type: "POST",
                url: "${pageContext.request.contextPath}/user/quick14",
                data: JSON.stringify(userList),
                contentType: "application/json;charset=UTF-8"
            }
        );
    </script>
</head>
<title>Title</title>

<body>

</body>
</html>
