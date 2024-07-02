public class MinhaClasse{

    public static void main(String [] args){
        String primeiroNome = "Pedro";
        String segundoNome = "Honorato";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //a variável 'nomeCompleto', chama(=) o método 'nomeCompleto'

        System.out.print (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome); //esse método vai retornar 'primeiro nome + espaço em branco + segundo nome'
    }
}
//por curiosidade, pra testar se o método está mesmo sendo chamado, pode adicionar algo. Ex:
// return "Método funciona e retorna" + primeiroNome.concat(" ").concat(segundoNome);
// O '+' também pode ser usado para juntar strings