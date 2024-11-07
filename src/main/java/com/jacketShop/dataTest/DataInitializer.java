package com.jacketShop.dataTest;

import com.jacketShop.entity.Produto;
import com.jacketShop.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProdutoRepository repository, ProdutoRepository produtoRepository) {
        return args -> {
            repository.save(new Produto(1L, "Jaqueta Protetora", "150.00","", ""));
            repository.save(new Produto(2L, "Capacete IronHorse", "200.00", "", ""));
            repository.save(new Produto(3L,"Luvas Protetoras", "50.00", "", ""));
        };
    }
}
