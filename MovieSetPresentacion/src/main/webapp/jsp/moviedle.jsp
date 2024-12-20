<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Moviedle</title>
    <link rel="stylesheet" href="../css/moviedle.css">
    <link rel="shortcut icon" href="../images/icon.png" type="image/x-icon">
</head>
<body>
    <header>
        <h1>MOVIE<span>DLE</span></h1>
    </header>
    <main>
        <section class="moviedle">
            <p>GUESS THE MOVIE OF THE DAY!</p>
            <div class="search-wrapper">
                <input type="checkbox" id="hint-toggle" class="hint-toggle">
                <label for="hint-toggle" class="hint-button" aria-label="Show hint">&#8505;</label>
                <div class="search-container">
                    <input type="text" placeholder="Type a movie title ...">
                    <button class="submit-button">
                        <img src="../images/send_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24.png" alt="paper-plane" class="send-btn">
                    </button>
                </div>
                <div class="hint-popup">
                    <div class="hint-content">
                        <label for="hint-toggle" class="close-button" aria-label="Close hint">&times;</label>
                        <h3>Color indicators</h3>
                        <ul class="color-indicators">
                            <li><span class="color-box correct"></span>Correct</li>
                            <li><span class="color-box partial"></span>Partial</li>
                            <li><span class="color-box wrong"></span>Wrong</li>
                            <li><span class="color-box before-more"></span>Before - More</li>
                            <li><span class="color-box after-less"></span>After - Less</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!--  
              <table>
                <thead>
                    <tr>
                        <th>Movie</th>
                        <th>Genre</th>
                        <th>Director</th>
                        <th>Release year</th>
                        <th>Duration</th>
                        <th>Rating</th>
                    </tr>
                </thead>
                <tbody>

                </tbody>
            </table> 
            -->
           
        </section>
    </main>
</body>
</html>