package edu.curso;

import java.util.List;

public interface PetDAO {
    void adicionar(Pet p);
    List<Pet> pesquisarPorNome(String nome);
//   List<Pet> pesquisarPorRaca(String raca);
//   Pet pesquisarPorId(long id);
    void atualizar(long id, Pet p);
    void remover(long id);
}
