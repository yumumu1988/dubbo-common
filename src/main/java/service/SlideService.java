package service;

import model.Slide;
import response.ApiResponse;

public interface SlideService {
    ApiResponse<Slide> getSlideById(Integer id);
    ApiResponse<Slide> createSlide(Slide slide);
    ApiResponse<Slide> updateSlide(Slide slide);
    ApiResponse<Boolean> deleteSlideById(Integer id);
}
