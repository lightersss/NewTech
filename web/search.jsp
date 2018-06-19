<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div>
            <table style="width: 100%; height: 358px; padding: 5px" border="0">
                <tr>

                    <td style="width: 100px">
                        <img src="Logo.jpg" Width="200px" />
                    </td>
                    <td style="text-align: center; vertical-align: middle; background-color: #106e0c; font-family: 'Monotype Corsiva'; font-size: 75px; font-weight: bold; color: #FFFFFF;">New Tech Book Store
                        &nbsp;</td>
                    <td style="width: 200px">
                        <img src="Book2.png" Width="300px" /></td>
                </tr>
                <tr>
                    <td colspan="3" style="background-color: #106e0c" class="auto-style1"></td>
                </tr>
                <tr>

                    <td style="vertical-align: top; background-color: #106e0c; color: #FFFFFF; width: 100px;">
                        <br />
                        <br />
                        <ul>
                            <c:if test="${sessionScope.user==null}">
                                <li><a href="denglu.jsp" Font-Underline="False" ForeColor="#FFFFFF" Style="font-size: 9pt; font-family: 'Times New Roman'" Width="89px">log in</a>
                            </c:if>
                            <c:if test="${sessionScope.user!=null}">
                                <li><a href="http://localhost:8084/NewTech/logout" Font-Underline="False" ForeColor="#FFFFFF" Style="font-size: 9pt; font-family: 'Times New Roman'" Width="89px">log out</a>
                                    
                            </c:if>
                               
                            <br />  
                            <br />
                            <li><a href="zhuce.jsp" Font-Underline="False" ForeColor="#FFFFFF" Style="font-size: 9pt; font-family: 'Times New Roman'" Width="89px">register</a></li>
                            <br /><br />
                            <li><a href="shoppingcart.jsp" Font-Underline="False" ForeColor="#FFFFFF" Style="font-size: 9pt; font-family: 'Times New Roman'" Width="89px">shopping cart</a>
                                <br />  <br/>

                            <li><a href="search.jsp" Font-Underline="False" ForeColor="#FFFFFF" Style="font-size: 9pt; font-family: 'Times New Roman'" Width="89px">search</a>
                        </ul>
                    </td>

                    <td style="vertical-align: top">
                        
                        <table style="text-align: center; font-family: 'Monotype Corsiva'; font-size: 25px; font-weight: bold; ">
                            <tr><td>Hello,${sessionScope.user}</td></tr>
                            <tr><td><form method="GET" action="http://localhost:8080/NewTech/Search">
                                search the book <input id="a" type="text"  name="SearchArea"/><br>
                                <input type="submit" value="submit"/>
                                    </form></td></tr>
 


                        </table>
                        &nbsp;
                    </td>
                    <td style="background-color: #106e0c; vertical-align: top; text-align: left; width: 200px;">
                        <div ID="Label9" runat="server" Font-Bold="True" Font-Italic="True" Font-Size="X-Large"
                             ForeColor="#FFFFFF" Height="22px" Style="font-weight: bold; font-family: Verdana; text-align: left; font-size: 9pt; font-style: normal; color: #FFFFFF;"
                             Width="196px" Font-Underline="False">Why buy from us?</div><br />
                        <hr style="width: 287px; color: #FFFFFF" />
                        <div ID="Label1" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Width="233px">* Over 4.5 million books</div>
                        <div ID="Label3" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Lowest possible prices" Width="233px">* Lowest possible prices</div>
                        <div ID="Label4" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Books for all age groups" Width="283px">* Books for all age groups</div>
                        <div ID="Label6" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Order a book before it hits the market" Width="289px">* Order a book before it hits the market</div>
                        <div ID="Label7" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Promotion schemes" Width="289px">* Promotion schemes</div>
                        <hr style="width: 287px; color: #FFFFFF" />
                        <div ID="Label5" runat="server" Font-Bold="True" Font-Italic="True" Font-Size="X-Large"
                             ForeColor="#FFFFFF" Height="22px" Style="font-weight: bold; font-size: 9pt; color: #FFFFFF; font-style: normal; font-family: Verdana; text-align: left"
                             Text="Join the book club"
                             Width="196px" Font-Underline="False">Join the book club</div><br />
                        <hr style="width: 287px; color: #FFFFFF" />
                        <div ID="Label10" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Get 10% discount"
                             Width="286px">* Get 10% discount</div>
                        <div ID="Label11" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Get books free worth $20" Width="285px">* Get books free worth $20</div>
                        <hr style="width: 287px; color: #FFFFFF" />
                        <div ID="Label12" runat="server" Font-Bold="True" Font-Italic="True" Font-Size="X-Large"
                             Font-Underline="False" ForeColor="#FFFFFF" Height="22px" Style="font-weight: bold; font-size: 9pt; color: #FFFFFF; font-style: normal; font-family: Verdana; text-align: left"
                             Text="Customer service" Width="196px">Customer service</div>
                        <hr style="width: 287px; color: #FFFFFF" />
                        <div ID="Label13"  Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* All orders are executed in the least possible time." Width="297px">* All orders are executed in the least possible time.</div>
                        <div ID="Label8" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Books are supplied all over the globe." Width="291px">* Books are supplied all over the globe.</div>
                        <div ID="Label15" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Books are thoroughly checked before dispatch." Width="289px">* Books are thoroughly checked before dispatch.</div>
                        <div ID="Label14" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Best standard of packaging material is used." Width="282px">* Best standard of packaging material is used.</div>
                        <div ID="Label16" runat="server" Style="font-size: 8pt; color: #FFFFFF; font-family: Verdana"
                             Text="* Multiple modes of payment are available." Width="289px">* Multiple modes of payment are available.</div>
                        <hr style="width: 287px; color: #FFFFFF" />
                        &nbsp;</td>

                </tr>
                <tr>
                    <td colspan="3" style="height: 14px; background-color: #106e0c; text-align: center; color: #FFFFFF;">
                        <div ID="lblCopyright"  Text="Copyright © New Tech Books 2013" Style="font-size: 8pt; font-family: Verdana">Copyright © New Tech Books 2013</div></td>
                </tr>
            </table>

        </div>

    </body>
</html>
