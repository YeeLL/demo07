<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/3/1
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/getUser">
    <input type="text" name="id">
    <input type="submit" value="hello">
</form>
    <a href="hello"> hello</a>
    <a href="/springMVC/testSpring"> hello</a>
    <a href="/testHeader?username=hahaha&age=10">test</a>

<a href="/test/1/hahah"> 测试pathVariable</a>

<br/>
<br/>
<br/>
<a href="testRequestParam?username=adfasdf&password=12312313"> 测试pathVariable</a>

<a href="/testUser?username=aaaa&password=123123&email=adfasdfaf">测试POJO参数</a>
<a href="/testServletApi">测试原生API</a>
<a href="/testModelAndView">测试modelandvIEW</a>
<a href="/testMap">测试modelandvIEW</a>
<a href="/testSession">测试modelandvIEW</a>
</body>
</html>
