import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main
{
	public static void main(String[] args)
	{
		List<String> listaNoivo = Arrays.asList("João", "Lucas");
		List<String> listaNoiva = Arrays.asList("Joana", "Maura");

		List<String> languages = Stream.concat(listaNoivo.stream(), listaNoiva.stream())
				.collect(Collectors.toList());

		System.out.println(languages);
	}
}