package basic.jpa;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

public class BaseEntity {
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
