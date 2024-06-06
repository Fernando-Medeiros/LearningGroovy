package Domain

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

abstract class BaseEntity {
    static EventListener Producer = new EventListener() {
        @Override
        int hashCode() {
            return super.hashCode()
        }
    }

    protected static OffsetDateTime GetDateTime(){
        return new OffsetDateTime(LocalDateTime.now(), ZoneOffset.UTC)
    }
}
