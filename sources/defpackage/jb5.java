package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.z91;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jb5 implements vc4, z91.a, ks2 {
    public final Path a;
    public final ij8 b;
    public final ba1 c;
    public final boolean d;
    public final ArrayList e;
    public final ia2 f;
    public final yh7 g;
    public final j79 h;
    public final z91<Float, Float> i;
    public float j;

    public jb5(j79 j79Var, ba1 ba1Var, lce lceVar) {
        Path path = new Path();
        this.a = path;
        this.b = new ij8(1);
        this.e = new ArrayList();
        this.c = ba1Var;
        fc0 fc0Var = lceVar.e;
        cc0 cc0Var = lceVar.d;
        this.d = lceVar.f;
        this.h = j79Var;
        if (ba1Var.l() != null) {
            di5 di5VarT = ((dc0) ba1Var.l().a).t();
            this.i = di5VarT;
            di5VarT.a(this);
            ba1Var.f(this.i);
        }
        if (cc0Var == null) {
            this.f = null;
            this.g = null;
            return;
        }
        path.setFillType(lceVar.b);
        z91<Integer, Integer> z91VarT = cc0Var.t();
        this.f = (ia2) z91VarT;
        z91VarT.a(this);
        ba1Var.f(z91VarT);
        z91<Integer, Integer> z91VarT2 = fc0Var.t();
        this.g = (yh7) z91VarT2;
        z91VarT2.a(this);
        ba1Var.f(z91VarT2);
    }

    @Override // z91.a
    public final void a() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ks2 ks2Var = list2.get(i);
            if (ks2Var instanceof a6b) {
                this.e.add((a6b) ks2Var);
            }
        }
    }

    @Override // defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((a6b) arrayList.get(i)).c(), matrix);
                i++;
            }
        }
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
    @Override // defpackage.vc4
    public final void h(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        MaskFilter maskFilter;
        if (this.d) {
            return;
        }
        ia2 ia2Var = this.f;
        float fIntValue = this.g.e().intValue() / 100.0f;
        int iC = (du9.c((int) (i * fIntValue)) << 24) | (ia2Var.j(ia2Var.c.b(), ia2Var.c()) & 16777215);
        ij8 ij8Var = this.b;
        ij8Var.setColor(iC);
        z91<Float, Float> z91Var = this.i;
        if (z91Var != null) {
            float fFloatValue = z91Var.e().floatValue();
            if (fFloatValue == 0.0f) {
                ij8Var.setMaskFilter(null);
            } else if (fFloatValue != this.j) {
                ba1 ba1Var = this.c;
                if (ba1Var.A == fFloatValue) {
                    maskFilter = ba1Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    ba1Var.B = blurMaskFilter;
                    ba1Var.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                ij8Var.setMaskFilter(maskFilter);
            }
            this.j = fFloatValue;
        }
        if (hd4Var != null) {
            hd4Var.a((int) (fIntValue * 255.0f), ij8Var);
        } else {
            ij8Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, ij8Var);
                return;
            } else {
                path.addPath(((a6b) arrayList.get(i2)).c(), matrix);
                i2++;
            }
        }
    }
}
