import Closures.ItExamples
import Domain.BaseEntity
import Domain.Entity
import Domain.IEntity

static void main(String[] args) {
  BaseEntity FirstCustomer = new Entity(UUID.randomUUID(), "Victor", "Rotciv")
  IEntity LastCustomer = new Entity("Mike", "Ekim")

  FirstCustomer.setName(FirstCustomer.getName().toUpperCase())
  LastCustomer.setLastName(LastCustomer.getLastName().toUpperCase())

  println FirstCustomer.toString()
  println LastCustomer.toString()

  new ItExamples()
}
