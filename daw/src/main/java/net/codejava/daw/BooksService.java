package net.codejava.daw;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	@Autowired
	private BooksRepository repo;
	public List<Books> listAll(){
		return repo.findAll();
	}
	
	public void save(Books books) {
		repo.save(books);
	}
	
	public Books get(Long Id) {
		return repo.findById(Id).get();
	}
	public void delete(Long Id) {
		repo.deleteById(Id);
	}
}