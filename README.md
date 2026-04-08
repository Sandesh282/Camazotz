# UI / Functionality Fixes

## 1) PixelPioneers

### UI Improvements

Files Updated:
- activity_learning_page.xml
- activity_login_page.xml
- activity_main.xml
- activity_splash.xml

Changes Made:
- Fixed UI alignment and spacing
- Improved layout structure
- Improved visual hierarchy
- Enhanced readability across screens


---

## 2) OneByte

### UI Enhancements

Files Updated:
- activity_cttp_q1.xml
- fragment_home.xml
- fragment_profile.xml
- activity_splash.xml

Changes Made:
- Improved UI layout and positioning
- Fixed typos across layout files
- Standardized UI structure across screens
- Improved readability and consistency


---

## 3) KotlinKnight

### UI Improvements

Files Updated:
- activity_main.xml
- main_page.xml
- orderpage.xml
- deviceManager.xml
- KotlinKnight.iml

Changes Made:
- Fixed UI layout issues
- Improved readability and alignment of UI elements
- Ensured screens display correctly


### Navigation and Functionality Fixes

Files Updated:
- SecondScreen.kt
- ThirdScreen.kt

Changes Made:
- Fixed button redirection between screens
- Corrected navigation flow


### Configuration Fixes

- Corrected incorrect path references in configuration files


---

## 4) Error 404

### MainActivity.kt
- Removed floating intent block causing compiler error
- Fixed misplaced closing brace
- Fixed button navigation logic (Confirm, Accept, Reject, Cancel)
- Removed padding interfering with ScrollView


### activity_main.xml
- Removed constraint referencing non-existent `btnSave`
- Fixed button constraints for proper positioning
- Removed unnecessary rotation attributes
- Adjusted view hierarchy for correct scrolling behavior


### GameActivity.kt
- Fixed Tic-Tac-Toe board mapping
- Fixed player turn toggle logic
- Updated game status messages


### activity_game.xml
- Replaced unstable `GridLayout` with `MaterialCardView`
- Added unique `android:tag` values (0–8) for each button


### page2.xml, page3.xml, page4.xml
- Removed duplicate IDs causing `R` class generation errors
- Fixed layout width issues (`0dp` → `match_parent`)
- Added missing IDs used in Kotlin files
- Updated UI colors to a softer Material theme


### page4.kt
- Moved `clickCount` variable to class-level scope to properly trigger hidden game


---

## 5) Krantikari

### UI Improvements

Files Updated:
- activity_main.xml
- activity_main2.xml
- activity_main3.xml

Changes Made:
- Improved UI readability
- Fixed layout visibility issues


### Functionality Fixes

Files Updated:
- MainActivity.kt
- MainActivity2.kt

Changes Made:
- Fixed button functionality
- Added proper navigation between pages
- Removed typos across the application
