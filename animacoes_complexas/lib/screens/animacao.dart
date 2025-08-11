import 'package:flutter/material.dart';

class Animacao extends StatefulWidget {
  const Animacao({super.key});

  @override
  State<Animacao> createState() => _AnimacaoState();
}

class _AnimacaoState extends State<Animacao> with SingleTickerProviderStateMixin {

  //Criando o controlador do tipo AnimationController
  late AnimationController controller;
  late Animation<double> animation; //O tipo da Classe abstrata Animation pode animar qualquer coisa, neste caso vamos animar um double

  //Inicializando o controlador do AnimationController
  @override
  void initState() {
    super.initState();
    controller = AnimationController( //este controller varia a numeração/controlador entre 0 e 1.0
      vsync: this,
      duration: Duration(seconds: 2)
    );

    //A variável animation está recebendo a classe Tween, onde essa classe vai variar entre 0 e 300, mas com o controle da variavel controller
    animation = Tween<double>(begin: 0, end: 300).animate(controller);

    //este listener ficará escutando quando a animação tiver alteração valor para depois redesenhar a tela
    animation.addListener((){
      setState(() {

      });
    });

    //Iniciando a animação
    controller.forward();
  }

  //Este dispose irá encerrar o processo para não ficar consumindo recurso do dispositivo
  @override
  void dispose() {
    controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        //Essa altura e largura serão alteradas de 0 até 300 com base na variável animation
        height: animation.value,
        width: animation.value,
        child: FlutterLogo(),
        // child: Icon(Icons.heart_broken, color: Colors.white70, size: animation.value,), É POSSÍVEL FAZER TAMBÉM COM ÍCONES DESTE JEITO
      ),
    );
  }
}
