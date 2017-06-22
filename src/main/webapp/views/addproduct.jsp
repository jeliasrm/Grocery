<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elias
  Date: 21/06/17
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Product</title>
</head>
<body>
    <%--<c:url var="addProduct" value="/addproduct"></c:url>--%>
    <form:form action = "addproduct" method="GET" modelAttribute="product">
        BarCode: <form:input type = "text" name = "id_product" path="id_product"/>
        <br/>
        Name: <form:input type = "text" name = "name" path="name" />
        <br/>
        Brand: <form:input type = "text" name = "brand" path="brand"/>
        <br/>
        Buy Price: <form:input type = "text" name = "buy_price" path="buy_price"/>
        <br/>
        Sell Price: <form:input type = "text" name = "sell_price" path="sell_price"/>
        <br/>
        QTY: <form:input type = "text" name = "qty" path="qty" />
        <input type="submit" name="action" value="Add" />
    </form:form>
</body>
</html>
