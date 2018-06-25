<%@page import="entidade.Venda"%>
<%@page import="java.util.List"%>
<%@page import="DAO.VendaDAO"%>
<%@page import="DAO.UsuarioDAO"%>
<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="layout/header.jsp" >
        <jsp:param name="title" value="Histórico de vendas" />
    </jsp:include>

    <jsp:include page="autenticarAdmin.jsp" />

    <%
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario) dao.getPojo(request.getSession().getAttribute("usuario") + "");
    %>

    <body class="admin">



        <jsp:include page="layout/top-admin.jsp" />
        <jsp:include page="layout/menu-admin.jsp" >
            <jsp:param name="active" value="historico-vendas" />
        </jsp:include>

        <div class="container-fluid container-admin">
            <div class="row">   



                <div class="col-lg-12 col-md-12">

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

                    <div class="box-admin">
                        <div class="box-titulo"><i class="fas fa-user-plus nav-left-icon"></i> Histórico de vendas</div>
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
                                    <% for (int i = 0; i < vendas.size(); i++) { %>
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


        <!-- Modal editar nome -->
        <div class="modal fade" id="modal-nome" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Editar nome</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form method="POST" action="/ru/Controller?command=EditarNome">
                        <div class="modal-body">
                            <input type="text" class="form-control form-green" placeholder="Novo nome" name="nome">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <input type="submit" value="Salvar" class="btn btn-green"> 
                        </div>
                    </form>
                </div>
            </div>
        </div>


        <!-- Modal editar senha -->
        <div class="modal fade" id="modal-senha" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Editar senha</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form method="POST" action="/ru/Controller?command=EditarSenha">
                        <div class="modal-body">
                            <input type="password" class="form-control form-green" placeholder="Nova senha" name="senha">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <input type="submit" value="Salvar" class="btn btn-green"> 
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>