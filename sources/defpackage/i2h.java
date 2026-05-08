package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i2h {
    public static final i2h V;
    public static final /* synthetic */ i2h[] W;
    public static final i2h a;
    public static final i2h b;
    public static final i2h c;
    public static final i2h d;
    public static final i2h e;
    public static final i2h f;

    /* JADX INFO: Fake field, exist only in values array */
    i2h EF0;

    static {
        i2h i2hVar = new i2h("EDIT_ROOT_PAGE", 0);
        i2h i2hVar2 = new i2h("JOB_TITLE", 1);
        a = i2hVar2;
        i2h i2hVar3 = new i2h("COMPANY", 2);
        b = i2hVar3;
        i2h i2hVar4 = new i2h("COUNTRY", 3);
        c = i2hVar4;
        i2h i2hVar5 = new i2h("COUNTRY_SELECTOR", 4);
        d = i2hVar5;
        i2h i2hVar6 = new i2h("LOCATION", 5);
        e = i2hVar6;
        i2h i2hVar7 = new i2h("TIME_PERIOD", 6);
        f = i2hVar7;
        i2h i2hVar8 = new i2h("DESCRIPTION", 7);
        V = i2hVar8;
        W = new i2h[]{i2hVar, i2hVar2, i2hVar3, i2hVar4, i2hVar5, i2hVar6, i2hVar7, i2hVar8};
    }

    public i2h() {
        throw null;
    }

    public static i2h valueOf(String str) {
        return (i2h) Enum.valueOf(i2h.class, str);
    }

    public static i2h[] values() {
        return (i2h[]) W.clone();
    }
}
