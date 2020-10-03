@Controller
@RequestMapping(value = "/test")
public class TestController {
 
    @GetMapping
    public ModelAndView getTestData() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        mv.getModel().put("data", "Welcome home man");
 
        return mv;
    }
}
