<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script type="text/javascript">
	function Validate() {
		var u = document.getElementsByName("username")[0].value;
		var p = document.getElementsByName("password")[0].value;
		//alert(u.length);
		if (u.length == 0 || p.length == 0) {
			alert("please enter username/password");
			return false;
		}
		return true;
	}
</script>
</head>
<body
	background="https://th.bing.com/th/id/OIP.dZccnbpb_thPx-UwI0eWcgHaE7?pid=ImgDet&rs=1">



	</div>
	<div class="col-md-6 col-lg-7 d-flex align-items-center">
		<div class="card-body p-4 p-lg-5 text-black">
			<form action="home">
				<div class="d-flex align-items-center mb-3 pb-1">
					<i class="fas fa-cubes fa-2x me-3" style="color: black;"></i> <span
						class="h1 fw-bold mb-0" style="color: red;">AirPort
						Management System</span>
				</div>
				
				
				<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Login
					into your account</h5>
					
					
				<div class="form-outline mb-4">
					User Name<input type="text" id="name" name="name"
						placeholder="User Name" class="form-control form-control-lg" /> <label
						class="form-label" > </label>
				</div>
				<div class="form-outline mb-4">
					Password<input type="password" id="pass" name="pass"
						placeholder="Password" class="form-control form-control-lg" /><label
						class="form-label" ></label>
				</div>
				
				
				
				<div class="form-outline mb-4">
						  <input type="radio" name="contact" value="1"> Admin

  						<input type="radio" name="contact" value="2"> Manager
				</div>
				
				

				
				
				<div class="pt-1 mb-4">
					<input type="submit" class="btn btn-dark btn-lg btn-block" 
					 value="submit">
						
				
				</div>
			</form>
			
			
			
			
			<form action="register">
				<p class="mb-5 pb-lg-2" style="color: blue;">
					AirPort Management System : <a href="/register" style="color: red;">More</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>