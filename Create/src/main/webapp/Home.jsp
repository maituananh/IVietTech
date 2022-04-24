<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@ include file="Pages/MasterPage/Header.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!-- Carousel Start -->
<div class="container-fluid p-0">
	<div id="header-carousel" class="carousel slide" data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="w-100" src="style/img/carousel-1.jpg" alt="Image">
				<div
					class="carousel-caption d-flex flex-column align-items-center justify-content-center">
					<div class="p-3" style="max-width: 900px;">
						<h4 class="text-white text-uppercase mb-md-3">Laundry & Dry
							Cleaning</h4>
						<h1 class="display-3 text-white mb-md-4">Best For Laundry
							Services</h1>
						<a href="" class="btn btn-primary py-md-3 px-md-5 mt-2">Learn
							More</a>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<img class="w-100" src="style/img/carousel-2.jpg" alt="Image">
				<div
					class="carousel-caption d-flex flex-column align-items-center justify-content-center">
					<div class="p-3" style="max-width: 900px;">
						<h4 class="text-white text-uppercase mb-md-3">Laundry & Dry
							Cleaning</h4>
						<h1 class="display-3 text-white mb-md-4">Highly Professional
							Staff</h1>
						<a href="" class="btn btn-primary py-md-3 px-md-5 mt-2">Learn
							More</a>
					</div>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#header-carousel"
			data-slide="prev">
			<div class="btn btn-secondary" style="width: 45px; height: 45px;">
				<span class="carousel-control-prev-icon mb-n2"></span>
			</div>
		</a> <a class="carousel-control-next" href="#header-carousel"
			data-slide="next">
			<div class="btn btn-secondary" style="width: 45px; height: 45px;">
				<span class="carousel-control-next-icon mb-n2"></span>
			</div>
		</a>
	</div>
</div>
<!-- Carousel End -->

<!-- Contact Info Start -->
<div class="container-fluid contact-info mt-5 mb-4">
	<div class="container" style="padding: 0 30px;">
		<div class="row">
			<div
				class="col-md-4 d-flex align-items-center justify-content-center bg-secondary mb-4 mb-lg-0"
				style="height: 100px;">
				<div class="d-inline-flex">
					<i class="fa fa-2x fa-map-marker-alt text-white m-0 mr-3"></i>
					<div class="d-flex flex-column">
						<h5 class="text-white font-weight-medium">Our Location</h5>
						<p class="m-0 text-white">123 Street, New York, USA</p>
					</div>
				</div>
			</div>
			<div
				class="col-md-4 d-flex align-items-center justify-content-center bg-primary mb-4 mb-lg-0"
				style="height: 100px;">
				<div class="d-inline-flex text-left">
					<i class="fa fa-2x fa-envelope text-white m-0 mr-3"></i>
					<div class="d-flex flex-column">
						<h5 class="text-white font-weight-medium">Email Us</h5>
						<p class="m-0 text-white">info@example.com</p>
					</div>
				</div>
			</div>
			<div
				class="col-md-4 d-flex align-items-center justify-content-center bg-secondary mb-4 mb-lg-0"
				style="height: 100px;">
				<div class="d-inline-flex text-left">
					<i class="fa fa-2x fa-phone-alt text-white m-0 mr-3"></i>
					<div class="d-flex flex-column">
						<h5 class="text-white font-weight-medium">Call Us</h5>
						<p class="m-0 text-white">+012 345 6789</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Contact Info End -->

<!-- Pricing Plan Start -->
<div class="container-fluid pt-5 pb-3">
	<div class="container">
		<h6
			class="text-secondary text-uppercase text-center font-weight-medium mb-3">Our
			Pricing Plan</h6>
		<h1 class="display-4 text-center mb-5">The Best Price</h1>
		<div class="row">
			<%
			List<Product> products = (List<Product>) request.getAttribute("products");
			for (Product product : products) {
			%>

			<div class="col-lg-4 mb-4">
				<div class="bg-light text-center mb-2 pt-4">
					<div
						class="d-inline-flex flex-column align-items-center justify-content-center bg-secondary rounded-circle shadow mt-2 mb-4"
						style="width: 200px; height: 200px; border: 15px solid #ffffff;">
						<h3 class="text-white">Basic</h3>
						<h1 class="display-4 text-white mb-0">
							<small class="align-top"
								style="font-size: 22px; line-height: 45px;">$</small>49<small
								class="align-bottom" style="font-size: 16px; line-height: 40px;">/
								Mo</small>
						</h1>
					</div>
					<div class="d-flex flex-column align-items-center py-3">
						<p><%=product.getName()%></p>
						<p><%=product.getPrice()%>.000 đ</p>
					</div>
					<a href="detail?id=<%=product.getId()%>"
						class="btn btn-secondary py-2 px-4">Detail</a>
				</div>
			</div>
			<%
			}
			%>
		</div>
	</div>
</div>
<!-- Pricing Plan End -->

<%@ include file="Pages/MasterPage/Footer.jsp"%>
