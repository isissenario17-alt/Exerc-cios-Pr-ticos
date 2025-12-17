import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Exercício 1
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("\nMaria");
        funcionarios.add("\nVitor");
        funcionarios.add("\nAna");

        System.out.println("Lista de Funcionários:\n" + funcionarios + "\n");

        //Exercício 2
        List<String> alunos = new ArrayList<>();
        alunos.add("Joana");
        alunos.add("Lucas");
        alunos.add("Pedro");
        alunos.add("Antônio");

        System.out.println("Primeira Lista: " + alunos);

        alunos.remove("Pedro");

        System.out.println("Lista Atualizada: " + alunos + "\n");

        //Exercício 3
        List<String> funcionariosEmpresa = new ArrayList<>();
        funcionariosEmpresa.add("João");
        funcionariosEmpresa.add("Maria");
        funcionariosEmpresa.add("Ana");
        funcionariosEmpresa.add("Pedro");
        funcionariosEmpresa.add("Antônio");


        System.out.println("A segunda pessoa da lista é: " + funcionariosEmpresa.get(1));
        System.out.println("O total de funcionários registrados é: " + funcionariosEmpresa.size() + "\n");

        //Exercício 4
        List<String> eventos = new ArrayList<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(eventos);

        System.out.println("Lista de eventos únicos: " + eventosUnicos + "\n");

        //Exercício 5
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Eduarda");
        clientes.put(2, "Marcos");
        clientes.put(3, "Luis");

        System.out.println("O nome do cliente com ID igual a 2 é: " + clientes.get(2) + "\n");

        //Exercício 6
        Map<Integer, String> clientesEmpresa = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int idCliente = 6;

        if(clientesEmpresa.containsKey(idCliente)){
            String nomeCliente = clientesEmpresa.get(idCliente);
            System.out.println("O nome com ID " + idCliente + "é: " + nomeCliente);
        }else {
            System.out.println("Cliente com ID " + idCliente + " não encontrado" + "\n");
        }

        //Exercício 7
        List<String> funcionarios3 = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> nomesCurtos = funcionarios3.stream()
                .filter(f-> f.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(nomesCurtos + "\n");

        //Exercício 8
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("O quadrado dos números é: " + quadrados + "\n");

        //Exercício 9
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream()
                .reduce(0.0, Double::sum);

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Total sem o imposto: " + totalGasto);
        System.out.println("Total com o imposto de 8% : " + totalComImposto +"\n");

        //Exercício 10
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNotas = notas.stream().reduce(0.0, Double::sum);

        double media = somaNotas / notas.size();

        double menorNota = notas.stream().min(Double::compare).get();

        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.println("O total das notas é: " + somaNotas);
        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A maior nota é: " + maiorNota);
    }
}