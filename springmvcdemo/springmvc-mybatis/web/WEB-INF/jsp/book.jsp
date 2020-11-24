<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 默尘
  Date: 2020/11/23
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container ">

    <div class="row clearfix">
        <div class="col-md-12">
            <div class="page-header">
                <h1>
                    <small>书籍列表----显示所有书籍</small>
                </h1>
            </div>
        </div>

        <div class="row">

                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toadd">新增书籍</a>
                </div>
                <div class="col-md-8 column">
                    <form class="form-inline" action="${pageContext.request.contextPath}/book/query" method="post" style="float:right ">
                        <input type="text" class="form-control" placeholder="请输入要查询的书籍名称" name="bookName"/>
                        <input type="submit" value="查询" class="btn btn-primary"/>
                    </form>
                </div>

        </div>

    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍价格</th>
                    <th>书籍数量</th>
                    <th>书籍作者</th>
                    <th>书籍操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookId}</td>
                        <td>${book.bookName}</td>
                        <td>${book.price}</td>
                        <td>${book.bookCount}</td>
                        <td>${book.author}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toupdate?bookId=${book.bookId}">修改</a>
                            &nbsp;|&nbsp; <a href="${pageContext.request.contextPath}/book/delete/${book.bookId}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>
