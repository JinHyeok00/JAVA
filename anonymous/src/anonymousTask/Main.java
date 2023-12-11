package anonymousTask;

public class Main {
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getmenu() {
				return new String[] {"신발","옷","모자"};
			}
		});
		
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menu = getmenu();
				for (int i = 0; i < menu.length; i++) {
					if(order.equals(menu[i])) {
						System.out.println(order+" 판매완료");
						return;
					}
				}
				return;
			}
			
			@Override
			public String[] getmenu() {
				return new String[] {"신발","옷","모자"};
			}
		});
	}
}
