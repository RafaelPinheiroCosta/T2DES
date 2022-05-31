import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean {
	
	public enum Pages {
		page_a, page_b;
	}
	
	private String page;
	
	public String getPage() {
		return page;
	}
	
	public void setPage(String page) {
		this.page = page;
	}
	
	public Pages goTo() {
		if ("a".equals(page)) {
			return Pages.page_a;
		} else {
			return Pages.page_b;
		}
	}

}
