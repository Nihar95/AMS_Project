<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!Doctype Html>  
<Html>     
<Head>      
<Title>     
AirPort Management 
</Title>  
<style type=text/css>   
body   
{  
height: 125vh;  
margin-top: 80px;  
padding: 30px;  
background-size: cover;  
font-family: sans-serif;  
}  
header {  
background-color: orange;  
position: fixed;  
left: 0;  
right: 0;  
top: 5px;  
height: 30px;  
display: flex;  
align-items: center;  
box-shadow: 0 0 25px 0 black;  
}  
header * {  
display: inline;  
}  
header li {  
margin: 20px;  
}  
header li a {  
color: blue;  
text-decoration: none;  
}

.dropdown {
  display: inline-block;
  position: relative;
}
.dropdown-content {
  display: none;
  position: absolute;
  width: 100%;
  overflow: auto;
  box-shadow: 0px 10px 10px 0px rgba(0,0,0,0.4);
}
.dropdown:hover .dropdown-content {
  display: block;
}
.dropdown-content a {
  display: block;
  color: #000000;
  padding: 5px;
  text-decoration: none;
}
.dropdown-content a:hover {
  color: #FFFFFF;
  background-color: #00A4BD;
}  
</style>   
</Head>  
<Body background="https://th.bing.com/th/id/OIP.dZccnbpb_thPx-UwI0eWcgHaE7?pid=ImgDet&rs=1">   
<header>  
<nav>  
<ul>  
<li>  
<a href="#"> Home </a>  
</li>  
<li>  
<a href="AddPlane"> Add Plane </a>  
</li>  
<li>  
<a href="AddPilot"> Add Pilot </a>  
</li>  

<li> <a href="AddManager">Add Manager Details </a>  
</li> 
<li> <a href="AddHanger">Add Hanger Details </a>  
</li>  
<li>  
<a href="#"> Join Us </a>  
</li>  

<li>  
<div class="dropdown">
  <button>See Details</button>
  <div class="dropdown-content">
  <a href="planeDetails">Plane Details</a>
  <a href="PilotDetails">Pilot Details</a>
  <a href="ManagerDetails">Manager Details</a>
    <a href="HangerDetails">Hanger Details</a>
  </div>
</div> 
</li> 


<li>  
<a href="#"> Logout </a>  
</li> 
</ul>  
</nav>  
</header>  
WelCome Admin .......!
</Body>   
</Html>  