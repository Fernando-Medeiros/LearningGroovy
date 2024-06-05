import Domain.BaseEntity
import Domain.Entity
import Domain.IEntity

static void main(String[] args) {
  BaseEntity FirstCustomer = new Entity(UUID.randomUUID(), "Victor", "Rotciv")
  IEntity LastCustomer = new Entity("Mike", "Ekim")

  FirstCustomer.SetName(FirstCustomer.Name().toUpperCase())
  LastCustomer.SetLastName(LastCustomer.LastName().toUpperCase())

  println FirstCustomer.toString()
  println LastCustomer.toString()
}
