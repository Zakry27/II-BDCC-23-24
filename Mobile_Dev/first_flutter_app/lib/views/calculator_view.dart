import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../models/calculator_model.dart';


class CalculatorView extends StatefulWidget {
  const CalculatorView({super.key});

  @override
  _CalculatorViewState createState() => _CalculatorViewState();
}

class _CalculatorViewState extends State<CalculatorView> {

  late TextEditingController _value1Controller = TextEditingController();
  final TextEditingController _value2Controller = TextEditingController();

  @override
  void initState() {
    super.initState();

  }

  @override
  void dispose() {
    _value1Controller.dispose();
    _value2Controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return ChangeNotifierProvider(
      create: (_) => CalculatorModel(),
      child: Scaffold(
        appBar: AppBar(
          title: Text('Calculator View'),
          leading: IconButton(
            icon: Icon(Icons.arrow_back),
            onPressed: () {
              Navigator.popAndPushNamed(context, "/");
            },
          ),
        ),
        body: Center(
          child: Consumer<CalculatorModel>(
            builder: (context, calculator, child) {
              return Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: TextField(
                      controller: _value1Controller,
                      decoration: InputDecoration(
                        border: OutlineInputBorder(),
                        labelText: 'Enter a number',
                      ),
                      keyboardType: TextInputType.number,
                      onChanged: (value) {

                        calculator.setValue1(double.parse(value));

                      },
                    ),
                  ),
                  Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: TextField(
                      controller: _value2Controller,
                      decoration: const InputDecoration(
                        border: OutlineInputBorder(),
                        labelText: 'Enter another number',
                      ),
                      keyboardType: TextInputType.number,
                      onChanged: (value) {
                        calculator.setValue2(double.parse(value));

                      },
                    ),
                  ),
                  const SizedBox(height: 20),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      ElevatedButton(
                        onPressed: () {
                          calculator.calculateSum();
                          _clearInputs();
                        },
                        child: const Text('+'),
                      ),
                      const SizedBox(width: 10),
                      ElevatedButton(
                        onPressed: () {

                          calculator.calculateDifference();

                          _clearInputs();
                        },
                        child: const Text('-'),
                      ),
                      const SizedBox(width: 10),
                      ElevatedButton(
                        onPressed: () {

                          calculator.calculateProduct();
                          _clearInputs();
                        },
                        child: const Text('*'),
                      ),
                      const SizedBox(width: 10),
                      ElevatedButton(
                        onPressed: () {
                          calculator.calculateQuotient();

                          _clearInputs();
                        },
                        child: const Text('/'),
                      ),
                    ],
                  ),
                  const SizedBox(height: 20),
                  Text(
                    'Result: ${calculator.result.toString()}',
                    style: const TextStyle(fontSize: 24),
                  ),
                  SizedBox(height: 20),
                  const Text(
                    'History:',
                    style: TextStyle(fontSize: 18),
                  ),
                  Expanded(
                    child: ListView.builder(
                      itemCount: calculator.history.length,
                      itemBuilder: (context, index) {
                        return ListTile(
                          title: Text(calculator.history[index]),
                        );
                      },
                    ),
                  ),
                ],
              );
            },
          ),
        ),
      ),
    );
  }

  void _clearInputs() {
      _value1Controller .clear();
    _value2Controller.clear();
  }
}
