package entity;

import enums.Language;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private Date releaseDate;
	private float rating;

	@ManyToMany
	private List<Actor> actors;
	private Enum<Language> language;
	@ManyToMany
	private List<Genre> genres;

	public Movie() {
	}

	public Movie(String name) {
		this.name = name;
		this.rating = 0.0f;
		this.actors = new ArrayList<Actor>();
		this.description = "";
		this.genres = new ArrayList<Genre>();
		this.releaseDate = new Date();
		this.language = Language.NOT_AVALABLE;
	}

	public Movie(String name, Date releaseDate,  Enum<Language> language, List<Actor> actors, List<Genre> genres) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.actors = actors;
		this.language = language;
		this.genres = genres;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Enum<Language> getLanguage() {
		return language;
	}

	public void setLanguage(Enum<Language> language) {
		this.language = language;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", releaseDate=" + releaseDate +
				", rating=" + rating +
				", actors=" + actors +
				", language=" + language +
				", genres=" + genres +
				'}';
	}
}
