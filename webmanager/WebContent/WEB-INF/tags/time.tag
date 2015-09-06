<%@ tag import="java.util.*" import="java.text.*"%>
<%  
      DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);  
      Date d = new Date(System.currentTimeMillis());  
      out.println(df.format(d));  
    %>
