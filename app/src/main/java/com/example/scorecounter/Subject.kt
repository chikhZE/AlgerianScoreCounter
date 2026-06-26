package com.example.scorecounter

data class Subject(
    val name: String ,
    val coefficient: Int,
    var score: String = ""
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
            Subject("التربية البدنية", 1)
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
            Subject("التربية البدنية", 1)
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
            Subject("التربية البدنية", 1)
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
            Subject("التربية البدنية", 1)
        )

        "آداب" -> listOf(
            Subject("الفلسفة", 6),
            Subject("اللغة العربية وآدابها", 6),
            Subject("التاريخ والجغرافيا", 4),
            Subject("اللغة الفرنسية", 3),
            Subject("اللغة الإنجليزية", 3),
            Subject("العلوم الإسلامية", 2),
            Subject("الرياضيات", 2),
            Subject("التربية البدنية", 1)
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
            Subject("التربية البدنية", 1)
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
            Subject("التربية البدنية", 1)
        )

        else -> {emptyList()}
    }
}
