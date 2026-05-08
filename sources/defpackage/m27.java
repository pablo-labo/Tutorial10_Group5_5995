package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class m27 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final vpb a;
    public final gze<Boolean> b;
    public final gze<f64> c;
    public final cq5 d;
    public final bq5 e;
    public final rn9<ot1, l82> f;
    public final rn9<ot1, PooledByteBuffer> g;
    public final am3 h;
    public final gze<Boolean> i;
    public final AtomicLong j;
    public final o27 k;

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public m27(vpb vpbVar, Set set, Set set2, gze gzeVar, up1 up1Var, up1 up1Var2, gze gzeVar2, am3 am3Var, z1b z1bVar, gze gzeVar3, n27 n27Var) {
        vpbVar.getClass();
        set.getClass();
        set2.getClass();
        gzeVar.getClass();
        up1Var.getClass();
        up1Var2.getClass();
        gzeVar2.getClass();
        am3Var.getClass();
        z1bVar.getClass();
        gzeVar3.getClass();
        n27Var.getClass();
        this.a = vpbVar;
        this.b = gzeVar;
        this.c = gzeVar2;
        this.d = new cq5((Set<g4d>) set);
        this.e = new bq5(set2);
        this.j = new AtomicLong();
        this.f = up1Var;
        this.g = up1Var2;
        this.h = am3Var;
        this.i = gzeVar3;
        this.k = n27Var;
    }

    public final u1 a(a aVar, Object obj, a.c cVar, g4d g4dVar, String str) {
        if (aVar == null) {
            return ojh.q(new NullPointerException());
        }
        try {
            vpb vpbVar = this.a;
            vpbVar.getClass();
            vhb vhbVar = aVar.p;
            it5.a();
            opb<n82<l82>> opbVarC = vpbVar.c(aVar);
            if (vhbVar != null) {
                opbVarC = vpbVar.f(opbVarC);
            }
            opb<n82<l82>> opbVar = opbVarC;
            if (cVar == null) {
                cVar = a.c.FULL_FETCH;
            }
            return d(opbVar, aVar, cVar, obj, g4dVar, str);
        } catch (Exception e) {
            return ojh.q(e);
        }
    }

    public final boolean b(Uri uri, a.b bVar) {
        boolean zB;
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        imageRequestBuilderD.g = bVar;
        a aVarA = imageRequestBuilderD.a();
        f64 f64Var = this.c.get();
        f64Var.getClass();
        f64 f64Var2 = f64Var;
        lfe lfeVarB = this.h.b(aVarA, null);
        a.b bVar2 = aVarA.a;
        bVar2.getClass();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int iOrdinal = bVar2.ordinal();
            if (iOrdinal == 0) {
                zB = f64Var2.a().b(lfeVarB);
            } else if (iOrdinal == 1) {
                zB = f64Var2.b().b(lfeVarB);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zB = c(aVarA);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zB;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public final boolean c(a aVar) {
        f64 f64Var = this.c.get();
        f64Var.getClass();
        lfe lfeVarB = this.h.b(aVar, null);
        Iterator<Map.Entry<String, po1>> it = f64Var.c().entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().b(lfeVarB)) {
                return true;
            }
        }
        return false;
    }

    public final u1 d(opb opbVar, a aVar, a.c cVar, Object obj, g4d g4dVar, String str) {
        cq5 cq5Var;
        it5.a();
        if (aVar != null) {
            cq5Var = this.d;
            if (g4dVar != null) {
                cq5Var = new cq5(cq5Var, g4dVar);
            }
        } else {
            r6.g("Required value was null.");
            cq5Var = null;
        }
        bj7 bj7Var = new bj7(cq5Var, this.e);
        try {
            gbe gbeVar = new gbe(aVar, String.valueOf(this.j.getAndIncrement()), str, bj7Var, obj, a.c.a(aVar.l, cVar), false, aVar.e || !rhg.c(aVar.b), aVar.k, this.k);
            it5.a();
            m82 m82Var = new m82(opbVar, gbeVar, bj7Var);
            it5.a();
            return m82Var;
        } catch (Exception e) {
            return ojh.q(e);
        }
    }

    public final u1 e(opb opbVar, a aVar, Object obj) {
        a.c cVar = a.c.FULL_FETCH;
        inb inbVar = inb.c;
        bj7 bj7Var = new bj7(this.d, this.e);
        Uri uri = aVar.b;
        uri.getClass();
        if (!uri.equals(uri)) {
            ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(aVar);
            imageRequestBuilderB.a = uri;
            aVar = imageRequestBuilderB.a();
        }
        a aVar2 = aVar;
        try {
            a.c cVarA = a.c.a(aVar2.l, cVar);
            String strValueOf = String.valueOf(this.j.getAndIncrement());
            this.k.getClass();
            return new wpb(opbVar, new gbe(aVar2, strValueOf, null, bj7Var, obj, cVarA, true, false, inbVar, this.k), bj7Var);
        } catch (Exception e) {
            return ojh.q(e);
        }
    }
}
