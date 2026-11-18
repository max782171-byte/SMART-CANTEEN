package com.smartcanteen.service;
import com.smartcanteen.domain.MenuItem; import com.smartcanteen.repo.MenuRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class MenuService { private final MenuRepository repository; public MenuService(MenuRepository repository){this.repository=repository;} public List<MenuItem> all(){return repository.findAll();} public MenuItem save(MenuItem item){return repository.save(item);} public void delete(Long id){repository.deleteById(id);} }
