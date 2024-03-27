package pl.onrwir.a7minutesworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

//      1 Jumping Jacks
        val jumpingJacks = ExerciseModel(
            1, "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

//        2 Abdominal Crunch
        val abdominalCrunch = ExerciseModel(
            2, "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

//        3 High Knees running in place
        val highKneesInPlace = ExerciseModel(
            3, "High Knees Running in place",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )
        exerciseList.add(highKneesInPlace)

//        4 Lunge
        val lunge = ExerciseModel(
            4, "Lunge",
            R.drawable.ic_lunge,
            false,
            false
        )
        exerciseList.add(lunge)

//        5 Plank
        val plank = ExerciseModel(
            5, "Plank",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)

//        6 Push Up
        val pushUp = ExerciseModel(
            6, "Push Up",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushUp)

//        7 Push Up and Rotation
        val pushUpAndRotation = ExerciseModel(
            7, "Push Up and Rotation",
            R.drawable.ic_push_up_and_rotation,
            false,
            false
        )
        exerciseList.add(pushUpAndRotation)

//        8 Side Plank
        val sidePlank = ExerciseModel(
            8, "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

//        9 Squat
        val squat = ExerciseModel(
            9, "Squat",
            R.drawable.ic_squat,
            false,
            false
        )
        exerciseList.add(squat)

//        10 Step up onto chair
        val stepUpOntoChair = ExerciseModel(
            10, "Step-Up onto Chair",
            R.drawable.ic_step_up_onto_chair,
            false,
            false
        )
        exerciseList.add(stepUpOntoChair)

//        11 Tricep dip on chair
        val tricepDipOnChair = ExerciseModel(
            11, "Tricep Dip On Chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        exerciseList.add(tricepDipOnChair)

//        12 Wall Sit
        val wallSit = ExerciseModel(
            12, "Wall Sit",
            R.drawable.ic_wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)


        return exerciseList
    }
}