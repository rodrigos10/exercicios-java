package exercicos.exerciciofaculdade;

import java.util.ArrayList;

public class GerenciadorVoo {
        private ArrayList<Voo> voos;// Lista para armazenar voos
        public GerenciadorVoo() {
            voos = new ArrayList<>(); // Inicializando a lista de voos
        }
        // Método para adicionar um voo
        public void adicionarVoo(Voo voo) {
            voos.add(voo);
            System.out.println("Voo " + voo.getCodigo() + " adicionado com sucesso.");
        }

        // Método para reservar um assento em um voo específico
        public void reservarAssento(String codigoVoo) {
            for (Voo voo : voos) {
                if (voo.getCodigo().equals(codigoVoo)) {
                    voo.reservrAssento();
                    return;
                }
            }
            System.out.println("Voo não encontrado.");
        }
        // Método para exibir informações de todos os voos
        public void exibirVoos() {
            for (Voo voo : voos) {
                System.out.println("Código do Voo: " + voo.getCodigo());
                System.out.println("Aeroporto de Origem: " + voo.getAeroportoOrigem());
                System.out.println("Aeroporto de Destino: " + voo.getAeroportoDestino());
                System.out.println("Assentos disponíveis: " + voo.getAssentosDisponiveis());
                System.out.println("--------");
            }
        }
    }
