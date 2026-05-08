package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.d;
import androidx.media3.session.s;
import androidx.media3.session.v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f35 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f35(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Integer, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                z71<Integer> z71Var = dVar.F;
                Context context = dVar.e;
                String str = vjg.a;
                ?? ValueOf = Integer.valueOf(ey0.a(context).generateAudioSessionId());
                z71Var.e = ValueOf;
                w71 w71Var = new w71(0, z71Var, ValueOf);
                sf6 sf6Var = z71Var.b;
                if (sf6Var.f().getThread().isAlive()) {
                    sf6Var.i(w71Var);
                    break;
                }
                break;
            case 1:
                s sVar = (s) obj;
                v.b bVar = sVar.v;
                if (bVar != null) {
                    v.this.f(sVar.k, false);
                }
                break;
            default:
                rdb rdbVar = (rdb) obj;
                rdbVar.l.start();
                rdbVar.e(rdbVar.u, 2000L);
                break;
        }
    }
}
