package com.sykomaniac.graphql.resolvers;

import com.sykomaniac.graphql.entities.Article;
import com.sykomaniac.graphql.repositories.ArticleRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class ArticleQueries implements GraphQLQueryResolver {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public Optional<Article> getArticle(ObjectId id) {
        return articleRepository.findById(id);
    }
}
