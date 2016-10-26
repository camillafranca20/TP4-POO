package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.fatecpg.cadastros.clientes;
import br.com.fatecpg.cadastros.fornecedores;
import br.com.fatecpg.cadastros.database;
import br.com.fatecpg.cadastros.pessoa;

public final class edicaoCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/bootsconfig.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/jsconfig.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  
    ArrayList<clientes> lista = database.getClientes();
//    String teste = request.getParameter("idt");
      String teste = request.getParameter("id");
      
      clientes c = lista.get(Integer.parseInt(teste));
      
    //int i  = (teste!=null) ? Integer.parseInt(teste) : 0;
    if(request.getParameter("editar") != null){
        int i = Integer.parseInt(teste);
        lista.get(i).setNome(request.getParameter("nome"));
        lista.get(i).setCpf(request.getParameter("cpf"));
        lista.get(i).setRg(request.getParameter("rg"));
        lista.get(i).setEmail(request.getParameter("email"));
        lista.get(i).setTelefone(request.getParameter("telefone"));
        //lista.get(i).setEndereco(request.getParameter("endereco"));

        response.sendRedirect("listagemCliente.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"bootstrap/css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"bootstrap/css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"bootstrap/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>Cadastro de cliente</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">PROJETO 4</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"index.jsp\"><i class=\"fa fa-fw fa-dashboard\"></i> Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#cliente\"><i class=\"fa fa-fw fa-arrows-v\"></i> Cliente <i class=\"fa fa-fw fa-caret-down\"></i></a>\n");
      out.write("                        <ul id=\"cliente\" class=\"collapse\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"cadastroCliente.jsp\">Cadastrar novo</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"listagemCliente.jsp\">Relatório</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#fornecedor\"><i class=\"fa fa-fw fa-arrows-v\"></i> Fornecedor <i class=\"fa fa-fw fa-caret-down\"></i></a>\n");
      out.write("                        <ul id=\"fornecedor\" class=\"collapse\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"cadastroFornec.jsp\">Cadastrar novo</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"listagemFornec.jsp\">Relatório</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </nav>");
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <!-- Page Heading -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            Editar cliente\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.html\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <i class=\"fa fa-edit\"></i> Edição\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(teste);
      out.write("\">\n");
      out.write("                <!-- /.row -->\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <form role=\"form\" class=\"col-lg-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nome</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Informe seu nome aqui\" name=\"nome\"  value=\"");
c.getNome();
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>CPF</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"45678998760\" name=\"cpf\" value=\"");
c.getCpf();
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>RG</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"349887680\" name=\"rg\" value=\"");
c.getRg();
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" placeholder=\"email@email.com\" name=\"email\" value=\"");
c.getEmail();
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Telefone</label>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" placeholder=\"(13)34562678\" name=\"telefone\" pattern=\"^\\d{2}-\\d{4}-\\d{4}$\" value=\"");
c.getTelefone();
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Endereço</label>\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Rua Guarulhos\" name=\"endereco\" value=\"");
c.getRua();
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <button type=\"submit\" name=\"editar\" value=\"Editar\" class=\"btn btn-success\">Editar</button>\n");
      out.write("                            <button type=\"reset\" name=\"excluir\" class=\"btn btn-default\">Limpar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("    ");
      out.write("<!-- jQuery -->\n");
      out.write("    <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.8.2.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Morris Charts JavaScript -->\n");
      out.write("    <script src=\"bootstrap/js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/plugins/morris/morris.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/plugins/morris/morris-data.js\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("$('#filtro-nome').keyup(function() {\n");
      out.write("    var nomeFiltro = $(this).val().toLowerCase();\n");
      out.write("    $('table tbody').find('tr').each(function() {\n");
      out.write("        var conteudoCelula = $(this).find('td:nth-child(2)').text();\n");
      out.write("        var corresponde = conteudoCelula.toLowerCase().indexOf(nomeFiltro) >= 0;\n");
      out.write("        $(this).css('display', corresponde ? '' : 'none');\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<script src=\"//code.jquery.com/jquery-2.2.2.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Adicionando Javascript -->\n");
      out.write("    <script type=\"text/javascript\" >\n");
      out.write("\n");
      out.write("        $(document).ready(function() {\n");
      out.write("\n");
      out.write("            function limpa_formulário_cep() {\n");
      out.write("                // Limpa valores do formulário de cep.\n");
      out.write("                $(\"#rua\").val(\"\");\n");
      out.write("                $(\"#bairro\").val(\"\");\n");
      out.write("                $(\"#cidade\").val(\"\");\n");
      out.write("                $(\"#uf\").val(\"\");\n");
      out.write("                $(\"#ibge\").val(\"\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            //Quando o campo cep perde o foco.\n");
      out.write("            $(\"#cep\").blur(function() {\n");
      out.write("\n");
      out.write("                //Nova variável \"cep\" somente com dígitos.\n");
      out.write("                var cep = $(this).val().replace(/\\D/g, '');\n");
      out.write("\n");
      out.write("                //Verifica se campo cep possui valor informado.\n");
      out.write("                if (cep !== \"\") {\n");
      out.write("\n");
      out.write("                    //Expressão regular para validar o CEP.\n");
      out.write("                    var validacep = /^[0-9]{8}$/;\n");
      out.write("\n");
      out.write("                    //Valida o formato do CEP.\n");
      out.write("                    if(validacep.test(cep)) {\n");
      out.write("\n");
      out.write("                        //Preenche os campos com \"...\" enquanto consulta webservice.\n");
      out.write("                        $(\"#rua\").val(\"...\");\n");
      out.write("                        $(\"#bairro\").val(\"...\");\n");
      out.write("                        $(\"#cidade\").val(\"...\");\n");
      out.write("                        $(\"#uf\").val(\"...\");\n");
      out.write("                        $(\"#ibge\").val(\"...\");\n");
      out.write("\n");
      out.write("                        //Consulta o webservice viacep.com.br/\n");
      out.write("                        $.getJSON(\"//viacep.com.br/ws/\"+ cep +\"/json/?callback=?\", function(dados) {\n");
      out.write("\n");
      out.write("                            if (!(\"erro\" in dados)) {\n");
      out.write("                                //Atualiza os campos com os valores da consulta.\n");
      out.write("                                $(\"#rua\").val(dados.logradouro);\n");
      out.write("                                $(\"#bairro\").val(dados.bairro);\n");
      out.write("                                $(\"#cidade\").val(dados.localidade);\n");
      out.write("                                $(\"#uf\").val(dados.uf);\n");
      out.write("                                $(\"#ibge\").val(dados.ibge);\n");
      out.write("                            } //end if.\n");
      out.write("                            else {\n");
      out.write("                                //CEP pesquisado não foi encontrado.\n");
      out.write("                                limpa_formulário_cep();\n");
      out.write("                                alert(\"CEP não encontrado.\");\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    } //end if.\n");
      out.write("                    else {\n");
      out.write("                        //cep é inválido.\n");
      out.write("                        limpa_formulário_cep();\n");
      out.write("                        alert(\"Formato de CEP inválido.\");\n");
      out.write("                    }\n");
      out.write("                } //end if.\n");
      out.write("                else {\n");
      out.write("                    //cep sem valor, limpa formulário.\n");
      out.write("                    limpa_formulário_cep();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        </script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
