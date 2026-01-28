# StudyPlanner — SmartStudy

Concise, modern study planner built in Kotlin for Android. This README focuses on a clear web-style product description, features, languages used, tools & technologies, and other practical details you (or contributors) need.

---

[![Kotlin](https://img.shields.io/badge/Kotlin-100%25-blue.svg)](#) [![License: MIT](https://img.shields.io/badge/License-MIT-lightgrey.svg)](#)

## Product overview (Web-style description)

SmartStudy is a focused productivity app that helps students plan, track, and optimize study time. Imagine a web landing page or product page describing SmartStudy:

- Hero: "Organize your study. Track your progress. Learn smarter."
- Key proposition: Simple task & session management, smart reminders, and progress insights in a lightweight Android app.
- Target users: High school and university students, self-learners, exam prep groups.
- Typical workflow: Add subjects → create study tasks → schedule sessions → receive reminders → review progress.

If you later add a web dashboard or landing page, that front-end would show user stats, upcoming tasks, and sync settings (if cloud sync is implemented).

## Features

- Task management: create, edit, delete tasks with deadlines and priorities
- Study sessions: schedule sessions with duration and subject tags
- Reminders & notifications: local reminders for upcoming sessions and deadlines
- Progress tracking: mark sessions complete and view basic statistics
- Local persistence: reliable offline storage (Room / local DB)
- Lightweight UI: material design components for a clean mobile experience
- Extensible: built to add cloud sync, web dashboard, or calendar integration

Planned / optional features:
- Cloud backup & multi-device sync (Firebase / REST API)
- Analytics and productivity reports
- Home screen widgets and quick actions
- Integration with Google Calendar or iCal export

## Languages used

- Primary: Kotlin (100%) — app code, business logic, and Android UI
- Suggested for web/dashboard (optional): JavaScript/TypeScript + React/Vue, or a simple static site (HTML/CSS)

## Tools & technologies

Mobile app (current codebase)
- Android SDK (minSdkVersion/targetSdkVersion: check project settings)
- Kotlin
- Gradle (Android Gradle Plugin)
- Android Studio (recommended IDE)

Common libraries & modules (adjust to match your repo)
- AndroidX (Core, AppCompat, Navigation)
- Jetpack: ViewModel, LiveData / Kotlin Flow
- Room — local database
- Coroutines — asynchronous work
- WorkManager — background scheduling & reminders
- Material Components — UI styling
- Hilt / Koin — dependency injection (recommended)
- Timber / Crashlytics — logging & crash reporting (optional)

Suggested web & backend stack (if adding web)
- Frontend: React (TypeScript) or Vue (TypeScript)
- Backend/API: Node.js (Express), Kotlin Ktor, or Firebase (Realtime/Firestore + Auth)
- Hosting: Vercel / Netlify (frontend), Heroku / Render / Google Cloud / AWS (API)
- Auth & user management: Firebase Auth, Auth0, or custom JWT

CI / CD and developer tooling
- GitHub Actions for CI: build, lint, and unit tests
- ktlint / detekt for Kotlin linting
- Dependabot for dependency updates
- Fastlane for release automation (optional)

## Architecture & project structure (recommended)

Use a modular, testable structure — an example:
- app/ — Android application module
  - src/main/java/... — activities, fragments, viewmodels, repositories
  - src/main/res — layouts, drawables, strings, themes
  - src/main/AndroidManifest.xml
- data/ — data layer (Room DAOs, entities, local sources)
- domain/ — business logic, use-cases, interfaces
- docs/ — screenshots, specs, design assets

Architecture pattern: MVVM with Repository pattern and coroutines for async operations. Use DI (Hilt) to keep classes small and testable.

## Installation (developer setup)

1. Prerequisites
   - Android Studio (latest stable)
   - JDK 11+
   - Android SDK tools for the project's target API

2. Clone & open
   ```
   git clone https://github.com/DulmiKalupahana/StudyPlanner-SmartStudy.git
   cd StudyPlanner-SmartStudy
   ```
   Open the project in Android Studio and allow Gradle sync to complete.

3. Build & run
   - Select a device/emulator and Run.
   - Or from command line:
     ```
     ./gradlew assembleDebug
     ./gradlew installDebug
     ```

4. Configuration
   - Add required API keys or signing configs to local properties (do NOT commit secrets).
   - Example: create `local.properties` or use environment variables for CI.




