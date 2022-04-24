<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="Pages/MasterPage/Header.jsp"%>

<!-- Page Header Start -->
<div
	class="page-header container-fluid bg-secondary pt-2 pt-lg-5 pb-2 mb-5">
	<div class="container py-5">
		<div class="row align-items-center py-4">
			<div class="col-md-6 text-center text-md-left">
				<h1 class="mb-4 mb-md-0 text-white">Detail Page</h1>
			</div>
			<div class="col-md-6 text-center text-md-right">
				<div class="d-inline-flex align-items-center">
					<a class="btn text-white" href="">Home</a> <i
						class="fas fa-angle-right text-white"></i> <a
						class="btn text-white disabled" href="">Detail</a>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Page Header Start -->

<!-- Detail Start -->
<%
Product product = (Product) request.getAttribute("product");
%>
<div class="container py-5">
	<div class="row">
		<!-- Blog Detail Start -->
		<div class="col-lg-8">
			<div class="d-flex flex-column text-left mb-4">
				<h6 class="text-primary font-weight-normal text-uppercase mb-3">Blog
					Detail Page</h6>
				<h1 class="mb-4 section-title"><%=product.getName()%></h1>
				<div class="d-index-flex mb-2">
					<span class="mr-3"><i class="fa fa-user text-primary"></i>
						Admin</span> <span class="mr-3"><i
						class="fa fa-folder text-primary"></i> Web Design</span> <span
						class="mr-3"><i class="fa fa-comments text-primary"></i> 15</span>
				</div>
			</div>

			<div class="mb-5">
				<img class="img-fluid w-100 mb-4" src="style/img/carousel-1.jpg"
					alt="Image">
				<p><%= product.getDesctiption() %>.</p>
			</div>
			<button type="button" class="btn btn-success">Update</button>
			<button type="button" class="btn btn-danger">
				<a href="detail?action=DELETE&id=<%= product.getId() %>" style="text-decoration: none; color: White;">
					Delete
				</a>
			</button>
		</div>
		<!-- Blog Detail End -->



		<!-- Sidebar Start -->
		<div class="col-lg-4 mt-5 mt-lg-0">
			<!-- Author Start -->
			<div
				class="d-flex flex-column text-center bg-secondary mb-5 py-5 px-4">
				<img class="rounded-circle bg-white shadow mx-auto mb-4"
					src="img/user.jpg"
					style="width: 100px; height: 100px; padding: 12px;" alt="">
				<h3 class="text-primary mb-3">John Doe</h3>
				<p class="text-white m-0">Conset elitr erat vero dolor ipsum et
					diam, eos dolor lorem ipsum, ipsum ipsum sit no ut est. Guber ea
					ipsum erat kasd amet est elitr ea sit.</p>
			</div>
			<!-- Author End -->

			<!-- Search Form Start -->
			<div class="mb-5">
				<form action="">
					<div class="input-group">
						<input type="text" class="form-control form-control-lg"
							placeholder="Keyword">
						<div class="input-group-append">
							<span class="input-group-text bg-transparent text-primary"><i
								class="fa fa-search"></i></span>
						</div>
					</div>
				</form>
			</div>
			<!-- Search Form End -->

			<!-- Category Start -->
			<div class="mb-5">
				<h3 class="font-weight-bold mb-4">Categories</h3>
				<ul class="list-group">
					<li
						class="list-group-item d-flex justify-content-between align-items-center">
						Web Design <span class="badge badge-primary badge-pill">150</span>
					</li>
					<li
						class="list-group-item d-flex justify-content-between align-items-center">
						Web Development <span class="badge badge-primary badge-pill">131</span>
					</li>
					<li
						class="list-group-item d-flex justify-content-between align-items-center">
						Online Marketing <span class="badge badge-primary badge-pill">78</span>
					</li>
					<li
						class="list-group-item d-flex justify-content-between align-items-center">
						Keyword Research <span class="badge badge-primary badge-pill">56</span>
					</li>
					<li
						class="list-group-item d-flex justify-content-between align-items-center">
						Email Marketing <span class="badge badge-primary badge-pill">98</span>
					</li>
				</ul>
			</div>
			<!-- Category End -->
		</div>
		<!-- Sidebar End -->

	</div>
</div>
<!-- Detail End -->

<%@ include file="Pages/MasterPage/Footer.jsp"%>