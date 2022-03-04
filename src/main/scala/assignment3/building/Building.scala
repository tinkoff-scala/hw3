package assignment3.building

/** Здание должно иметь:
  *   - строковый адрес
  *   - этажи (сходящиеся к первому этажу) Этаж может быть либо жилым, либо чердаком На каждом жилом этаже живет 2
  *     человека и есть лестница(ссылка) ведущая на следующий этаж На чердаке никто не живет У каждого человека есть
  *     возраст и пол
  */
trait Building // rewrite me
trait Floor // rewrite me
trait Attic // rewrite me
trait ResidentialFloor // rewrite me

object Building {

  /** Проходится по зданию снизу в вверх, применяя функцию [[f]] на каждом жилом этаже с начальным аккумулятором
    * [[acc0]]
    */
  def protoFold[T](building: Building, acc0: T)(f: (T, ResidentialFloor) => T): T = ???

  /** Подсчитывает количество этаже, на которых живет хотя бы один мужчина старше [[olderThan]]. Используйте
    * [[protoFold]]
    */
  def countOldManFloors(building: Building, olderThan: Int): Int = ???

  /** Находит наибольший возраст женьщины, проживающей в здании. Используйте [[protoFold]]
    */
  def womanMaxAge(building: Building): Option[Int] = ???

}
