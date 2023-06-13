# BoxingTimer

This project contains a Boxing Timer application with various levels and exercises. 

## Classes

### BoxingTimer

BoxingTimer class manages a list of training plans.

- **Properties**:
  - `trainingPlans`: List of `TrainingPlan`
- **Methods**:
  - `selectTrainingplan(plan: TrainingPlan)`: Selects a particular training plan.

### TrainingPlan

TrainingPlan class represents a training plan, which consists of a list of exercises.

- **Properties**:
  - `name`: String
  - `exercises`: List of `Exercise`
  - `totalDuration`: Int
  - `numExercises`: Int
- **Methods**:
  - `setName(name: String)`: Sets the name of the training plan.
  - `addExercise(exercise: Exercise)`: Adds an exercise to the plan.
  - `delExercise(exercise: Exercise)`: Removes an exercise from the plan.
  - `startPlan()`: Runs through each exercise in `exercises`, starts a timer based on the duration of the exercise, and prints corresponding hints in the console.
  - `calcTotalDuration()`: Calculates the total duration of the training plan.
  - `calcNumExercises()`: Calculates the number of exercises in the training plan.

### TrainingPlanLevel

TrainingPlanLevel class is a specialized version of `TrainingPlan` class, additionally including a difficulty level.

- **Properties**:
  - `level`: Difficulty level as String (e.g., light, medium, heavy)
- **Methods**:
  - `filterTrainingPlan(level: String)`: Filters `TrainingPlan` by `Exercise` with `level`.

### Exercise

Exercise class represents an exercise.

- **Properties**:
  - `name`: String
  - `description`: String
  - `rounds`: Integer
  - `duration`: Int (in seconds)
  - `break`: Int (in seconds)
- **Methods**:
  - `setName(name: String)`: Sets the name of the exercise.
  - `setDescription(description: String)`: Sets the description of the exercise.
  - `setRounds(rounds: Int)`: Sets the number of rounds.
  - `setDuration(duration: Int)`: Sets the duration of the exercise.
  - `setBreak(break: Int)`: Sets the break time.
  - `setLevel(level: String)`: Sets the difficulty level of the exercise.
