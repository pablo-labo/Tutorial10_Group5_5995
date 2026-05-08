package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y3c {
    public static final y3c a;
    public static final y3c b;
    public static final /* synthetic */ y3c[] c;

    /* JADX INFO: Fake field, exist only in values array */
    y3c EF0;

    static {
        y3c y3cVar = new y3c("PRETTY", 0);
        y3c y3cVar2 = new y3c("DEBUG", 1);
        a = y3cVar2;
        y3c y3cVar3 = new y3c("NONE", 2);
        b = y3cVar3;
        c = new y3c[]{y3cVar, y3cVar2, y3cVar3};
    }

    public y3c() {
        throw null;
    }

    public static y3c valueOf(String str) {
        return (y3c) Enum.valueOf(y3c.class, str);
    }

    public static y3c[] values() {
        return (y3c[]) c.clone();
    }
}
