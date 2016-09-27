# Inheritance Part 1 Individual Exercises


## Auto Parts

Model the classes that might be used to represent a total inventory for an auto part system.

When looking at first glance in the various types of auto parts stored in the system, it is clear that there are many distinct characteristics. However upon further inspection, there are
many similarities between each of them. 

| Tire            | Headlight    | Stereo                 | Door Handle       | Seat           | Windshield Wiper |
|-----------------|--------------|------------------------|-------------------|----------------|------------------|
| Manufacturer    | Part Number  | HasAuxiliryInput       | Price             | Manufacturer   | Length           |
| Speed Rating    | Lumens       | Name                   | IsTouchlessHandle | Weight         | IsDriverSide     |
| Recommended PSI | Name         | Height(in)             | Manufacturer      | Part Number    | Part Number      |
| Part Number     | Part Number  | NumberOfStationPresets | Weight            | IncludesHeater | Manufacturer     |
| HandlesSnowWell | Life(hrs)    | Manufacturer           | Part Number       | MaterialType   | Weight           |
| Weight          | Manufacturer | Weight                 | Manufacturer      | Name           | Price            |
| Name            | Weight       | Manufacturer           | MaterialType      | Price          | Name             |
| Price           | Price        | Part Number            | Name              |                |                  |
|                 |              | Price                  | Price             |                |                  |

** Leverage Inheritance ** when building the classes that model the above properties. You'll need to introduce a base class that has the properties that are consistent across all of the products
and then allow each specialized product type to define its own unique properties.


 