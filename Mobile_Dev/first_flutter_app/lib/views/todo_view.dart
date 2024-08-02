import 'package:first_flutter_app/views/todolist/to-do_list.dart';
import 'package:first_flutter_app/views/todolist/to_do_input.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../models/todo_model.dart';

class ToDoView extends StatelessWidget {
  const ToDoView({super.key});

  @override
  Widget build(BuildContext context) {
    return ChangeNotifierProvider(
      create: (_) => ToDoModel(),
      child: Scaffold(
        appBar: AppBar(
          title: const Text('To-Do List'),
          leading: IconButton(
            icon: const Icon(Icons.arrow_back),
            onPressed: () {
              Navigator.popAndPushNamed(context, "/");
            },
          ),
        ),
        body: Column(
          children: <Widget>[
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: ToDoInput(),
            ),
            Expanded(
              child: ToDoList(),
            ),
          ],
        ),
      ),
    );
  }
}
