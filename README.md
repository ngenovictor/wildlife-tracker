## Wildlife Tracker

An application that allows Rangers to track wildlife sightings in the area.

**Specs**
- App can track two categories of wildlife
> 1. Animals(id, name)
> 2. Endangered Animals (id, name, health ["healthy", "ill","okay"], age["newborn", "young", "adult"])

- Sightings 
> When wildlife is spotted, a Ranger submits a form to record a Sighting containing the following
> has (id of animal/endangered, location, rangerName)

- Exceptions
>  It may take a few days for new Rangers to familiarize themselves with the app. To avoid saving incomplete or invalid records, throw and catch exceptions if Rangers attempt to submit an incomplete form, or misuse the application in any other conceivable fashion. 

- DB Naming Requirements
> 1. Production Database: wildlife_tracker
> 2. Development Database: wildlife_tracker_test
> 3. Table Names:animals, sightings

**Setup and Installation Instructions**

**Licence and copyright**
Ngeno Victor, Moringa School
[MIT Licence](license) 