<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Product</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

</head>
<body>

	<div class="container">

				  <div class="my-2"></div>
                    <a href="#" class="btn btn-info btn-icon-split">
                       <span class="icon text-white-50">
                         <i class="fas fa-info-circle"></i>
                         </span>
                        <span class="text">Remove Products</span>
                        </a>
   	
			<form method = "post" action = "RemoveProductServlet" class="form-horizontal">
    		<div class="form-group">
     		 	<label class="control-label col-sm-2" >Product Id:</label>
      			<div class="col-sm-10">
       			<input type="text" class="form-control"  placeholder="Enter id" name="Pid">
      			</div>
    		</div> 
    
    
    
   			 <div class="form-group">        
      			<div class="col-sm-offset-2 col-sm-10">
        			<div class="checkbox">
        		 	<label><input type="checkbox" name="remember"> Remember me</label>
        			</div>
      			</div>
    		</div>
    		
    		
    		<div class="form-group">        
      			<div class="col-sm-offset-2 col-sm-10">
        			<button type="submit" class="btn btn-default">Submit</button>
      			</div>
    		</div>
    

			</form>
			
                    <a href="Admin_index.jsp" class="btn btn-warning btn-circle">

                   <span class="icon text-white-50">
				<i class="fas fa-arrow-right"></i>

                  </span>
				  <span class="text">Go to main menu</span>

                   </a>
	
	</div>
	
	
 

</div>
	

</body>
</html>


