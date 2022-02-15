from flask import Flask, flash, redirect, render_template, request, session, abort
import os
import cgi

app = Flask(__name__)
 

@app.route('/')
def index():
    return render_template('index.html')
     
@app.route('/signup', methods=['POST'])
def signup():
    #create variables for form inputs
    username = request.form['username']
    password = request.form['password']
    password_verify = request.form['password-verify']
    

    #create a place for error messages. 

    username_error = ""
    password_error = ""
    password_verify_error = ""
    

#Username Validation    
    if username == "" and password == password_verify:
        username_error = "Gotta have a user name, brah."
        return render_template("index.html", username=username, username_error=username_error)
    
    elif password != password_verify:
        password_error = "Passwords do NOT match!"
        return render_template("index.html", password_error=password_error)
        
    else:    
        return redirect('/welcome?username={0}'.format(username))



@app.route("/welcome")
def welcome():
    username = request.args.get('username')
    return render_template('welcome.html', username=username)

app.run(debug=True,host='127.0.0.1', port=5000)