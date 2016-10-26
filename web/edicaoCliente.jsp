<%@ page pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatecpg.cadastros.clientes"%>
<%@page import="br.com.fatecpg.cadastros.fornecedores"%>
<%@page import="br.com.fatecpg.cadastros.database"%>
<%@page import="br.com.fatecpg.cadastros.pessoa"%>
<%        
    ArrayList<clientes> lista = new ArrayList<clientes>();
    String id = "";
    clientes c = new clientes();
    
    if(request.getParameter("editar") != null){
        ArrayList<clientes> listas = database.getClientes();  
        int i = Integer.parseInt(request.getParameter("i"));
        listas.get(i).setNome(request.getParameter("nome"));
        listas.get(i).setCpf(request.getParameter("cpf"));
        listas.get(i).setRg(request.getParameter("rg"));
        listas.get(i).setEmail(request.getParameter("email"));
        listas.get(i).setTelefone(request.getParameter("telefone"));
        listas.get(i).setBairro(request.getParameter("bairro"));
        listas.get(i).setRua(request.getParameter("rua"));
        listas.get(i).setCidade(request.getParameter("cidade"));
        listas.get(i).setUf(request.getParameter("estado"));
        listas.get(i).setNumero(request.getParameter("numero"));

        response.sendRedirect("listagemCliente.jsp");
    }
    else
    {  
    lista = database.getClientes();
    id = request.getParameter("id");
    c = lista.get(Integer.parseInt(id));
    }
%>

<html lang="en">
<head>
    <%@include file="WEB-INF/jspf/bootsconfig.jspf" %>
    <title>Cadastro de cliente</title>
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
                            Editar Cliente
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">Home</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Edição
                            </li>
                        </ol>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-12">
                        <form role="form" class="col-lg-6">
                            <input type="hidden" id="idlista" name="i" value="<%= lista.indexOf(c) %>">
                            <div class="form-group">
                                <label>Nome</label>
                                <input type="text" class="form-control" placeholder="Informe seu Nome aqui..." name="nome" value="<%= c.getNome()%>" required>
                            </div>

                            <div class="form-group">
                                <label>CPF</label>
                                <input type="text" class="form-control" placeholder="000.000.00-00..." name="cpf" onkeypress="mascara(this, '###.###.###-##')" value="<%= c.getCpf()%>">
                            </div>
                            
                            <div class="form-group">
                                <label>RG</label>
                                <input type="text" class="form-control" placeholder="00.000.000-0..." name="rg" value="<%= c.getRg()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" placeholder="email@email.com..." name="email" value="<%= c.getEmail()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Telefone</label>
                                <input type="tel" class="form-control" placeholder="(00)00000-0000..." name="telefone" value="<%= c.getTelefone()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Bairro</label>
                                <input class="form-control" placeholder="Informe o Bairro aqui..." name="bairro" value="<%= c.getBairro()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Rua</label>
                                <input class="form-control" placeholder="Informe a Rua aqui..." name="rua" value="<%= c.getRua()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Numero</label>
                                <input class="form-control" placeholder="Informe o Número aqui..." name="numero" value="<%= c.getNumero()%>" required>
                            </div>                          
                            
                            <div class="form-group">
                                <label>Cidade</label>
                                <input class="form-control" placeholder="Informe a Cidade aqui..." name="cidade" value="<%= c.getCidade()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>UF</label>
                                <input class="form-control" placeholder="Informe a UF aqui..." name="estado" value="<%= c.getUf()%>" required>
                            </div>
                           
                            
                            <button type="submit" name="editar" value="Editar" class="btn btn-success">Salvar</button>
                            <button type="reset" name="excluir" class="btn btn-default">Limpar</button>
                        </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
    <%@include file="WEB-INF/jspf/jsconfig.jspf" %>
</body>

</html>
