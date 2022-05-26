<%@ include file="/init.jsp" %>
<portlet:defineObjects/>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:renderURL var="openportletURL" copyCurrentRenderParameters="true"></portlet:renderURL>

<h1>They have no information</h1>
<a href="${openPortletURL}">Render url created by liferay</a>