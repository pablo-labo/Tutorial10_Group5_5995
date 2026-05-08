package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class iz4 implements gz4 {
    public final Handler a;
    public final f5g b;
    public final CopyOnWriteArraySet<Function1<qx4, j6g>> c = new CopyOnWriteArraySet<>();

    public iz4(int i, Handler handler) {
        this.a = handler;
        this.b = new f5g(i);
    }

    @Override // defpackage.gz4
    public final e5g a(String str, Function1<? super y3b, j6g> function1) {
        e5g e5gVar;
        str.getClass();
        f5g f5gVar = this.b;
        synchronized (f5gVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = f5gVar.c;
            if (jCurrentTimeMillis <= j) {
                int i = f5gVar.b + 1;
                f5gVar.b = i;
                if (i > 1023) {
                    f5gVar.b = 0;
                    f5gVar.c = j + 1;
                }
                jCurrentTimeMillis = f5gVar.c;
            } else {
                f5gVar.b = 0;
                f5gVar.c = jCurrentTimeMillis;
            }
            e5gVar = new e5g(f5gVar.a, f5gVar.b, jCurrentTimeMillis);
        }
        ArrayList arrayList = new ArrayList();
        y3b y3bVar = new y3b();
        function1.invoke(y3bVar);
        arrayList.addAll(y3bVar.a);
        this.a.post(new ky0(1, this, new qx4(e5gVar, str, arrayList)));
        return e5gVar;
    }
}
