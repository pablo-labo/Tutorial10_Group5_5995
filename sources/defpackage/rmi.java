package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class rmi {
    public static final rmi d = new rmi(true, null, null);
    public final boolean a;
    public final String b;
    public final Throwable c;

    public rmi(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = str;
        this.c = exc;
    }

    public static rmi b(String str) {
        return new rmi(false, str, null);
    }

    public static rmi c(Exception exc, String str) {
        return new rmi(false, str, exc);
    }

    public String a() {
        return this.b;
    }
}
