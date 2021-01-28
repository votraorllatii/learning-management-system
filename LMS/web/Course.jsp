<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title> Admin </title>
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    </head>

    <body id="page-top">
        <div id="wrapper">
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3"> ADMIN </div>
                </a>
                <hr class="sidebar-divider my-0">

                <li class="nav-item">
                    <a class="nav-link" href="indexii.jsp">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span></a>
                </li>


                <li class="nav-item">
                    <a class="nav-link collapsed" href="User.jsp">
                        <i class="fas fa-fw fa-cog"></i>
                        <span>User </span>
                    </a>

                </li>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="Course.jsp" >
                        <i class="fas fa-fw fa-wrench"></i>
                        <span>Course</span>
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="Languages.jsp" >
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Languages</span>
                    </a>

                </li>

                <li class="nav-item">
                    <a class="nav-link" href="Roles.jsp">
                        <i class="fas fa-fw fa-chart-area"></i>
                        <span>User Roles</span></a>
                </li>

                <li class="nav-item active">
                    <a class="nav-link" href="CourseCategory.jsp">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Course Cateogory</span>
                    </a>
                </li>


            </ul>
            <div id="content-wrapper" class="d-flex flex-column">

                <div id="content">
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
ss
                        <ul class="navbar-nav ml-auto">

                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small">Votra Orllati</span>
                                    <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
                                </a>
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Profile
                                    </a>
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Settings
                                    </a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <div class="container-fluid">

                        <h1 class="h3 mb-2 text-gray-800">Course </h1>
                        <form action="CoursesController" method="post">  
                            <table> 
                                <input type=hidden id="idField" name="courseId" value="<c:out value="${course.getCourseId()}"/>"/>
                                <tr><td>Course Title:</td><td><input type="text" name="coursetitle" value="<c:out value="${course.getCourseTitle()}"/>" required/></td></tr>  
                                <tr><td>Course Description: </td><td><input type="text" name="coursedescription" value="<c:out value="${course.getCourseDescription()}"/>" required/></td></tr>  
                                <tr><td>Course Duration:</td><td><input type="text" name="courseduration" value="<c:out value="${course.getCourseDurationDays()}"/>" required/></td></tr>  
                                <tr><td>Course Fee</td><td><input type="text" name="coursefee" value="<c:out value="${course.getCourseFee()}"/>" required/></td></tr>
                                <tr><td colspan="2"><input type="submit" value="Add Course"/></td></tr>  
                            </table>  
                        </form> 

                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">DataTables </h6>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <jsp:include page="/CoursesController?action=coursesList"/>

                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <tbody>
                                            <tr><th>Id</th><th>Title</t><th>Course Duration</th><th>Course Description</th><th>Course Fee</th><th>Update</th><th>Delete</th>      

                                                <c:forEach items="${coursesList}" var="courses">  
                                                <tr><td><c:out value="${courses.courseId}"/></td><td><c:out value="${courses.courseTitle}"/></td><td><c:out value="${courses.courseDescription}"/></td><td><c:out value="${courses.courseDurationDays}"/></td><td><c:out value="${courses.courseFee}"/></td>  
                                                    <td><a href="CoursesController?action=edit&coursesId=<c:out value="${courses.courseId}"/>">Update</a></td>
                                                    <td><a href="CoursesController?action=delete&coursesId=<c:out value="${courses.courseId}"/>">Delete</a></td>                   
                                                </c:forEach>   
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright LMS 2018</span>
                        </div>
                    </div>
                </footer>

            </div>
        </div>
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="login.html">Logout</a>
                    </div>
                </div>
            </div>
        </div>

        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="js/sb-admin-2.min.js"></script>
        <script src="vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>
        <script src="js/demo/datatables-demo.js"></script>

    </body>

</html>
