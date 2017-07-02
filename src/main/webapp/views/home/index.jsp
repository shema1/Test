<%@ taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="/css/all.css">
<body class="proba">
<ol>
    <q:forEach var="com" items="${Company}">
        <li>${com.name} , ${com.value} $ | ${com.allIncome} $<a href="/updateCurentBalance/${com.id}">  update balance</a>
            <q:forEach var="a" items="${com.companies}">
                <ul id="fix"> -${a.childName}, ${a.childValue}$</ul>
            </q:forEach>

        </li>

    </q:forEach>
</ol>
</body>