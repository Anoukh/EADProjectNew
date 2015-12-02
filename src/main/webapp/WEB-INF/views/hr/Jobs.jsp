<%--
  Created by IntelliJ IDEA.
  User: Janitha
  Date: 11/12/15
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Free Bootstrap Admin Template : Dream</title>
  <!-- Bootstrap Styles-->
  <link href="assets/css/bootstrap.css" rel="stylesheet" />
  <!-- FontAwesome Styles-->
  <link href="assets/css/font-awesome.css" rel="stylesheet" />
  <!-- Morris Chart Styles-->
  <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
  <!-- Custom Styles-->
  <link href="assets/css/custom-styles.css" rel="stylesheet" />
  <!-- Google Fonts-->
  <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>

<body>
<div id="wrapper">
  <nav class="navbar navbar-default top-navbar" role="navigation">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index1.jsp">AZD</a>
    </div>

    <ul class="nav navbar-top-links navbar-right">


      <!-- /.dropdown -->
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
          <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
        </a>
        <ul class="dropdown-menu dropdown-alerts">
          <li>
            <a href="#">
              <div>
                <i class="fa fa-comment fa-fw"></i> New Vacancy
                <span class="pull-right text-muted small">Training Mechanics</span>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.dropdown-alerts -->
      </li>
      <!-- /.dropdown -->
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
          <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
        </a>
        <ul class="dropdown-menu dropdown-user">
          <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
          </li>
          <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
          </li>
          <li class="divider"></li>
          <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
          </li>
        </ul>
        <!-- /.dropdown-user -->
      </li>
      <!-- /.dropdown -->
    </ul>
  </nav>
  <!--/. NAV TOP  -->
  <nav class="navbar-default navbar-side" role="navigation">
    <div class="sidebar-collapse">
      <ul class="nav" id="main-menu">

        <li>
          <a href="Finance.jsp"><i class="fa fa-edit"></i> Employee </a>


        </li>
        <li>
          <a href="Wokallocation.jsp"><i class="fa fa-bar-chart-o"></i> Work Allocation</a>
        </li>
        <li>
          <a href="Attendence.jsp"><i class="fa fa-qrcode"></i> Attendence</a>
        </li>
        <li>

          <a class="active-menu" href="Jobs.jsp"><i class="fa fa-dashboard"></i> Training and Jobs</a>
        </li>




      </ul>
      <</div>
  </nav>
  <!-- /. NAV SIDE  -->
  <div id="page-wrapper">
    <div id="page-inner">


      <div class="row">
        <div class="col-md-12">
          <h1 class="page-header">
            Jobs and Training<small></small>
          </h1>
        </div>
      </div>
      <!-- /. ROW  -->

      <div class="row">
        <div class="col-md-3 col-sm-12 col-xs-12">
          <div class="panel panel-primary text-center no-boder bg-color-brown">
            <div class="panel-body">
              <i class="fa fa-users fa-5x"></i>
              <h3>120</h3>
            </div>
            <div class="panel-footer back-footer-brown">
              Total Workers

            </div>
          </div>
        </div>
        <div class="col-md-3 col-sm-12 col-xs-12">
          <div class="panel panel-primary text-center no-boder bg-color-blue">
            <div class="panel-body">
              <i class="fa fa-shopping-cart fa-5x"></i>
              <h3>20</h3>
            </div>
            <div class="panel-footer back-footer-blue">
              Training people

            </div>
          </div>
        </div>
        <div class="col-md-3 col-sm-12 col-xs-12">
          <div class="panel panel-primary text-center no-boder bg-color-red">
            <div class="panel-body">
              <i class="fa fa fa-comments fa-5x"></i>
              <h3>15 </h3>
            </div>
            <div class="panel-footer back-footer-red">
              Job Vacancies

            </div>
          </div>
        </div>
      </div>


      <div class="row">



      <!-- /. ROW  -->



        <div class="col-md-8 col-sm-12 col-xs-12">

          <div class="panel panel-default">
            <div class="panel-heading">
              Vancancies
            </div>
            <div class="panel-body">
              <div class="table-responsive">
                <table class="table table-striped table-bordered table-hover">
                  <thead>
                  <tr>
                    <th>Job Title</th>
                    <th>No. of Vacancies</th>
                    <th>No. of Applicants</th>
                    <th>Type</th>
                    <th>Status</th>

                  </tr>
                  </thead>
                  <tbody>
                  <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                  </tr>
                  <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                  </tr>
                  <tr>
                    <td></td>
                    <td></td>
                    <td></td>

                  </tr>
                  <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                  </tr>
                  <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                  </tr>
                  <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                  </tr>

                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        </div>
      </div>
      <!-- /. ROW  -->
    <footer><p>All right reserved.<a>AZD Private Ltd</a></p></footer>
    </div>
    <!-- /. PAGE INNER  -->
  </div>
  <!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- Morris Chart Js -->
<script src="assets/js/morris/raphael-2.1.0.min.js"></script>
<script src="assets/js/morris/morris.js"></script>
<!-- Custom Js -->
<script src="assets/js/custom-scripts.js"></script>


</body>

</html>

</body>
</html>
