<%--
  Created by IntelliJ IDEA.
  User: 默尘
  Date: 2020/11/23
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<form action="${pageContext.request.contextPath}/book/add" method="post">
    <div class="form-group">
        <label for="bookname">书籍名称</label>
        <input type="text" class="form-control" id="bookname" required>
    </div>

    <div class="form-group">
        <label for="bookprice">书籍价格</label>
        <input type="text" class="form-control" id="bookprice" required>
    </div>

    <div class="form-group">
        <label for="bookcount">书籍数量</label>
        <input type="text" class="form-control" id="bookcount" required>
    </div>

    <div class="form-group">
        <label for="bookauthor">书籍作者</label>
        <input type="text" class="form-control" id="bookauthor" required>
    </div>

    <div class="form-group">
        <input type="submit" class="form-control" value="添加"/>
    </div>

</form>

</body>
</html>
