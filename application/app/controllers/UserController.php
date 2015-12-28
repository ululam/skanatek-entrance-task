<?php

class UserController extends \BaseController {
	public function showLogin() 
	{
    	return View::make('login');
	}

	public function doLogin()
	{
	    $userdata = array(
	        'email'     => Input::get('email'),
	        'password'  => Input::get('password')
	    );

	    if (Auth::attempt($userdata)) 
	    {
	    	// Write the uinmost phrase (which will be verified from Cucumber's side)
	        echo '<div id="helloDiv">Welcome, ' . Auth::user()->name . '</div>';
	    } 
	    else 
	    {        
	        return Redirect::to('login')->withErrors(array("email" => "Incorrect login data"));
	    }
	}
}
