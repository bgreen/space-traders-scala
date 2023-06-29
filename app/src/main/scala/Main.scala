
import spacetraders.api.DefaultApi
import spacetraders.model.FactionSymbols
import spacetraders.model.RegisterRequest

val faction = FactionSymbols.COSMIC
val callsign = "McMoop"

@main def init: Unit =
  val registration = RegisterRequest(faction, callsign)
  val stapi = DefaultApi()
  val response = stapi.register(registerRequest = Option(registration))
  println(response)

