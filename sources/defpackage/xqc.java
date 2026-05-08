package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import defpackage.ab5;
import defpackage.bu7;
import defpackage.cz4;
import defpackage.d6d;
import defpackage.fsf;
import defpackage.ir1;
import defpackage.ju0;
import defpackage.lt2;
import defpackage.mg1;
import defpackage.og2;
import defpackage.pb4;
import defpackage.q55;
import defpackage.qg1;
import defpackage.v03;
import defpackage.w27;
import defpackage.yq1;
import defpackage.z03;
import defpackage.zse;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xqc implements m17 {
    public static final /* synthetic */ int f = 0;
    public final b a;
    public final eu2 b;
    public final i90 c;
    public final og2 d;
    public volatile /* synthetic */ int e;

    @uh3(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {66}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super c37>, Object> {
        final /* synthetic */ w27 $request;
        int label;
        final /* synthetic */ xqc this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, w27 w27Var, xqc xqcVar) {
            super(2, lu2Var);
            this.this$0 = xqcVar;
            this.$request = w27Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$request, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super c37> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            xqc xqcVar = this.this$0;
            w27 w27Var = this.$request;
            this.label = 1;
            int i2 = xqc.f;
            Object objC = xqcVar.c(w27Var, 0, this);
            g13 g13Var = g13.a;
            return objC == g13Var ? g13Var : objC;
        }
    }

    public static final class b {
        public final Context a;
        public final w27.b b;
        public final d2f c;
        public final d2f d;
        public final og2 e;

        public b(Context context, w27.b bVar, d2f d2fVar, d2f d2fVar2, og2 og2Var) {
            this.a = context;
            this.b = bVar;
            this.c = d2fVar;
            this.d = d2fVar2;
            this.e = og2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return wl7.b(this.a, bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
            }
            return false;
        }

        public final int hashCode() {
            return (this.e.hashCode() + ((cz4.b.m.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        }

        public final String toString() {
            return "Options(application=" + this.a + ", defaults=" + this.b + ", memoryCacheLazy=" + this.c + ", diskCacheLazy=" + this.d + ", eventListenerFactory=" + cz4.b.m + ", componentRegistry=" + this.e + ", logger=null)";
        }
    }

    static {
        AtomicIntegerFieldUpdater.newUpdater(xqc.class, "e");
    }

    public xqc(b bVar) {
        Object obj = l25.a;
        this.a = bVar;
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        this.b = f13.a(v03.a.C0438a.c(ezeVarA, m89.a.J1()).d1(new grc(z03.a.a)));
        la0 la0Var = new la0(this);
        i90 i90Var = new i90(this, la0Var);
        this.c = i90Var;
        og2.a aVar = new og2.a(bVar.e);
        Object obj2 = bVar.b.n.a.get(r17.a);
        if (((Boolean) (obj2 == null ? Boolean.TRUE : obj2)).booleanValue()) {
            aVar.d.add(new kr(14));
            aVar.e.add(new fc2(13));
        }
        kb0 kb0Var = new kb0();
        iwc iwcVar = fwc.a;
        aVar.b(kb0Var, iwcVar.b(Uri.class));
        aVar.b(new u5d(), iwcVar.b(Integer.class));
        aVar.c.add(new Pair(new j90(), iwcVar.b(lhg.class)));
        aVar.a(new ju0.a(), iwcVar.b(lhg.class));
        aVar.a(new lt2.a(), iwcVar.b(lhg.class));
        aVar.a(new d6d.a(), iwcVar.b(lhg.class));
        aVar.a(new pb4.a(), iwcVar.b(Drawable.class));
        aVar.a(new qg1.a(), iwcVar.b(Bitmap.class));
        q55.b<Integer> bVar2 = s17.a;
        Object obj3 = bVar.b.n.a.get(s17.a);
        int iIntValue = ((Number) (obj3 == null ? 4 : obj3)).intValue();
        int i = d6e.a;
        c6e c6eVar = new c6e(iIntValue, 0);
        int i2 = 5;
        if (Build.VERSION.SDK_INT >= 29) {
            Object obj4 = bVar.b.n.a.get(s17.b);
            l25 l25Var = (l25) (obj4 == null ? obj : obj4);
            if (l25Var.equals(obj) || l25Var.equals(l25.b)) {
                aVar.e.add(new zh(new zse.a(c6eVar), i2));
            }
        }
        Object obj5 = bVar.b.n.a.get(s17.b);
        aVar.e.add(new zh(new mg1.b(c6eVar, (l25) (obj5 != null ? obj5 : obj)), i2));
        aVar.b(new ca5(), iwcVar.b(File.class));
        aVar.a(new bu7.a(), iwcVar.b(lhg.class));
        aVar.a(new ir1.a(), iwcVar.b(ByteBuffer.class));
        aVar.b(new hve(), iwcVar.b(String.class));
        aVar.b(new g6b(), iwcVar.b(w5b.class));
        aVar.c.add(new Pair(new bb5(), iwcVar.b(lhg.class)));
        aVar.c.add(new Pair(new nhg(), iwcVar.b(lhg.class)));
        aVar.a(new ab5.a(), iwcVar.b(lhg.class));
        aVar.a(new yq1.a(), iwcVar.b(byte[].class));
        aVar.a.add(new vt4(this, la0Var, i90Var));
        this.d = aVar.c();
        this.e = 0;
    }

    @Override // defpackage.m17
    public final j74 a(w27 w27Var) {
        return irc.a(w27Var, u63.l(this.b, null, new a(null, w27Var, this), 3));
    }

    @Override // defpackage.m17
    public final Object b(w27 w27Var, pu2 pu2Var) {
        return ((w27Var.c instanceof yrg) || (w27Var.p instanceof wrg) || ((kv8) r55.a(w27Var, z27.f)) != null) ? f13.d(new yqc(null, w27Var, this), pu2Var) : c(w27Var, 1, pu2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d2 A[Catch: all -> 0x01cf, PHI: r1 r2 r3 r4
  0x01d2: PHI (r1v19 xqc) = (r1v4 xqc), (r1v20 xqc), (r1v21 xqc) binds: [B:28:0x0090, B:110:0x01bc, B:112:0x01cc] A[DONT_GENERATE, DONT_INLINE]
  0x01d2: PHI (r2v14 x3d) = (r2v5 x3d), (r2v34 x3d), (r2v35 x3d) binds: [B:28:0x0090, B:110:0x01bc, B:112:0x01cc] A[DONT_GENERATE, DONT_INLINE]
  0x01d2: PHI (r3v16 w27) = (r3v29 w27), (r3v30 w27), (r3v31 w27) binds: [B:28:0x0090, B:110:0x01bc, B:112:0x01cc] A[DONT_GENERATE, DONT_INLINE]
  0x01d2: PHI (r4v16 cz4) = (r4v4 cz4), (r4v38 cz4), (r4v39 cz4) binds: [B:28:0x0090, B:110:0x01bc, B:112:0x01cc] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x01cf, blocks: (B:116:0x01d2, B:118:0x01d9, B:120:0x01e3, B:121:0x01ed, B:122:0x01f0, B:107:0x01af, B:109:0x01b9, B:111:0x01be, B:148:0x026b, B:149:0x0270), top: B:172:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d9 A[Catch: all -> 0x01cf, TryCatch #6 {all -> 0x01cf, blocks: (B:116:0x01d2, B:118:0x01d9, B:120:0x01e3, B:121:0x01ed, B:122:0x01f0, B:107:0x01af, B:109:0x01b9, B:111:0x01be, B:148:0x026b, B:149:0x0270), top: B:172:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023d A[Catch: all -> 0x0246, TryCatch #3 {all -> 0x0246, blocks: (B:132:0x0237, B:134:0x023d, B:137:0x024b, B:139:0x024f, B:142:0x025b, B:143:0x0260), top: B:168:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024b A[Catch: all -> 0x0246, TryCatch #3 {all -> 0x0246, blocks: (B:132:0x0237, B:134:0x023d, B:137:0x024b, B:139:0x024f, B:142:0x025b, B:143:0x0260), top: B:168:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [xqc] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [x3d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [w27] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.w27 r21, int r22, defpackage.pu2 r23) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqc.c(w27, int, pu2):java.lang.Object");
    }

    public final qn9 d() {
        return (qn9) this.a.c.getValue();
    }

    public final void e(uw4 uw4Var, z9f z9fVar, cz4 cz4Var) {
        w27 w27Var = uw4Var.b;
        if (z9fVar instanceof ssf) {
            fsf fsfVarA = ((fsf.a) r55.a(w27Var, z27.b)).a((ssf) z9fVar, uw4Var);
            if (!(fsfVarA instanceof nka)) {
                cz4Var.getClass();
                fsfVarA.a();
            }
        }
        cz4Var.getClass();
        w27.d dVar = w27Var.d;
        if (dVar != null) {
            dVar.a(uw4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.mye r4, defpackage.z9f r5, defpackage.cz4 r6) {
        /*
            r3 = this;
            w27 r3 = r4.b
            k07 r0 = r4.a
            boolean r1 = r5 instanceof defpackage.ssf
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L28
            goto L1e
        Lb:
            q55$b<fsf$a> r1 = defpackage.z27.b
            java.lang.Object r1 = defpackage.r55.a(r3, r1)
            fsf$a r1 = (fsf.a) r1
            r2 = r5
            ssf r2 = (defpackage.ssf) r2
            fsf r4 = r1.a(r2, r4)
            boolean r1 = r4 instanceof defpackage.nka
            if (r1 == 0) goto L22
        L1e:
            r5.c(r0)
            goto L28
        L22:
            r6.getClass()
            r4.a()
        L28:
            r6.getClass()
            w27$d r3 = r3.d
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqc.f(mye, z9f, cz4):void");
    }
}
