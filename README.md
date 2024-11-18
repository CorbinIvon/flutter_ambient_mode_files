# flutter_ambient_mode_files

This project aims to outline the necessary changes in order to enable ambient mode on a flutter application.

## Why I created this project?

I am developing a Flutter application for Wear OS and observed that when the screen powers off, the app enters a state of inactivity. After some time in this state, the app freezes, which is not ideal for a watch app as users may want to interact with the app again without having to close and reopen it.

This seems to be a bug, and this repository is a one stop solution to implement a fix for the issue.

Currently, the default behavior of a base Flutter app is to freeze after the screen powers off for a certain period (which varies by device).

This repository aims to outline the necessary changes to enable ambient mode in a Flutter app to prevent a Wear OS device from freezing.

Given the Wear OS environment's objective to conserve power, I speculated that the issue was due to the app entering a state of inactivity, causing the system to freeze the app to save power. I then referred to the Android documentation to learn how to enable ambient mode on a Wear OS device and discovered this solution.

Look at the project diff here: [Diff]()

Please refer to [AndroidManifest.xml](flutter_ambient_mode_files/android/app/src/main/AndroidManifest.xml), [build.gradle](flutter_ambient_mode_files/android/app/build.gradle), and [MainActivity.kt](flutter_ambient_mode_files/android/app/src/main/kotlin/com/example/flutter_ambient_mode_files/MainActivity.kt) for the necessary changes.

## Useful Sources

- [Conserve power and battery](https://developer.android.com/training/wearables/apps/power)
- [Always-on apps and system ambient mode](https://developer.android.com/training/wearables/always-on)

---

# New Flutter Project Boilerplate

A new Flutter project.

## Getting Started

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Lab: Write your first Flutter app](https://docs.flutter.dev/get-started/codelab)
- [Cookbook: Useful Flutter samples](https://docs.flutter.dev/cookbook)

For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev/), which offers tutorials,
samples, guidance on mobile development, and a full API reference.
