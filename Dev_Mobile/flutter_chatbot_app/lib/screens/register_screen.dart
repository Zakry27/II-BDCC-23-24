import 'package:flutter/material.dart';
import 'package:flutter_chatbot_app/widgets/my_button.dart';
import 'package:flutter_chatbot_app/widgets/my_textfield.dart';

class RegisterScreen extends StatelessWidget {
  // email and pswd controllers
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _pwController = TextEditingController();
  final TextEditingController _confirmPwController = TextEditingController();

  // tap to move to login
  final void Function()? onTap;

  RegisterScreen({
    super.key,
    required this.onTap,
  });

  // register method
  void register() {}

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Theme.of(context).colorScheme.surface,
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // logo
            Icon(
              Icons.message,
              size: 60,
              color: Theme.of(context).colorScheme.primary,
            ),
            const SizedBox(height: 50),
            // welcome back
            Text(
              "First time here? let's create your account!",
              style: TextStyle(
                color: Theme.of(context).colorScheme.primary,
                fontSize: 16,
              ),
            ),
            const SizedBox(height: 25),

            // email textfield
            MyTextField(
              hintText: "Email",
              obscureText: false,
              controller: _emailController,
            ),
            const SizedBox(height: 10),
            // password textfield
            MyTextField(
              hintText: "Password",
              obscureText: true,
              controller: _pwController,
            ),
            const SizedBox(height: 10),
            // password confirm textfield
            MyTextField(
              hintText: "Confirm password",
              obscureText: true,
              controller: _confirmPwController,
            ),
            const SizedBox(height: 25),
            // login button
            MyButton(
              text: "Register",
              onTap: register,
            ),
            const SizedBox(height: 25),
            // Register now
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  "Already have an account? ",
                  style: TextStyle(
                    color: Theme.of(context).colorScheme.primary,
                  ),
                ),
                GestureDetector(
                  onTap: onTap,
                  child: Text(
                    "Login now",
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Theme.of(context).colorScheme.primary,
                    ),
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
