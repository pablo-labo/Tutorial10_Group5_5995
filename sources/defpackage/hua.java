package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hua {
    public final String a;
    public final String b;
    public final String c;
    public final sta d;
    public final boolean e;

    public hua(String str, String str2, String str3, sta staVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = staVar;
        this.e = z;
        if (str.length() <= 0 || str.length() > 50) {
            l5.q("String size needs to be less or equal to 50");
            throw null;
        }
        if (str2.length() > 200) {
            l5.q("String size needs to be less or equal to 200");
            throw null;
        }
        if (str3.length() <= 0 || str3.length() > 50) {
            l5.q("String size needs to be less or equal to 50");
            throw null;
        }
    }
}
