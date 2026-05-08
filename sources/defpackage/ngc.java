package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ngc {
    public static final ngc a;
    public static final ngc b;
    public static final ngc c;
    public static final /* synthetic */ ngc[] d;

    static {
        ngc ngcVar = new ngc("kStartMarker", 0);
        a = ngcVar;
        ngc ngcVar2 = new ngc("kMidMarker", 1);
        b = ngcVar2;
        ngc ngcVar3 = new ngc("kEndMarker", 2);
        c = ngcVar3;
        d = new ngc[]{ngcVar, ngcVar2, ngcVar3};
    }

    public ngc() {
        throw null;
    }

    public static ngc valueOf(String str) {
        return (ngc) Enum.valueOf(ngc.class, str);
    }

    public static ngc[] values() {
        return (ngc[]) d.clone();
    }
}
