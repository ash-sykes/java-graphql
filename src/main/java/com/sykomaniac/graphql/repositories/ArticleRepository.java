package com.sykomaniac.graphql.repositories;

import com.sykomaniac.graphql.entities.Article;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<Article, ObjectId> {
}
