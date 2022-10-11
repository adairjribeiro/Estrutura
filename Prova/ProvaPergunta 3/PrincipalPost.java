import javax.swing.JOptionPane;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class PrincipalPost {
    public static void main(String[] args) {
        Deque<Post> dq = new ArrayDeque<Post>();
        Post p1 = null;
        String cadPost, postRel;
        String texto=null;
        Iterator<Post> itr;
        int opcao;
        do {
            opcao=Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar Post\n<2> Visualisar Post ordem Crescente\n<3> Visualisar Post ordem Decrescente\n<4> Sair"));
            switch (opcao)
            {
                case 1:
                    cadPost=JOptionPane.showInputDialog("Cadastrar Post:");
                    postRel=JOptionPane.showInputDialog("Visualizar Post:");

                    p1 = new Post(cadPost,postRel);
                    dq.add(p1);
                    break;
                case 2:
                    texto="";
                    for (itr = dq.iterator();itr.hasNext();) {
                        texto+=itr.next().mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, texto,"De A...Z",JOptionPane.DEFAULT_OPTION);
                    break;

                case 3:
                    texto="";
                    for (itr = dq.descendingIterator(); itr.hasNext();) {
                        texto+=itr.next().mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, texto,"De Z...A",JOptionPane.DEFAULT_OPTION);
                    break;
                case 4:
                    break;
            }
        }while(opcao!=4);
    }
}
