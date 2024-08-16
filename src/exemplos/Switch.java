package exemplos;

public class Switch {
    public static void main(String[] args) {

        String faixa = "amarela";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("sei o Bassai-Dai...");
            case "marrom":
                System.out.println("sei o tekki shodan....");
            case "roxa":
                System.out.println("sei o heian godan");
            case "verde":
                System.out.println("sei o hein yodan");
            case "laramja":
                System.out.println("sei o heian sandan");
            case "vermelha":
                System.out.println("sei o heian nidan");
            case"amarela":
                System.out.println("sei o heian shodan");
        }
    }
}
