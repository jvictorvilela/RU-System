<%@page import="DAO.UsuarioDAO"%>
<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="layout/header.jsp" >
        <jsp:param name="title" value="Novo usuário" />
    </jsp:include>

    <jsp:include page="autenticarAdmin.jsp" />

    <%
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario) dao.getPojo(request.getSession().getAttribute("usuario") + "");
    %>

    <body class="admin">



        <jsp:include page="layout/top-admin.jsp" />
        <jsp:include page="layout/menu-admin.jsp" >
            <jsp:param name="active" value="add-usuario" />
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
                        <div class="box-titulo"><i class="fas fa-user-plus nav-left-icon"></i> Cadastrar novo usuário</div>
                        <div class="box-conteudo">
                            <form action="/ru/Controller?command=CadastrarNovoUsuario" method="POST">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="nomeLabel">Nome</label>
                                            <input type="text" class="form-control form-green" id="nomeLabel" name="nome" >
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label for="matriculaLabel">Matrícula</label>
                                            <input type="text" class="form-control form-green" id="matriculaLabel" name="matricula" >
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label for="senhaLabel">Senha</label>
                                            <input type="password" class="form-control form-green" id="senhaLabel" name="senha">
                                        </div>
                                    </div>
                                    <div class="col-lg-7">
                                        <div class="form-group">
                                            <label for="cpfLabel">CPF</label>
                                            <input type="password" class="form-control form-green" id="cpfLabel" name="cpf">
                                        </div>
                                    </div>
                                    <div class="col-lg-5">
                                        <div class="form-group">
                                            <label for="tipoLabel">Tipo</label>
                                            <input type="text" class="form-control form-green" id="tipoLabel" name="tipo">
                                        </div>
                                    </div>
                                </div>
                                <input type="submit" value="Cadastrar" class="btn btn-green">
                            </form>
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