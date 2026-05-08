package defpackage;

import defpackage.g6d;
import defpackage.vyf;

/* JADX INFO: loaded from: classes.dex */
public final class mv1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                g6d.c cVar = ((vyf.a) obj).q0;
                if (cVar != null) {
                    cVar.b(i2);
                }
                break;
            default:
                ((y9h) obj).i(i2);
                break;
        }
    }
}
