<div class="nav-left">
    <nav>
        <ul>
            <li class="<% if (request.getParameter("active").equals("inicio")) {out.print("active");
            }%>">
                <a href="admin.jsp"><i class="fas fa-home nav-left-icon"></i>Inicio</a>
            </li>
            
            <li class="<% if (request.getParameter("active").equals("add-usuario")) {out.print("active");
            }%>">
                <a href="novoUsuario.jsp"><i class="fas fa-user-plus nav-left-icon"></i>Novo usuário</a>
            </li>
            
            <li class="<% if (request.getParameter("active").equals("historico-vendas")) {out.print("active");
            }%>">
                <a href="historicoVendas.jsp"><i class="fas fa-history nav-left-icon"></i>Vendas</a>
            </li>
            
            <li class="<% if (request.getParameter("active").equals("perfil")) {out.print("active");
            }%>">
                <a href="editarPerfilAdmin.jsp"><i class="fas fa-user nav-left-icon"></i>Perfil</a>
            </li>
        </ul>
    </nav>
</div>