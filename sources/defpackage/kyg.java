package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kyg {
    public static final kyg a;
    public static final kyg b;
    public static final kyg c;
    public static final /* synthetic */ kyg[] d;

    static {
        kyg kygVar = new kyg("AUTOCOMPLETE_SUGGESTIONS_ONLY", 0);
        a = kygVar;
        kyg kygVar2 = new kyg("RECENT_SEARCHES_THEN_SEARCH_SUGGESTIONS", 1);
        b = kygVar2;
        kyg kygVar3 = new kyg("SEARCH_SUGGESTIONS_THEN_RECENT_SEARCHES", 2);
        c = kygVar3;
        d = new kyg[]{kygVar, kygVar2, kygVar3};
    }

    public kyg() {
        throw null;
    }

    public static kyg valueOf(String str) {
        return (kyg) Enum.valueOf(kyg.class, str);
    }

    public static kyg[] values() {
        return (kyg[]) d.clone();
    }
}
