package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ebf {
    public static final a a;
    public static final ebf b;
    public static final ebf c;
    public static final /* synthetic */ ebf[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        ebf ebfVar = new ebf("ATTRIBUTE", 0, "ATTRIBUTE");
        b = ebfVar;
        ebf ebfVar2 = new ebf("OCCUPATION", 1, "OCCUPATION");
        ebf ebfVar3 = new ebf("COMPANY_SECTOR", 2, "COMPANY_SECTOR");
        ebf ebfVar4 = new ebf("CUSTOM_CLASS", 3, "CUSTOM_CLASS");
        ebf ebfVar5 = new ebf("CROWTAG_OQVT_OCCUPATIONS", 4, "CROWTAG_OQVT_OCCUPATIONS");
        ebf ebfVar6 = new ebf("CROWTAG_OQVT_TAG", 5, "CROWTAG_OQVT_TAG");
        ebf ebfVar7 = new ebf("CROWTAG_MATCH_TAG", 6, "CROWTAG_MATCH_TAG");
        ebf ebfVar8 = new ebf("CROWTAG_OQVT_QUESTION", 7, "CROWTAG_OQVT_QUESTION");
        ebf ebfVar9 = new ebf("CROWTAG_OQVT_QUESTION_VAL", 8, "CROWTAG_OQVT_QUESTION_VAL");
        ebf ebfVar10 = new ebf("UNKNOWN__", 9, "UNKNOWN__");
        c = ebfVar10;
        ebf[] ebfVarArr = {ebfVar, ebfVar2, ebfVar3, ebfVar4, ebfVar5, ebfVar6, ebfVar7, ebfVar8, ebfVar9, ebfVar10};
        d = ebfVarArr;
        e = new wv4(ebfVarArr);
        a = new a();
        new bw4("TaxonomyConceptType", u63.a0("ATTRIBUTE", "OCCUPATION", "COMPANY_SECTOR", "CUSTOM_CLASS", "CROWTAG_OQVT_OCCUPATIONS", "CROWTAG_OQVT_TAG", "CROWTAG_MATCH_TAG", "CROWTAG_OQVT_QUESTION", "CROWTAG_OQVT_QUESTION_VAL"));
    }

    public ebf(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ebf valueOf(String str) {
        return (ebf) Enum.valueOf(ebf.class, str);
    }

    public static ebf[] values() {
        return (ebf[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
