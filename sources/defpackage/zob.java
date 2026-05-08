package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum zob {
    Initial("initial"),
    Periodic("periodic"),
    SignIn("sign_in"),
    SignOut("sign_out");

    private final String loggingValue;

    zob(String str) {
        this.loggingValue = str;
    }

    public final String a() {
        return this.loggingValue;
    }
}
