<%@ page language="java" pageEncoding="utf-8" %>
<%--@elvariable id="principal" type="com.itsmtools.common.service.security.Principal"--%>

<!doctype html>
<html ng-app="backend.application" ng-controller="RootController" ng-cloak>
    <head>
        <jsp:include page="./partial/head.jsp"/>
    </head>
    <body>
        <div class="x-layout">
            <div class="container-fluid">
                <jsp:include  page="./partial/toolbar.jsp"/>
                <div class="x-content" ui-view="index"></div>
            </div>
        </div>
    </body>
</html>