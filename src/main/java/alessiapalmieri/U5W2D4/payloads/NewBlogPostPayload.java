package alessiapalmieri.U5W2D4.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class NewBlogPostPayload {
    @NotEmpty(message = "Author id is needed!")
    @Size(min = 1, max = 100000)
    private int authorId;
    @NotEmpty(message = "Category is needed!")
    @Size(min = 3,max = 20, message = "Category must have at least 3 chars!")
    private String category;
    @NotEmpty(message = "Content is needed!")
    @Size(min = 3,max = 80, message = "Content must have at least 3 chars!")
    private String content;
    @NotEmpty(message = "Reading Time is needed!")
    @Size(min = 1,max = 15)
    private String readingTime;
    @NotEmpty(message = "Title is needed!")
    @Size(min = 3, max = 20, message = "Title must have at least 3 chars!")
    private String title;
}