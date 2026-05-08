package defpackage;

import androidx.media3.session.k;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hg0(Object obj, int i, int i2) {
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
                ((IntConsumer) obj).accept(i2);
                break;
            default:
                k kVar = (k) obj;
                ot0<Integer> ot0Var = kVar.k;
                ot0Var.remove(Integer.valueOf(i2));
                aae aaeVar = kVar.m;
                if (aaeVar != null && aaeVar.a.d() < 5 && ot0Var.isEmpty()) {
                    kVar.l.postDelayed(new z84(kVar, 4), 500L);
                    break;
                }
                break;
        }
    }
}
