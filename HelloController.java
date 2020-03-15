public class HelloController {

    public String hello(@RequestParam(name="name" )String name, Model model) throws  Exception{
        model.addAttribute("name",name);
	    model.addAttribute("1",1); 
		model.addAttribute("name",name);
		model.addAttribute("2",2);
        return "hello";
    }
}