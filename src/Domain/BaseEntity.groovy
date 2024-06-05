package Domain

abstract class BaseEntity {
    static EventListener Producer = new EventListener() {
        @Override
        int hashCode() {
            return super.hashCode()
        }
    }
}
