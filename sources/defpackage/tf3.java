package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tf3 extends Throwable {
    private final String message;
    private final String stack;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf3(String str, String str2, String str3) {
        super(str2);
        q6.m(str, str2, str3);
        this.type = str;
        this.message = str2;
        this.stack = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return this.type + ": " + this.message + "\n" + this.stack;
    }
}
