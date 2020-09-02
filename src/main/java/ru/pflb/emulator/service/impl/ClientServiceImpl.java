package ru.pflb.emulator.service.impl;

import lombok.Builder;
import org.springframework.stereotype.Service;
import ru.pflb.emulator.model.dto.ClientDto;
import ru.pflb.emulator.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

//    @Override
    public ClientDto getClient(long id) {
        ClientDto client = ClientDto.builder()
                .id(id)
                .firstName("Ivan")
                .lastName("Petrov")
                .cardNumber("" + Math.round(Math.random() * 987654321))
                .isActive(Math.round(Math.random() * 10) % 2 == 0)
                .INN("" + Math.round(Math.random() * 123456789))
                .photo("path")
        .build();

        return client;
    }

    public void addClient(ClientDto dto) {

    }

    public void deleteClient(long id) {

    }

    public ClientDto updateClient(long id, ClientDto dto) {
        return dto;
    }
}
