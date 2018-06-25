<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="layout/header.jsp" >
        <jsp:param name="title" value="Página inicial" />
    </jsp:include>
    <body class="bg">
        <canvas class="canvas"></canvas>
        <div class="container full">
            <div class="row align-items-center full">
                <div class="col-md-7 col-lg-6 offset-md-0 offset-lg-1 col-sm-12 offset-sm-0 cardapio height-box-login">

                    <jsp:include page="layout/cardapio.jsp" />

                </div>
                <div class="col-md-5 col-lg-4 login-place height-box-login box-login">
                    <% if (request.getParameter("erro") != null) {%>
                        <div class="alert alert-danger" role="alert">
                        Matrícula ou senha incorretas!
                        </div>
                    <% } %>


                    <img src="img/logo.png" class="logo-main-page">
                    <form action="/ru/Controller?command=Login" method="POST">
                        <input class="form-control form-green" type="text" name="login" placeholder="Matrícula">
                        <input class="form-control form-green" type="password" name="senha" placeholder="Senha">
                        <input type="checkbox" value="lembrar" id="lembrar-me">
                        <label class="form-check-label" for="lembrar-me">Lembrar-me</label>
                        <br>
                        <input type="submit" value="Entrar" class="btn btn-green">
                    </form>
                    <a href="#" data-toggle="modal" data-target="#recuperarSenha" >Esqueceu sua senha?</a>
                </div>
            </div>


            <!-- Modal -->
            <div class="modal fade" id="recuperarSenha" tabindex="-1" role="dialog" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Recuperar Senha</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <form class="form-group" style="margin-bottom: 0px">
                                <input type="text" class="form-control form-green" placeholder="Seu email">
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <button type="button" class="btn btn-green">Recuperar</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- -->


    </body>
</html>