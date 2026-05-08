package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class aie {
    public static final /* synthetic */ b a = new b();

    public interface a {
        xqc a(Context context);
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "a");
        public volatile /* synthetic */ Object a;
    }

    public static final m17 a(Context context) {
        m17 m17Var;
        m17 m17Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.b;
        b bVar = a;
        Object obj = atomicReferenceFieldUpdater.get(bVar);
        m17 m17Var3 = obj instanceof m17 ? (m17) obj : null;
        if (m17Var3 != null) {
            return m17Var3;
        }
        m17 m17VarA = null;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(bVar);
            if (obj2 instanceof m17) {
                m17Var = (m17) obj2;
                m17Var2 = m17VarA;
            } else {
                if (m17VarA == null) {
                    a aVar = obj2 instanceof a ? (a) obj2 : null;
                    if (aVar != null) {
                        m17VarA = aVar.a(context);
                    } else {
                        Object applicationContext = context.getApplicationContext();
                        a aVar2 = applicationContext instanceof a ? (a) applicationContext : null;
                        m17VarA = aVar2 != null ? aVar2.a(context) : cie.a.a(context);
                    }
                }
                m17Var = m17VarA;
                m17Var2 = m17Var;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, obj2, m17Var)) {
                if (atomicReferenceFieldUpdater.get(bVar) != obj2) {
                    break;
                }
            }
            return m17Var;
            m17VarA = m17Var2;
        }
    }
}
