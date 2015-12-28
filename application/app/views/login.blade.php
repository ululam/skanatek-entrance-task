<!-- app/views/login.blade.php -->

<!doctype html>
<html>
<head>
	{{ HTML::style('http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'); }}
	{{ HTML::style('css/login.css'); }}
	<title>Alexey Zakharchenko entrance task :: Login</title>
</head>
<body>

<div class="wrapper">
{{ Form::open(array('url' => 'login', 'class' => 'form-signin')) }}
	<h2 class="form-signin-heading">Please login</h2>
	<p>
		{{ $errors->first('email') }}
		{{ $errors->first('password') }}
	</p>
	<p>
		{{ Form::text('email', Input::old('email'), array('placeholder' => 'Your@Email.com', 'class' => 'form-control', 'id' => 'loginEmail')) }}
	</p>
	<p>
		{{ Form::password('password', array('placeholder' => 'Password', 'class' => 'form-control', 'id' => 'loginPassword')) }}
	</p>
		{{ Form::submit('Login', array('class' => 'btn btn-lg btn-primary btn-block', 'id' => 'loginButton')) }}
{{ Form::close() }}
</div>
  
