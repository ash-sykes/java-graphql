package com.sykomaniac.graphql.resolvers;

import com.sykomaniac.graphql.entities.Article;
import com.sykomaniac.graphql.entities.User;
import com.sykomaniac.graphql.repositories.ArticleRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserResolver implements GraphQLResolver<User> {
    private final ArticleRepository articleRepository;

    public Iterable<Article> getArticles(User user)
    {
        return articleRepository.findAllById(user.getArticles());
    }
}
