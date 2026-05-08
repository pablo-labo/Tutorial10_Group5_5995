package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p9c {
    public static final a a;
    public static final p9c b;
    public static final /* synthetic */ p9c[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        p9c p9cVar = new p9c("DEFAULT_QUESTIONS", 0, "DEFAULT_QUESTIONS");
        p9c p9cVar2 = new p9c("PDCS_DATA_SCIENCE_MODELS", 1, "PDCS_DATA_SCIENCE_MODELS");
        p9c p9cVar3 = new p9c("SEGMENT_CONFIG_PLATFORM", 2, "SEGMENT_CONFIG_PLATFORM");
        p9c p9cVar4 = new p9c("SEGMENT_CONFIG_PLATFORM_CROWTAXO", 3, "SEGMENT_CONFIG_PLATFORM_CROWTAXO");
        p9c p9cVar5 = new p9c("SEGMENT_CONFIG_PLATFORM_MOC", 4, "SEGMENT_CONFIG_PLATFORM_MOC");
        p9c p9cVar6 = new p9c("ATTRIBUTE_ORDERING_SERVICE", 5, "ATTRIBUTE_ORDERING_SERVICE");
        p9c p9cVar7 = new p9c("CINTEL_SURFACE_DERIVED", 6, "CINTEL_SURFACE_DERIVED");
        p9c p9cVar8 = new p9c("CI_EXPERIMENTAL_NEW", 7, "CI_EXPERIMENTAL_NEW");
        p9c p9cVar9 = new p9c("HIGH_CONFIDENCE_DEDUCTION", 8, "HIGH_CONFIDENCE_DEDUCTION");
        p9c p9cVar10 = new p9c("UNKNOWN__", 9, "UNKNOWN__");
        b = p9cVar10;
        p9c[] p9cVarArr = {p9cVar, p9cVar2, p9cVar3, p9cVar4, p9cVar5, p9cVar6, p9cVar7, p9cVar8, p9cVar9, p9cVar10};
        c = p9cVarArr;
        d = new wv4(p9cVarArr);
        a = new a();
        new bw4("QuestionSource", u63.a0("DEFAULT_QUESTIONS", "PDCS_DATA_SCIENCE_MODELS", "SEGMENT_CONFIG_PLATFORM", "SEGMENT_CONFIG_PLATFORM_CROWTAXO", "SEGMENT_CONFIG_PLATFORM_MOC", "ATTRIBUTE_ORDERING_SERVICE", "CINTEL_SURFACE_DERIVED", "CI_EXPERIMENTAL_NEW", "HIGH_CONFIDENCE_DEDUCTION"));
    }

    public p9c(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static p9c valueOf(String str) {
        return (p9c) Enum.valueOf(p9c.class, str);
    }

    public static p9c[] values() {
        return (p9c[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
