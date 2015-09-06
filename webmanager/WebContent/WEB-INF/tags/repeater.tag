<%@ attribute name="count" type="java.lang.Integer" required="true"%>
<%@ attribute name="value" type="java.lang.String" required="true"%>
<%!  
      private String repeater(Integer count, String s) {  
        int n = count.intValue();  
        StringBuffer sb = new StringBuffer();  
        for (int i = 0; i < n; i++) {  
          sb.append(s);  
        }  
        return sb.toString();  
      }  
    %>
<%  
      out.println(repeater(count, value));  
    %>
