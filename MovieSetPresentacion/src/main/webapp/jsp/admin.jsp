<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Nueva Pel�cula</title>
    <link rel="stylesheet" href="../css/admin.css">
    <link rel="shortcut icon" href="../images/icon.png" type="image/x-icon">
    

</head>
<body>
    <header>
        <h1>ADD SOME NEW MOVIES TO THE COMMUNITY</h1>
    </header>
    <div class="container">
        <div class="content">
            <div class="image-upload">
                <label for="movie-image" id="image-label">
                    <span>Choose image</span>
                </label>
                <input type="file" id="movie-image" accept="image/*">
            </div>
            <div class="movie-details">
                <div class="movie-title">
                    <input type="text" id="movie-name" placeholder="Movie Name">
                    <span class="directed-by">directed by</span>
                    <input type="text" id="director-name" placeholder="Director Name">
                </div>
                <div class="movie-info">
                    <input type="text" id="year" placeholder="YEAR">
                    <input type="text" id="rating" placeholder="RATING">
                    <input type="text" id="duration" placeholder="DURATION">
                </div>
                <div class="genre-selection">
                    <select id="genre-dropdown">
                        <option value="">Choose genres</option>
                    </select>
                    <div class="genre-labels">
                        <label class="genre-label">
                            <input type="checkbox" class="genre-checkbox" value="Drama"> Drama
                        </label>
                        <label class="genre-label">
                            <input type="checkbox" class="genre-checkbox" value="Romance"> Romance
                        </label>
                        <label class="genre-label">
                            <input type="checkbox" class="genre-checkbox" value="Comedy"> Comedy
                        </label>
                        <label class="genre-label">
                            <input type="checkbox" class="genre-checkbox" value="Action Drama"> Action Drama
                        </label>
                        <label class="genre-label">
                            <input type="checkbox" class="genre-checkbox" value="Psychological drama"> Psychological drama
                        </label>
                        <label class="genre-label">
                            <input type="checkbox" class="genre-checkbox" value="Workplace drama"> Workplace drama
                        </label>
                    </div>
                </div>
                <textarea id="movie-description" placeholder="Here is a space where a description of the movie can be added."></textarea>
                <button type="button" id="add-movie">ADD MOVIE</button>
            </div>
        </div>
        <div class="separator">
            <span>or</span>
        </div>
        <button type="button" id="view-movies">VIEW CURRENT MOVIES</button>
    </div>
    <footer>
        <a href="index.html">Return</a>
    </footer>
</body>
</html>