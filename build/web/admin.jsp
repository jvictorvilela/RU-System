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
        <jsp:param name="title" value="Tela admin" />
    </jsp:include>

    <jsp:include page="autenticarAdmin.jsp" />

    <%
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario) dao.getPojo(request.getSession().getAttribute("usuario") + "");


    %>

    <body class="admin">


        <jsp:include page="layout/top-admin.jsp" />
        <jsp:include page="layout/menu-admin.jsp" >
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
                <div class="col-lg-6 col-md-12">


                    <div class="row">
                        <div class="col-md-12">
                            <div class="box-admin">
                                <div class="box-titulo"><i class="fas fa-plus-circle"></i>Adicionar fichas</div>
                                <div class="box-conteudo">

                                    <form action="/ru/Controller?command=AdicionarFichas" method="POST">
                                        <div class="form-group">
                                            <label for="matriculaLabel">Matrícula</label>
                                            <input type="text" class="form-control form-green" id="matriculaLabel" name="matricula" >
                                        </div>
                                        <div class="form-group">
                                            <label for="qtdLabel">Quantidade de fichas</label>
                                            <input type="number" class="form-control form-green" id="qtdLabel" name="qtd">
                                        </div>
                                        <input type="submit" value="Adicionar" class="btn btn-green">
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-12">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="box-admin">
                                <div class="box-titulo"><i class="fas fa-history"></i>Histórico de vendas</div>
                                <div class="box-conteudo">

                                    <%
                                        VendaDAO vendDao = new VendaDAO();
                                        List vendas = vendDao.getPojos();
                                    %>

                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th scope="col">Quantidade</th>
                                                <th scope="col">Vendedor</th>
                                                <th scope="col">Matrícula</th>
                                                <th scope="col">Data</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% for (int i = (vendas.size() > 10 ? vendas.size() - 10 : 0); i < vendas.size(); i++) {%>
                                            <tr>
                                                <td><%= ((Venda) vendas.get(i)).getQuantTicket()%></td>
                                                <td><%= ((Venda) vendas.get(i)).getIdUsuV()%></td>
                                                <td><%= ((Venda) vendas.get(i)).getIdUsuC()%></td>
                                                <td><%= ((Venda) vendas.get(i)).getDatas() + " - " + ((Venda) vendas.get(i)).getHoras()%></td>
                                            </tr>
                                            <% }%>
                                        </tbody>
                                    </table>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>