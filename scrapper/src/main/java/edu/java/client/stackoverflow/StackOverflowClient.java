package edu.java.client.stackoverflow;

import edu.java.dto.stackoverflow.QuestionsResponse;
import edu.java.model.Link;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;

public interface StackOverflowClient {
    QuestionsResponse getLastModificationTime(@NotNull long questionId);

    OffsetDateTime checkForUpdate(Link link);
}
