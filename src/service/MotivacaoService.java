package service;

import java.util.ArrayList;
import java.util.List;

public class MotivacaoService {

    private List<String> frases = new ArrayList<>();
    private int indice = 0;

    public MotivacaoService() {
        frases.add("💜 Você não está atrasada, você está no seu próprio tempo e cada passo que você dá já é um avanço real na direção da sua nova vida");
        frases.add("🔥 Esse espaço também é seu e cada linha de código que você escreve prova que você pode estar onde quiser");
        frases.add("🚀 Você pode não perceber agora, mas está construindo uma versão sua muito mais forte e preparada todos os dias");
        frases.add("💻 Você não precisa ser perfeita para evoluir, você só precisa continuar mesmo quando parecer difícil");
        frases.add("👑 Você está construindo sua independência e isso vai mudar completamente o rumo da sua vida");
        frases.add("✨ O desconforto que você sente hoje é o sinal de que você está saindo da sua zona de conforto e crescendo");
        frases.add("💜 Mulheres como você estão mudando a realidade e abrindo caminhos que antes pareciam impossíveis");
        frases.add("🔥 Você não chegou até aqui para desistir agora, você chegou até aqui porque é mais forte do que imagina");
        frases.add("🌱 Mesmo nos dias difíceis, você está evoluindo e isso já te coloca à frente de quem desistiu");
        frases.add("💡 A sua coragem de continuar mesmo com medo já é uma das maiores provas da sua força");
        frases.add("🚀 Recomeçar não é fraqueza, é uma decisão corajosa de não aceitar menos do que você merece");
        frases.add("👑 O seu esforço silencioso hoje vai se transformar em resultados visíveis no futuro");
        frases.add("💻 Você pertence à tecnologia e ninguém pode tirar isso de você se você continuar");
        frases.add("🔥 Você não precisa que ninguém acredite em você, você só precisa não desistir de si mesma");
        frases.add("✨ Você está quebrando padrões simplesmente por continuar tentando todos os dias");
        frases.add("💜 A sua jornada importa e ela pode inspirar outras mulheres que ainda nem começaram");
        frases.add("🚀 Isso não é sorte, é consistência e escolha diária de continuar mesmo cansada");
        frases.add("🌱 Você está construindo algo que ninguém pode tirar, que é o seu conhecimento e sua evolução");
        frases.add("💡 Você é mais capaz do que imagina, só precisa dar tempo para os resultados aparecerem");
        frases.add("👑 Você não começou do zero, você começou com tudo que viveu até aqui e isso é uma vantagem");
        frases.add("💻 Errar faz parte do processo e cada erro está te ensinando algo importante");
        frases.add("🔥 Você está se transformando na mulher que um dia você precisou ser para si mesma");
        frases.add("✨ Você ainda não chegou onde quer, mas já não é mais a mesma de antes e isso é evolução");
        frases.add("💜 Todo esforço que você faz hoje está sendo acumulado para um futuro melhor");
        frases.add("🚀 Continue avançando, mesmo que devagar, porque parar é a única forma de não chegar");
        frases.add("🌱 Crescer exige esforço, mas continuar parada custa muito mais caro para sua vida");
        frases.add("💡 Você está aprendendo algo que pode mudar completamente sua realidade financeira e profissional");
        frases.add("👑 Você merece ocupar espaços grandes e conquistar tudo que está buscando");
        frases.add("💻 Você não é uma impostora, você está aprendendo e isso faz parte de qualquer profissional");
        frases.add("🔥 Persistir quando está difícil é o que realmente constrói resultados de verdade");
        frases.add("✨ Você está escrevendo uma nova história para sua vida com cada escolha que faz hoje");
        frases.add("💜 Você não está sozinha nessa jornada, muitas mulheres estão lutando e vencendo junto com você");
        frases.add("🚀 Continue, porque lá na frente você vai agradecer por não ter desistido agora");
        frases.add("🌱 Você está criando oportunidades que antes não existiam na sua vida");
        frases.add("💡 Seu futuro está sendo construído agora, em cada pequena decisão que você toma");
        frases.add("👑 Você é mais forte do que pensa e mais capaz do que imagina");
        frases.add("💻 Você aprende, erra, tenta de novo e evolui, e isso já te diferencia de muita gente");
        frases.add("🔥 Você tem potencial para chegar muito mais longe do que consegue ver hoje");
        frases.add("✨ Sua evolução é real e cada pequeno avanço conta muito");
        frases.add("💜 Você já superou muita coisa e isso prova que você também vai conseguir superar isso aqui");
    }

    public String proximaFrase() {
        if (indice < frases.size()) {
            return frases.get(indice++);
        } else {
            return "🌟 Você já desbloqueou todas as mensagens!";
        }
    }
}

