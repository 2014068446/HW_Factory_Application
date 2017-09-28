<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="phoneData" type="com.model.phone.Phone" scope="request"></jsp:useBean>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Master's Phone Hub - Official</title>
  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
</head>
<body>
  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#"><img src="vendor/img/logo.png" style="height:50px; width:100px;"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active"><a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a></li>
          <li class="nav-item"><a class="nav-link" data-toggle="popover" data-placement="top" data-content="HW for Elective Course" href="#">About </a></li>
          <li class="nav-item"><a class="nav-link" data-toggle="popover" data-placement="top" data-content="NIGGA I ain't got no time for services bruuhh." href="#">Services </a></li>
          <li class="nav-item"><a class="nav-link" data-toggle="popover" data-placement="top" data-content="4ITG Cucharo & Rodis - https://github.com/2014068446/HW_Factory_Application" href="#">Contact </a></li>
        </ul>
      </div>
    </div>
  </nav><!-- /Navigation -->
  <!-- Page Content -->
  <div class="container">
    <div class="row">
      <div class="col-lg-3">
        <h1 class="my-4">MAJOR SALE! </h1>
        <div class="list-group">
          <a href="#" class="list-group-item" data-toggle="popover" data-placement="left" data-content="You just dabbed.">DAB</a>
          <a href="#" class="list-group-item" data-toggle="popover" data-placement="left" data-content="Watch me">WHIP</a>
          <a href="#" class="list-group-item" data-toggle="popover" data-placement="left" data-content="Watch me">NAE NAE</a>
        </div>
      </div><!-- /.col-lg-3 -->
      <div class="col-lg-9">
        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
         	 <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid parentimg" src="vendor/img/1.jpeg" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid parentimg" src="vendor/img/2.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid parentimg" src="vendor/img/3.jpg" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>
        <div class="row">
          <div class="col-lg-6">
          	<div class="card h-100">
              <div class="card-body">
              	<%
              		String img = "";
              		String model = phoneData.viewModel();
              		
              		switch (model) {
              		case "Moto Z"            : img = "motoz.png"; break;
              		case "5"                 : img = "one+5.jpg"; break;
              		case "U11"               : img = "htc11.png";   break;
              		case "Galaxy S8"         : img = "s8.jpg";      break;
              		case "Galaxy S8 Plus"    : img = "s8plus.png";  break;
              		case "Xperia XZ Premium" : img = "xperia.jpg";  break;
              		}
              	%>
              	<img class="card-img-top childimg" src="vendor/img/<%=img %>">
              </div>
          	</div>
          </div>
          <div class="col-lg-6">
            <div class="card h-100">
              <a href="#"></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#" class="entry"><%=phoneData.viewBrand() + " " + model %></a><br />
                  <a href="#">&#9733; &#9733; &#9733; &#9733; &#9734;</a><br /><br />
                </h4>
                <h5><%=phoneData.getSpecs().viewPrice() %></h5>
                <p class="card-text"><%=phoneData.viewDescription() %></p>
              	<p class="card-text"><%=phoneData.getSpecs().viewSpecification() %></p>
              </div>
              
              <div class="card-footer">
                <small class="text-muted"></small>
                <button type="button" class="btn btn-default btn-xs" onclick="goBack()">See other catalogs</button>
              </div>
            </div>
          </div>
        </div><!-- /.row -->
      </div><!-- /.col-lg-9 -->
    </div><!-- /.row -->
  </div><!-- /.container -->
  <br /><br />
  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MPH 2017</p>
    </div>
  </footer>
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/popper/popper.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
  <script>
    $(document).ready(function(){
        $('[data-toggle="popover"]').popover();   
    });
    function goBack() {
    	window.history.back();
    }
  </script>
</body>
</html>
