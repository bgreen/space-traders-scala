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
   */
case class Shipyard(
  /* The symbol of the shipyard. The symbol is the same as the waypoint where the shipyard is located. */
  symbol: String,
  /* The list of ship types available for purchase at this shipyard. */
  shipTypes: Seq[ShipyardShipTypesInner],
  /* The list of recent transactions at this shipyard. */
  transactions: Option[Seq[ShipyardTransaction]] = None,
  /* The ships that are currently available for purchase at the shipyard. */
  ships: Option[Seq[ShipyardShip]] = None
)

