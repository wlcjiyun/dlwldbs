package Day20.gallery.model.Dao;

public class memberDao extends Dao{
	
	// 1. 싱글톤
	private static memberDao dao = new memberDao();
	private memberDao() {}
	public static memberDao getInstance() {return dao;}
}
