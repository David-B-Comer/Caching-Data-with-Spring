package caching;

public interface BookRepository {

	Book getByIsbn(String isbn);

}
