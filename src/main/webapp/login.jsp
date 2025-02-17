<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("title", "Login"); %>
<html>
<jsp:include page="header.jsp" />
<body>

<div class="container-box">
    <h3 class="text-center">Login</h3>
    <form action="login" method="post">
        <div class="mb-3">
            <label class="form-label">Enter Username</label>
            <input type="text" name="username" class="form-control" placeholder="Enter your username" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Enter Password</label>
            <input type="password" name="password" class="form-control" placeholder="Enter your password" required>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>

    <p class="mt-3">Don't have an account?</p>
    <a href="signup.jsp" class="btn btn-secondary">Sign Up</a>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
