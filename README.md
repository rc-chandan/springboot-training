# springboot-training (Work In Progress)
Code base for assignments done in Springboot training

# IMDB clone App:

## Use cases:

  1. Users can rate movies
  2. Movies will have casts
  3. Show me movies of a specific Genre
  4. Show me movies by a specific Actor
  5. Show me all movies with 9+ rating
  6. Show me all hollywood movies of 2018
  7. Find all movies rated by Rahul

## Models:

  1. Movie `{id, name, description, releaseDate, rating, genres, language, actors}`
  2. User `{id, name, email, password, ratingsGiven}`
  3. Actor `{id, name, moviesAppearedIn }`
  4. UserRating `{id, user, movie, rating, timsstamp}`
  5. Genere `{id, name, description, movies}`

## Steps: (Hibernate)

  1. Create a maven project
  2. Add hibernate and H2 as dependencies
  3. Write the hibernate.cfg.xml file
  4. Create model classes with constructors, setters and getters, override toString() method for better logs.
  5. Annotate model classes with JPA, so that Hibernate can create appropriate tables
  6. List Entity classes in hibernate.cfg.xml file
  7. Define JPA relationships between entities(if any)
  8. Write repository classes and methods for CRUD operations.
  9. Implement the app with main method. 




