package com.vladmihalcea.hpjp.spring.stateless.repository;

import com.vladmihalcea.hpjp.spring.stateless.domain.Post;
import io.hypersistence.utils.spring.repository.BaseJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vlad Mihalcea
 */
@Repository
public interface PostRepository extends BaseJpaRepository<Post, Long>, CustomPostRepository<Post> {

}
