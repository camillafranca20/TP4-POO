package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.fatecpg.cadastros.clientes;
import br.com.fatecpg.cadastros.fornecedores;
import br.com.fatecpg.cadastros.database;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");

  ArrayList<clientes> lista = database.getClientes();
  ArrayList<fornecedores> lista2 = database.getFornecedores();
  int a = 0, b = 0;
  a = lista.size();
  b = lista2.size();

      out.write("\n");
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
      out.write("    <title>Home</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("        \n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <!-- Page Heading -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            Cliente <small>Informações</small>\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> Home\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\"> \n");
      out.write("                                            ");
      out.print(a);
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>clientes</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"listagemCliente.jsp\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Veja detalhes</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-green\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">Novo</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"cadastroCliente.jsp\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Novo cliente</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-yellow\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                       <i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">Editar</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Editar clientes</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-red\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-support fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">Excluir</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Excluir fornecedores</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            Fornecedor <small>Informações</small>\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> Home\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div><div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">");
      out.print(b);
      out.write("</div>\n");
      out.write("                                        <div>fornecedores</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Veja detalhes</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-green\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">Novo</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"cadastroFornec.jsp\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Novo fornecedor</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-yellow\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                       <i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">Editar</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Editar fornecedores</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"panel panel-red\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-3\">\n");
      out.write("                                        <i class=\"fa fa-support fa-5x\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\n");
      out.write("                                        <div class=\"huge\">Excluir</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <span class=\"pull-left\">Excluir fornecedores</span>\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>         \n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("    \n");
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
