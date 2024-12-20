<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Rate and comment</title>
                <link rel="stylesheet" href="../css/rate-comment.css">
                <link rel="shortcut icon" href="../images/icon.png" type="image/x-icon">
                <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
            </head>

            <body>
                <jsp:include page="fragmentos/header.jsp" />
                <div class="content">
                    <aside>
                        <img src="https://s3.amazonaws.com/nightjarprod/content/uploads/sites/249/2024/09/16145201/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK-scaled.jpg"
                            alt="Fight Club">
                        <div class="movie-text">
                            An insomniac office worker and a
                            devil-may-care soap maker form an
                            underground fight club that
                            evolves into much more.
                        </div>
                    </aside>
                    <main>
                        <section class="description">
                            <div class="title">
                                <h1>Fight Club</h1>
                                <p>directed by</p>
                                <h3>David Fincher <h3>
                            </div>
                            <ul class="presentation">
                                <li>2010</li>
                                <li>R</li>
                                <li>2h 19m</li>
                            </ul>
                            <div class="genre">
                                <div class="type-genre">
                                    <p>Psychological drama</p>

                                </div>
                                <div class="type-genre">
                                    <P>Workplace drama</P>
                                </div>
                                <div class="type-genre">
                                    <p>Drama</p>
                                </div>

                            </div>
                        </section>
                        <section class="rate-movie">
                            <h2>
                                RATE THE MOVIE!
                            </h2>
                            <div class="stars">
                                <img src="../images/yellow-star.png" alt="yellow-star">
                                <img src="../images/yellow-star.png" alt="yellow-star">
                                <img src="../images/yellow-star.png" alt="yellow-star">
                                <img src="../images/midstar.png" alt="midstar">
                                <img src="../images/white-star.png" alt="white-star">
                            </div>
                        </section>
                        <section class="post">
                            <h4>Leave a Post</h4>
                            <form id="form-create-post">
                                <textarea name="post" id="text-post" cols="50" rows="5"
                                    placeholder="Make a Post..."></textarea>
                                <button type="button" id="send-post">Post</button>
                            </form>
                        </section>
                    </main>
                </div>
            </body>

            </html>