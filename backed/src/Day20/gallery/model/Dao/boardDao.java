package Day20.gallery.model.Dao;

public class boardDao extends Dao{
	
	// 1. 싱글톤
	private static boardDao dao = new boardDao();
	private boardDao() {}
	public static boardDao getInstance() {return dao;}
	
}
