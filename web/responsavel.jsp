<%@page import="entidade.Venda"%>
<%@page import="java.util.List"%>
<%@page import="DAO.VendaDAO"%>
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
        <jsp:param name="title" value="Tela responsável" />
    </jsp:include>

    <jsp:include page="autenticarResponsavel.jsp" />

    <%
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario) dao.getPojo(request.getSession().getAttribute("usuario") + "");


    %>

    <body class="admin">


        <jsp:include page="layout/top-responsavel.jsp" />
        <jsp:include page="layout/menu-responsavel.jsp" >
            <jsp:param name="active" value="inicio" />
        </jsp:include>

        <div class="container-fluid container-admin">

            <!-- mensagens -->
            <%          
                if (request.getParameter("erro") != null) {
            %>
            <div class="alert alert-danger alert-dismissibler alert-dismissible fade show" role="alert" style="margin-bottom: 30px">
                <%= request.getParameter("erro")%>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <%
                }
            %>

            <%
                if (request.getParameter("sucesso") != null) {
            %>


            <div class="alert alert-success alert-dismissible fade show" role="alert" style="margin-bottom: 30px">
                <%= request.getParameter("sucesso")%>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <%
                }
            %>
            <!-- -->


            <div class="row">
                <div class="col-lg-12 col-md-12">


                    <div class="row">
                        <div class="col-md-12">
                            <div class="box-admin">
                                <div class="box-titulo"><i class="fas fa-plus-circle"></i>Descontar ficha</div>
                                <div class="box-conteudo">

                                    <form action="/ru/Controller?command=DescontarFicha" method="POST">
                                        <div class="form-group">
                                            <label for="matriculaLabel">Matrícula</label>
                                            <input type="text" class="form-control form-green" id="matriculaLabel" name="matricula" >
                                        </div>
                                        <input type="submit" value="Descontar" class="btn btn-green">
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>