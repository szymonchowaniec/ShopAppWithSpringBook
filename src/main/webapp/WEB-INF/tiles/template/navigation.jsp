<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<li><a href="<spring:url value="/products"/>">Strona główna</a></li>
<li><a href="<spring:url value="/products/"/>">Produkty</a></li>
<li><a href="<spring:url value="/products/add"/>">Dodaj produkt</a></li>
<li><a href="<spring:url value="/cart/"/>">Koszyk</a></li>
