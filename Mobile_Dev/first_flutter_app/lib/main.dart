import 'package:first_flutter_app/views/calculator_view.dart';
import 'package:first_flutter_app/views/camera_view.dart';
import 'package:first_flutter_app/views/photo_view.dart';
import 'package:first_flutter_app/views/resources_view.dart';
import 'package:first_flutter_app/views/todo_view.dart';
import 'package:flutter/material.dart';
import 'views/home_view.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Multi-View App',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.purple),
        useMaterial3: true,
      ),
      home: const HomeView(),
      routes: {
        '/todo': (context) => const ToDoView(),
        '/resources': (context) => const ResourcesView(),
        '/photo': (context) => const PhotoView(),
        '/calculator': (context) => const CalculatorView(),
        '/camera': (context) => const CameraView(),
      },
    );
  }
}
