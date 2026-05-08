package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.d;
import androidx.compose.runtime.i;
import androidx.compose.runtime.j;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class s6b {
    public final km2 a;
    public final dm2 b;
    public final c c;
    public final Function2<b, Integer, j6g> d;
    public final boolean e;
    public final nr0<?> f;
    public final Object g;
    public final AtomicReference<u6b> h = new AtomicReference<>(u6b.c);
    public mnd<i> i;
    public final b0d j;
    public final j<Object> k;

    public s6b(km2 km2Var, dm2 dm2Var, c cVar, b4a b4aVar, Function2 function2, boolean z, cba cbaVar, Object obj) {
        this.a = km2Var;
        this.b = dm2Var;
        this.c = cVar;
        this.d = function2;
        this.e = z;
        this.f = cbaVar;
        this.g = obj;
        a4a<Object> a4aVar = nnd.a;
        a4aVar.getClass();
        this.i = a4aVar;
        b0d b0dVar = new b0d();
        b0dVar.g(b4aVar, cVar.d0());
        this.j = b0dVar;
        this.k = new j<>(cbaVar.d);
    }

    public final void a() throws Exception {
        AtomicReference<u6b> atomicReference = this.h;
        try {
            switch (atomicReference.get().ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    u6b u6bVar = u6b.f;
                    u6b u6bVar2 = u6b.V;
                    while (!atomicReference.compareAndSet(u6bVar, u6bVar2)) {
                        if (atomicReference.get() != u6bVar) {
                            gib.b("Unexpected state change from: " + u6bVar + " to: " + u6bVar2 + JwtParser.SEPARATOR_CHAR);
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(u6b.a);
            throw e;
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                j<Object> jVar = this.k;
                nr0<?> nr0Var = this.f;
                nr0Var.getClass();
                jVar.a(nr0Var, this.j);
                this.j.c();
                this.j.d();
                this.j.b();
                this.a.f0 = null;
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                this.j.b();
                this.a.f0 = null;
                throw th;
            }
        }
    }

    public final boolean c() {
        return this.h.get().compareTo(u6b.f) >= 0;
    }

    public final void d() {
        u6b u6bVar;
        u6b u6bVar2;
        boolean z;
        while (true) {
            AtomicReference<u6b> atomicReference = this.h;
            u6bVar = u6b.d;
            u6bVar2 = u6b.f;
            if (atomicReference.compareAndSet(u6bVar, u6bVar2)) {
                z = true;
                break;
            } else if (atomicReference.get() != u6bVar) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        gib.b("Unexpected state change from: " + u6bVar + " to: " + u6bVar2 + JwtParser.SEPARATOR_CHAR);
    }

    public final void e() {
        u6b u6bVar;
        boolean z;
        AtomicReference<u6b> atomicReference = this.h;
        u6b u6bVar2 = atomicReference.get();
        u6b u6bVar3 = u6b.d;
        if (u6bVar2 == u6bVar3) {
            return;
        }
        while (true) {
            u6bVar = u6b.f;
            if (atomicReference.compareAndSet(u6bVar, u6bVar3)) {
                z = true;
                break;
            } else if (atomicReference.get() != u6bVar) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        gib.b("Unexpected state change from: " + u6bVar + " to: " + u6bVar3 + JwtParser.SEPARATOR_CHAR);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean f(p6 p6Var) throws Exception {
        u6b u6bVar = u6b.e;
        AtomicReference<u6b> atomicReference = this.h;
        try {
            int iOrdinal = atomicReference.get().ordinal();
            u6b u6bVar2 = u6b.d;
            km2 km2Var = this.a;
            dm2 dm2Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    c cVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        cVar.z = 100;
                        cVar.y = true;
                    }
                    try {
                        this.i = dm2Var.b(km2Var, p6Var, this.d);
                        u6b u6bVar3 = u6b.c;
                        while (true) {
                            if (!atomicReference.compareAndSet(u6bVar3, u6bVar2)) {
                                if (atomicReference.get() != u6bVar3) {
                                    gib.b("Unexpected state change from: " + u6bVar3 + " to: " + u6bVar2 + JwtParser.SEPARATOR_CHAR);
                                }
                            }
                        }
                        if (this.i.b()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            cVar.X();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(u6bVar2, u6bVar)) {
                            if (atomicReference.get() != u6bVar2) {
                                gib.b("Unexpected state change from: " + u6bVar2 + " to: " + u6bVar + JwtParser.SEPARATOR_CHAR);
                            }
                        }
                    }
                    try {
                        this.i = dm2Var.o(km2Var, p6Var, this.i);
                        while (true) {
                            if (!atomicReference.compareAndSet(u6bVar, u6bVar2)) {
                                if (atomicReference.get() != u6bVar) {
                                    gib.b("Unexpected state change from: " + u6bVar + " to: " + u6bVar2 + JwtParser.SEPARATOR_CHAR);
                                }
                            }
                        }
                        if (this.i.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        while (true) {
                            if (!atomicReference.compareAndSet(u6bVar, u6bVar2)) {
                                if (atomicReference.get() != u6bVar) {
                                    gib.b("Unexpected state change from: " + u6bVar + " to: " + u6bVar2 + JwtParser.SEPARATOR_CHAR);
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    d.d("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(u6b.a);
            throw e;
        }
    }
}
