package defpackage;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class tw1 {
    public boolean a;
    public a b;
    public boolean c;

    public interface a {
        void onCancel();
    }

    public final void a(a aVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == aVar) {
                return;
            }
            this.b = aVar;
            if (this.a) {
                aVar.onCancel();
            }
        }
    }
}
