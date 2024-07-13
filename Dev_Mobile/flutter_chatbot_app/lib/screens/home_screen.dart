import 'package:flutter/material.dart';
import 'package:flutter_chatbot_app/screens/chat_screen.dart';
import 'package:flutter_chatbot_app/widgets/my_drawer.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Home"),
        backgroundColor: Colors.transparent,
        foregroundColor: Colors.grey,
        elevation: 0,
      ),
      drawer: const MyDrawer(),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          // navigate to settings
          Navigator.push(
              context,
              MaterialPageRoute(
                builder: (context) => ChatScreen(),
              ));
        },
        tooltip: 'New Chat',
        child: const Icon(Icons.message_rounded),
      ),
    );
  }
}
