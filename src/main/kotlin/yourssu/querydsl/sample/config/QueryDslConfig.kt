package yourssu.querydsl.sample.config

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Configuration
class QueryDslConfig(
    @PersistenceContext
    val em: EntityManager
) {
    @Bean
    fun jpqQueryFactory(): JPAQueryFactory {
        return JPAQueryFactory(em)
    }
}