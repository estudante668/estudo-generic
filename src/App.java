import dao.ListaGenerica.GenericDao;
import dao.ListaGenerica.UserDao;
import domain.UserDomain;


public class App {

  
      private static final GenericDao<Integer, UserDomain> dao = new UserDao();
        // Implementação anônima para o GenericDao

    public static void main(String[] args) throws Exception {
        
        var user = new UserDomain(1, "João");

        System.out.println(dao.tamanhoLista());
        System.out.println(dao.salvarItem(user));
        System.out.println(dao.buscarTodos());   
        System.out.println(dao.tamanhoLista());
        System.out.println(dao.removerItem(new UserDomain(-76, "")));
       
       // System.out.println(dao.AtualizarLista(new Usuario("João",  70)));
        //System.out.println(dao.buscarItemPorId(1));
       // System.out.println(dao.buscarTodos(usuario -> usuario.nome().equals("João")));
    }}
        


    
        
      