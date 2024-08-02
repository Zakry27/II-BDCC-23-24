import 'package:first_flutter_app/models/todo_model.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

class ToDoInput extends StatelessWidget {
  final TextEditingController _controller = TextEditingController();

  ToDoInput({super.key});

  @override
  Widget build(BuildContext context) {
    return Row(
      children: <Widget>[
        Expanded(
          child: TextField(
            controller: _controller,
            decoration: const InputDecoration(
              labelText: 'Create new task',
              border: OutlineInputBorder(),
            ),
          ),
        ),
        const SizedBox(width: 8),
        ElevatedButton(
          onPressed: () {
            if (_controller.text.isNotEmpty) {
              Provider.of<ToDoModel>(context, listen: false)
                  .addTask(_controller.text);
              _controller.clear();
            }
          },
          child: const Text('Add'),
        ),
      ],
    );
  }
}
