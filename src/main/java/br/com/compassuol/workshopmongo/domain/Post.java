package br.com.compassuol.workshopmongo.domain;

import br.com.compassuol.workshopmongo.dto.AuthorDTO;
import br.com.compassuol.workshopmongo.dto.CommentDTO;
import com.mongodb.lang.Nullable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "post")
public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    @Setter
    @Getter
    private List<CommentDTO> comments = new ArrayList<>();

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

}
