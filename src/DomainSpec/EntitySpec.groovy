package DomainSpec

import Domain.BaseEntity
import Domain.Entity
import Domain.IEntity
import org.junit.jupiter.api.Test

class EntitySpec {

    @Test
    void DeveCriarEntidade(){
        var name = "Jose"
        var lastName = "Silva"

        var entity = new Entity(name, lastName)

        assert  entity.Name() == name
        assert  entity.LastName() == lastName
        assert  entity.Token() instanceof UUID
    }
    @Test
    void DeveChamarInterface(){
        var name = "Jose"
        var lastName = "Silva"

        IEntity entityLeft = new Entity(name, lastName)
        BaseEntity entityRight = new Entity(name, lastName)

        assert  entityLeft.getClass() == entityRight.getClass()
    }
}
