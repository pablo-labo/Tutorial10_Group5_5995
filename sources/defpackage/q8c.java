package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q8c {
    public static final q8c a;
    public static final q8c b;
    public static final q8c c;
    public static final /* synthetic */ q8c[] d;

    static {
        q8c q8cVar = new q8c("PROCTOR", 0);
        a = q8cVar;
        q8c q8cVar2 = new q8c("BOTTOM_SHEET", 1);
        b = q8cVar2;
        q8c q8cVar3 = new q8c("ALERT_DIALOG", 2);
        c = q8cVar3;
        d = new q8c[]{q8cVar, q8cVar2, q8cVar3};
    }

    public q8c() {
        throw null;
    }

    public static q8c valueOf(String str) {
        return (q8c) Enum.valueOf(q8c.class, str);
    }

    public static q8c[] values() {
        return (q8c[]) d.clone();
    }
}
