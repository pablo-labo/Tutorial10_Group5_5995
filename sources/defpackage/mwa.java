package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mwa {
    public static final a a;
    public static final mwa b;
    public static final mwa c;
    public static final mwa d;
    public static final /* synthetic */ mwa[] e;

    public static final class a {
    }

    static {
        mwa mwaVar = new mwa("SOLID", 0);
        b = mwaVar;
        mwa mwaVar2 = new mwa("DASHED", 1);
        c = mwaVar2;
        mwa mwaVar3 = new mwa("DOTTED", 2);
        d = mwaVar3;
        e = new mwa[]{mwaVar, mwaVar2, mwaVar3};
        a = new a();
    }

    public mwa() {
        throw null;
    }

    public static mwa valueOf(String str) {
        return (mwa) Enum.valueOf(mwa.class, str);
    }

    public static mwa[] values() {
        return (mwa[]) e.clone();
    }
}
