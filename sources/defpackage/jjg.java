package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.jjg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jjg {
    public final is9 a;
    public final a33 b;
    public String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final ted f = new ted();
    public final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    public class a {
        public final AtomicMarkableReference<sh8> a;
        public final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new sh8(z ? 8192 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET), false);
        }

        public final boolean a(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().b(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<sh8> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    Callable<Void> callable = new Callable() { // from class: ijg
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws Throwable {
                            Map<String, String> mapUnmodifiableMap;
                            jjg.a aVar = this.a;
                            aVar.b.set(null);
                            synchronized (aVar) {
                                if (aVar.a.isMarked()) {
                                    sh8 reference = aVar.a.getReference();
                                    synchronized (reference) {
                                        mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                                    }
                                    AtomicMarkableReference<sh8> atomicMarkableReference2 = aVar.a;
                                    atomicMarkableReference2.set(atomicMarkableReference2.getReference(), false);
                                } else {
                                    mapUnmodifiableMap = null;
                                }
                            }
                            if (mapUnmodifiableMap != null) {
                                jjg jjgVar = jjg.this;
                                jjgVar.a.g(jjgVar.c, mapUnmodifiableMap, aVar.c);
                            }
                            return null;
                        }
                    };
                    AtomicReference<Callable<Void>> atomicReference = this.b;
                    while (!atomicReference.compareAndSet(null, callable)) {
                        if (atomicReference.get() != null) {
                            return true;
                        }
                    }
                    jjg.this.b.a(callable);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public jjg(String str, oa5 oa5Var, a33 a33Var) {
        this.c = str;
        this.a = new is9(oa5Var);
        this.b = a33Var;
    }
}
