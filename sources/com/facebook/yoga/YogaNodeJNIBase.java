package com.facebook.yoga;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.facebook.yoga.a;
import defpackage.a6h;
import defpackage.b0;
import defpackage.b6h;
import defpackage.e6h;
import defpackage.f6h;
import defpackage.g6h;
import defpackage.g84;
import defpackage.i6h;
import defpackage.j6h;
import defpackage.k6h;
import defpackage.l5;
import defpackage.l6h;
import defpackage.loc;
import defpackage.m6h;
import defpackage.mpc;
import defpackage.p6;
import defpackage.p6h;
import defpackage.q6h;
import defpackage.r6;
import defpackage.r6h;
import defpackage.s6h;
import defpackage.vk3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@g84
public abstract class YogaNodeJNIBase extends a implements Cloneable {
    public loc V;
    public boolean W;
    public YogaNodeJNIBase a;

    @g84
    private float[] arr;
    public b6h b;
    public ArrayList c;
    public l6h d;
    public vk3 e;
    public long f;

    @g84
    private int mLayoutDirection;

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.W = true;
        if (j != 0) {
            this.f = j;
        } else {
            r6.g("Failed to allocate native memory");
            throw null;
        }
    }

    public static YogaValue n0(long j) {
        r6h r6hVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        switch (i) {
            case 0:
                r6hVar = r6h.UNDEFINED;
                break;
            case 1:
                r6hVar = r6h.POINT;
                break;
            case 2:
                r6hVar = r6h.PERCENT;
                break;
            case 3:
                r6hVar = r6h.AUTO;
                break;
            case 4:
                r6hVar = r6h.MAX_CONTENT;
                break;
            case 5:
                r6hVar = r6h.FIT_CONTENT;
                break;
            case 6:
                r6hVar = r6h.STRETCH;
                break;
            default:
                l5.q(p6.c(i, "Unknown enum value: "));
                return null;
        }
        return new YogaValue(fIntBitsToFloat, r6hVar);
    }

    @g84
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            r6.g("Cannot replace child. YogaNode does not have children");
            return 0L;
        }
        arrayList.remove(i);
        this.c.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.a = this;
        return yogaNodeJNIBase.f;
    }

    @Override // com.facebook.yoga.a
    public final void A(loc locVar) {
        this.V = locVar;
    }

    @Override // com.facebook.yoga.a
    public final void B() {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f, e6h.RTL.a());
    }

    @Override // com.facebook.yoga.a
    public final void C(f6h f6hVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f, f6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void D(float f) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void E(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void F() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f);
    }

    @Override // com.facebook.yoga.a
    public final void G(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void H(i6h i6hVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f, i6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void I(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void J(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void K(j6h j6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f, j6hVar.a(), f);
    }

    @Override // com.facebook.yoga.a
    public final void L(j6h j6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f, j6hVar.a(), f);
    }

    @Override // com.facebook.yoga.a
    public final void M(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void O() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f);
    }

    @Override // com.facebook.yoga.a
    public final void P(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void Q(k6h k6hVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f, k6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void R(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f, g6hVar.c(), f);
    }

    @Override // com.facebook.yoga.a
    public final void S(g6h g6hVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f, g6hVar.c());
    }

    @Override // com.facebook.yoga.a
    public final void T(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f, g6hVar.c(), f);
    }

    @Override // com.facebook.yoga.a
    public final void U(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void V(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void W(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void X(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void Y(l6h l6hVar) {
        this.d = l6hVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f, true);
    }

    @Override // com.facebook.yoga.a
    public final void Z(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void a0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void b0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f, f);
    }

    @g84
    public final float baseline(float f, float f2) {
        mpc mpcVar = (mpc) this.e.b;
        SpannableStringBuilder spannableStringBuilder = mpcVar.P0;
        if (spannableStringBuilder != null) {
            Layout layoutO0 = mpcVar.o0(spannableStringBuilder, f, m6h.EXACTLY);
            return layoutO0.getLineBaseline(layoutO0.getLineCount() - 1);
        }
        r6.g("Spannable element has not been prepared in onBeforeLayout");
        return 0.0f;
    }

    @Override // com.facebook.yoga.a
    public final void c(a aVar, int i) {
        if (aVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) aVar;
            if (yogaNodeJNIBase.a != null) {
                r6.g("Child already has a parent, it must be removed first.");
                return;
            }
            if (this.c == null) {
                this.c = new ArrayList(4);
            }
            this.c.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f, yogaNodeJNIBase.f, i);
        }
    }

    @Override // com.facebook.yoga.a
    public final void c0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void d(float f, float f2) {
        Object obj = this.V;
        if (obj instanceof a.InterfaceC0146a) {
            ((a.InterfaceC0146a) obj).freeze();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList<YogaNodeJNIBase> arrayList2 = ((YogaNodeJNIBase) arrayList.get(i)).c;
            if (arrayList2 != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase : arrayList2) {
                    Object obj2 = yogaNodeJNIBase.V;
                    if (obj2 instanceof a.InterfaceC0146a) {
                        ((a.InterfaceC0146a) obj2).freeze();
                    }
                    arrayList.add(yogaNodeJNIBase);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.a
    public final void d0(p6h p6hVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f, p6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void e() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f);
    }

    @Override // com.facebook.yoga.a
    public final void e0(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f, g6hVar.c(), f);
    }

    @Override // com.facebook.yoga.a
    public final YogaValue f() {
        return n0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f));
    }

    @Override // com.facebook.yoga.a
    public final void f0(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f, g6hVar.c(), f);
    }

    @Override // com.facebook.yoga.a
    public final e6h g() {
        float[] fArr = this.arr;
        int i = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        if (i == 0) {
            return e6h.INHERIT;
        }
        if (i == 1) {
            return e6h.LTR;
        }
        if (i == 2) {
            return e6h.RTL;
        }
        l5.q(p6.c(i, "Unknown enum value: "));
        return null;
    }

    @Override // com.facebook.yoga.a
    public final void g0(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f, g6hVar.c(), f);
    }

    @Override // com.facebook.yoga.a
    public final float h() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.a
    public final void h0(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f, g6hVar.c(), f);
    }

    @Override // com.facebook.yoga.a
    public final float i(g6h g6hVar) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = (int) fArr[0];
            if ((i & 2) == 2) {
                int i2 = (i & 1) != 1 ? 4 : 0;
                int i3 = 10 - i2;
                int iOrdinal = g6hVar.ordinal();
                if (iOrdinal == 0) {
                    return this.arr[i3];
                }
                if (iOrdinal == 1) {
                    return this.arr[11 - i2];
                }
                if (iOrdinal == 2) {
                    return this.arr[12 - i2];
                }
                if (iOrdinal == 3) {
                    return this.arr[13 - i2];
                }
                e6h e6hVar = e6h.RTL;
                if (iOrdinal == 4) {
                    e6h e6hVarG = g();
                    float[] fArr2 = this.arr;
                    return e6hVarG == e6hVar ? fArr2[12 - i2] : fArr2[i3];
                }
                if (iOrdinal != 5) {
                    l5.q("Cannot get layout paddings of multi-edge shorthands");
                    return 0.0f;
                }
                e6h e6hVarG2 = g();
                float[] fArr3 = this.arr;
                return e6hVarG2 == e6hVar ? fArr3[i3] : fArr3[12 - i2];
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.a
    public final void i0(q6h q6hVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f, q6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.a
    public final void j0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.a
    public final void k0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f);
    }

    @Override // com.facebook.yoga.a
    public final float l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.a
    public final void l0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final YogaValue m() {
        return n0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f));
    }

    @Override // com.facebook.yoga.a
    public final void m0(s6h s6hVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f, s6hVar.a());
    }

    @g84
    public final long measure(float f, int i, float f2, int i2) {
        if (p()) {
            return this.d.N(this, f, m6h.a(i), f2, m6h.a(i2));
        }
        b0.o("Measure function isn't defined!");
        return 0L;
    }

    @Override // com.facebook.yoga.a
    public final boolean n() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.W;
    }

    @Override // com.facebook.yoga.a
    public final boolean o() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f);
    }

    @Override // com.facebook.yoga.a
    public final boolean p() {
        return this.d != null;
    }

    @Override // com.facebook.yoga.a
    public final void q() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.W = false;
    }

    @Override // com.facebook.yoga.a
    public final YogaNodeJNIBase r(int i) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            r6.g("Trying to remove a child of a YogaNode that does not have children");
            return null;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.remove(i);
        yogaNodeJNIBase.a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f, yogaNodeJNIBase.f);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.a
    public final void t() {
        this.d = null;
        this.e = null;
        this.V = null;
        this.arr = null;
        this.W = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f);
    }

    @Override // com.facebook.yoga.a
    public final void u(a6h a6hVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f, a6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void v(a6h a6hVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f, a6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void w(a6h a6hVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f, a6hVar.a());
    }

    @Override // com.facebook.yoga.a
    public final void x(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f, f);
    }

    @Override // com.facebook.yoga.a
    public final void y(vk3 vk3Var) {
        this.e = vk3Var;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f, vk3Var != null);
    }

    @Override // com.facebook.yoga.a
    public final void z(g6h g6hVar, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f, g6hVar.c(), f);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
