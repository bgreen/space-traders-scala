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
package spacetraders.api

import spacetraders.model.CreateChart201Response
import spacetraders.model.CreateShipShipScan201Response
import spacetraders.model.CreateShipSystemScan201Response
import spacetraders.model.CreateShipWaypointScan201Response
import spacetraders.model.CreateSurvey201Response
import spacetraders.model.DockShip200Response
import spacetraders.model.ExtractResources201Response
import spacetraders.model.ExtractResourcesRequest
import spacetraders.model.GetMounts200Response
import spacetraders.model.GetMyShip200Response
import spacetraders.model.GetMyShipCargo200Response
import spacetraders.model.GetMyShips200Response
import spacetraders.model.GetShipCooldown200Response
import spacetraders.model.GetShipNav200Response
import spacetraders.model.InstallMount201Response
import spacetraders.model.InstallMountRequest
import spacetraders.model.Jettison200Response
import spacetraders.model.JettisonRequest
import spacetraders.model.JumpShip200Response
import spacetraders.model.JumpShipRequest
import spacetraders.model.NavigateShip200Response
import spacetraders.model.NavigateShipRequest
import spacetraders.model.NegotiateContract200Response
import spacetraders.model.OrbitShip200Response
import spacetraders.model.PatchShipNavRequest
import spacetraders.model.PurchaseCargo201Response
import spacetraders.model.PurchaseCargoRequest
import spacetraders.model.PurchaseShip201Response
import spacetraders.model.PurchaseShipRequest
import spacetraders.model.RefuelShip200Response
import spacetraders.model.RefuelShipRequest
import spacetraders.model.RemoveMount201Response
import spacetraders.model.RemoveMountRequest
import spacetraders.model.SellCargo201Response
import spacetraders.model.SellCargoRequest
import spacetraders.model.ShipRefine201Response
import spacetraders.model.ShipRefineRequest
import spacetraders.model.TransferCargo200Response
import spacetraders.model.TransferCargoRequest
import spacetraders.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object FleetApi {

def apply(baseUrl: String = "https://api.spacetraders.io/v2") = new FleetApi(baseUrl)
}

class FleetApi(baseUrl: String) {

  /**
   * Command a ship to chart the waypoint at its current location.  Most waypoints in the universe are uncharted by default. These waypoints have their traits hidden until they have been charted by a ship.  Charting a waypoint will record your agent as the one who created the chart, and all other agents would also be able to see the waypoint's traits.
   * 
   * Expected answers:
   *   code 201 : CreateChart201Response (Created)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def createChart(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], CreateChart201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/chart")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[CreateChart201Response])

  /**
   * Scan for nearby ships, retrieving information for all ships in range.  Requires a ship to have the `Sensor Array` mount installed to use.  The ship will enter a cooldown after using this function, during which it cannot execute certain actions.
   * 
   * Expected answers:
   *   code 201 : CreateShipShipScan201Response (Successfully scanned for nearby ships.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   */
  def createShipShipScan(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], CreateShipShipScan201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/scan/ships")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[CreateShipShipScan201Response])

  /**
   * Scan for nearby systems, retrieving information on the systems' distance from the ship and their waypoints. Requires a ship to have the `Sensor Array` mount installed to use.  The ship will enter a cooldown after using this function, during which it cannot execute certain actions.
   * 
   * Expected answers:
   *   code 201 : CreateShipSystemScan201Response (Successfully scanned for nearby systems.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   */
  def createShipSystemScan(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], CreateShipSystemScan201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/scan/systems")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[CreateShipSystemScan201Response])

  /**
   * Scan for nearby waypoints, retrieving detailed information on each waypoint in range. Scanning uncharted waypoints will allow you to ignore their uncharted state and will list the waypoints' traits.  Requires a ship to have the `Sensor Array` mount installed to use.  The ship will enter a cooldown after using this function, during which it cannot execute certain actions.
   * 
   * Expected answers:
   *   code 201 : CreateShipWaypointScan201Response (Successfully scanned for nearby waypoints.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   */
  def createShipWaypointScan(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], CreateShipWaypointScan201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/scan/waypoints")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[CreateShipWaypointScan201Response])

  /**
   * Create surveys on a waypoint that can be extracted such as asteroid fields. A survey focuses on specific types of deposits from the extracted location. When ships extract using this survey, they are guaranteed to procure a high amount of one of the goods in the survey.  In order to use a survey, send the entire survey details in the body of the extract request.  Each survey may have multiple deposits, and if a symbol shows up more than once, that indicates a higher chance of extracting that resource.  Your ship will enter a cooldown after surveying in which it is unable to perform certain actions. Surveys will eventually expire after a period of time or will be exhausted after being extracted several times based on the survey's size. Multiple ships can use the same survey for extraction.  A ship must have the `Surveyor` mount installed in order to use this function.
   * 
   * Expected answers:
   *   code 201 : CreateSurvey201Response (Surveys has been created.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def createSurvey(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], CreateSurvey201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/survey")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[CreateSurvey201Response])

  /**
   * Attempt to dock your ship at its current location. Docking will only succeed if your ship is capable of docking at the time of the request.  Docked ships can access elements in their current location, such as the market or a shipyard, but cannot do actions that require the ship to be above surface such as navigating or extracting.  The endpoint is idempotent - successive calls will succeed even if the ship is already docked.
   * 
   * Expected answers:
   *   code 200 : DockShip200Response (The ship has successfully docked at its current location.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def dockShip(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], DockShip200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/dock")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DockShip200Response])

  /**
   * Extract resources from a waypoint that can be extracted, such as asteroid fields, into your ship. Send an optional survey as the payload to target specific yields.  The ship must be in orbit to be able to extract and must have mining equipments installed that can extract goods, such as the `Gas Siphon` mount for gas-based goods or `Mining Laser` mount for ore-based goods.
   * 
   * Expected answers:
   *   code 201 : ExtractResources201Response (Extracted successfully.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param extractResourcesRequest 
   */
  def extractResources(bearerToken: String)(shipSymbol: String, extractResourcesRequest: Option[ExtractResourcesRequest] = None
): Request[Either[ResponseException[String, Exception], ExtractResources201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/extract")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(extractResourcesRequest)
      .response(asJson[ExtractResources201Response])

  /**
   * Get the mounts installed on a ship.
   * 
   * Expected answers:
   *   code 200 : GetMounts200Response (Got installed mounts.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship's symbol.
   */
  def getMounts(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], GetMounts200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/my/ships/${shipSymbol}/mounts")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[GetMounts200Response])

  /**
   * Retrieve the details of a ship under your agent's ownership.
   * 
   * Expected answers:
   *   code 200 : GetMyShip200Response (Successfully fetched ship.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def getMyShip(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], GetMyShip200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/my/ships/${shipSymbol}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[GetMyShip200Response])

  /**
   * Retrieve the cargo of a ship under your agent's ownership.
   * 
   * Expected answers:
   *   code 200 : GetMyShipCargo200Response (Successfully fetched ship's cargo.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def getMyShipCargo(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], GetMyShipCargo200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/my/ships/${shipSymbol}/cargo")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[GetMyShipCargo200Response])

  /**
   * Return a paginated list of all of ships under your agent's ownership.
   * 
   * Expected answers:
   *   code 200 : GetMyShips200Response (Succesfully listed ships.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param page What entry offset to request
   * @param limit How many entries to return per page
   */
  def getMyShips(bearerToken: String)(page: Option[Int] = None, limit: Option[Int] = None
): Request[Either[ResponseException[String, Exception], GetMyShips200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/my/ships?page=${ page }&limit=${ limit }")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[GetMyShips200Response])

  /**
   * Retrieve the details of your ship's reactor cooldown. Some actions such as activating your jump drive, scanning, or extracting resources taxes your reactor and results in a cooldown.  Your ship cannot perform additional actions until your cooldown has expired. The duration of your cooldown is relative to the power consumption of the related modules or mounts for the action taken.  Response returns a 204 status code (no-content) when the ship has no cooldown.
   * 
   * Expected answers:
   *   code 200 : GetShipCooldown200Response (Succesfully fetched ship's cooldown.)
   *   code 204 :  (No cooldown.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def getShipCooldown(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], GetShipCooldown200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/my/ships/${shipSymbol}/cooldown")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[GetShipCooldown200Response])

  /**
   * Get the current nav status of a ship.
   * 
   * Expected answers:
   *   code 200 : GetShipNav200Response (The current nav status of the ship.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   */
  def getShipNav(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], GetShipNav200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/my/ships/${shipSymbol}/nav")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[GetShipNav200Response])

  /**
   * Install a mount on a ship.  In order to install a mount, the ship must be docked and located in a waypoint that has a `Shipyard` trait. The ship also must have the mount to install in its cargo hold.  An installation fee will be deduced by the Shipyard for installing the mount on the ship. 
   * 
   * Expected answers:
   *   code 201 : InstallMount201Response (Successfully installed the mount.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship's symbol.
   * @param installMountRequest 
   */
  def installMount(bearerToken: String)(shipSymbol: String, installMountRequest: Option[InstallMountRequest] = None
): Request[Either[ResponseException[String, Exception], InstallMount201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/mounts/install")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(installMountRequest)
      .response(asJson[InstallMount201Response])

  /**
   * Jettison cargo from your ship's cargo hold.
   * 
   * Expected answers:
   *   code 200 : Jettison200Response (Jettison successful.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param jettisonRequest 
   */
  def jettison(bearerToken: String)(shipSymbol: String, jettisonRequest: Option[JettisonRequest] = None
): Request[Either[ResponseException[String, Exception], Jettison200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/jettison")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(jettisonRequest)
      .response(asJson[Jettison200Response])

  /**
   * Jump your ship instantly to a target system. The ship must be in orbit to use this function. When used while in orbit of a Jump Gate waypoint, any ship can use this command, jumping to the target system's Jump Gate waypoint.  When used elsewhere, jumping requires the ship to have a `Jump Drive` module installed and consumes a unit of antimatter from the ship's cargo. The command will fail if there is no antimatter to consume. When jumping via the `Jump Drive` module, the ship ends up at its largest source of energy in the system, such as a gas planet or a jump gate.
   * 
   * Expected answers:
   *   code 200 : JumpShip200Response (Jump successful.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param jumpShipRequest 
   */
  def jumpShip(bearerToken: String)(shipSymbol: String, jumpShipRequest: Option[JumpShipRequest] = None
): Request[Either[ResponseException[String, Exception], JumpShip200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/jump")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(jumpShipRequest)
      .response(asJson[JumpShip200Response])

  /**
   * Navigate to a target destination. The ship must be in orbit to use this function. The destination waypoint must be within the same system as the ship's current location. Navigating will consume the necessary fuel from the ship's manifest based on the distance to the target waypoint.  The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it's destination.  To travel between systems, see the ship's Warp or Jump actions.
   * 
   * Expected answers:
   *   code 200 : NavigateShip200Response (The successful transit information including the route details and changes to ship fuel. The route includes the expected time of arrival.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param navigateShipRequest 
   */
  def navigateShip(bearerToken: String)(shipSymbol: String, navigateShipRequest: Option[NavigateShipRequest] = None
): Request[Either[ResponseException[String, Exception], NavigateShip200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/navigate")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(navigateShipRequest)
      .response(asJson[NavigateShip200Response])

  /**
   * Negotiate a new contract with the HQ.  In order to negotiate a new contract, an agent must not have ongoing or offered contracts over the allowed maximum amount. Currently the maximum contracts an agent can have at a time is 1.  Once a contract is negotiated, it is added to the list of contracts offered to the agent, which the agent can then accept.   The ship must be present at a faction's HQ waypoint to negotiate a contract with that faction.
   * 
   * Expected answers:
   *   code 201 : NegotiateContract200Response (Successfully negotiated a new contract.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship's symbol.
   */
  def negotiateContract(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], NegotiateContract200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/negotiate/contract")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[NegotiateContract200Response])

  /**
   * Attempt to move your ship into orbit at its current location. The request will only succeed if your ship is capable of moving into orbit at the time of the request.  Orbiting ships are able to do actions that require the ship to be above surface such as navigating or extracting, but cannot access elements in their current waypoint, such as the market or a shipyard.  The endpoint is idempotent - successive calls will succeed even if the ship is already in orbit.
   * 
   * Expected answers:
   *   code 200 : OrbitShip200Response (The ship has successfully moved into orbit at its current location.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   */
  def orbitShip(bearerToken: String)(shipSymbol: String
): Request[Either[ResponseException[String, Exception], OrbitShip200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/orbit")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[OrbitShip200Response])

  /**
   * Update the nav configuration of a ship.  Currently only supports configuring the Flight Mode of the ship, which affects its speed and fuel consumption.
   * 
   * Expected answers:
   *   code 200 : GetShipNav200Response (The updated nav data of the ship.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param patchShipNavRequest 
   */
  def patchShipNav(bearerToken: String)(shipSymbol: String, patchShipNavRequest: Option[PatchShipNavRequest] = None
): Request[Either[ResponseException[String, Exception], GetShipNav200Response], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/my/ships/${shipSymbol}/nav")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(patchShipNavRequest)
      .response(asJson[GetShipNav200Response])

  /**
   * Purchase cargo from a market.  The ship must be docked in a waypoint that has `Marketplace` trait, and the market must be selling a good to be able to purchase it.  The maximum amount of units of a good that can be purchased in each transaction are denoted by the `tradeVolume` value of the good, which can be viewed by using the Get Market action.  Purchased goods are added to the ship's cargo hold.
   * 
   * Expected answers:
   *   code 201 : PurchaseCargo201Response (Purchased goods successfully.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship's symbol.
   * @param purchaseCargoRequest 
   */
  def purchaseCargo(bearerToken: String)(shipSymbol: String, purchaseCargoRequest: Option[PurchaseCargoRequest] = None
): Request[Either[ResponseException[String, Exception], PurchaseCargo201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/purchase")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(purchaseCargoRequest)
      .response(asJson[PurchaseCargo201Response])

  /**
   * Purchase a ship from a Shipyard. In order to use this function, a ship under your agent's ownership must be in a waypoint that has the `Shipyard` trait, and the Shipyard must sell the type of the desired ship.  Shipyards typically offer ship types, which are predefined templates of ships that have dedicated roles. A template comes with a preset of an engine, a reactor, and a frame. It may also include a few modules and mounts.
   * 
   * Expected answers:
   *   code 201 : PurchaseShip201Response (Purchased ship successfully.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param purchaseShipRequest 
   */
  def purchaseShip(bearerToken: String)(purchaseShipRequest: Option[PurchaseShipRequest] = None
): Request[Either[ResponseException[String, Exception], PurchaseShip201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(purchaseShipRequest)
      .response(asJson[PurchaseShip201Response])

  /**
   * Refuel your ship by buying fuel from the local market.  Requires the ship to be docked in a waypoint that has the `Marketplace` trait, and the market must be selling fuel in order to refuel.  Each fuel bought from the market replenishes 100 units in your ship's fuel.  Ships will always be refuel to their frame's maximum fuel capacity when using this action.
   * 
   * Expected answers:
   *   code 200 : RefuelShip200Response (Refueled successfully.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param refuelShipRequest 
   */
  def refuelShip(bearerToken: String)(shipSymbol: String, refuelShipRequest: Option[RefuelShipRequest] = None
): Request[Either[ResponseException[String, Exception], RefuelShip200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/refuel")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(refuelShipRequest)
      .response(asJson[RefuelShip200Response])

  /**
   * Remove a mount from a ship.  The ship must be docked in a waypoint that has the `Shipyard` trait, and must have the desired mount that it wish to remove installed.  A removal fee will be deduced from the agent by the Shipyard.
   * 
   * Expected answers:
   *   code 201 : RemoveMount201Response (Successfully removed the mount.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship's symbol.
   * @param removeMountRequest 
   */
  def removeMount(bearerToken: String)(shipSymbol: String, removeMountRequest: Option[RemoveMountRequest] = None
): Request[Either[ResponseException[String, Exception], RemoveMount201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/mounts/remove")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(removeMountRequest)
      .response(asJson[RemoveMount201Response])

  /**
   * Sell cargo in your ship to a market that trades this cargo. The ship must be docked in a waypoint that has the `Marketplace` trait in order to use this function.
   * 
   * Expected answers:
   *   code 201 : SellCargo201Response (Cargo was successfully sold.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol Symbol of a ship.
   * @param sellCargoRequest 
   */
  def sellCargo(bearerToken: String)(shipSymbol: String, sellCargoRequest: Option[SellCargoRequest] = None
): Request[Either[ResponseException[String, Exception], SellCargo201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/sell")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(sellCargoRequest)
      .response(asJson[SellCargo201Response])

  /**
   * Attempt to refine the raw materials on your ship. The request will only succeed if your ship is capable of refining at the time of the request. In order to be able to refine, a ship must have goods that can be refined and have installed a `Refinery` module that can refine it.  When refining, 30 basic goods will be converted into 10 processed goods.
   * 
   * Expected answers:
   *   code 201 : ShipRefine201Response (The ship has successfully refined goods.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The symbol of the ship.
   * @param shipRefineRequest 
   */
  def shipRefine(bearerToken: String)(shipSymbol: String, shipRefineRequest: Option[ShipRefineRequest] = None
): Request[Either[ResponseException[String, Exception], ShipRefine201Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/refine")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(shipRefineRequest)
      .response(asJson[ShipRefine201Response])

  /**
   * Transfer cargo between ships.  The receiving ship must be in the same waypoint as the transferring ship, and it must able to hold the additional cargo after the transfer is complete. Both ships also must be in the same state, either both are docked or both are orbiting.  The response body's cargo shows the cargo of the transferring ship after the transfer is complete.
   * 
   * Expected answers:
   *   code 200 : TransferCargo200Response (Transfer successful.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The transferring ship's symbol.
   * @param transferCargoRequest 
   */
  def transferCargo(bearerToken: String)(shipSymbol: String, transferCargoRequest: Option[TransferCargoRequest] = None
): Request[Either[ResponseException[String, Exception], TransferCargo200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/transfer")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(transferCargoRequest)
      .response(asJson[TransferCargo200Response])

  /**
   * Warp your ship to a target destination in another system. The ship must be in orbit to use this function and must have the `Warp Drive` module installed. Warping will consume the necessary fuel from the ship's manifest.  The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at its destination.
   * 
   * Expected answers:
   *   code 200 : NavigateShip200Response (The successful transit information including the route details and changes to ship fuel. The route includes the expected time of arrival.)
   * 
   * Available security schemes:
   *   AgentToken (http)
   * 
   * @param shipSymbol The ship symbol.
   * @param navigateShipRequest 
   */
  def warpShip(bearerToken: String)(shipSymbol: String, navigateShipRequest: Option[NavigateShipRequest] = None
): Request[Either[ResponseException[String, Exception], NavigateShip200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/my/ships/${shipSymbol}/warp")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(navigateShipRequest)
      .response(asJson[NavigateShip200Response])

}
