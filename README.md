# Mission

A simple Android application that helps users manage their daily tasks efficiently. Built using the **MVVM** architecture and **Room** database for local data storage, this app provides a seamless user experience for organizing tasks.

## Features

- **Task List:** View all your tasks in a simple, easy-to-read list.
- **Add New Tasks:** Quickly add new tasks with a user-friendly interface.
- **Update/Delete Tasks:** Update or remove tasks effortlessly.
- **Filter Tasks:** Filter tasks by their completion status (completed or incomplete).
- **Persistent Data:** All tasks are stored locally using the Room database, so your data remains available even after closing the app.

## Architecture
This project follows the **MVVM (Model-View-ViewModel)** architecture, making the app more maintainable and testable.

### MVVM Breakdown:
- **Model:** The data layer, which includes the Room database.
- **View:** The UI components such as the `RecyclerView` and other Android views.
- **ViewModel:** The mediator between the view and the data source (Model).

## Technology Stack

- **Kotlin**: The primary programming language used in the project.
- **Room**: For handling local data storage.
- **LiveData**: For observing data changes and updating the UI automatically.
- **RecyclerView**: For displaying the list of tasks.
- **MVVM**: To separate concerns and manage data efficiently.

## Getting Started

### Prerequisites
To run this project, you will need:
- **Android Studio**: Set up the project with Android Studio.
- **Minimum API Level**: 21 (Android 5.0 Lollipop).

### Installation

1. Clone the repository:

   ```bash
   git clone  https://github.com/baranselklnc/Mission.git
