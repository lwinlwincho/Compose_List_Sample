package com.example.myaffirmation

class DataSource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.s1,R.drawable.flower1),
            Affirmation(R.string.s2,R.drawable.flower2),
            Affirmation(R.string.s3,R.drawable.flower1),
            Affirmation(R.string.s4,R.drawable.flower2),
            Affirmation(R.string.s5,R.drawable.flower1),
            Affirmation(R.string.s6,R.drawable.flower2),
            Affirmation(R.string.s7,R.drawable.flower1),
            Affirmation(R.string.s8,R.drawable.flower2),
            Affirmation(R.string.s9,R.drawable.flower1),
            Affirmation(R.string.s10,R.drawable.flower2)
        )

    }
}