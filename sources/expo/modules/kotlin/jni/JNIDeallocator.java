package expo.modules.kotlin.jni;

import defpackage.j6g;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", "Lj6g;", "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JNIDeallocator implements AutoCloseable {
    public final ReferenceQueue<Destructible> a;
    public final LinkedHashMap b;
    public final a c;

    public final class a extends Thread {
        public a() {
            super("Expo JNI deallocator");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            JNIDeallocator jNIDeallocator = JNIDeallocator.this;
            while (!isInterrupted()) {
                try {
                    Reference<? extends Destructible> referenceRemove = jNIDeallocator.a.remove();
                    synchronized (jNIDeallocator) {
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public JNIDeallocator(int i) {
        this.a = new ReferenceQueue<>();
        this.b = new LinkedHashMap();
        a aVar = new a();
        aVar.start();
        this.c = aVar;
    }

    public final void a() {
        synchronized (this) {
            try {
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    Destructible destructible = (Destructible) ((WeakReference) it.next()).get();
                    if (destructible != null) {
                        destructible.a();
                    }
                }
                this.b.clear();
                a aVar = this.c;
                if (aVar != null) {
                    aVar.interrupt();
                    j6g j6gVar = j6g.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addReference(Destructible destructible) {
        destructible.getClass();
        synchronized (this) {
            WeakReference weakReference = new WeakReference(destructible);
            this.b.put(new PhantomReference(destructible, this.a), weakReference);
            j6g j6gVar = j6g.a;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public JNIDeallocator() {
        this(0);
    }
}
