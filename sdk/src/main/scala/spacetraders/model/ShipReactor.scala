/**
 * SpaceTraders API
 * SpaceTraders is an open-universe game and learning platform that offers a set of HTTP endpoints to control a fleet of ships and explore a multiplayer universe.  The API is documented using [OpenAPI](https://github.com/SpaceTradersAPI/api-docs). You can send your first request right here in your browser to check the status of the game server.  ```json http {   \"method\": \"GET\",   \"url\": \"https://api.spacetraders.io/v2\", } ```  Unlike a traditional game, SpaceTraders does not have a first-party client or app to play the game. Instead, you can use the API to build your own client, write a script to automate your ships, or try an app built by the community.  We have a [Discord channel](https://discord.com/invite/jh6zurdWk5) where you can share your projects, ask questions, and get help from other players.   
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: joel@spacetraders.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package spacetraders.model


  /**
   * The reactor of the ship. The reactor is responsible for powering the ship's systems and weapons.
   */
case class ShipReactor(
  /* Symbol of the reactor. */
  symbol: ShipReactorEnums.Symbol,
  /* Name of the reactor. */
  name: String,
  /* Description of the reactor. */
  description: String,
  /* Condition is a range of 0 to 100 where 0 is completely worn out and 100 is brand new. */
  condition: Option[Int] = None,
  /* The amount of power provided by this reactor. The more power a reactor provides to the ship, the lower the cooldown it gets when using a module or mount that taxes the ship's power. */
  powerOutput: Int,
  requirements: ShipRequirements
)

object ShipReactorEnums {

  type Symbol = Symbol.Value
  object Symbol extends Enumeration {
    val REACTORSOLARI = Value("REACTOR_SOLAR_I")
    val REACTORFUSIONI = Value("REACTOR_FUSION_I")
    val REACTORFISSIONI = Value("REACTOR_FISSION_I")
    val REACTORCHEMICALI = Value("REACTOR_CHEMICAL_I")
    val REACTORANTIMATTERI = Value("REACTOR_ANTIMATTER_I")
  }

}