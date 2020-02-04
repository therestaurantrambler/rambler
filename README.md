Rambler App
===================================

This app displays a list of daily drink specials at restuarants in Champaign, Il.
It is based off a Udacity course in the Beginning Android Nanodegree called the Miwok App.

Pre-requisites
--------------

- Android SDK v23
- Android Build Tools v23.0.2
- Android Support Repository v23.3.0

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Future Work
-----------
1. The information in the list is hard coded. Create and connect a database. Inlcuding pictures of the establishments to replace the placeholder MON, TUES, ETC views.

2. Fix the imporper locations of the hard coded four specials in the map activity. The lat/long coordinates are correct but google maps has a third component that may be necessary to include. i.e. lat, long, 17z.

3. Have the Invite button/intent access the device's contact list and not the generic 888-555-5555 number.

5. Create the launcher icon to replace the default android icon.
