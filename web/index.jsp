<%@ page pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fatecpg.cadastros.clientes"%>
<%@page import="br.com.fatecpg.cadastros.fornecedores"%>
<%@page import="br.com.fatecpg.cadastros.database"%>
<!DOCTYPE html>
<html lang="en">
<%
  ArrayList<clientes> lista = database.getClientes();
  ArrayList<fornecedores> lista2 = database.getFornecedores();
  int a = 0, b = 0;
  a = lista.size();
  b = lista2.size();
%>
<head>
    <%@include file="WEB-INF/jspf/bootsconfig.jspf"%>
    <title>Home</title>
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
                            Cliente <small>Informações</small>
                        </h1>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-tasks fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge"> 
                                            <%=a%>
                                        </div>
                                        <div>clientes</div>
                                    </div>
                                </div>
                            </div>
                            <a href="listagemCliente.jsp">
                                <div class="panel-footer">
                                    <span class="pull-left">Veja detalhes</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>    
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-tasks fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge">Novo</div>
                                    </div>
                                </div>
                            </div>
                            <a href="cadastroCliente.jsp">
                                <div class="panel-footer">
                                    <span class="pull-left">Novo cliente</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                </div>                           
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Fornecedor <small>Informações</small>
                        </h1>
                    </div>
                </div><div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-tasks fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge"><%=b%></div>
                                        <div>fornecedores</div>
                                    </div>
                                </div>
                            </div>
                            <a href="listagemFornec.jsp">
                                <div class="panel-footer">
                                    <span class="pull-left">Veja detalhes</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-tasks fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge">Novo</div>
                                    </div>
                                </div>
                            </div>
                            <a href="cadastroFornec.jsp">
                                <div class="panel-footer">
                                    <span class="pull-left">Novo fornecedor</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
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
    
    <%@include  file="WEB-INF/jspf/jsconfig.jspf"%>
</body>

</html>
