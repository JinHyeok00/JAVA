package anonymousTask;

public class Nike {
	public void register(Form form) {
		String[] menu = form.getmenu();
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 매장입니다");
			return;
		}
		form.sell("신발");
	}
}
