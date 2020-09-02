package ru.pflb.emulator.service;

import ru.pflb.emulator.model.dto.ClientDto;

public interface ClientService {
    ClientDto getClient(long id);
    void addClient(ClientDto dto);
    void deleteClient(long id);
    ClientDto updateClient(long id, ClientDto dto);
}
