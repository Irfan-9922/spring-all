<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form action="perform.htm" method="post">
sno:<input type="text" name="no"/>
name:<input type="text" name="name"/>
adress:<input type="text" name="adress"/>
<input type="submit" name="opt" value="insert"/>
<input type="submit" name="opt" value="update"/>
<input type="submit" name="opt" value="delete"/>
<input type="submit" name="opt1" value="view"/>
</form>
<c: if test="${opretion ne null}"/>
<c:out value="${opretion}"/>
</c:if>