<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("title", "Signup"); %>
<html>
<jsp:include page="header.jsp" />
<body>

<div class="container-box">
    <h3 class="text-center">Signup</h3>
    <form action="signup" method="post">
        <div class="mb-3">
            <label class="form-label">Enter Username</label>
            <input type="text" name="username" class="form-control" placeholder="Choose a username" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Enter Password</label>
            <input type="password" name="password" class="form-control" placeholder="Choose a password" required>
        </div>
        <button type="submit" class="btn btn-primary">Sign Up</button>
    </form>

    <p class="mt-3">Already have an account?</p>
    <a href="login.jsp" class="btn btn-secondary">Login</a>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
