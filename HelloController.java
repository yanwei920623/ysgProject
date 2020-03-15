public class HelloController {

    public String hello(@RequestParam(name="name" )String name, Model model) throws  Exception{
        model.addAttribute("name",name);
	    model.addAttribute("11",11); 
		model.addAttribute("name",name);
		model.addAttribute("22",22);
        return "hello";
    }
}