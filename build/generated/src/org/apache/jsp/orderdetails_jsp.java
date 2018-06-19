package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.enterprise.context.SessionScoped;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import beans.Book;

public final class orderdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\" style=\"background-color: #106e0c\" class=\"auto-style1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td style=\"vertical-align: top; background-color: #106e0c; color: #FFFFFF; width: 100px;\">\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("                        <ul>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <br />  \n");
      out.write("                                <br />\n");
      out.write("                            <li><a href=\"zhuce.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">register</a></li>\n");
      out.write("                            <br /><br />\n");
      out.write("                            <li><a href=\"shoppingcart.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">shopping cart</a>\n");
      out.write("                                <br />  <br/>\n");
      out.write("\n");
      out.write("                            <li><a href=\"search.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">search</a>\n");
      out.write("                        </ul>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <td style=\"vertical-align: top\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <table >\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                          \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        &nbsp;\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"background-color: #106e0c; vertical-align: top; text-align: left; width: 200px;\">\n");
      out.write("                        <div ID=\"Label9\" runat=\"server\" Font-Bold=\"True\" Font-Italic=\"True\" Font-Size=\"X-Large\"\n");
      out.write("                             ForeColor=\"#FFFFFF\" Height=\"22px\" Style=\"font-weight: bold; font-family: Verdana; text-align: left; font-size: 9pt; font-style: normal; color: #FFFFFF;\"\n");
      out.write("                             Width=\"196px\" Font-Underline=\"False\">Why buy from us?</div><br />\n");
      out.write("                        <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                        <div ID=\"Label1\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Width=\"233px\">* Over 4.5 million books</div>\n");
      out.write("                        <div ID=\"Label3\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Lowest possible prices\" Width=\"233px\">* Lowest possible prices</div>\n");
      out.write("                        <div ID=\"Label4\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Books for all age groups\" Width=\"283px\">* Books for all age groups</div>\n");
      out.write("                        <div ID=\"Label6\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Order a book before it hits the market\" Width=\"289px\">* Order a book before it hits the market</div>\n");
      out.write("                        <div ID=\"Label7\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Promotion schemes\" Width=\"289px\">* Promotion schemes</div>\n");
      out.write("                        <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                        <div ID=\"Label5\" runat=\"server\" Font-Bold=\"True\" Font-Italic=\"True\" Font-Size=\"X-Large\"\n");
      out.write("                             ForeColor=\"#FFFFFF\" Height=\"22px\" Style=\"font-weight: bold; font-size: 9pt; color: #FFFFFF; font-style: normal; font-family: Verdana; text-align: left\"\n");
      out.write("                             Text=\"Join the book club\"\n");
      out.write("                             Width=\"196px\" Font-Underline=\"False\">Join the book club</div><br />\n");
      out.write("                        <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                        <div ID=\"Label10\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Get 10% discount\"\n");
      out.write("                             Width=\"286px\">* Get 10% discount</div>\n");
      out.write("                        <div ID=\"Label11\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Get books free worth $20\" Width=\"285px\">* Get books free worth $20</div>\n");
      out.write("                        <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                        <div ID=\"Label12\" runat=\"server\" Font-Bold=\"True\" Font-Italic=\"True\" Font-Size=\"X-Large\"\n");
      out.write("                             Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Height=\"22px\" Style=\"font-weight: bold; font-size: 9pt; color: #FFFFFF; font-style: normal; font-family: Verdana; text-align: left\"\n");
      out.write("                             Text=\"Customer service\" Width=\"196px\">Customer service</div>\n");
      out.write("                        <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                        <div ID=\"Label13\"  Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* All orders are executed in the least possible time.\" Width=\"297px\">* All orders are executed in the least possible time.</div>\n");
      out.write("                        <div ID=\"Label8\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Books are supplied all over the globe.\" Width=\"291px\">* Books are supplied all over the globe.</div>\n");
      out.write("                        <div ID=\"Label15\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Books are thoroughly checked before dispatch.\" Width=\"289px\">* Books are thoroughly checked before dispatch.</div>\n");
      out.write("                        <div ID=\"Label14\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Best standard of packaging material is used.\" Width=\"282px\">* Best standard of packaging material is used.</div>\n");
      out.write("                        <div ID=\"Label16\" runat=\"server\" Style=\"font-size: 8pt; color: #FFFFFF; font-family: Verdana\"\n");
      out.write("                             Text=\"* Multiple modes of payment are available.\" Width=\"289px\">* Multiple modes of payment are available.</div>\n");
      out.write("                        <hr style=\"width: 287px; color: #FFFFFF\" />\n");
      out.write("                        &nbsp;</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\" style=\"height: 14px; background-color: #106e0c; text-align: center; color: #FFFFFF;\">\n");
      out.write("                        <div ID=\"lblCopyright\"  Text=\"Copyright © New Tech Books 2013\" Style=\"font-size: 8pt; font-family: Verdana\">Copyright © New Tech Books 2013</div></td>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"denglu.jsp\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">log in</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"http://localhost:8080/NewTech/logout\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">log out</a>\n");
        out.write("                                <li><a href=\"http://localhost:8080/NewTech/SearchBill\" Font-Underline=\"False\" ForeColor=\"#FFFFFF\" Style=\"font-size: 9pt; font-family: 'Times New Roman'\" Width=\"89px\">bill</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("pays");
    _jspx_th_c_forEach_0.setVarStatus("status");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pays}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr> <td>    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pays.billnum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pays.credict_num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pays.credict_typeString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                   \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
