public class ListaSimples {
    No inicio = null;
    int tamanho = 0;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public String retirarInicio() {
        if (inicio == null) {
            return null;
        }
        String info = inicio.info;
        inicio = inicio.proximo;
        tamanho--;
        return info;
    }

    public void inserirFim(String info) {
        No no = new No();
        no.info = info;
        if (inicio == null) {
            no.proximo = null;
            inicio = no;
        } else {
            No local = inicio;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = no;
            no.proximo = null;
        }
        tamanho++;
    }

    public String retirarFim() {
        if (inicio == null) {
            return null;
        }
        No local = inicio;
        while (local.proximo != null) {
            No aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return local.info;
            }
        }
        inicio = null;
        tamanho--;
        return local.info;

    }

    public void inserirIndice(int indice, String info) {
        if (indice <= 0) {
            inserirInicio(info);
        } else if (indice >= tamanho) {
            inserirFim(info);
        } else {
            No local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            No no = new No();
            no.info = info;
            no.proximo = local.proximo;
            local.proximo = no;
            tamanho++;
        }
    }

    public String retirarIndice(int indice) {
        if (indice < 0 || indice >= tamanho || inicio == null) {
            return null;
        } else if (indice == 0) {
            return retirarInicio();
        } else if (indice == tamanho -1){
            return retirarFim();
        }
        No local = inicio;
        for (int i = 0; i < indice - 1; i++) {
            local = local.proximo;
        }
        String info = local.proximo.info;
        local.proximo = local.proximo.proximo;
        tamanho--;
        return info;
    }

    public String toString() {
        String str = "(" + tamanho + ") ";
        No local = inicio;
        while (local != null) {
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }

    public static void main(String [] args) {
        ListaSimples l = new ListaSimples();
        System.out.println(l);
        l.inserirInicio("AECIO NEVES DA CUNHA\n" +
                "ANA PAULA PROCOPIO JUNQUEIRA\n" +
                "ANA CRISTINA DE LIMA PIMENTEL\n" +
                "ANDRE LUIS GASPAR JANONES\n" +
                "BRUNO SOUZA FARIAS\n" +
                "CELIA NUNES CORREA\n" +
                "DANDARA TONANTZIN SILVA CASTRO\n" +
                "IONE MARIA MOREIRA DIAS BARBOSA\n" +
                "MARCELO EDUARDO FREITAS\n" +
                "DIEGO LEONARDO DE ANDRADE CARVALHO\n" +
                "DIMAS FABIANO TOLEDO JUNIOR\n" +
                "DOMINGOS SAVIO CAMPOS RESENDE\n" +
                "MARIO LUCIO HERINGER\n" +
                "FREDERICO DE CASTRO ESCALEIRA\n" +
                "DUDA SALABERT ROSA\n" +
                "EMIDIO ALVES MADEIRA JUNIOR\n" +
                "EROS FERREIRA BIONDINI\n" +
                "EUCLYDES MARCOS PETTERSEN NETO\n" +
                "FREDERICO BORGES DA COSTA\n" +
                "GILBERTO APARECIDO ABRAMO");
        System.out.println(l);
        l.inserirInicio("GREYCE DE QUEIROZ ELIAS\n" +
                "HERCILIO ARAUJO DINIZ FILHO\n" +
                "IGOR TARCIANO TIMO\n" +
                "GERALDO JUNIO DO AMARAL\n" +
                "LAFAYETTE LUIZ DOORGAL DE ANDRADA\n" +
                "JOSE LEONARDO COSTA MONTEIRO\n" +
                "LINCOLN DINIZ PORTELA\n" +
                "LUIS HENRIQUE DE OLIVEIRA RESENDE\n" +
                "LUIZ FERNANDO RAMOS FARIA\n" +
                "MARCELO HENRIQUE TEIXEIRA DIAS\n" +
                "MAURICIO LUIZ DE SOUZA\n" +
                "MIGUEL ANGELO MONTEIRO ANDRADE\n" +
                "MISAEL ARTUR FERREIRA VARELLA\n" +
                "NELI PEREIRA DE AQUINO\n" +
                "NEWTON CARDOSO JUNIOR\n" +
                "NIKOLAS FERREIRA DE OLIVEIRA\n" +
                "ODAIR JOSÃ‰ DA CUNHA\n" +
                "JOAO CARLOS SIQUEIRA\n" +
                "PATRUS ANANIAS DE SOUSA\n" +
                "PAULO ABI-ACKEL");
        System.out.println(l);
        l.inserirInicio("PAULO JOSE CARLOS GUEDES\n" +
                "PEDRO DOSHIKAZU PIANCHAO AIHARA\n" +
                "ANTONIO PINHEIRO NETO\n" +
                "RAFAEL TADEU SIMOES\n" +
                "REGINALDO LAZARO DE OLIVEIRA LOPES\n" +
                "RODRIGO BATISTA DE CASTRO\n" +
                "ROGERIO CORREIA DE MOURA BAPTISTA\n" +
                "ROSANGELA DE OLIVEIRA CAMPOS REIS\n" +
                "SAMUEL JOSE RODRIGUES DE VIANA\n" +
                "STEFANO AGUIAR DOS SANTOS\n" +
                "WELITON FERNANDES PRADO\n" +
                "JOSE SILVA SOARES\n" +
                "JOSE VITOR DE RESENDE AGUIAR");
        System.out.println(l);

        while (l.retirarInicio() != null) {
            System.out.println("Lista dos candidados: " + l);
        }
}
