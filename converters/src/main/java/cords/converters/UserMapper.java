package cords.converters;

import cords.entities.Client;
import cords.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    Client contactToClient(Contact contact);

    Contact clientToContact(Client client);

}
