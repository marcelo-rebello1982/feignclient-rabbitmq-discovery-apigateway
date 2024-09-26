package br.com.cadastroit.security.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastroit.security.domain.AuthorityUser;

@Repository
public interface AuthorityUserRepository extends MongoRepository<AuthorityUser, ObjectId> {
}
