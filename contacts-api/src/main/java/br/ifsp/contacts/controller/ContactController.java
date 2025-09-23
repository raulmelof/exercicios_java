package br.ifsp.contacts.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ifsp.contacts.model.Contact;
import br.ifsp.contacts.repository.ContactRepository;

/**
 * Classe responsável por mapear as rotas/endpoints relacionados
 * aos contatos. Cada método abaixo corresponde a uma operação
 * em nosso sistema.
 * 
 * @RestController: Indica que esta classe é um controlador 
 *                  responsável por responder requisições REST.
 * @RequestMapping("/api/contacts"): Indica o caminho base.
 */
@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    /**
     * @Autowired permite que o Spring "injete" automaticamente
     * uma instância de ContactRepository aqui, 
     * sem que precisemos criar manualmente.
     */
    @Autowired
    private ContactRepository contactRepository;

    /**
     * Método para obter todos os contatos.
     * 
     * @GetMapping indica que este método vai responder a chamadas HTTP GET.
     * Exemplo de acesso: GET /api/contacts
     */
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    /**
     * Método para obter um contato específico pelo seu ID.
     * 
     * @PathVariable "amarra" a variável {id} da URL 
     * ao parâmetro do método.
     * Exemplo de acesso: GET /api/contacts/1
     */
    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable Long id) {
        // findById retorna um Optional, então usamos orElseThrow
        return contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato não encontrado: " + id));
    }

    /**
     * Método para criar um novo contato.
     * 
     * @PostMapping indica que este método responde a chamadas HTTP POST.
     * @RequestBody indica que o objeto Contact será preenchido 
     * com os dados JSON enviados no corpo da requisição.
     */
    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    /**
     * Método para atualizar um contato existente.
     * 
     * @PutMapping indica que este método responde a chamadas HTTP PUT.
     * Exemplo de acesso: PUT /api/contacts/1
     */
    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable Long id, @RequestBody Contact updatedContact) {
        // Buscar o contato existente
        Contact existingContact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato não encontrado: " + id));

        // Atualizar os campos
        existingContact.setNome(updatedContact.getNome());
        existingContact.setTelefone(updatedContact.getTelefone());
        existingContact.setEmail(updatedContact.getEmail());

        // Salvar alterações
        return contactRepository.save(existingContact);
    }

    /**
     * Método para excluir um contato pelo ID.
     * 
     * @DeleteMapping indica que este método responde a chamadas HTTP DELETE.
     * Exemplo de acesso: DELETE /api/contacts/1
     */
    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactRepository.deleteById(id);
    }

    // EXERCICIO 1 AULA 3
    @GetMapping("/search")
    public List<Contact> getContactByName(@RequestParam String nome) {
        return contactRepository.findByNome(nome);
    }

    // EXERCICIO 2 AULA 3
    @PatchMapping("/{id}")
    public ResponseEntity<Contact> patchContact(
            @PathVariable Long id,
            @RequestBody Map<String, Object> updates) {

        Optional<Contact> optionalContact = contactRepository.findById(id);
        if (!optionalContact.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        Contact contact = optionalContact.get();

        if (updates.containsKey("nome")) {
            contact.setNome((String) updates.get("nome"));
        }
        if (updates.containsKey("telefone")) {
            contact.setTelefone((String) updates.get("telefone"));
        }
        if (updates.containsKey("email")) {
            contact.setEmail((String) updates.get("email"));
        }

        Contact updatedContact = contactRepository.save(contact);
        return ResponseEntity.ok(updatedContact);
    }

    /*   EXERCICIO 3 AULA 3
     *   Qual a principal diferença entre REST e SOAP?
     *   R: Enquanto REST garante uma estrutura previsível e intuitiva, além de padronização e flexibilidade por trabalhar com diversos formatos de dados, SOAP é mais rígido, com um padrão estrito baseado em XML, oferecendo maior segurança e confiabilidade para transações complexas.
     * 
     *   Em quais cenários SOAP ainda é utilizado?
     *   R: Principalmente em sistemas legados e em sistemas que exigem altos níveis de segurança e transações complexas, como em serviços financeiros e governamentais.
     * 
     *   Quais são as vantagens e desvantagens de usar REST ao invés de SOAP?
     *   R: REST é mais simples, flexível e escalável, também tem melhor desempenho, porém falta padrões rígidos e segurança integrada que o SOAP oferece. SOAP é mais adequado para operações complexas e transações seguras, mas é mais pesado e complexo de implementar.
     * 
     *   O que é WS-Security e como ele se compara à segurança em APIs REST?
     *   R: WS-Security é um padrão para aplicar segurança em mensagens SOAP. REST geralmente usa HTTPS para segurança em trânsito e pode implementar autenticação via tokens (como JWT) para segurança em APIs.
     * 
     *   Explique o modelo de maturidade de Richardson.
     *   R: O modelo de maturidade de Richardson classifica APIs REST em quatro níveis: o nível 0 (uso de HTTP como transporte simples), o nível 1 (uso de recursos), o nível 2 (uso de métodos HTTP corretos) e o nível 3 (uso de HATEOAS para hipermídia).
     * 
     *   O que é GraphQL? Pesquisa e relacione com os conceitos vistos em aula.
     *   R: GraphQL é uma linguagem de consulta para APIs. Uma alternativa ao REST, permitindo que os clientes solicitem exatamente os dados de que precisam, reduzindo a quantidade de dados transferidos e melhorando a eficiência das consultas.
     */  
}
