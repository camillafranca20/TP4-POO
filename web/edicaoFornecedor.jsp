<%@ page pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatecpg.cadastros.clientes"%>
<%@page import="br.com.fatecpg.cadastros.fornecedores"%>
<%@page import="br.com.fatecpg.cadastros.database"%>
<%@page import="br.com.fatecpg.cadastros.pessoa"%>
<%        
    ArrayList<fornecedores> lista = new ArrayList<fornecedores>();
    String id = "";
    fornecedores f = new fornecedores();
    
    if(request.getParameter("editar") != null){
        ArrayList<fornecedores> listas = database.getFornecedores();  
        int i = Integer.parseInt(request.getParameter("i"));
        listas.get(i).setNome(request.getParameter("nome"));
        listas.get(i).setCnpj(request.getParameter("cnpj"));
        listas.get(i).setRazaoSocial(request.getParameter("razao"));
        listas.get(i).setEmail(request.getParameter("email"));
        listas.get(i).setTelefone(request.getParameter("telefone"));
        listas.get(i).setBairro(request.getParameter("bairro"));
        listas.get(i).setRua(request.getParameter("rua"));
        listas.get(i).setCidade(request.getParameter("cidade"));
        listas.get(i).setUf(request.getParameter("estado"));
        listas.get(i).setNumero(request.getParameter("numero"));

        response.sendRedirect("listagemFornec.jsp");
    }
    else
    {  
    lista = database.getFornecedores();
    id = request.getParameter("id");
    f = lista.get(Integer.parseInt(id));
    }
    

    
//    String teste = request.getParameter("idt");      
    //int i  = (teste!=null) ? Integer.parseInt(teste) : 0;

%>

<html lang="en">
<head>
    <%@include file="WEB-INF/jspf/bootsconfig.jspf" %>
    <title>Cadastro de fornecedor</title>
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
                            Editar Fornecedor
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
                            <input type="hidden" id="idlista" name="i" value="<%= lista.indexOf(f) %>">
                            <div class="form-group">
                                <label>Nome</label>
                                <input type="text" class="form-control" placeholder="Informe o Nome aqui..." name="nome" value="<%= f.getNome()%>" required>
                            </div>

                            <div class="form-group">
                                <label>CNPJ</label>
                                <input type="text" class="form-control" placeholder="00.000.000/0000-00..." name="cnpj" value="<%= f.getCnpj()%>">
                            </div>
                            
                            <div class="form-group">
                                <label>Razão Social</label>
                                <input type="text" class="form-control" placeholder="Informe a Razão Social aqui..." name="razao" value="<%= f.getRazaoSocial()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" placeholder="email@email.com..." name="email" value="<%= f.getEmail()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Telefone</label>
                                <input type="tel" class="form-control" placeholder="(00)00000-0000..." name="telefone" value="<%= f.getTelefone()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Bairro</label>
                                <input class="form-control" placeholder="Informe o Bairro aqui..." name="bairro" value="<%= f.getBairro()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Rua</label>
                                <input class="form-control" placeholder="Informe a Rua aqui..." name="rua" value="<%= f.getRua()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Numero</label>
                                <input class="form-control" placeholder="Informe o Número aqui..." name="numero" value="<%= f.getNumero()%>" required>
                            </div>                          
                            
                            <div class="form-group">
                                <label>Cidade</label>
                                <input class="form-control" placeholder="Informe a Cidade aqui..." name="cidade" value="<%= f.getCidade()%>" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Estado</label>
                                <input class="form-control" placeholder="Informe a UF aqui..." name="estado" value="<%= f.getUf()%>" required>
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
