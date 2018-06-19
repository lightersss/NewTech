package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class denglu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table style=\"width: 100%; height: 358px; padding: 5px\" border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td style=\"width: 100px\">\n");
      out.write("                        <img src=\"Logo.jpg\" Width=\"200px\" />\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"text-align: center; vertical-align: middle; background-color: #106e0c; font-family: 'Monotype Corsiva'; font-size: 75px; font-weight: bold; color: #FFFFFF;\">New Tech Book Store\n");
      out.write("                        &nbsp;</td>\n");
      out.write("                    <td style=\"width: 200px\">\n");
      out.write("                        <img src=\"Book2.png\" Width=\"300px\" /></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <td style=\"vertical-align: top; background-color: #106e0c; color: #FFFFFF; width: 100px;\">\n");
      out.write("                    <br />\n");
      out.write("                    <br />\n");
      out.write("                    <ul>\n");
      out.write("                      <li><a href=\"index.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"color: #FFFFFF;font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">Welcome</a>\n");
      out.write("                       <br />  \n");
      out.write("                        <br />\n");
      out.write("                            <li><a href=\"denglu.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"color: #FFFFFF;font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">Login</a>\n");
      out.write("\n");
      out.write("                        <br />  \n");
      out.write("                        <br />\n");
      out.write("                        <li><a href=\"zhuce.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"color: #FFFFFF;font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">Register</a>\n");
      out.write("                            <br /><br />\n");
      out.write("                            <li><a href=\"shoppingcart.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"color: #FFFFFF;font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">Shopping cart</a>\n");
      out.write("                                <br />  <br/>\n");
      out.write("\n");
      out.write("                            <li><a href=\"search.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"color: #FFFFFF;font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">Search</a>\n");
      out.write("                    </ul>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td style=\" vertical-align: top; \">\n");
      out.write("\n");
      out.write("                    <form method=\"GET\" action=\"http://localhost:8080/NewTech/Login\"style=\"text-align: center; font-family: 'Monotype Corsiva'; font-size: 25px; font-weight: bold; \">\n");
      out.write("                        Username:\n");
      out.write("                        <input type=\"text\" name=\"CustumUsername\" ><br>\n");
      out.write("                        Password:\n");
      out.write("                        <input type=\"password\" name=\"CustemPassword\" ><br>\n");
      out.write("                        <input type=SUBMIT value=\"Submit\">\n");
      out.write("                    </form> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <td style=\"background-color: #106e0c; vertical-align: top; text-align: left; width: 200px;\">\n");
      out.write("                    <div ID=\"Label9\" runat=\"server\" Font-Bold=\"True\" Font-Italic=\"True\" Font-Size=\"X-Large\"\n");
      out.write("                         ForeColor=\"#FFFFFF\" Height=\"22px\" Style=\"font-weight: bold; font-family: Verdana; text-align: left; font-size: 9pt; font-style: normal; color: #FFFFFF;\"\n");
      out.write("                         Width=\"196px\" Font-Underline=\"False\">Why buy from us?</div><br />\n");
      out.write("                    <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                    <div ID=\"Label1\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Width=\"233px\">* Over 4.5 million books</div>\n");
      out.write("                    <div ID=\"Label3\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Lowest possible prices\" Width=\"233px\">* Lowest possible prices</div>\n");
      out.write("                    <div ID=\"Label4\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Books for all age groups\" Width=\"283px\">* Books for all age groups</div>\n");
      out.write("                    <div ID=\"Label6\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Order a book before it hits the market\" Width=\"289px\">* Order a book before it hits the market</div>\n");
      out.write("                    <div ID=\"Label7\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Promotion schemes\" Width=\"289px\">* Promotion schemes</div>\n");
      out.write("                    <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                    <div ID=\"Label5\" runat=\"server\" Font-Bold=\"True\" Font-Italic=\"True\" Font-Size=\"X-Large\"\n");
      out.write("                         ForeColor=\"#FFFFFF\" Height=\"22px\" Style=\"font-weight: bold; font-size: 9pt; color: #FFFFFF; font-style: normal; font-family: Verdana; text-align: left\"\n");
      out.write("                         Text=\"Join the book club\"\n");
      out.write("                         Width=\"196px\" Font-Underline=\"False\">Join the book club</div><br />\n");
      out.write("                    <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                    <div ID=\"Label10\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Get 10% discount\"\n");
      out.write("                         Width=\"286px\">* Get 10% discount</div>\n");
      out.write("                    <div ID=\"Label11\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Get books free worth $20\" Width=\"285px\">* Get books free worth $20</div>\n");
      out.write("                    <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                    <div ID=\"Label12\" runat=\"server\" Font-Bold=\"True\" Font-Italic=\"True\" Font-Size=\"X-Large\"\n");
      out.write("                         Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Height=\"22px\" Style=\"font-weight: bold; font-size: 9pt; color: #FFFFFF; font-style: normal; font-family: Verdana; text-align: left\"\n");
      out.write("                         Text=\"Customer service\" Width=\"196px\">Customer service</div>\n");
      out.write("                    <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                    <div ID=\"Label13\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* All orders are executed in the least possible time.\" Width=\"297px\">* All orders are executed in the least possible time.</div>\n");
      out.write("                    <div ID=\"Label8\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Books are supplied all over the globe.\" Width=\"291px\">* Books are supplied all over the globe.</div>\n");
      out.write("                    <div ID=\"Label15\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Books are thoroughly checked before dispatch.\" Width=\"289px\">* Books are thoroughly checked before dispatch.</div>\n");
      out.write("                    <div ID=\"Label14\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Best standard of packaging material is used.\" Width=\"282px\">* Best standard of packaging material is used.</div>\n");
      out.write("                    <div ID=\"Label16\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                         Text=\"* Multiple modes of payment are available.\" Width=\"289px\">* Multiple modes of payment are available.</div>\n");
      out.write("                    <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                    &nbsp;</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\" style=\"height: 14px; background-color: #106e0c; text-align: center; color: #FFFFFF;\">\n");
      out.write("                        <div ID=\"lblCopyright\" runat=\"server\" Text=\"Copyright © New Tech Books 2013\" Style=\"font-size: 8pt; font-family: Verdana\">Copyright © New Tech Books 2018</div></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
