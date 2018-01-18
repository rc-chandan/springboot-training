package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserRating {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private User user;
	@OneToOne
	private Movie movie;
	private float rating;
	private Date ratingGivenOn;

	public UserRating() {
	}

	public UserRating(User user, Movie movie, float rating) {
		this.user = user;
		this.movie = movie;
		this.rating = rating;
		ratingGivenOn = new Date();
	}

	public UserRating(User user, Movie movie, float rating, Date ratingGivenOn) {
		this.user = user;
		this.movie = movie;
		this.rating = rating;
		this.ratingGivenOn = ratingGivenOn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Date getRatingGivenOn() {
		return ratingGivenOn;
	}

	public void setRatingGivenOn(Date ratingGivenOn) {
		this.ratingGivenOn = ratingGivenOn;
	}

	@Override
	public String toString() {
		return "UserRating{" +
				"id=" + id +
				", user=" + user +
				", movie=" + movie +
				", rating=" + rating +
				", ratingGivenOn=" + ratingGivenOn +
				'}';
	}
}
