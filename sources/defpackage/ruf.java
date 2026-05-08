package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ruf {
    public static final ruf a;
    public static final ruf b;
    public static final ruf c;
    public static final ruf d;
    public static final /* synthetic */ ruf[] e;

    static {
        ruf rufVar = new ruf("SUCCESSFUL", 0);
        a = rufVar;
        ruf rufVar2 = new ruf("REREGISTER", 1);
        b = rufVar2;
        ruf rufVar3 = new ruf("CANCELLED", 2);
        c = rufVar3;
        ruf rufVar4 = new ruf("ALREADY_SELECTED", 3);
        d = rufVar4;
        e = new ruf[]{rufVar, rufVar2, rufVar3, rufVar4};
    }

    public ruf() {
        throw null;
    }

    public static ruf valueOf(String str) {
        return (ruf) Enum.valueOf(ruf.class, str);
    }

    public static ruf[] values() {
        return (ruf[]) e.clone();
    }
}
