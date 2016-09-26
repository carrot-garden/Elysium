package nz.daved.elysium.debug

import pprint._

import scala.annotation.StaticAnnotation
import scala.meta._

class printStructure extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    pprintln(defn.show[Structure])
    defn
  }
}

class printSyntax extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    pprintln(defn.show[Syntax])
    defn
  }
}

