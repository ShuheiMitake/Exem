package Dgroup.kanri.controller;
// 
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import io.micrometer.common.lang.NonNull;
//import jp.ac.fgrope.Money.model.MoneyBook;
//import jp.ac.fgrope.Money.service.MoneyBookService;

@Controller
public class ManageController {
//	@Autowired
//	private MoneyBookService MoneyBookService;
 
	@RequestMapping("/")
	public String index() {
//		model.addAttribute("list",this.MoneyBookService.getMoneyList());
		// TODO: model.addAttributeに一覧取得結果を追加
		return "top";
	}
		
	
}