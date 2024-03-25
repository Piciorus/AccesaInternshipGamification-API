package org.example.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
public class Question extends BaseEntity{
    @Column(name = "question_text", nullable = false)
    private String questionText;
    @Column(name = "answer1")
    private String answer1;
    @Column(name = "answer2")
    private String answer2;
    @Column(name = "answer3")
    private String answer3;
    @Column(name = "correct_answer")
    private String correctAnswer;
    @Column(name = "rewarded", nullable = true, length = 200)
    private boolean rewarded;
    @Column(name = "difficulty", nullable = false, length = 50)
    private String difficulty;
    @Column(name = "threshold", nullable = false, length = 50)
    private int threshold;
    @Column(name = "questRewardTokens", nullable = false, length = 50)
    private int questRewardTokens;
    @Column(name = "checked_by_admin", nullable = true, length = 200)
    private boolean checkByAdmin;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

}
