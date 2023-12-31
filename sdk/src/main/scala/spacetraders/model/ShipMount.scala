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
   * A mount is installed on the exterier of a ship.
   */
case class ShipMount(
  /* Symbo of this mount. */
  symbol: ShipMountEnums.Symbol,
  /* Name of this mount. */
  name: String,
  /* Description of this mount. */
  description: Option[String] = None,
  /* Mounts that have this value, such as mining lasers, denote how powerful this mount's capabilities are. */
  strength: Option[Int] = None,
  /* Mounts that have this value denote what goods can be produced from using the mount. */
  deposits: Option[Seq[ShipMountEnums.Deposits]] = None,
  requirements: ShipRequirements
)

object ShipMountEnums {

  type Symbol = Symbol.Value
  type Deposits = Deposits.Value
  object Symbol extends Enumeration {
    val MOUNTGASSIPHONI = Value("MOUNT_GAS_SIPHON_I")
    val MOUNTGASSIPHONII = Value("MOUNT_GAS_SIPHON_II")
    val MOUNTGASSIPHONIII = Value("MOUNT_GAS_SIPHON_III")
    val MOUNTSURVEYORI = Value("MOUNT_SURVEYOR_I")
    val MOUNTSURVEYORII = Value("MOUNT_SURVEYOR_II")
    val MOUNTSURVEYORIII = Value("MOUNT_SURVEYOR_III")
    val MOUNTSENSORARRAYI = Value("MOUNT_SENSOR_ARRAY_I")
    val MOUNTSENSORARRAYII = Value("MOUNT_SENSOR_ARRAY_II")
    val MOUNTSENSORARRAYIII = Value("MOUNT_SENSOR_ARRAY_III")
    val MOUNTMININGLASERI = Value("MOUNT_MINING_LASER_I")
    val MOUNTMININGLASERII = Value("MOUNT_MINING_LASER_II")
    val MOUNTMININGLASERIII = Value("MOUNT_MINING_LASER_III")
    val MOUNTLASERCANNONI = Value("MOUNT_LASER_CANNON_I")
    val MOUNTMISSILELAUNCHERI = Value("MOUNT_MISSILE_LAUNCHER_I")
    val MOUNTTURRETI = Value("MOUNT_TURRET_I")
  }

  object Deposits extends Enumeration {
    val QUARTZSAND = Value("QUARTZ_SAND")
    val SILICONCRYSTALS = Value("SILICON_CRYSTALS")
    val PRECIOUSSTONES = Value("PRECIOUS_STONES")
    val ICEWATER = Value("ICE_WATER")
    val AMMONIAICE = Value("AMMONIA_ICE")
    val IRONORE = Value("IRON_ORE")
    val COPPERORE = Value("COPPER_ORE")
    val SILVERORE = Value("SILVER_ORE")
    val ALUMINUMORE = Value("ALUMINUM_ORE")
    val GOLDORE = Value("GOLD_ORE")
    val PLATINUMORE = Value("PLATINUM_ORE")
    val DIAMONDS = Value("DIAMONDS")
    val URANITEORE = Value("URANITE_ORE")
    val MERITIUMORE = Value("MERITIUM_ORE")
  }

}
