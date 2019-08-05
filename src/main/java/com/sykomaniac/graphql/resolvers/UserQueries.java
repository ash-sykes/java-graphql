package com.sykomaniac.graphql.resolvers;

import com.sykomaniac.graphql.repositories.UserRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sykomaniac.graphql.entities.User;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UserQueries implements GraphQLQueryResolver {
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(ObjectId id) {
        return userRepository.findById(id);
    }
}
