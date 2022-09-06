import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main
{
	public static void main(String[] args)
	{
		List<String> listaNoivo = Arrays.asList("João", "Lucas", "Jean", "Lucios", "Jo", "Lucio", "Jânio", "Lauro", "Jirão", "Leon", "Jino", "Levi");
		List<String> listaNoiva = Arrays.asList("Joana", "Maura", "Je", "Mara", "Jema", "Meire", "Joaquina", "Mirtes", "Jana", "Mercia", "Jiane", "Mia");

		List<String> listas = Stream.concat(listaNoivo.stream(), listaNoiva.stream())
				.collect(Collectors.toList());

		System.out.println(listas);
	}
}