# Weather Servlet

App based on servlets with jsp. Supports two types of users - user and admin. After auth they have
different home pages.
<br><br>
**Path list:**

* /weather-forecast/
  <br>Index page with reference to the login page
* /weather-forecast/login
  <br>Login page. If user with username doesn't exist or password is incorrect error message will be
  shown
* /weather-forecast/home
  <br>Home page for common users
* /weather-forecast/admin
  <br>Home page for admin - admin panel. Contains list of existing users