import 'package:flutter/material.dart';
import '../widgets/app_drawer.dart';
class HomeView extends StatelessWidget {
  const HomeView({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Home View'),
      ),
      drawer: const AppDrawer(),

      body: const Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text('Welcome to the Home View!'),
          ],
        ),
      ),
    );
  }
}

