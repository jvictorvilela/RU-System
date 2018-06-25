<div class="nav-left">
    <nav>
        <ul>
            <li class="<% if (request.getParameter("active").equals("inicio")) {out.print("active");
            }%>">
                <a href="usuario.jsp"><i class="fas fa-home nav-left-icon"></i>Inicio</a></li>
            <li class="<% if (request.getParameter("active").equals("perfil")) {out.print("active");
            }%>">
                <a href="editarPerfil.jsp"><i class="fas fa-user nav-left-icon"></i>Perfil</a></li>
        </ul>
    </nav>
</div>