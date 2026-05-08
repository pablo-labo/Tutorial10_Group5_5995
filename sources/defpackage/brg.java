package defpackage;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbrg;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class brg {
    public final crg a = new crg();

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        crg crgVar = this.a;
        if (crgVar != null) {
            if (crgVar.d) {
                crg.a(autoCloseable);
                return;
            }
            synchronized (crgVar.a) {
                autoCloseable2 = (AutoCloseable) crgVar.b.put(str, autoCloseable);
            }
            crg.a(autoCloseable2);
        }
    }

    public final void c() {
        crg crgVar = this.a;
        if (crgVar != null && !crgVar.d) {
            crgVar.d = true;
            synchronized (crgVar.a) {
                try {
                    Iterator it = crgVar.b.values().iterator();
                    while (it.hasNext()) {
                        crg.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = crgVar.c.iterator();
                    while (it2.hasNext()) {
                        crg.a((AutoCloseable) it2.next());
                    }
                    crgVar.c.clear();
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f();
    }

    public final <T extends AutoCloseable> T e(String str) {
        T t;
        crg crgVar = this.a;
        if (crgVar == null) {
            return null;
        }
        synchronized (crgVar.a) {
            t = (T) crgVar.b.get(str);
        }
        return t;
    }

    public void f() {
    }
}
