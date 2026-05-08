package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y25 implements fze {
    public final /* synthetic */ Context a;

    @Override // defpackage.fze
    public final Object get() {
        rl3 rl3Var;
        Context context = this.a;
        qyc qycVar = rl3.p;
        synchronized (rl3.class) {
            try {
                if (rl3.v == null) {
                    Context applicationContext = context.getApplicationContext();
                    HashMap map = new HashMap(8);
                    map.put(0, 1000000L);
                    map.put(2, -9223372036854775807L);
                    map.put(3, -9223372036854775807L);
                    map.put(4, -9223372036854775807L);
                    map.put(5, -9223372036854775807L);
                    map.put(10, -9223372036854775807L);
                    map.put(9, -9223372036854775807L);
                    map.put(7, -9223372036854775807L);
                    rl3.v = new rl3(applicationContext, map);
                }
                rl3Var = rl3.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl3Var;
    }
}
