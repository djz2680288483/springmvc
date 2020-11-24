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
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<form action="${pageContext.request.contextPath}/book/update" method="post">
    <input type="hidden" name="bookId" value="${book.bookId}"/>
    <div class="form-group">
        <label for="bookname">书籍名称</label>
        <input type="text" class="form-control" id="bookname" name="bookName" value="${book.bookName}">
    </div>

    <div class="form-group">
        <label for="bookprice">书籍价格</label>
        <input type="text" class="form-control" id="bookprice" name="price" value="${book.price}" />
    </div>

    <div class="form-group">
        <label for="bookcount">书籍数量</label>
        <input type="text" class="form-control" name="bookCount" id="bookcount" value="${book.bookCount}" />
    </div>

    <div class="form-group">
        <label for="bookauthor">书籍作者</label>
        <input type="text" class="form-control" name="author" id="bookauthor" value="${book.author}" />
    </div>

    <div class="form-group">
        <input type="submit" class="form-control" value="修改"/>
    </div>

</form>

</body>
</html>
