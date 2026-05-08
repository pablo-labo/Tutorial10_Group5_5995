package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n96 implements o96<Object> {
    public volatile Object a;
    public final /* synthetic */ o96 b;

    public n96(o96 o96Var) {
        this.b = o96Var;
    }

    @Override // defpackage.o96
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = this.b.get();
                        beb.e(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
