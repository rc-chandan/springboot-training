package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Actor {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@ManyToMany
	private List<Movie> moviesAppearedIn;

	public Actor() {
	}

	public Actor(String name) {
		this.name = name;
		this.moviesAppearedIn = new ArrayList<Movie>();
	}

	public Actor(String name, List<Movie> moviesAppearedIn) {
		this.name = name;
		this.moviesAppearedIn = moviesAppearedIn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMoviesAppearedIn() {
		return moviesAppearedIn;
	}

	public void setMoviesAppearedIn(List<Movie> moviesAppearedIn) {
		this.moviesAppearedIn = moviesAppearedIn;
	}

	@Override
	public String toString() {
		return "Actor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", moviesAppearedIn=" + moviesAppearedIn +
				'}';
	}
}
