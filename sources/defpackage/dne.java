package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dne extends UnsatisfiedLinkError {
    private String mSoName;

    public dne(String str, String str2) {
        super(str2);
        this.mSoName = str;
    }

    public final String a() {
        return this.mSoName;
    }
}
