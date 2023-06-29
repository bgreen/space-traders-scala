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


case class WaypointTrait(
  /* The unique identifier of the trait. */
  symbol: WaypointTraitEnums.Symbol,
  /* The name of the trait. */
  name: String,
  /* A description of the trait. */
  description: String
)

object WaypointTraitEnums {

  type Symbol = Symbol.Value
  object Symbol extends Enumeration {
    val UNCHARTED = Value("UNCHARTED")
    val MARKETPLACE = Value("MARKETPLACE")
    val SHIPYARD = Value("SHIPYARD")
    val OUTPOST = Value("OUTPOST")
    val SCATTEREDSETTLEMENTS = Value("SCATTERED_SETTLEMENTS")
    val SPRAWLINGCITIES = Value("SPRAWLING_CITIES")
    val MEGASTRUCTURES = Value("MEGA_STRUCTURES")
    val OVERCROWDED = Value("OVERCROWDED")
    val HIGHTECH = Value("HIGH_TECH")
    val CORRUPT = Value("CORRUPT")
    val BUREAUCRATIC = Value("BUREAUCRATIC")
    val TRADINGHUB = Value("TRADING_HUB")
    val INDUSTRIAL = Value("INDUSTRIAL")
    val BLACKMARKET = Value("BLACK_MARKET")
    val RESEARCHFACILITY = Value("RESEARCH_FACILITY")
    val MILITARYBASE = Value("MILITARY_BASE")
    val SURVEILLANCEOUTPOST = Value("SURVEILLANCE_OUTPOST")
    val EXPLORATIONOUTPOST = Value("EXPLORATION_OUTPOST")
    val MINERALDEPOSITS = Value("MINERAL_DEPOSITS")
    val COMMONMETALDEPOSITS = Value("COMMON_METAL_DEPOSITS")
    val PRECIOUSMETALDEPOSITS = Value("PRECIOUS_METAL_DEPOSITS")
    val RAREMETALDEPOSITS = Value("RARE_METAL_DEPOSITS")
    val METHANEPOOLS = Value("METHANE_POOLS")
    val ICECRYSTALS = Value("ICE_CRYSTALS")
    val EXPLOSIVEGASES = Value("EXPLOSIVE_GASES")
    val STRONGMAGNETOSPHERE = Value("STRONG_MAGNETOSPHERE")
    val VIBRANTAURORAS = Value("VIBRANT_AURORAS")
    val SALTFLATS = Value("SALT_FLATS")
    val CANYONS = Value("CANYONS")
    val PERPETUALDAYLIGHT = Value("PERPETUAL_DAYLIGHT")
    val PERPETUALOVERCAST = Value("PERPETUAL_OVERCAST")
    val DRYSEABEDS = Value("DRY_SEABEDS")
    val MAGMASEAS = Value("MAGMA_SEAS")
    val SUPERVOLCANOES = Value("SUPERVOLCANOES")
    val ASHCLOUDS = Value("ASH_CLOUDS")
    val VASTRUINS = Value("VAST_RUINS")
    val MUTATEDFLORA = Value("MUTATED_FLORA")
    val TERRAFORMED = Value("TERRAFORMED")
    val EXTREMETEMPERATURES = Value("EXTREME_TEMPERATURES")
    val EXTREMEPRESSURE = Value("EXTREME_PRESSURE")
    val DIVERSELIFE = Value("DIVERSE_LIFE")
    val SCARCELIFE = Value("SCARCE_LIFE")
    val FOSSILS = Value("FOSSILS")
    val WEAKGRAVITY = Value("WEAK_GRAVITY")
    val STRONGGRAVITY = Value("STRONG_GRAVITY")
    val CRUSHINGGRAVITY = Value("CRUSHING_GRAVITY")
    val TOXICATMOSPHERE = Value("TOXIC_ATMOSPHERE")
    val CORROSIVEATMOSPHERE = Value("CORROSIVE_ATMOSPHERE")
    val BREATHABLEATMOSPHERE = Value("BREATHABLE_ATMOSPHERE")
    val JOVIAN = Value("JOVIAN")
    val ROCKY = Value("ROCKY")
    val VOLCANIC = Value("VOLCANIC")
    val FROZEN = Value("FROZEN")
    val SWAMP = Value("SWAMP")
    val BARREN = Value("BARREN")
    val TEMPERATE = Value("TEMPERATE")
    val JUNGLE = Value("JUNGLE")
    val OCEAN = Value("OCEAN")
    val STRIPPED = Value("STRIPPED")
  }

}