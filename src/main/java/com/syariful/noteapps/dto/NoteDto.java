package com.syariful.noteapps.dto;

import com.syariful.noteapps.model.NoteStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class NoteDto {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    @NotBlank(message = "Title is required")
    private NoteStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;
}
