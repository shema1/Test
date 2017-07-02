<%@ taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 22.06.2017
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="/css/all.css">
<body class="proba">
<ol>
    <q:forEach var="com" items="${Company}">
        <li>${com.name} , ${com.value} $ | ${com.allIncome}<a href="/updateCurentBalance/${com.id}">  update balance</a>
            <q:forEach var="a" items="${com.companies}">
                <ul id="fix"> -${a.childName}, ${a.childValue}$</ul>
            </q:forEach>

        </li>

    </q:forEach>
</ol>
</body>