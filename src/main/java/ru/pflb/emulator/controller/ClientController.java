package ru.pflb.emulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.pflb.emulator.model.dto.ClientDto;
import ru.pflb.emulator.service.ClientService;

@RestController
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<ClientDto> get(@PathVariable long id) {
        ClientDto client = clientService.getClient(id);

        return ResponseEntity.ok(client);
    }

    @PostMapping("/clientAdd")
    public ResponseEntity<String> add(@RequestBody ClientDto client) {
        clientService.addClient(client);

        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/clientDrop/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        clientService.deleteClient(id);

        return ResponseEntity.status(200).build();
    }

    @PutMapping("/client/{id}")
    public ResponseEntity<ClientDto> update(@PathVariable long id, @RequestBody ClientDto client) {
        ClientDto clientRes = clientService.updateClient(id, client);

        return ResponseEntity.ok(clientRes);
    }
}
