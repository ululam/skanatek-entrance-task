<?php

use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateUsers extends Migration {

	/**
	 * Run the migrations.
	 *
	 * @return void
	 */
	public function up()
	{
		Schema::create('users', function(Blueprint $table)
		{
		  $table->increments('id');

		  $table->string('name', 32);
		  $table->string('username', 32);
		  $table->string('email', 320);
		  $table->string('password', 64);

          // required for Laravel 4.1.26
          $table->string('remember_token', 100)->nullable();
		  $table->timestamps();
		});

		Eloquent::unguard();

	    User::create(array(
	        'name'     => 'Alexey Zakharchenko',
	        'username' => 'AlexeyZ',
	        'email'    => 'alexey.zakharchenko@gmail.com',
	        'password' => Hash::make('top_secret_password_124'),
	    ));
	}

	/**
	 * Reverse the migrations.
	 *
	 * @return void
	 */
	public function down()
	{
		Schema::drop('users');
	}

}
