package service;

import java.util.ArrayList;
import java.util.List;

public class MotivacaoService {

    private List<String> frases = new ArrayList<>();
    private int indice = 0;

    public MotivacaoService() {
        frases.add("👩‍💻 Mulher, seu futuro está sendo escrito em cada código.");
        frases.add("✨ Você é capaz de aprender qualquer coisa com prática.");
        frases.add("💜 Não desista só porque ficou difícil.");
        frases.add("🚀 Seu esforço vai te levar longe.");
        frases.add("🌸 Toda grande dev já começou insegura.");
        frases.add("💻 Cada bug resolvido é uma vitória.");
        frases.add("👑 Mulher, você pertence à tecnologia.");
        frases.add("✨ Continue acreditando na sua evolução.");
        frases.add("👩‍💻 Seu conhecimento cresce todos os dias.");
        frases.add("💖 Você consegue mais do que imagina.");
        frases.add("🚀 Persistência também é talento.");
        frases.add("🌷 Seu sonho merece constância.");
        frases.add("💻 Programação se aprende praticando.");
        frases.add("👩‍💻 Mulher, continue firme no seu caminho.");
        frases.add("✨ Cada linha de código é evolução.");
        frases.add("💜 Você está mais perto do que pensa.");
        frases.add("🚀 Continue mesmo nos dias difíceis.");
        frases.add("🌸 Sua dedicação vai valer a pena.");
        frases.add("💻 Toda dev aprende errando.");
        frases.add("👑 Mulher, sua inteligência tem espaço aqui.");
        frases.add("✨ Não tenha medo de recomeçar.");
        frases.add("👩‍💻 Seu esforço de hoje é seu futuro.");
        frases.add("💖 Continue evoluindo um passo por vez.");
        frases.add("🚀 Você pode criar coisas incríveis.");
        frases.add("🌷 Seu potencial é maior que seus medos.");
        frases.add("💻 Continue codando, garota.");
        frases.add("👩‍💻 Você já evoluiu muito.");
        frases.add("✨ O importante é continuar.");
        frases.add("💜 Mulher, sua jornada importa.");
        frases.add("🚀 Grandes devs também começaram do zero.");
        frases.add("🌸 Você consegue resolver isso.");
        frases.add("💻 Seu código tem valor.");
        frases.add("👑 Continue acreditando em você.");
        frases.add("✨ Mulher, sua evolução é real.");
        frases.add("👩‍💻 Todo projeto ensina algo novo.");
        frases.add("💖 Você está construindo algo incrível.");
        frases.add("🚀 Seu futuro dev começa agora.");
        frases.add("🌷 Continue firme, mulher.");
        frases.add("💻 Você nasceu para evoluir.");
        frases.add("👩‍💻 Nunca subestime sua capacidade.");
    }

    public String proximaFrase() {
        if (indice < frases.size()) {
            return frases.get(indice++);
        } else {
            return "🌟 Você já desbloqueou todas as mensagens!";
        }
    }
}

