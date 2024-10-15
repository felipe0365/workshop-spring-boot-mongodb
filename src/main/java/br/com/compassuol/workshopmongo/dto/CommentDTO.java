package br.com.compassuol.workshopmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommentDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String text;
    private Date date;
    private AuthorDTO author;

}
