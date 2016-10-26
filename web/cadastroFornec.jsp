<%@page pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatecpg.cadastros.clientes"%>
<%@page import="br.com.fatecpg.cadastros.fornecedores"%>
<%@page import="br.com.fatecpg.cadastros.database"%>
<%@page import="br.com.fatecpg.cadastros.pessoa"%>

<%
    ArrayList<fornecedores> lista = database.getFornecedores();
    if(request.getParameter("incluir")!= null){
        fornecedores f = new fornecedores();
        f.setNome(request.getParameter("nome"));
        f.setCnpj(request.getParameter("cnpj"));
        f.setRazaoSocial(request.getParameter("razao"));
        f.setEmail(request.getParameter("email"));
        f.setTelefone(request.getParameter("telefone"));
        f.setRua(request.getParameter("rua"));
        f.setBairro(request.getParameter("bairro"));
        f.setCidade(request.getParameter("cidade"));
        f.setUf(request.getParameter("uf"));
        f.setNumero(request.getParameter("numero"));
        lista.add(f);
        response.sendRedirect(request.getRequestURI());
        //Redireciona à página sem parâmetros na URL
    }
    if(request.getParameter("excluir") != null){
        String id = request.getParameter("i");
        int i = Integer.parseInt(id);
        lista.remove(i);
        //Passa o índice do objeto a ser removido da lista
        response.sendRedirect(request.getRequestURI());
    }
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
                            Cadastro de fornecedor
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Home</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Cadastrar novo
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->
                <form role="form" class="col-lg-12">
                <div class="row">
                    <div class="col-lg-6 text-center">
                        <div class="form-group">
                                <label>Nome</label>
                                <input type="text" class="form-control" placeholder="Informe o Nome aqui..." name="nome" required>
                        </div>
                        <div class="form-group">
                                <label>CNPJ</label>
                                <input type="text" class="form-control" placeholder="00.000.000/0000-00..." name="cnpj">
                        </div>
                        <div class="form-group">
                                <label>Razão Social</label>
                                <input type="text" class="form-control" placeholder="Informe a Razão Social aqui..." name="razao" required>
                        </div>
                        <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" placeholder="email@email.com..." name="email" required>
                        </div>
                        <div class="form-group">
                                <label>Telefone</label>
                                <input type="tel" class="form-control" placeholder="(00)00000-0000..." name="telefone" required>
                        </div>
                        <div class="form-group">
                                <label>CEP</label>
                                <input class="form-control" placeholder="00000-000..." name="cep" id="cep" required>
                        </div>
                    </div>
                    <div class="col-lg-6 text-center">
                        <div class="form-group">
                                <label>Rua</label>
                                <input class="form-control" placeholder="Informe a Rua aqui..." name="rua" id="rua" required>
                        </div>
                        <div class="form-group">
                                <label>Bairro</label>
                                <input class="form-control" placeholder="Informe o Bairro aqui..." name="bairro" id="bairro" required>
                        </div>
                        <div class="form-group">
                                <label>Número</label>
                                <input class="form-control" placeholder="Informe o Número aqui..." name="numero" id="numero" required>
                        </div>
                        <div class="form-group">
                                <label>Cidade</label>
                                <input class="form-control" placeholder="Informe a Cidade aqui..." name="cidade" id="cidade" required>
                        </div>
                        <div class="form-group">
                                <label>UF</label>
                                <input class="form-control" placeholder="Informe a UF aqui..." name="uf" id="uf" required>
                        </div>
                            
                        <button type="submit" name="incluir" value="Incluir" class="btn btn-success">Cadastrar</button>
                        <button type="reset" name="excluir" class="btn btn-default">Limpar</button>
                    </div>
                </div>
            </form> 
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
    <%@include file="WEB-INF/jspf/jsconfig.jspf" %>
</body>

</html>
