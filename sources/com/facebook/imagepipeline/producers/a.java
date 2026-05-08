package com.facebook.imagepipeline.producers;

import bolts.ExecutorException;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.DiskCacheDecision;
import com.facebook.imagepipeline.request.a;
import defpackage.am3;
import defpackage.b64;
import defpackage.c64;
import defpackage.f64;
import defpackage.g47;
import defpackage.gi1;
import defpackage.gze;
import defpackage.haf;
import defpackage.iaf;
import defpackage.it5;
import defpackage.lfe;
import defpackage.oaf;
import defpackage.opb;
import defpackage.po1;
import defpackage.ppb;
import defpackage.qq2;
import defpackage.r6;
import defpackage.s55;
import defpackage.sqe;
import defpackage.tpb;
import defpackage.vs4;
import defpackage.xq2;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements opb<vs4> {
    public final gze<f64> a;
    public final am3 b;
    public final b c;

    public a(gze gzeVar, am3 am3Var, b bVar) {
        this.a = gzeVar;
        this.b = am3Var;
        this.c = bVar;
    }

    public static Map<String, String> c(tpb tpbVar, ppb ppbVar, boolean z, int i) {
        if (tpbVar.j(ppbVar, "DiskCacheProducer")) {
            return z ? g47.f("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : g47.d("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        oaf oafVarB;
        boolean z;
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        if (!ppbVar.Q().c(16)) {
            d(xq2Var, ppbVar);
            return;
        }
        ppbVar.G().k(ppbVar, "DiskCacheProducer");
        final lfe lfeVarB = this.b.b(aVarQ, ppbVar.a());
        f64 f64Var = this.a.get();
        final po1 po1VarA = DiskCacheDecision.a(aVarQ, f64Var.a(), f64Var.b(), f64Var.c());
        oaf oafVar = null;
        if (po1VarA == null) {
            ppbVar.G().h(ppbVar, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(aVarQ.a.ordinal()).toString()), null);
            d(xq2Var, ppbVar);
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        sqe sqeVar = po1VarA.g;
        lfeVarB.getClass();
        it5.a();
        vs4 vs4VarB = sqeVar.b(lfeVarB);
        if (vs4VarB != null) {
            s55.i(po1.class, lfeVarB.a(), "Found image for %s in staging area");
            po1VarA.f.getClass();
            oaf oafVar2 = new oaf();
            if (oafVar2.g(vs4VarB)) {
                oafVar = oafVar2;
            } else {
                r6.g("Cannot set the result of a completed task.");
            }
        } else {
            try {
                oafVarB = oaf.a(po1VarA.d, new Callable() { // from class: no1
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws InterruptedException {
                        po1 po1Var = po1VarA;
                        jia jiaVar = po1Var.f;
                        ot1 ot1Var = lfeVarB;
                        ot1Var.getClass();
                        if (atomicBoolean.get()) {
                            throw new CancellationException();
                        }
                        vs4 vs4VarB2 = po1Var.g.b(ot1Var);
                        if (vs4VarB2 != null) {
                            s55.i(po1.class, ot1Var.a(), "Found image for %s in staging area");
                            jiaVar.getClass();
                        } else {
                            s55.i(po1.class, ot1Var.a(), "Did not find image for %s in staging area");
                            jiaVar.getClass();
                            try {
                                PooledByteBuffer pooledByteBufferC = po1Var.c(ot1Var);
                                if (pooledByteBufferC == null) {
                                    return null;
                                }
                                im3 im3VarB0 = n82.b0(pooledByteBufferC);
                                im3VarB0.getClass();
                                try {
                                    vs4VarB2 = new vs4(im3VarB0);
                                } finally {
                                    im3VarB0.close();
                                }
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return vs4VarB2;
                        }
                        s55.a.getClass();
                        if (wab.p(2)) {
                            wab.t(2, po1.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                        }
                        vs4VarB2.close();
                        throw new InterruptedException();
                    }
                });
            } catch (Exception e) {
                s55.m(e, "Failed to schedule disk-cache read for %s", lfeVarB.a());
                oafVarB = oaf.b(e);
            }
            oafVar = oafVarB;
        }
        b64 b64Var = new b64(this, ppbVar.G(), ppbVar, xq2Var);
        oafVar.getClass();
        gi1.a aVar = oaf.h;
        qq2 qq2Var = new qq2(6);
        synchronized (oafVar.a) {
            try {
                synchronized (oafVar.a) {
                    z = oafVar.b;
                }
                if (!z) {
                    oafVar.f.add(new haf(qq2Var, b64Var, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            try {
                aVar.execute(new iaf(qq2Var, b64Var, oafVar));
            } catch (Exception e2) {
                qq2Var.e(new ExecutorException(e2));
            }
        }
        ppbVar.v(new c64(atomicBoolean));
    }

    public final void d(xq2<vs4> xq2Var, ppb ppbVar) {
        if (ppbVar.h0().c() < a.c.DISK_CACHE.c()) {
            this.c.a(xq2Var, ppbVar);
        } else {
            ppbVar.p("disk", "nil-result_read");
            xq2Var.v(1, null);
        }
    }
}
