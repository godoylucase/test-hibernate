<%@ include file="/taglibs.jsp"%>

<title><fmt:message key="robotList.title"/></title>

<button onclick="location.href='robotform.html'"style="float: right; margin-top: -30px; width: 100px">Add Robot</button>

<display:table name="robotList" class="table" requestURI="" id="robotList" export="true" pagesize="10">
    <display:setProperty name="export.pdf.filename" value="robot.pdf"/>
    <display:column property="id" sortable="true" href="robotform.html" media="html"
        paramId="id" paramProperty="id" titleKey="robot.id"/>
    <display:column property="id" media="csv excel xml pdf" titleKey="robot.id"/>  
    <display:column property="owner" sortable="true" titleKey="robot.owner" escapeXml="true"/>
    <display:column property="qualityCheckPassed" sortable="true" titleKey="robot.qualityCheckPassed" escapeXml="true"/>
    <display:column titleKey="robot.dateOfBuild" sortable="true" sortProperty="dateOfBuild" escapeXml="true">
        <fmt:formatDate value="${robot.dateOfBuild}" pattern="${datePattern}"/>
    </display:column>
</display:table>

<script type="text/javascript">highlightTableRows("robotList");</script>