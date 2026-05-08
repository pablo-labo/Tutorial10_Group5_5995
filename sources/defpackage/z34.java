package defpackage;

import androidx.profileinstaller.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z34 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z34(huc hucVar, p3c p3cVar, int i) {
        this.c = hucVar;
        this.d = p3cVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b) obj2).b.b(i2, obj);
                break;
            default:
                p3c p3cVar = (p3c) obj;
                if (!((huc) obj2).element) {
                    p3cVar.reject(p6.c(i2, "error_"), p6.c(i2, "Failed to retrieve supported locales with error: "), new Throwable());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z34(b bVar, int i, Object obj) {
        this.c = bVar;
        this.b = i;
        this.d = obj;
    }
}
