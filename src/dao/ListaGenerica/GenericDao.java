package dao.ListaGenerica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import domain.GenericDomain;

public abstract class GenericDao< ID, T extends GenericDomain<ID>> {
   
  private final List<T> lista = new ArrayList<>();

    public T salvarItem(T user) {
        lista.add( user);
        return user;
    }

    public T AtualizarLista(ID id, T itens) {
       
        var atualizado = lista.stream().filter(i -> i.getId().equals(id)).findFirst().orElseThrow(
            () -> new IllegalArgumentException("Item não encontrado na lista")
        );

        lista.remove(atualizado); 
        return salvarItem(itens);
    }

    public boolean removerItem(T itens) {
        return lista.remove(itens);
    }

    public Optional<T> buscarItemPorId(int id) {
        return lista.stream().filter(i -> i.hashCode() == id).findFirst();
    }

    public Optional<T> buscarTodos(Predicate<T> filtro) {
        return lista.stream()
                .filter(filtro)
                .findFirst();
    }

    public List<T> buscarTodos() {
        return new ArrayList<>(lista);
    }

    public int tamanhoLista() {
        return lista.size();
    }
}
