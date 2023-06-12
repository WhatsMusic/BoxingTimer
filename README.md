<img align="right" width="50" height="50" src="img/syntaxLogo.png">

### Batch08: Grundlagen der Programmierung<p align="right">

# BoxingTimer

## Überblick

Das BoxingTimer-Projekt ist eine Anwendung, die Trainingspläne für Boxübungen bereitstellt. Ein Trainingsplan besteht aus einer Liste von Übungen, die Benutzer durchführen können. Die Anwendung unterstützt die Verwaltung von Übungen, die Auswahl von Trainingsplänen und das Starten eines Timers für den ausgewählten Plan.

## Hauptklassen

### BoxingTimer

Diese Klasse stellt das Hauptelement der Anwendung dar. Sie enthält eine Liste von `TrainingPlan`-Instanzen, aus der Benutzer einen Plan zur Durchführung auswählen können.

- **Eigenschaften**:
  - `trainingPlans`: Liste von `TrainingPlan`
- **Methoden**:
  - `selectTrainingplan(plan: TrainingPlan)`: Wählt einen bestimmten Trainingsplan aus.

### TrainingPlan

Diese Klasse repräsentiert einen Trainingsplan. Jeder Trainingsplan besteht aus einer Liste von `Exercise`-Instanzen.

- **Eigenschaften**:
  - `exercises`: Liste von `Exercise`
- **Methoden**:
  - `addExercise(exercise: Exercise)`: Fügt eine Übung zum Plan hinzu.
  - `delExercise(exercise: Exercise)`: Entfernt eine Übung aus dem Plan.
  - `startPlan()`: Durchläuft jede Übung in `exercises`, startet einen Timer basierend auf der Dauer der Übung und druckt entsprechende Hinweise in der Konsole.

### TrainingPlanLevel

Diese Klasse ist eine spezialisierte Version der `TrainingPlan`-Klasse und enthält zusätzlich einen Schwierigkeitsgrad.

- **Eigenschaften**:
  - `level`: Schwierigkeitsstufe als String (z.B. leicht, mittel, schwer)
- **Methoden**:
  - `filterTrainingPlan(level: String)`: Filtert `TrainingPlan` nach `Exercise` mit `level`.

### Exercise

Diese Klasse repräsentiert eine Übung. Jede Übung hat eine bestimmte Anzahl von Runden, eine Dauer und eine Pausenzeit.

- **Eigenschaften**:
  - `rounds`: Integer
  - `duration`: Int (in Sekunden)
  - `break`: Int (in Sekunden)
- **Methoden**:
  - `setRounds(rounds: Int)`: Legt die Anzahl der Runden fest.
  - `setDuration(duration: Int)`: Legt die Dauer der Übung fest.
  - `setBreak(break: Int)`: Legt die Pausenzeit fest.
  - `setLevel(level: String)`: Legt den Schwierigkeitsgrad der Übung fest.

## Ziel

Das Ziel des BoxingTimer-Projekts ist es, eine flexible und anpassbare Trainingsumgebung zu bieten. Benutzer können ihren eigenen Trainingsplan entsprechend ihrem Fitnesslevel und ihren Präferenzen auswählen. Mit dem Start des Plans beginnt die Anwendung, die Übungen nacheinander herunterzuzählen und gibt entsprechende Hinweise auf der Konsole aus.
