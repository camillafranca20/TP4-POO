package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.fatecpg.cadastros.clientes;
import br.com.fatecpg.cadastros.fornecedores;
import br.com.fatecpg.cadastros.database;
import br.com.fatecpg.cadastros.pessoa;

public final class editarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
    if(request.getParameter("incluir")!= null){
        clientes c = new clientes();
        c.setNome(request.getParameter("nome"));
        c.setCpf(request.getParameter("cpf"));
        c.setRg(request.getParameter("rg"));
        c.setEmail(request.getParameter("email"));
        c.setTelefone(request.getParameter("telefone"));
        c.setEndereco(request.getParameter("endereco"));
        lista.add(c);
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

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      out.write("    <meta charset=\"utf-8\">\n");
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
      out.write("                                <a href=\"cadastroCliente.jsp\">Cadastrar</a>\n");
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
      out.write("                                <a href=\"cadastroFornec.jsp\">Cadastrar</a>\n");
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
      out.write("                            Edição de cliente\n");
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
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("                        <form role=\"form\" class=\"col-lg-6\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nome</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"nome\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>CPF</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"45678998760\" name=\"cpf\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>RG</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"349887680\" name=\"rg\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" placeholder=\"email@email.com\" name=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Telefone</label>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" placeholder=\"(13)34562678\" name=\"telefone\" pattern=\"^\\d{2}-\\d{4}-\\d{4}$\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Endereço</label>\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Rua Guarulhos\" name=\"endereco\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <button type=\"submit\" name=\"incluir\" value=\"Incluir\"class=\"btn btn-success\">Editar</button>\n");
      out.write("                            <button type=\"reset\" name=\"excluir\" class=\"btn btn-default\">Limpar</button>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                                <h2>Relação de todos os clientes cadastrados</h2>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-bordered table-hover table-striped\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Id</th>\n");
      out.write("                                                <th>Nome</th>\n");
      out.write("                                                <th>RG</th>\n");
      out.write("                                                <th>CPF</th>\n");
      out.write("                                                <th>Email</th>\n");
      out.write("                                                <th>Telefone</th>\n");
      out.write("                                                <th>Endereço</th>\n");
      out.write("                                                <th>Ação</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
 for(clientes c: lista){ 
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.print( lista.indexOf(c) /*pega o indice do objeto passado*/ );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( c.getNome()  );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( c.getRg()  );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( c.getCpf()  );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( c.getEmail() );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( c.getTelefone() );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( c.getEndereco() );
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <form>\n");
      out.write("                                                        <input type=\"hidden\" name=\"i\" value=\"");
      out.print( lista.indexOf(c) );
      out.write("\">\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-danger\" name=\"excluir\">Excluir</button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");
 } 
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                        </form>\n");
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
      out.write("\n");
      out.write("    ");
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
