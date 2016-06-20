import org.scalatest.FlatSpec
import Main._

class MainSpec extends FlatSpec {
  val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
  val env: Environment = {
    case "x" => 5
    case "y" => 7
  }

  "Expression" should "be evaluated correctly" in {
    assert(eval(exp, env) == 24)
  }
}
