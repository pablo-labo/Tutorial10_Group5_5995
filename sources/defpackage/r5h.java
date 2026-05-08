package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r5h {
    public q5h a;

    public abstract q5h a();

    public final synchronized q5h b() {
        try {
            if (this.a == null) {
                this.a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
