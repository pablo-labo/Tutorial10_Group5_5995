package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kud {
    public static final kud V;
    public static final kud W;
    public static final kud X;
    public static final /* synthetic */ kud[] Y;
    public static final kud a;
    public static final kud b;
    public static final kud c;
    public static final kud d;
    public static final kud e;
    public static final kud f;

    static {
        kud kudVar = new kud("SUBMIT_SEARCH_BUTTON", 0);
        a = kudVar;
        kud kudVar2 = new kud("PRESSED_WHAT_INITIAL_SUGGESTION", 1);
        b = kudVar2;
        kud kudVar3 = new kud("PRESSED_WHAT_RELATED_QUERY", 2);
        c = kudVar3;
        kud kudVar4 = new kud("PRESSED_WHAT_AUTOCOMPLETE_SUGGESTION", 3);
        d = kudVar4;
        kud kudVar5 = new kud("PRESSED_RECENT_SEARCH", 4);
        e = kudVar5;
        kud kudVar6 = new kud("PRESSED_WHERE_AUTOCOMPLETE_SUGGESTION", 5);
        f = kudVar6;
        kud kudVar7 = new kud("PRESSED_PROFILE_LOCATION", 6);
        V = kudVar7;
        kud kudVar8 = new kud("LOCATION_DETECTED", 7);
        W = kudVar8;
        kud kudVar9 = new kud("UNDEFINED", 8);
        X = kudVar9;
        Y = new kud[]{kudVar, kudVar2, kudVar3, kudVar4, kudVar5, kudVar6, kudVar7, kudVar8, kudVar9};
    }

    public kud() {
        throw null;
    }

    public static kud valueOf(String str) {
        return (kud) Enum.valueOf(kud.class, str);
    }

    public static kud[] values() {
        return (kud[]) Y.clone();
    }
}
