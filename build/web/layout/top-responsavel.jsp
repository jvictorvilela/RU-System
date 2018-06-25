<%@page import="entidade.Usuario"%>
<%@page import="DAO.UsuarioDAO"%>
<%
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario)dao.getPojo(request.getSession().getAttribute("usuario")+"");
%>    


<!-- top responsivo -->
<div class="top-responsivo">
    <div class="collapse" id="navbarToggleExternalContent">
        <ul class="nav flex-column">
            <li class="nav-item">
                <a class="nav-link active" href="Admin.jsp"><i class="fas fa-home nav-left-icon"></i> Inicio</a>
            </li>
            <div class="separador-menu-responsivo"></div>
            <li class="nav-item">
                <a class="nav-link" href="editarPerfilAdmin.jsp"><i class="fas fa-user nav-left-icon"></i> Editar perfil</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/ru/Controller?command=Sair"><i class="fas fa-sign-out-alt"></i> Sair</a>
            </li>
        </ul>
    </div>
    <nav class="navbar navbar-dark">
        <a href="admin.jsp">
            <img src="img/logo_small.png" class="logo-admin-responsivo">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </nav>
</div>

<!-- -->    

<div class="top">
    <a href="admin.jsp">
        <img src="img/logo_small.png" class="logo-admin">
    </a>
    <div class="usuario-info">
        <a href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <div class="usuario-foto" style="background-image: url('img/perfil.jpg');"></div>
        </a>
        <a href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <div class="usuario-nome"><%= usr.getNome()%> <i class="fas fa-caret-down" style="margin-left: 4px; font-size: 14px"></i></div>
        </a>
        <div class="dropdown-menu dropdown-usuario" aria-labelledby="dropdownMenuLink">
            <a class="dropdown-item" href="editarPerfilAdmin.jsp">Editar perfil</a>
            <a class="dropdown-item" href="/ru/Controller?command=Sair">Sair</a>
        </div>

        <div class="usuario-nivel">
            <%= usr.getTipo()%>
        </div>
    </div>

</div>