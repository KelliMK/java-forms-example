package org.wecancodeit.blogposts.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.blogposts.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
