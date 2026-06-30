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
        "رياضيات" -> listOf(
            UniversityMajor("المدرسة العليا للذكاء الاصطناعي (ENSIA)", 18.61),
            UniversityMajor("المدرسة العليا للأمن السيبراني (ENSS)", 18.34),
            UniversityMajor("المدرسة العليا للإعلام الآلي ESI (الجزائر)", 18.19),
            UniversityMajor("كلية الطب (دكتور في الطب)", 16.65),
            UniversityMajor("المدرسة الوطنية العليا للتكنولوجيا (ENST)", 15.60),
            UniversityMajor("المدرسة العليا للأساتذة بالقبة (رياضيات ثانوي)", 16.85),
            UniversityMajor("المدرسة العليا للأساتذة بالقبة (فيزياء ثانوي)", 16.20),
            UniversityMajor("المدرسة الوطنية العليا لمهندسي الطيران (البليدة)", 15.85),
            UniversityMajor("المدرسة الوطنية العليا المتعددة التقنيات (الأبيار ENP)", 16.50),
            UniversityMajor("كلية الصيدلة", 16.26)
        )

        "علوم" -> listOf(
            UniversityMajor("المدرسة العليا للذكاء الاصطناعي (ENSIA)", 18.55),
            UniversityMajor("المدرسة العليا للأمن السيبراني (ENSS)", 18.70),
            UniversityMajor("المدرسة العليا للإعلام الآلي ESI (الجزائر)", 18.55),
            UniversityMajor("كلية الطب (دكتور في الطب)", 17.15),
            UniversityMajor("كلية طب الأسنان", 17.05),
            UniversityMajor("كلية الصيدلة", 16.76),
            UniversityMajor("المدرسة العليا للتكنولوجيا الحيوية (قسنطينة ENSTB)", 16.45),
            UniversityMajor("المدرسة العليا للأساتذة بالقبة (علوم طبيعية ثانوي)", 16.90),
            UniversityMajor("المدرسة العليا للعلوم الفلاحية (العراش ENSA)", 15.10),
            UniversityMajor("المدرسة العليا للأساتذة بالقبة (كيمياء ثانوي)", 16.30)
        )

        "تقني" -> listOf(
            UniversityMajor("المدرسة العليا للأمن السيبراني (ENSS)", 19.07),
            UniversityMajor("المدرسة العليا للإعلام الآلي ESI (الجزائر)", 18.93),
            UniversityMajor("المدرسة الوطنية العليا المتعددة التقنيات (الأبيار ENP)", 17.10),
            UniversityMajor("المدرسة الوطنية العليا للتكنولوجيا (ENST الجزائر)", 16.20),
            UniversityMajor("هندسة كهربائية وإلكترونيك (بومرداس IGEE)", 16.10),
            UniversityMajor("المدرسة الوطنية العليا لمهندسي الطيران (البليدة)", 16.40),
            UniversityMajor("المدرسة العليا للأساتذة (هندسة ميكانيكية ثانوي)", 15.50),
            UniversityMajor("المدرسة العليا للأساتذة (هندسة كهربائية ثانوي)", 15.20),
            UniversityMajor("المدرسة الوطنية العليا للمناجم والتعدين (عنابة)", 14.80),
            UniversityMajor("المدرسة العليا للأشغال العمومية (القبة ENSTP)", 15.30)
        )

        "تسيير" -> listOf(
            UniversityMajor("المدرسة العليا للتجارة (ESC القليعة)", 15.40),
            UniversityMajor("المدرسة العليا للدراسات التجارية (EHEC القليعة)", 15.10),
            UniversityMajor("المدرسة العليا لعلوم التسيير (عنابة)", 14.35),
            UniversityMajor("المدرسة الوطنية العليا للإحصاء والاقتصاد التطبيقي (ENSSEA)", 14.80),
            UniversityMajor("المدرسة العليا للمحاسبة والمالية (قسنطينة)", 14.20),
            UniversityMajor("المدرسة العليا للأساتذة (اقتصاد ثانوي)", 15.60),
            UniversityMajor("المدرسة الوطنية العليا للمناجمنت (ENM)", 14.50),
            UniversityMajor("المدرسة العليا للتجارة الدولية (درارية)", 14.60),
            UniversityMajor("المدرسة العليا لإدارة الأعمال (ESB)", 14.10),
            UniversityMajor("معهد التسيير والتقنيات التجارية (بومرداس)", 13.50)
        )

        "آداب" -> listOf(
            UniversityMajor("المدرسة العليا للأساتذة ببوزريعة (أدب عربي ثانوي)", 15.40),
            UniversityMajor("المدرسة العليا للأساتذة ببوزريعة (تاريخ وجغرافيا ثانوي)", 15.80),
            UniversityMajor("المدرسة العليا للأساتذة ببوزريعة (فلسفة ثانوي)", 14.90),
            UniversityMajor("المدرسة العليا للأساتذة بمستغانم (أدب عربي ثانوي)", 14.80),
            UniversityMajor("المدرسة العليا للأساتذة بقسنطينة (تاريخ ثانوي)", 15.20),
            UniversityMajor("المدرسة الوطنية العليا للعلوم السياسية", 13.50),
            UniversityMajor("المدرسة الوطنية العليا للصحافة وعلوم الإعلام", 14.10),
            UniversityMajor("كلية الحقوق (بن عكنون)", 12.50),
            UniversityMajor("المدرسة العليا للأساتذة (ابتدائي - لغة عربية)", 14.20),
            UniversityMajor("المدرسة العليا للفنون الجميلة", 13.00)
        )

        "لغات" -> listOf(
            UniversityMajor("المدرسة العليا للأساتذة ببوزريعة (إنجليزية ثانوي)", 16.90),
            UniversityMajor("المدرسة العليا للأساتذة ببوزريعة (فرنسية ثانوي)", 15.80),
            UniversityMajor("المدرسة العليا للأساتذة بقسنطينة (إنجليزية ثانوي)", 16.50),
            UniversityMajor("المدرسة العليا للأساتذة بوهران (فرنسية ثانوي)", 15.40),
            UniversityMajor("المدرسة العليا للأساتذة ببوزريعة (ألمانية ثانوي)", 14.20),
            UniversityMajor("معهد الترجمة (الجزائر 2 - عربي/إنجليزي/فرنسي)", 14.10),
            UniversityMajor("المدرسة العليا للأساتذة (متوسط - لغة إنجليزية)", 16.10),
            UniversityMajor("المدرسة العليا للأساتذة (متوسط - لغة فرنسية)", 14.90),
            UniversityMajor("كلية اللغات الأجنبية (لغة إسبانية/إيطالية تخصص نخبة)", 12.80),
            UniversityMajor("المدرسة الوطنية العليا للسياحة", 13.40)
        )

        else -> { emptyList() }
    }
}