<%@page import="entidade.Item"%>
<%@page import="DAO.ItemDAO"%>
<%@page import="entidade.Cardapio"%>
<%@page import="DAO.CardapioSemDAO"%>
<%@page import="DAO.UsuarioDAO"%>
<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="layout/header.jsp" >
        <jsp:param name="title" value="Tela aluno" />
    </jsp:include>
    
    <jsp:include page="autenticarUsuario.jsp" />
    
    <%
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario)dao.getPojo(request.getSession().getAttribute("usuario")+"");
        

    %>
    
    <body class="admin">


    <jsp:include page="layout/top-usuario.jsp" />
     <jsp:include page="layout/menu-usuario.jsp" >
        <jsp:param name="active" value="inicio" />
    </jsp:include>
    
        <div class="container-fluid container-admin">
            <div class="row">
                <div class="col-lg-8 col-md-12">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="box-admin">
                                <div class="box-titulo"><i class="fas fa-list-ul"></i>Cardápio</div>
                                <div class="box-conteudo ajuste-cardapio">

                                <jsp:include page="layout/cardapio.jsp" />

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12">
                    <div class="row">
                        <div class="col-lg-12 col-md-6">
                            <div class="box-admin box-verde">
                                <div class="box-titulo"><i class="far fa-credit-card"></i>Créditos</div>
                                <div class="box-conteudo ajuste-creditos center"><span class="font-regular" style="font-size: 75px"><%= usr.getQuantTicket()%></span><span class="font-regular" style="font-size: 30px"> Refeições</span></div>
                            </div>
                        </div>
                        <!--
                        <div class="col-lg-12 col-md-6">
                            <div class="box-admin">
                                <div class="box-titulo"><i class="fas fa-history"></i></i>Histórico</div>
                                <div class="box-conteudo">

                                    <table class="table table-historico">
                                        <tbody>
                                            <tr>
                                                <td>+ 10,50</td>
                                                <td>05/11/2018 - 12:32</td>
                                            </tr>
                                            <tr>
                                                <td>- 01,10</td>
                                                <td>05/11/2018 - 12:45</td>
                                            </tr>
                                            <tr>
                                                <td>- 01,10</td>
                                                <td>05/11/2018 - 18:05</td>
                                            </tr>
                                            <tr>
                                                <td>- 01,10</td>
                                                <td>06/11/2018 - 12:11</td>
                                            </tr>
                                            <tr>
                                                <td>- 01,10</td>
                                                <td>07/11/2018 - 11:56</td>
                                            </tr>
                                            <tr>
                                                <td>- 01,10</td>
                                                <td>07/11/2018 - 18:01</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                            -->
                    </div>
                </div>
                
            </div>
        </div>
    </body>
</html>