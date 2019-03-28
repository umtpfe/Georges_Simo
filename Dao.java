import java.sql.SQLException;

public interface Dao<T,ID> {
	Optional<T>find(ID id) throws SQLException;
	List<T> findAll() throws SQLException;
	boolean Save(T 0) throws SQLException;
	boolean update(T 0) throws SQLException;
	boolean delete(T 0) throws SQLException;
	
}
