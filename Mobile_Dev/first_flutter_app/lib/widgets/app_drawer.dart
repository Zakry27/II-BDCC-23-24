import 'package:flutter/material.dart';

class AppDrawer extends StatelessWidget {
  const AppDrawer({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        padding: EdgeInsets.zero,
        children: <Widget>[
          UserAccountsDrawerHeader(
            accountName: Container(
              margin: const EdgeInsets.only(top: 10),
              child: const Text(
                'CHARJAOUI ZAKARIA',
                style: TextStyle(fontSize: 20),
              ),
            ),
            accountEmail: const Text(
              'z_charjaoui@etu.enset-media.ac.ma',
              style: TextStyle(fontSize: 14),
            ),
            currentAccountPicture: const CircleAvatar(
              backgroundImage: AssetImage('assets/images/user.jpg'),
            ),
            decoration: const BoxDecoration(
              color: Colors.purple,
            ),
          ),
          ListTile(
            leading: const Icon(Icons.public),
            title: const Text('Posts'),
            onTap: () {
              Navigator.pushReplacementNamed(context, '/resources');
            },
          ),
          ListTile(
            leading: const Icon(Icons.photo),
            title: const Text('Photo'),
            onTap: () {
              Navigator.pushReplacementNamed(context, '/photo');
            },
          ),
          ListTile(
            leading: const Icon(Icons.camera),
            title: const Text('Camera View'),
            onTap: () {
              Navigator.pushReplacementNamed(context, '/camera');
            },
          ),
          ListTile(
            leading: const Icon(Icons.calculate),
            title: const Text('Calculator'),
            onTap: () {
              Navigator.pushReplacementNamed(context, '/calculator');
            },
          ),
          ListTile(
            leading: const Icon(Icons.check_box),
            title: const Text('To-Do List'),
            onTap: () {
              Navigator.pushReplacementNamed(context, '/todo');
            },
          ),
        ],
      ),
    );
  }
}
