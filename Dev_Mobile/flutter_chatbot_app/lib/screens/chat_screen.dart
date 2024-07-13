import 'package:dash_chat_2/dash_chat_2.dart';
import 'package:flutter/material.dart';
import 'package:flutter_chatbot_app/auth/auth_service.dart';

class ChatScreen extends StatelessWidget {
 ChatScreen({super.key});

  final auth = AuthService();
  final ChatUser _currentUser = ChatUser(id: auth.)

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("chat"),
        backgroundColor: Colors.transparent,
        foregroundColor: Colors.grey,
        elevation: 0,
      ),
      body: DashChat(
          currentUser: currentUser, onSend: onSend, messages: messages),
    );
  }
}
