package defpackage;

import androidx.media3.session.q;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj9 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sj9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vjg.T(((q) obj).d, runnable);
                break;
            default:
                ((sf6) obj).i(runnable);
                break;
        }
    }
}
