def concat(seed: String, list: List[String]): String =
  if(list.isEmpty) seed
  else concat(seed + list.head, list.tail)

val palabras = "Hola" :: "Tomi" :: "y" :: "Rodri" :: Nil

concat("Cacona", palabras)




val l = List(('a', 2), ('b', 2))

//val permutations: List[List[(Char, Int)]] =
val perm: List[(Char, Int)] = for {
  (char, num) <- l
  elem <- 1 to num
} yield (char, elem)

val empty: List[List[(Char, Int)]] = Nil

val singleDistribution: List[List[(Char, Int)]] =
  perm map (tuple => List(tuple))