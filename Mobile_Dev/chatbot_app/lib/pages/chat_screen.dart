import 'package:chatbot_app/pages/home_screen.dart';
import 'package:dash_chat_2/dash_chat_2.dart';
import 'package:chat_gpt_sdk/chat_gpt_sdk.dart';
import 'package:flutter/material.dart';
import 'config.dart';

class ChatScreen extends StatefulWidget {
  const ChatScreen({super.key});

  @override
  _ChatScreenState createState() => _ChatScreenState();
}

class _ChatScreenState extends State<ChatScreen> {
  final ChatUser user =
      ChatUser(id: '1', firstName: 'zakaria', lastName: 'CHARJAOUI');
  final ChatUser bot = ChatUser(id: '2', firstName: 'Bot');
  final List<ChatMessage> messages = [];
  late OpenAI openAI;

  @override
  void initState() {
    super.initState();
    // Ensure OpenAI is initialized in initState
    openAI = OpenAI.instance.build(token: Config.apiKey);
  }

  Future<void> _sendMessage(ChatMessage message) async {
    setState(() {
      messages.insert(
        0,
        ChatMessage(
          user: user,
          text: message.text,
          createdAt: DateTime.now(),
        ),
      );
    });

    final request = ChatCompleteText(
      messages: [
        Map.of({"role": "user", "content": message.text})
      ],
      maxToken: 500,
      model: Gpt40314ChatModel(), // Change to a more accessible model
    );

    try {
      final response = await openAI.onChatCompletion(request: request);
      final botResponse = response?.choices.first.message?.content;

      if (botResponse != null) {
        setState(() {
          messages.insert(
            0,
            ChatMessage(
              user: bot,
              text: botResponse,
              createdAt: DateTime.now(),
            ),
          );
        });
      } else {
        setState(() {
          messages.insert(
            0,
            ChatMessage(
              user: bot,
              text: 'Failed to load response',
              createdAt: DateTime.now(),
            ),
          );
        });
      }
    } catch (e) {
      setState(() {
        messages.insert(
          0,
          ChatMessage(
            user: bot,
            text: 'Error: $e',
            createdAt: DateTime.now(),
          ),
        );
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.grey[300] ?? Colors.grey,
        title: Text(
          'ChatGPT ChatBot',
          style: TextStyle(color: Colors.grey[800] ?? Colors.black),
        ),
        iconTheme: IconThemeData(color: Colors.grey[800] ?? Colors.black),
        actions: [
          IconButton(
            icon: const Icon(Icons.home_filled),
            onPressed: () {
              Navigator.of(context).pop();
              Navigator.push(context,
                  MaterialPageRoute(builder: (context) => const HomeScreen()));
            },
          ),
        ],
      ),
      body: DashChat(
        currentUser: user,
        onSend: _sendMessage,
        messages: messages,
        messageOptions: MessageOptions(
          showCurrentUserAvatar: true,
          showTime: true,
          containerColor: Colors.white,
          textColor: Colors.grey[800] ?? Colors.black,
          currentUserTextColor: Colors.white,
          currentUserContainerColor: Colors.grey[800] ?? Colors.black,
        ),
        inputOptions: InputOptions(
          sendOnEnter: true,
          alwaysShowSend: false,
          sendButtonBuilder: defaultSendButton(
            color: Colors.grey[800] ?? Colors.black,
            icon: Icons.send_rounded,
          ),
          inputDecoration: InputDecoration(
            prefixIcon: Icon(Icons.blur_on_sharp,
                color: Colors.grey[800] ?? Colors.black),
            border: OutlineInputBorder(
              borderRadius: BorderRadius.circular(10),
            ),
            hintMaxLines: 6,
            hintText: 'Enter your message',
            hintStyle: TextStyle(color: Colors.grey[800] ?? Colors.black),
          ),
        ),
      ),
    );
  }
}
