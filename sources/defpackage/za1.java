package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import defpackage.z91;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class za1 implements z91.a, ks2, vc4 {
    public final j79 e;
    public final ba1 f;
    public final float[] h;
    public final ij8 i;
    public final di5 j;
    public final yh7 k;
    public final ArrayList l;
    public final di5 m;
    public final z91<Float, Float> n;
    public float o;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public static final class a {
        public final ArrayList a = new ArrayList();
        public final juf b;

        public a(juf jufVar) {
            this.b = jufVar;
        }
    }

    public za1(j79 j79Var, ba1 ba1Var, Paint.Cap cap, Paint.Join join, float f, fc0 fc0Var, dc0 dc0Var, ArrayList arrayList, dc0 dc0Var2) {
        ij8 ij8Var = new ij8(1);
        this.i = ij8Var;
        this.o = 0.0f;
        this.e = j79Var;
        this.f = ba1Var;
        ij8Var.setStyle(Paint.Style.STROKE);
        ij8Var.setStrokeCap(cap);
        ij8Var.setStrokeJoin(join);
        ij8Var.setStrokeMiter(f);
        this.k = (yh7) fc0Var.t();
        this.j = dc0Var.t();
        if (dc0Var2 == null) {
            this.m = null;
        } else {
            this.m = dc0Var2.t();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((dc0) arrayList.get(i)).t());
        }
        ba1Var.f(this.k);
        ba1Var.f(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            ba1Var.f((z91) this.l.get(i2));
        }
        di5 di5Var = this.m;
        if (di5Var != null) {
            ba1Var.f(di5Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((z91) this.l.get(i3)).a(this);
        }
        di5 di5Var2 = this.m;
        if (di5Var2 != null) {
            di5Var2.a(this);
        }
        if (ba1Var.l() != null) {
            di5 di5VarT = ((dc0) ba1Var.l().a).t();
            this.n = di5VarT;
            di5VarT.a(this);
            ba1Var.f(this.n);
        }
    }

    @Override // z91.a
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // defpackage.ks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<defpackage.ks2> r8, java.util.List<defpackage.ks2> r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            ade$a r3 = ade.a.b
            if (r0 < 0) goto L22
            java.lang.Object r4 = r8.get(r0)
            ks2 r4 = (defpackage.ks2) r4
            boolean r5 = r4 instanceof defpackage.juf
            if (r5 == 0) goto L1f
            juf r4 = (defpackage.juf) r4
            ade$a r5 = r4.c
            if (r5 != r3) goto L1f
            r2 = r4
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.f(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L66
            java.lang.Object r4 = r9.get(r8)
            ks2 r4 = (defpackage.ks2) r4
            boolean r5 = r4 instanceof defpackage.juf
            if (r5 == 0) goto L51
            r5 = r4
            juf r5 = (defpackage.juf) r5
            ade$a r6 = r5.c
            if (r6 != r3) goto L51
            if (r1 == 0) goto L47
            r0.add(r1)
        L47:
            za1$a r0 = new za1$a
            r0.<init>(r5)
            r5.f(r7)
            r1 = r0
            goto L63
        L51:
            boolean r0 = r4 instanceof defpackage.a6b
            if (r0 == 0) goto L63
            if (r1 != 0) goto L5c
            za1$a r1 = new za1$a
            r1.<init>(r2)
        L5c:
            java.util.ArrayList r0 = r1.a
            a6b r4 = (defpackage.a6b) r4
            r0.add(r4)
        L63:
            int r8 = r8 + (-1)
            goto L2d
        L66:
            if (r1 == 0) goto L6b
            r0.add(r1)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za1.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fJ = this.j.j() / 2.0f;
                rectF2.set(rectF2.left - fJ, rectF2.top - fJ, rectF2.right + fJ, rectF2.bottom + fJ);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i2 = 0; i2 < aVar.a.size(); i2++) {
                path.addPath(((a6b) aVar.a.get(i2)).c(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, defpackage.hd4 r24) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za1.h(android.graphics.Canvas, android.graphics.Matrix, int, hd4):void");
    }
}
