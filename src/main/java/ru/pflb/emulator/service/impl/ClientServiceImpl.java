package ru.pflb.emulator.service.impl;

import lombok.Builder;
import org.springframework.stereotype.Service;
import ru.pflb.emulator.model.dto.ClientDto;
import ru.pflb.emulator.service.ClientService;

import java.util.Random;

@Service
public class ClientServiceImpl implements ClientService {

//    @Override
    public ClientDto getClient(long id) {

        ClientDto client = ClientDto.builder()
                .id(id)
                .firstName(this.getString())
                .lastName(this.getString())
                .cardNumber("" + Math.round(Math.random() * 987654321))
                .isActive(Math.round(Math.random() * 10) % 2 == 0)
                .INN("" + Math.round(Math.random() * 123456789))
                .photo("path")
        .build();

        return client;
    }

    public  String getRandPhotoPach() {


        return "path";
    }

    public String getString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public void addClient(ClientDto dto) {

    }

    public void deleteClient(long id) {

    }

    public ClientDto updateClient(long id, ClientDto dto) {
        return dto;
    }
}
