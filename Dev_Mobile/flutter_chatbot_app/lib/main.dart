import 'package:flutter/material.dart';
import 'package:flutter_chatbot_app/screens/splash_screen.dart';
import 'package:flutter_chatbot_app/themes/light_mode.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Chatbot',
      theme: LightMode,
      home: SplashScreen(),
    );
  }
}
