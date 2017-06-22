<%--
  Created by IntelliJ IDEA.
  User: elias
  Date: 20/06/17
  Time: 09:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html class="tablesaw-enhanced">
<head>
    <title>Product</title>
</head>
<body>
    <div class="panel-body" >
    <c:choose>
        <c:when test="${product != null}">
            <table id="detailProducts" class="table table-striped table-bordered dt-responsive" cellspacing="0" width="100%">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Buy Price</th>
                <th>Sell Price</th>
                <th>QTY</th>
            </tr>
            <tr id="filterrow">
                <td>${product.id_product}</td>
                <td>${product.name}</td>
                <td>${product.brand}</td>
                <td>${product.buy_price}</td>
                <td>${product.sell_price}</td>
                <td>${product.qty}</td>
            </tr>
            </thead>
        </table>
        </c:when>
        <c:otherwise>
            <table id="detailTemplate" class="table table-striped table-bordered dt-responsive" cellspacing="0" width="100%">
            <thead>
            <tr>
                <th>Bar Code</th>
                <th>Name</th>
                <th>Buy Price</th>
                <th>Sell Pricee</th>
                <th>QTY</th>

            </tr>
            <tr id="filterrow">
                <c:forEach var="products" items="${products}" >
                    <tr>
                        <td>${products.id_product}</td>
                        <td>${products.name}</td>
                        <td>${products.buy_price}</td>
                        <td>${products.sell_price}</td>
                        <td>${products.qty}</td>
                    </tr>
                </c:forEach>
            </tr>
            </thead>


        </table>
        </c:otherwise>
    </c:choose>
    </div>
</body>
</html>
