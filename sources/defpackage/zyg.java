package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zyg {
    public static final zyg a;
    public static final zyg b;
    public static final zyg c;
    public static final zyg d;
    public static final zyg e;
    public static final /* synthetic */ zyg[] f;

    static {
        zyg zygVar = new zyg("CURRENT_LOCATION_ONLY", 0);
        a = zygVar;
        zyg zygVar2 = new zyg("INITIAL_SUGGESTIONS", 1);
        b = zygVar2;
        zyg zygVar3 = new zyg("AUTOCOMPLETE_SUGGESTIONS", 2);
        c = zygVar3;
        zyg zygVar4 = new zyg("INITIAL_SUGGESTIONS_WITH_PROFILE_LOCATION", 3);
        d = zygVar4;
        zyg zygVar5 = new zyg("AUTOCOMPLETE_SUGGESTIONS_WITH_PROFILE_LOCATION", 4);
        e = zygVar5;
        f = new zyg[]{zygVar, zygVar2, zygVar3, zygVar4, zygVar5};
    }

    public zyg() {
        throw null;
    }

    public static zyg valueOf(String str) {
        return (zyg) Enum.valueOf(zyg.class, str);
    }

    public static zyg[] values() {
        return (zyg[]) f.clone();
    }
}
