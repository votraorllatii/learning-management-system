package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Admin - Dashboard</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS-->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Page level plugin CSS-->\n");
      out.write("    <link href=\"vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand navbar-dark bg-dark static-top\" style=\" width: 100%; position: fixed;\">\n");
      out.write("\n");
      out.write("      <a class=\"navbar-brand mr-1\" href=\"index.html\">Admin Dashboard</a>\n");
      out.write("\n");
      out.write("      <button class=\"btn btn-link btn-sm text-white order-1 order-sm-0\" id=\"sidebarToggle\" href=\"#\">\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!-- Navbar Search -->\n");
      out.write("      <form class=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("          <div class=\"input-group-append\">\n");
      out.write("            <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("              <i class=\"fas fa-search\"></i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <ul class=\"navbar-nav ml-auto ml-md-0\">\n");
      out.write("        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("            <span class=\"badge badge-danger\">9+</span>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("            <span class=\"badge badge-danger\">7</span>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"fas fa-user-circle fa-fw\"></i>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Settings</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Activity Log</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar -->\n");
      out.write("      <ul class=\"sidebar navbar-nav\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("            <i class=\"fas fa-user\"></i>\n");
      out.write("            <span>Profile</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("    \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"UserForm.jsp\">\n");
      out.write("            <i class=\"fas fa-users\"></i>\n");
      out.write("            <span>Users</span></a>\n");
      out.write("        </li>\n");
      out.write("    \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"CourseForm.jsp\">\n");
      out.write("            <i class=\"fas fa-chalkboard\"></i>\n");
      out.write("            <span>Courses</span></a>\n");
      out.write("        </li>\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"indexi.jsp\">\n");
      out.write("            <i class=\"fas fa-chalkboard\"></i>\n");
      out.write("            <span>Course Categories</span></a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Breadcrumbs-->\n");
      out.write("          <ol class=\"breadcrumb\">\n");
      out.write("            <li class=\"breadcrumb-item\">\n");
      out.write("              <a href=\"#\">Profile</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"breadcrumb-item active\">Overview</li>\n");
      out.write("          </ol>\n");
      out.write("\n");
      out.write("          <!-- DataTables Example -->\n");
      out.write("<!--          <div class=\"card mb-3\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("              <i class=\"fas fa-table\"></i>\n");
      out.write("              Data Table Example</div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                  <thead>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Name</th>\n");
      out.write("                      <th>Position</th>\n");
      out.write("                      <th>Office</th>\n");
      out.write("                      <th>Age</th>\n");
      out.write("                      <th>Start date</th>\n");
      out.write("                      <th>Salary</th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Name</th>\n");
      out.write("                      <th>Position</th>\n");
      out.write("                      <th>Office</th>\n");
      out.write("                      <th>Age</th>\n");
      out.write("                      <th>Start date</th>\n");
      out.write("                      <th>Salary</th>\n");
      out.write("                    </tr>\n");
      out.write("                  </tfoot>\n");
      out.write("                  <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Tiger Nixon</td>\n");
      out.write("                      <td>System Architect</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>61</td>\n");
      out.write("                      <td>2011/04/25</td>\n");
      out.write("                      <td>$320,800</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Garrett Winters</td>\n");
      out.write("                      <td>Accountant</td>\n");
      out.write("                      <td>Tokyo</td>\n");
      out.write("                      <td>63</td>\n");
      out.write("                      <td>2011/07/25</td>\n");
      out.write("                      <td>$170,750</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Ashton Cox</td>\n");
      out.write("                      <td>Junior Technical Author</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>66</td>\n");
      out.write("                      <td>2009/01/12</td>\n");
      out.write("                      <td>$86,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Cedric Kelly</td>\n");
      out.write("                      <td>Senior Javascript Developer</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>22</td>\n");
      out.write("                      <td>2012/03/29</td>\n");
      out.write("                      <td>$433,060</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Airi Satou</td>\n");
      out.write("                      <td>Accountant</td>\n");
      out.write("                      <td>Tokyo</td>\n");
      out.write("                      <td>33</td>\n");
      out.write("                      <td>2008/11/28</td>\n");
      out.write("                      <td>$162,700</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Brielle Williamson</td>\n");
      out.write("                      <td>Integration Specialist</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>61</td>\n");
      out.write("                      <td>2012/12/02</td>\n");
      out.write("                      <td>$372,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Herrod Chandler</td>\n");
      out.write("                      <td>Sales Assistant</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>59</td>\n");
      out.write("                      <td>2012/08/06</td>\n");
      out.write("                      <td>$137,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Rhona Davidson</td>\n");
      out.write("                      <td>Integration Specialist</td>\n");
      out.write("                      <td>Tokyo</td>\n");
      out.write("                      <td>55</td>\n");
      out.write("                      <td>2010/10/14</td>\n");
      out.write("                      <td>$327,900</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Colleen Hurst</td>\n");
      out.write("                      <td>Javascript Developer</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>39</td>\n");
      out.write("                      <td>2009/09/15</td>\n");
      out.write("                      <td>$205,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Sonya Frost</td>\n");
      out.write("                      <td>Software Engineer</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>23</td>\n");
      out.write("                      <td>2008/12/13</td>\n");
      out.write("                      <td>$103,600</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Jena Gaines</td>\n");
      out.write("                      <td>Office Manager</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>30</td>\n");
      out.write("                      <td>2008/12/19</td>\n");
      out.write("                      <td>$90,560</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Quinn Flynn</td>\n");
      out.write("                      <td>Support Lead</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>22</td>\n");
      out.write("                      <td>2013/03/03</td>\n");
      out.write("                      <td>$342,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Charde Marshall</td>\n");
      out.write("                      <td>Regional Director</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>36</td>\n");
      out.write("                      <td>2008/10/16</td>\n");
      out.write("                      <td>$470,600</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Haley Kennedy</td>\n");
      out.write("                      <td>Senior Marketing Designer</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>43</td>\n");
      out.write("                      <td>2012/12/18</td>\n");
      out.write("                      <td>$313,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Tatyana Fitzpatrick</td>\n");
      out.write("                      <td>Regional Director</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>19</td>\n");
      out.write("                      <td>2010/03/17</td>\n");
      out.write("                      <td>$385,750</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Michael Silva</td>\n");
      out.write("                      <td>Marketing Designer</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>66</td>\n");
      out.write("                      <td>2012/11/27</td>\n");
      out.write("                      <td>$198,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Paul Byrd</td>\n");
      out.write("                      <td>Chief Financial Officer (CFO)</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>64</td>\n");
      out.write("                      <td>2010/06/09</td>\n");
      out.write("                      <td>$725,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Gloria Little</td>\n");
      out.write("                      <td>Systems Administrator</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>59</td>\n");
      out.write("                      <td>2009/04/10</td>\n");
      out.write("                      <td>$237,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Bradley Greer</td>\n");
      out.write("                      <td>Software Engineer</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>41</td>\n");
      out.write("                      <td>2012/10/13</td>\n");
      out.write("                      <td>$132,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Dai Rios</td>\n");
      out.write("                      <td>Personnel Lead</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>35</td>\n");
      out.write("                      <td>2012/09/26</td>\n");
      out.write("                      <td>$217,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Jenette Caldwell</td>\n");
      out.write("                      <td>Development Lead</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>30</td>\n");
      out.write("                      <td>2011/09/03</td>\n");
      out.write("                      <td>$345,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Yuri Berry</td>\n");
      out.write("                      <td>Chief Marketing Officer (CMO)</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>40</td>\n");
      out.write("                      <td>2009/06/25</td>\n");
      out.write("                      <td>$675,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Caesar Vance</td>\n");
      out.write("                      <td>Pre-Sales Support</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>21</td>\n");
      out.write("                      <td>2011/12/12</td>\n");
      out.write("                      <td>$106,450</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Doris Wilder</td>\n");
      out.write("                      <td>Sales Assistant</td>\n");
      out.write("                      <td>Sidney</td>\n");
      out.write("                      <td>23</td>\n");
      out.write("                      <td>2010/09/20</td>\n");
      out.write("                      <td>$85,600</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Angelica Ramos</td>\n");
      out.write("                      <td>Chief Executive Officer (CEO)</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>47</td>\n");
      out.write("                      <td>2009/10/09</td>\n");
      out.write("                      <td>$1,200,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Gavin Joyce</td>\n");
      out.write("                      <td>Developer</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>42</td>\n");
      out.write("                      <td>2010/12/22</td>\n");
      out.write("                      <td>$92,575</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Jennifer Chang</td>\n");
      out.write("                      <td>Regional Director</td>\n");
      out.write("                      <td>Singapore</td>\n");
      out.write("                      <td>28</td>\n");
      out.write("                      <td>2010/11/14</td>\n");
      out.write("                      <td>$357,650</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Brenden Wagner</td>\n");
      out.write("                      <td>Software Engineer</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>28</td>\n");
      out.write("                      <td>2011/06/07</td>\n");
      out.write("                      <td>$206,850</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Fiona Green</td>\n");
      out.write("                      <td>Chief Operating Officer (COO)</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>48</td>\n");
      out.write("                      <td>2010/03/11</td>\n");
      out.write("                      <td>$850,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Shou Itou</td>\n");
      out.write("                      <td>Regional Marketing</td>\n");
      out.write("                      <td>Tokyo</td>\n");
      out.write("                      <td>20</td>\n");
      out.write("                      <td>2011/08/14</td>\n");
      out.write("                      <td>$163,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Michelle House</td>\n");
      out.write("                      <td>Integration Specialist</td>\n");
      out.write("                      <td>Sidney</td>\n");
      out.write("                      <td>37</td>\n");
      out.write("                      <td>2011/06/02</td>\n");
      out.write("                      <td>$95,400</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Suki Burks</td>\n");
      out.write("                      <td>Developer</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>53</td>\n");
      out.write("                      <td>2009/10/22</td>\n");
      out.write("                      <td>$114,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Prescott Bartlett</td>\n");
      out.write("                      <td>Technical Author</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>27</td>\n");
      out.write("                      <td>2011/05/07</td>\n");
      out.write("                      <td>$145,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Gavin Cortez</td>\n");
      out.write("                      <td>Team Leader</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>22</td>\n");
      out.write("                      <td>2008/10/26</td>\n");
      out.write("                      <td>$235,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Martena Mccray</td>\n");
      out.write("                      <td>Post-Sales support</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>46</td>\n");
      out.write("                      <td>2011/03/09</td>\n");
      out.write("                      <td>$324,050</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Unity Butler</td>\n");
      out.write("                      <td>Marketing Designer</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>47</td>\n");
      out.write("                      <td>2009/12/09</td>\n");
      out.write("                      <td>$85,675</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Howard Hatfield</td>\n");
      out.write("                      <td>Office Manager</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>51</td>\n");
      out.write("                      <td>2008/12/16</td>\n");
      out.write("                      <td>$164,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Hope Fuentes</td>\n");
      out.write("                      <td>Secretary</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>41</td>\n");
      out.write("                      <td>2010/02/12</td>\n");
      out.write("                      <td>$109,850</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Vivian Harrell</td>\n");
      out.write("                      <td>Financial Controller</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>62</td>\n");
      out.write("                      <td>2009/02/14</td>\n");
      out.write("                      <td>$452,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Timothy Mooney</td>\n");
      out.write("                      <td>Office Manager</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>37</td>\n");
      out.write("                      <td>2008/12/11</td>\n");
      out.write("                      <td>$136,200</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Jackson Bradshaw</td>\n");
      out.write("                      <td>Director</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>65</td>\n");
      out.write("                      <td>2008/09/26</td>\n");
      out.write("                      <td>$645,750</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Olivia Liang</td>\n");
      out.write("                      <td>Support Engineer</td>\n");
      out.write("                      <td>Singapore</td>\n");
      out.write("                      <td>64</td>\n");
      out.write("                      <td>2011/02/03</td>\n");
      out.write("                      <td>$234,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Bruno Nash</td>\n");
      out.write("                      <td>Software Engineer</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>38</td>\n");
      out.write("                      <td>2011/05/03</td>\n");
      out.write("                      <td>$163,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Sakura Yamamoto</td>\n");
      out.write("                      <td>Support Engineer</td>\n");
      out.write("                      <td>Tokyo</td>\n");
      out.write("                      <td>37</td>\n");
      out.write("                      <td>2009/08/19</td>\n");
      out.write("                      <td>$139,575</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Thor Walton</td>\n");
      out.write("                      <td>Developer</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>61</td>\n");
      out.write("                      <td>2013/08/11</td>\n");
      out.write("                      <td>$98,540</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Finn Camacho</td>\n");
      out.write("                      <td>Support Engineer</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>47</td>\n");
      out.write("                      <td>2009/07/07</td>\n");
      out.write("                      <td>$87,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Serge Baldwin</td>\n");
      out.write("                      <td>Data Coordinator</td>\n");
      out.write("                      <td>Singapore</td>\n");
      out.write("                      <td>64</td>\n");
      out.write("                      <td>2012/04/09</td>\n");
      out.write("                      <td>$138,575</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Zenaida Frank</td>\n");
      out.write("                      <td>Software Engineer</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>63</td>\n");
      out.write("                      <td>2010/01/04</td>\n");
      out.write("                      <td>$125,250</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Zorita Serrano</td>\n");
      out.write("                      <td>Software Engineer</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>56</td>\n");
      out.write("                      <td>2012/06/01</td>\n");
      out.write("                      <td>$115,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Jennifer Acosta</td>\n");
      out.write("                      <td>Junior Javascript Developer</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>43</td>\n");
      out.write("                      <td>2013/02/01</td>\n");
      out.write("                      <td>$75,650</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Cara Stevens</td>\n");
      out.write("                      <td>Sales Assistant</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>46</td>\n");
      out.write("                      <td>2011/12/06</td>\n");
      out.write("                      <td>$145,600</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Hermione Butler</td>\n");
      out.write("                      <td>Regional Director</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>47</td>\n");
      out.write("                      <td>2011/03/21</td>\n");
      out.write("                      <td>$356,250</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Lael Greer</td>\n");
      out.write("                      <td>Systems Administrator</td>\n");
      out.write("                      <td>London</td>\n");
      out.write("                      <td>21</td>\n");
      out.write("                      <td>2009/02/27</td>\n");
      out.write("                      <td>$103,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Jonas Alexander</td>\n");
      out.write("                      <td>Developer</td>\n");
      out.write("                      <td>San Francisco</td>\n");
      out.write("                      <td>30</td>\n");
      out.write("                      <td>2010/07/14</td>\n");
      out.write("                      <td>$86,500</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Shad Decker</td>\n");
      out.write("                      <td>Regional Director</td>\n");
      out.write("                      <td>Edinburgh</td>\n");
      out.write("                      <td>51</td>\n");
      out.write("                      <td>2008/11/13</td>\n");
      out.write("                      <td>$183,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Michael Bruce</td>\n");
      out.write("                      <td>Javascript Developer</td>\n");
      out.write("                      <td>Singapore</td>\n");
      out.write("                      <td>29</td>\n");
      out.write("                      <td>2011/06/27</td>\n");
      out.write("                      <td>$183,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>Donna Snider</td>\n");
      out.write("                      <td>Customer Support</td>\n");
      out.write("                      <td>New York</td>\n");
      out.write("                      <td>27</td>\n");
      out.write("                      <td>2011/01/25</td>\n");
      out.write("                      <td>$112,000</td>\n");
      out.write("                    </tr>\n");
      out.write("                  </tbody>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer small text-muted\">Updated yesterday at 11:59 PM</div>\n");
      out.write("          </div>-->\n");
      out.write("\n");
      out.write("        <form action=\"CourseCategoriesController\" method=\"post\">  \n");
      out.write("            <table> \n");
      out.write("                <input type=hidden id=\"idField\" name=\"courseCategoryId\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("                <tr><td>Course Category Name :</td><td><input type=\"text\" name=\"coursecategoriesname\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" required/></td></tr>  \n");
      out.write("                <tr><td>Course Category Discription: </td><td><input type=\"text\" name=\"coursecategoriesdiscription\" value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\" required/></td></tr>   \n");
      out.write("                <tr><td colspan=\"2\"><input type=\"submit\" value=\"Add Course Category\"/></td></tr>  \n");
      out.write("            </table>  \n");
      out.write("        </form> \n");
      out.write("                        <div class=\"card mb-3\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <i class=\"fas fa-table\"></i>\n");
      out.write("                                Data Table Example</div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/CourseCategoriesController?action=coursecategoriesList", out, false);
      out.write("\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                 \n");
      out.write("                                        <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">  \n");
      out.write("            <tr><th>Id</th><th>Course Category</th><th>Course Discription</th><th>Update</th><th>Delete</th>      \n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("        </table>  \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <form  method=\"POST\" action=\"LogoutController\">\n");
      out.write("            <button>Log out</button>\n");
      out.write("        </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer small text-muted\">Updated yesterday at 11:59 PM</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("        <!-- Sticky Footer -->\n");
      out.write("        <footer class=\"sticky-footer\">\n");
      out.write("          <div class=\"container my-auto\">\n");
      out.write("            <div class=\"copyright text-center my-auto\">\n");
      out.write("              <span>Â© LMS</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("     \n");
      out.write("      <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">Ã</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("            <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datatables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"vendor/datatables/dataTables.bootstrap4.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Demo scripts for this page-->\n");
      out.write("    <script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("    <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategory.getCourseCategoryId()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategory.getCourseCategoryName()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategory.getCourseCategoryDiscription()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategoriesList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("coursecategories");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                <tr><td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td><td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td><td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td><a href=\"CourseCategoriesController?action=edit&courseCategoriesId=");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Update</a></td>\n");
          out.write("                    <td><a href=\"CourseCategoriesController?action=delete&courseCategoriesId=");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">Delete</a></td>                   \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategories.courseCategoryId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategories.courseCategoryName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategories.courseCategoryDiscription}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategories.courseCategoryId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursecategories.courseCategoryId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }
}
