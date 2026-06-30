package com.example.scorecounter

data class Subject(
    val name: String ,
    val coefficient: Int,
    val isOptional: Boolean = false,
    var score: String = "",
    var isEnabled: Boolean = true
)

data class UniversityMajor(
    val name : String,
    val scoreNeeded: Double,
)
fun getSubjectsOfCho3ba(
    Cho3baName: String
): List<Subject> {
    return when(Cho3baName) {
        "علوم" -> listOf(
            Subject("علوم الطبيعة والحياة", 6),
            Subject("العلوم الفيزيائية", 5),
            Subject("الرياضيات", 5),
            Subject("اللغة العربية وآدابها", 3),
            Subject("التاريخ والجغرافيا", 2),
            Subject("الفلسفة", 2),
            Subject("اللغة الفرنسية", 2),
            Subject("اللغة الإنجليزية", 2),
            Subject("العلوم الإسلامية", 2),
            Subject("اللغة الأمازيغية", 2,true),

            Subject("التربية البدنية", 1,true)
        )

        "رياضيات" -> listOf(
            Subject("الرياضيات", 7),
            Subject("العلوم الفيزيائية", 6),
            Subject("علوم الطبيعة والحياة", 2),
            Subject("اللغة العربية وآدابها", 3),
            Subject("التاريخ والجغرافيا", 2),
            Subject("الفلسفة", 2),
            Subject("اللغة الفرنسية", 2),
            Subject("اللغة الإنجليزية", 2),
            Subject("العلوم الإسلامية", 2),
            Subject("اللغة الأمازيغية", 2,true),

            Subject("التربية البدنية", 1,true)
        )

        "تقني" -> listOf(
            Subject("التكنولوجيا", 7),
            Subject("الرياضيات", 6),
            Subject("العلوم الفيزيائية", 5),
            Subject("اللغة العربية وآدابها", 3),
            Subject("التاريخ والجغرافيا", 2),
            Subject("الفلسفة", 2),
            Subject("اللغة الفرنسية", 2),
            Subject("اللغة الإنجليزية", 2),
            Subject("العلوم الإسلامية", 2),
            Subject("اللغة الأمازيغية", 2,true),

            Subject("التربية البدنية", 1,true),
        )

        "تسيير" -> listOf(
            Subject("التسيير المحاسبي والمالي", 6),
            Subject("الاقتصاد والمناجمنت", 5),
            Subject("الرياضيات", 5),
            Subject("التاريخ والجغرافيا", 4),
            Subject("اللغة العربية وآدابها", 3),
            Subject("القانون", 2),
            Subject("اللغة الفرنسية", 2),
            Subject("اللغة الإنجليزية", 2),
            Subject("الفلـسفة", 1),
            Subject("العلوم الإسلامية", 2),
            Subject("اللغة الأمازيغية", 2,true),

            Subject("التربية البدنية", 1,true)
        )

        "آداب" -> listOf(
            Subject("الفلسفة", 6),
            Subject("اللغة العربية وآدابها", 6),
            Subject("التاريخ والجغرافيا", 4),
            Subject("اللغة الفرنسية", 3),
            Subject("اللغة الإنجليزية", 3),
            Subject("العلوم الإسلامية", 2),
            Subject("الرياضيات", 2),
            Subject("اللغة الأمازيغية", 2,true),

            Subject("التربية البدنية", 1,true)
        )

        "لغات" -> listOf(
            Subject("اللغة الأجنبية الثالثة", 5),
            Subject("اللغة العربية وآدابها", 5),
            Subject("اللغة الإنجليزية", 4),
            Subject("اللغة الفرنسية", 4),
            Subject("التاريخ والجغرافيا", 2),
            Subject("الفلسفة", 2),
            Subject("العلوم الإسلامية", 2),
            Subject("الرياضيات", 2),
            Subject("اللغة الأمازيغية", 2,true),

            Subject("التربية البدنية", 1,true)
        )
        "بيام" -> listOf(
            Subject("اللغة العربية وآدابها", 5),
            Subject("الرياضيات", 4),
            Subject("اللغة الفرنسية", 3),
            Subject("اللغة الإنجليزية", 2),
            Subject("العلوم الفيزيائية", 2),
            Subject("علوم الطبيعة والحياة", 2),
            Subject("التاريخ والجغرافيا", 3),
            Subject("التربية المدنية", 2),
            Subject("العلوم الإسلامية", 2),
            Subject("اللغة الأمازيغية", 2,true),
            Subject("الرسم", 1,true),
            Subject("الموسيقى", 1,true),
            Subject("التربية البدنية", 1,true)
        )

        else -> {emptyList()}
    }
}

fun getMajorsOfCho3ba(
    Cho3baName: String
): List<UniversityMajor> {
    return when(Cho3baName) {
        "علوم" -> listOf(
            UniversityMajor("علوم الطبيعة والحياة", 6.0),

        )

        "رياضيات" -> listOf(
            UniversityMajor("الرياضيات", 7.0),

        )

        "تقني" -> listOf(
            UniversityMajor("علوم الطبيعة والحياة", 6.0),

        )

        "تسيير" -> listOf(
            UniversityMajor("علوم الطبيعة والحياة", 6.0),

        )

        "آداب" -> listOf(
            UniversityMajor("علوم الطبيعة والحياة", 6.0),

        )

        "لغات" -> listOf(
            UniversityMajor("علوم الطبيعة والحياة", 6.0),

        )
        "بيام" -> listOf(
            UniversityMajor("علوم الطبيعة والحياة", 6.0),

        )

        else -> {emptyList()}
    }
}
