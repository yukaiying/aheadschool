package com.ahead.school.dao;

import com.ahead.school.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreDao extends JpaRepository<Score, Integer> {
}
