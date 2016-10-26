<%@page pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatecpg.cadastros.clientes"%>
<%@page import="br.com.fatecpg.cadastros.fornecedores"%>
<%@page import="br.com.fatecpg.cadastros.database"%>
<%@page import="br.com.fatecpg.cadastros.pessoa"%>

<!DOCTYPE html>
 <% ArrayList<clientes> lista = database.getClientes();
   
  String[] cliente = new String[11];
  
  cliente[1]= "";
  cliente[2] = "";
  cliente[3] = "";
  cliente[4] = "";
  cliente[5] = "";
  cliente[6] = "";
  cliente[7] = "";
  cliente[8] = "";
  cliente[9] = "";
  cliente[10] = "";
  
  if(request.getParameter("excluir") != null){
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        lista.remove(i);
        response.sendRedirect(request.getRequestURI());
  }
  
  if(request.getParameter("editar") != null){
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        response.sendRedirect("edicaoCliente.jsp?id=" + i);
  }
   
    if(request.getParameter("detalhe") != null) {      
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        for (clientes c: lista) {
            if(lista.indexOf(c) == i) {
                cliente[1]= c.getNome();
                cliente[2] = c.getRg();
                cliente[3] = c.getCpf();
                cliente[4] = c.getEmail();
                cliente[5] = c.getTelefone();
                cliente[6] = c.getRua();
                cliente[7] = c.getBairro();
                cliente[8] = c.getNumero();
                cliente[9] = c.getCidade();
                cliente[10] = c.getUf();
            }
        }
    }
    
%>

<head>
    <%@include  file="WEB-INF/jspf/bootsconfig.jspf"%>
    <title>Lista de cliente</title>
}
</head>

<body>

    <div id="wrapper">

        <%@include file="WEB-INF/jspf/header.jspf" %>
        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Relatório de Clientes
                            <small></small>
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Home</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-file"></i> Relatório de Clientes
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->
                
                <div class="col-lg-12">
                        <div class="table-responsive">
                            <div class="form-group col-lg-2">
                                <label for="filtro-nome">Pesquisar pelo nome</label>
                                <input id="filtro-nome" class="form-control"/>
                            </div>
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nome</th>
                                        <th>RG</th>
                                        <th>CPF</th>
                                        <th>Email</th>
                                        <th>Telefone</th>
                                        <th>Rua</th>
                                        <th>Ação</th>
                                    <tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <% for(clientes c: lista){ %>
                                            <tr>
                                                <td><%= lista.indexOf(c)%></td>
                                                <td><%= c.getNome()  %></td>
                                                <td><%= c.getRg()  %></td>
                                                <td><%= c.getCpf()  %></td>
                                                <td><%= c.getEmail() %></td>
                                                <td><%= c.getTelefone() %></td>
                                                <td><%= c.getRua() %></td>
                                                <td>
                                                    <form>
                                                        <input type="hidden" id="idlista" name="i" value="<%= lista.indexOf(c) %>">
                                                        <button type="submit" class="btn btn-xs btn-warning" name="editar">Editar</button>
                                                        <button type="submit" class="btn btn-xs btn-danger" name="excluir">Excluir</button>
                                                        <button type="submit" class="btn btn-xs btn-info" name="detalhe">Detalhes</button>
                                                    </form>
                                                </td>
                                            </tr>
                                            <% } %>
                                    </tr>
                                </tbody>
                            </table>
                                    
                            <div class="panel panel-default" class="hidden">
                            <div class="panel-heading">
                                <h3 class="panel-title">Detalhes</h3>
                            </div>
                            <div class="panel-body">
                                <label>Nome: </label><td><%=cliente[1]%></td><br/>
                                <label>RG: </label><td><%=cliente[2]%></td><br/>
                                <label>CPF: </label><td><%=cliente[3]%></td><br/>
                                <label>Email: </label><td><%=cliente[4]%></td><br/>
                                <label>Telefone: </label><td><%=cliente[5]%></td><br/>
                                <label>Rua: </label><td><%=cliente[6]%></td><br/>
                                <label>Bairro: </label><td><%=cliente[7]%></td><br/>
                                <label>Número: </label><td><%=cliente[8]%></td><br/>
                                <label>Cidade: </label><td><%=cliente[9]%></td><br/>
                                <label>UF:</label><td><%=cliente[10]%></td>
                            </div>
                        </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
    
    <%@include file="WEB-INF/jspf/jsconfig.jspf" %>
</body>
</html>
