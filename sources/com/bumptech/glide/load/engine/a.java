package com.bumptech.glide.load.engine;

import defpackage.beb;
import defpackage.f5d;
import defpackage.kg8;
import defpackage.t7;
import defpackage.u7;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue<h<?>> c;
    public f d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public static final class C0116a extends WeakReference<h<?>> {
        public final kg8 a;
        public final boolean b;
        public f5d<?> c;

        public C0116a(kg8 kg8Var, h hVar, ReferenceQueue referenceQueue) {
            super(hVar, referenceQueue);
            beb.e(kg8Var, "Argument must not be null");
            this.a = kg8Var;
            boolean z = hVar.a;
            this.c = null;
            this.b = z;
        }
    }

    public a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new t7());
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new u7(this));
    }

    public final synchronized void a(kg8 kg8Var, h<?> hVar) {
        C0116a c0116a = (C0116a) this.b.put(kg8Var, new C0116a(kg8Var, hVar, this.c));
        if (c0116a != null) {
            c0116a.c = null;
            c0116a.clear();
        }
    }

    public final void b(C0116a c0116a) {
        f5d<?> f5dVar;
        synchronized (this) {
            this.b.remove(c0116a.a);
            if (c0116a.b && (f5dVar = c0116a.c) != null) {
                this.d.a(c0116a.a, new h<>(f5dVar, true, false, c0116a.a, this.d));
            }
        }
    }
}
