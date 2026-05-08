package defpackage;

import android.os.SystemClock;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.memory.b;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class aga implements opb<vs4> {
    public final yn9 a;
    public final cr1 b;
    public final ka6 c;

    public class a {
        public final /* synthetic */ n85 a;

        public a(n85 n85Var) {
            this.a = n85Var;
        }

        public final void a() {
            n85 n85Var = this.a;
            n85Var.b.G().f(n85Var.b, "NetworkFetchProducer");
            n85Var.a.u();
        }

        public final void b(Exception exc) {
            n85 n85Var = this.a;
            tpb tpbVarG = n85Var.b.G();
            ppb ppbVar = n85Var.b;
            tpbVarG.h(ppbVar, "NetworkFetchProducer", exc, null);
            ppbVar.G().c(ppbVar, "NetworkFetchProducer", false);
            ppbVar.s("network");
            n85Var.a.t(exc);
        }

        public final void c(InputStream inputStream, int i) {
            MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStreamC;
            it5.a();
            aga agaVar = aga.this;
            cr1 cr1Var = agaVar.b;
            yn9 yn9Var = agaVar.a;
            if (i > 0) {
                yn9Var.getClass();
                memoryPooledByteBufferOutputStreamC = new MemoryPooledByteBufferOutputStream((b) yn9Var.a, i);
            } else {
                memoryPooledByteBufferOutputStreamC = yn9Var.c();
            }
            byte[] bArr = cr1Var.get(16384);
            while (true) {
                try {
                    int i2 = inputStream.read(bArr);
                    n85 n85Var = this.a;
                    if (i2 < 0) {
                        agaVar.c.K0(n85Var);
                        agaVar.c(memoryPooledByteBufferOutputStreamC, n85Var);
                        cr1Var.a(bArr);
                        memoryPooledByteBufferOutputStreamC.close();
                        it5.a();
                        return;
                    }
                    if (i2 > 0) {
                        memoryPooledByteBufferOutputStreamC.write(bArr, 0, i2);
                        agaVar.d(memoryPooledByteBufferOutputStreamC, n85Var);
                        int i3 = memoryPooledByteBufferOutputStreamC.c;
                        n85Var.a.w(i > 0 ? i3 / i : 1.0f - ((float) Math.exp(((double) (-i3)) / 50000.0d)));
                    }
                } catch (Throwable th) {
                    cr1Var.a(bArr);
                    memoryPooledByteBufferOutputStreamC.close();
                    throw th;
                }
            }
        }
    }

    public aga(yn9 yn9Var, cr1 cr1Var, ka6 ka6Var) {
        this.a = yn9Var;
        this.b = cr1Var;
        this.c = ka6Var;
    }

    public static void e(bgb bgbVar, int i, xr1 xr1Var, xq2 xq2Var) throws Throwable {
        im3 im3VarB0 = n82.b0(bgbVar.a());
        vs4 vs4Var = null;
        try {
            vs4 vs4Var2 = new vs4(im3VarB0);
            try {
                vs4Var2.X = xr1Var;
                vs4Var2.N();
                xq2Var.v(i, vs4Var2);
                vs4Var2.close();
                im3VarB0.close();
            } catch (Throwable th) {
                th = th;
                vs4Var = vs4Var2;
                vs4.h(vs4Var);
                n82.G(im3VarB0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.opb
    public final void a(xq2<vs4> xq2Var, ppb ppbVar) {
        ppbVar.G().k(ppbVar, "NetworkFetchProducer");
        ka6 ka6Var = this.c;
        n85 n85VarT = ka6Var.T(xq2Var, ppbVar);
        ka6Var.e0(n85VarT, new a(n85VarT));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(bgb bgbVar, n85 n85Var) throws Throwable {
        int size = bgbVar.size();
        tpb tpbVarG = n85Var.b.G();
        ppb ppbVar = n85Var.b;
        Map mapM0 = !tpbVarG.j(ppbVar, "NetworkFetchProducer") ? null : this.c.m0(n85Var, size);
        tpb tpbVarG2 = ppbVar.G();
        tpbVarG2.a(ppbVar, "NetworkFetchProducer", mapM0);
        tpbVarG2.c(ppbVar, "NetworkFetchProducer", true);
        ppbVar.s("network");
        e(bgbVar, 1 | n85Var.d, n85Var.e, n85Var.a);
    }

    public final void d(bgb bgbVar, n85 n85Var) throws Throwable {
        ppb ppbVar = n85Var.b;
        if (ppbVar.h().a() == null || !ppbVar.N()) {
            return;
        }
        this.c.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - n85Var.c >= 100) {
            n85Var.c = jUptimeMillis;
            ppbVar.G().b(ppbVar);
            e(bgbVar, n85Var.d, n85Var.e, n85Var.a);
        }
    }
}
