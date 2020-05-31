package net.codejava.daw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
	
	@Autowired
	 private BooksService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		
		List<Books> listBooks=service.listAll();
		model.addAttribute("listBooks", listBooks);
	
		return "index";
	}
	@RequestMapping("/new")
	public String showNewBooksForm(Model model) {
		Books books = new Books();
		model.addAttribute("books", books);
		
		return "new_books";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("books") Books books) {
		service.save(books);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{IdCarti}")
	public ModelAndView showEditBooksForm(@PathVariable(name = "IdCarti") Long IdCarti) {
		ModelAndView mav = new ModelAndView("edit_books");
		
		Books books = service.get(IdCarti);
		mav.addObject("books", books);
		
		return mav;
	}
	
	@RequestMapping("/delete/{IdCarti}")
	public String deleteBooks(@PathVariable(name = "IdCarti") Long IdCarti) {
		service.delete(IdCarti);
		return "redirect:/";
	}	
}
