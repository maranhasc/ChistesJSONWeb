<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
<title>Chistes</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">

</head>

<body>
	<div class="container shadow">
		<header class="bg-info text-white">
			<div class="row align-items-center">
				<div class="col-2">
					<img src="img/logo.png" alt="" class="p-2">
				</div>
				<div class="col-8">
					<h1 class="m-0 text-center">CHISTES </h1>
				</div>
			</div>
		</header>
		<main>
			<div class="row justify-content-center my-3">
				<c:forEach items="${categorias}" var="categoria">
					<div class="col-xl-1 col-lg-2 col-md-3 col-sm-4 col-6 d-flex mb-2">
						<div class="card flex-fill">
							<a href="Controller?op=buscaloschistes&idcategoria=${categoria.id}" class="text-dark text-decoration-none"> <img class="card-img-top"
								src="http://www.ies-azarquiel.es/paco/apichistes/img/${categoria.id}.png"
								alt="Title" width="120">
								<p class="card-title text-center">${categoria.nombre}</p>
							</a>
						</div>
					</div>
				</c:forEach>
			</div>
			<h3 class="text-center"></h3>
			<div class="row my-3">
			<c:forEach items="${chistes}" var="chiste">
				<div class="col-6">
					<div class="card">
						<div class="row align-items-center">
							<div class="col-3">
								<img class="card-img-top" src="http://www.ies-azarquiel.es/paco/apichistes/img/${chiste.idcategoria}.png" alt="Title">
							</div>
							<div class="col-9">
								<div class="card-body">
									<p class="card-text">${chiste.contenido}</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				</c:forEach>
			</div>
		</main>
		<footer>
			<h1 class="p-3 text-center bg-info text-white">&copy; Chistes</h1>
		</footer>
	</div>
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous">
		
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
		crossorigin="anonymous">
		
	</script>
</body>

</html>