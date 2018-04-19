package philip.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import philip.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
