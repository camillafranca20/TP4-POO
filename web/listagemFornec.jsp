<%@page pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatecpg.cadastros.clientes"%>
<%@page import="br.com.fatecpg.cadastros.fornecedores"%>
<%@page import="br.com.fatecpg.cadastros.database"%>
<%@page import="br.com.fatecpg.cadastros.pessoa"%>

<!DOCTYPE html>
 <% ArrayList<fornecedores> lista = database.getFornecedores();

   
  String[] fornecedor = new String[11];
  
  fornecedor[1]= "";
  fornecedor[2] = "";
  fornecedor[3] = "";
  fornecedor[4] = "";
  fornecedor[5] = "";
  fornecedor[6] = "";
  fornecedor[7] = "";
  fornecedor[8] = "";
  fornecedor[9] = "";
  fornecedor[10] = "";
  
  if(request.getParameter("excluir") != null){
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        lista.remove(i);
        response.sendRedirect(request.getRequestURI());
  }
    
  if(request.getParameter("editar") != null){
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        response.sendRedirect("edicaoFornecedor.jsp?id=" + i);
  }
   
    if(request.getParameter("detalhe") != null) {
        
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        for (fornecedores c: lista) {
            if(lista.indexOf(c) == i) {
                fornecedor[1]= c.getNome();
                fornecedor[2] = c.getCnpj();
                fornecedor[3] = c.getRazaoSocial();
                fornecedor[4] = c.getEmail();
                fornecedor[5] = c.getTelefone();
                fornecedor[6] = c.getRua();
                fornecedor[7] = c.getBairro();
                fornecedor[8] = c.getNumero();
                fornecedor[9] = c.getCidade();
                fornecedor[10] = c.getUf();
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
                            Relatório de Fornecedores
                            <small></small>
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Home</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-file"></i> Relatório de Fornecedores
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->
                
                <div class="col-lg-12">
                        <div class="table-responsive">
                            <div class="form-group col-lg-4">
                                <label for="filtro-nome">Pesquisar pelo nome</label>
                                <input id="filtro-nome" class="form-control"/>
                            </div>
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nome</th>
                                        <th>CNPJ</th>
                                        <th>Razão Social</th>
                                        <th>Email</th>
                                        <th>Telefone</th>
                                        <th>Rua</th>
                                        <th>Ação</th>
                                    <tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <% for(fornecedores c: lista){ %>
                                            <tr>
                                                <td><%= lista.indexOf(c)%></td>
                                                <td><%= c.getNome()  %></td>
                                                <td><%= c.getCnpj()%></td>
                                                <td><%= c.getRazaoSocial()%></td>
                                                <td><%= c.getEmail() %></td>
                                                <td><%= c.getTelefone() %></td>
                                                <td><%= c.getRua() %></td>
                                                <td>
                                                    <form>
                                                        <input type="hidden" name="i" value="<%= lista.indexOf(c) %>">
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
                                <label>Nome: </label><td><%=fornecedor[1]%></td><br/>
                                <label>CNPJ: </label><td><%=fornecedor[2]%></td><br/>
                                <label>Razão Social: </label><td><%=fornecedor[3]%></td><br/>
                                <label>Email: </label><td><%=fornecedor[4]%></td><br/>
                                <label>Telefone: </label><td><%=fornecedor[5]%></td><br/>
                                <label>Rua: </label><td><%=fornecedor[6]%></td><br/>
                                <label>Bairro: </label><td><%=fornecedor[7]%></td><br/>
                                <label>Número: </label><td><%=fornecedor[8]%></td><br/>
                                <label>Cidade: </label><td><%=fornecedor[9]%></td><br/>
                                <label>UF:</label><td><%=fornecedor[10]%></td>
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
