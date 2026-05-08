package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t9a {
    public static final t9a a;
    public static final t9a b;
    public static final t9a c;
    public static final /* synthetic */ t9a[] d;

    static {
        t9a t9aVar = new t9a("PARENT", 0);
        a = t9aVar;
        t9a t9aVar2 = new t9a("LEAF", 1);
        b = t9aVar2;
        t9a t9aVar3 = new t9a("NONE", 2);
        c = t9aVar3;
        d = new t9a[]{t9aVar, t9aVar2, t9aVar3};
    }

    public t9a() {
        throw null;
    }

    public static t9a valueOf(String str) {
        return (t9a) Enum.valueOf(t9a.class, str);
    }

    public static t9a[] values() {
        return (t9a[]) d.clone();
    }
}
