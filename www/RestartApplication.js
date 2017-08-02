/*
 * Android restart aplication
 * Cordova 2.2.0
 * Email: rodrigo[dot]gontijo[at]hotmail[dot]com
 * Author: Rodrigo Augusto Gontijo
 * Date: 05/23/2016
 */

var exec = require('cordova/exec');

var RestartApplication = {
  restartApplication: function(successCallback, failureCallback){
		return exec(
			successCallback,
			failureCallback,
			'RestartApplication',
			'restartApplication',
			[]);
	}
};

module.exports = RestartApplication;
