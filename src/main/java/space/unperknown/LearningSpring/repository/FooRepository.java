package space.unperknown.LearningSpring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import space.unperknown.LearningSpring.model.Foo;

public interface FooRepository extends MongoRepository<Foo, Integer> {
}
