package dev.godwin.movies.controllers;

import dev.godwin.movies.models.Review;
import dev.godwin.movies.services.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/reviews")
@CrossOrigin("http://localhost:3002/")
public class ReviewController {

    private  final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
            return new ResponseEntity<>(reviewService.createReview(payload.get("reviewBody"),
                    payload.get("imdbId")), HttpStatus.CREATED);
    }
}
