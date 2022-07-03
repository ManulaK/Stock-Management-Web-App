<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>View Product</title>

    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
    <link href="css/sb-admin-2.min.css" rel="stylesheet">
    <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    
</head>
<body>

    <div class="card shadow mb-4">
    <div class="container-fluid">
    <h1 class="h3 mb-2 text-gray-800">Product list</h1>
	<div class="card-body">
    <div class="table-responsive">
            <div class="card-header py-3">
               <h6 class="m-0 font-weight-bold text-primary">All Product details</h6>
        	</div>
    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">

              <th>Product ID</th>
              <th>Product Name</th>
              <th>Product Price</th>
              <th>Product Brand</th>
              <th>Seller ID</th>
              <th>Product Information</th>
              <th>Product Type</th>
              <th>Product Quality</th>

     <c:forEach var="pd" items="${pdsDetails}">
     <tr>

	          <td>${pd.PID}</td>
	          <td>${pd.product_name}</td>
	          <td>${pd.product_price}</td>
	          <td>${pd.product_Brand}</td>
	          <td>${pd.getSellerId()}</td>
	          <td>${pd.getProductInfo()}</td>
	          <td>${pd.getProductType()}</td>
	          <td>${pd.getProductQuality()}</td>
     <tr>

    </c:forEach>
    </table>
    </div>
   </div>
 </div>


</div>
			
                    <a href="Admin_index.jsp" class="btn btn-warning btn-icon-split">

                   <span class="icon text-white-50">
				<i class="fas fa-arrow-right"></i>

                  </span>
				  <span class="text">Go to main menu</span>

                   </a>

</body>
</html>