# Two fighters, one winner.
Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.

Each fighter will be a Fighter object/instance. See the Fighter class below.

Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.

Example:
```
public class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}
```
# TDD!
Main purpose of this practice is to apply TDD (Test Driven Development).
- Write tests to validate expected behavior
- Write class signature(s) without functionality, just to make tests code compile
- Run tests, they should fail
- Write class implementation until all tests pass