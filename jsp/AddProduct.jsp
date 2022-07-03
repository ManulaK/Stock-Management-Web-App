<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>Insert New Stocks</title>
	
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
             
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

 </head>
 <body>


 
	<div class="container">
	



  			<form action ="AddProductsServlet" method = "post" class="form-horizontal">
  			
  	     <div class="my-2"></div>
         <a class="btn btn-danger btn-icon-split">
         <span class="icon text-white-80">
         <i class="fas fa-trash"></i>
         </span>
         <span class="text">Add New Stocks</span>
         </a>
 
  
      		<div class="form-group">
      			<label class="control-label col-sm-2">Product Name:</label>
      			<div class="col-sm-10">
        		<input type="text" class="form-control" placeholder="enter product name" name ="product_name">
      			</div>
    		</div>
  
            
  			<div class="form-group">
          		<label class="control-label col-sm-2" >Product Price:</label>
      			<div class="col-sm-10">
        		<input type="text" class="form-control" placeholder="product price" name = "product_price">
 				</div>
    		</div>
    		
    		<div class="form-group">
      			<label class="control-label col-sm-2">Product Brand:</label>
      			<div class="col-sm-10">
        		<input type="text" class="form-control" placeholder="Barand Name" name ="product_Brand">
      			</div>
    		</div>
  
            
  			<div class="form-group">
          		<label class="control-label col-sm-2" >Seller ID:</label>
      			<div class="col-sm-10">
        		<input type="text" class="form-control" placeholder="Seller Identity" name = "SellerId">
 				</div>
    		</div>
    		
    		<div class="form-group">
      			<label class="control-label col-sm-2">Product Info:</label>
      			<div class="col-sm-10">
        		<input type="text" class="form-control" placeholder="Description" name ="productInfo">
      			</div>
    		</div>
  
            
  			<div class="form-group">
          		<label class="control-label col-sm-2" >Product Type:</label>
      			<div class="col-sm-10">
        		 <input type="text" class="form-control" placeholder="Type" name = "productType">
 				</div>
    		</div>

  			<div class="form-group">
          		<label class="control-label col-sm-2" >Product Quality:</label>
      			<div class="col-sm-10">
        		 <input type="text" class="form-control" placeholder="Quality" name = "productQty">
 				</div>
    		</div>   
    
   	     <div class="form-group">        
            <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Add Product</button>
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
</body>
</html>
