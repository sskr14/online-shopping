<%@ taglib prefix="cl" uri="http://java.sun.com/jstl/core_rt" %>
<div class="container">
	<div class="row">
	
	<!-- To display Sidebar -->
		<div class="col-md-3">
			<%@ include file="./shared/sidebar.jsp" %>
		</div>
		
	<!-- To display Products -->	
		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">
				
				<cl:if test="${userClickAllProducts==true}">
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a></li>
					<li class="active">All Products</li>
				</ol>
				</cl:if>
				
				<cl:if test="${userClickCategoryProducts==true}">
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a></li>
					<li class="active">Category</li>
					<li class="active">${category.name}</li>
				</ol>
				</cl:if>
				
				</div>
			</div>
		
		</div>
	</div>
</div>