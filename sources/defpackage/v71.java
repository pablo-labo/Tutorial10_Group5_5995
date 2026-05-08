package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v71 {
    public static final void a(View view, Canvas canvas) {
        RectF rectFJ;
        cn2 cn2VarC;
        q03 q03Var;
        q03 q03Var2;
        q03 q03Var3;
        q03 q03Var4;
        q03 q03Var5;
        q03 q03Var6;
        q03 q03Var7;
        q03 q03Var8;
        canvas.getClass();
        Path path = null;
        if (!ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            tl2 tl2VarH = h(view);
            cs1 cs1Var = tl2VarH != null ? tl2VarH.d : null;
            if (cs1Var == null) {
                canvas.clipRect(rect);
                return;
            }
            if (cs1Var.y.b()) {
                cs1Var.k();
                Path path2 = cs1Var.e;
                path2.getClass();
                path = new Path(path2);
            }
            if (path != null) {
                path.offset(rect.left, rect.top);
                canvas.clipPath(path);
                return;
            } else {
                RectF rectFE = cs1Var.e();
                RectF rectF = new RectF(rectFE.left, rectFE.top, cs1Var.getBounds().width() - rectFE.right, cs1Var.getBounds().height() - rectFE.bottom);
                rectF.offset(rect.left, rect.top);
                canvas.clipRect(rectF);
                return;
            }
        }
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        tl2 tl2VarH2 = h(view);
        if (tl2VarH2 == null) {
            canvas.clipRect(rect2);
            return;
        }
        RectF rectF2 = new RectF();
        r7i r7iVar = tl2VarH2.Y;
        if (r7iVar != null) {
            int layoutDirection = tl2VarH2.getLayoutDirection();
            Context context = view.getContext();
            context.getClass();
            rectFJ = r7iVar.j(context, layoutDirection);
        } else {
            rectFJ = null;
        }
        rectF2.left = tl2VarH2.getBounds().left + (rectFJ != null ? nn2.G(rectFJ.left) : 0.0f);
        rectF2.top = tl2VarH2.getBounds().top + (rectFJ != null ? nn2.G(rectFJ.top) : 0.0f);
        rectF2.right = tl2VarH2.getBounds().right - (rectFJ != null ? nn2.G(rectFJ.right) : 0.0f);
        rectF2.bottom = tl2VarH2.getBounds().bottom - (rectFJ != null ? nn2.G(rectFJ.bottom) : 0.0f);
        aj1 aj1Var = tl2VarH2.Z;
        if (aj1Var == null || !aj1Var.b()) {
            rectF2.offset(rect2.left, rect2.top);
            canvas.clipRect(rectF2);
            return;
        }
        aj1 aj1Var2 = tl2VarH2.Z;
        if (aj1Var2 != null) {
            int layoutDirection2 = tl2VarH2.getLayoutDirection();
            Context context2 = view.getContext();
            context2.getClass();
            cn2VarC = aj1Var2.c(layoutDirection2, context2, nn2.C(tl2VarH2.getBounds().width()), nn2.C(tl2VarH2.getBounds().height()));
        } else {
            cn2VarC = null;
        }
        Path path3 = new Path();
        path3.addRoundRect(rectF2, new float[]{i((cn2VarC == null || (q03Var8 = cn2VarC.a) == null) ? null : Float.valueOf(nn2.G(q03Var8.a)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.left)) : null), i((cn2VarC == null || (q03Var7 = cn2VarC.a) == null) ? null : Float.valueOf(nn2.G(q03Var7.b)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.top)) : null), i((cn2VarC == null || (q03Var6 = cn2VarC.b) == null) ? null : Float.valueOf(nn2.G(q03Var6.a)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.right)) : null), i((cn2VarC == null || (q03Var5 = cn2VarC.b) == null) ? null : Float.valueOf(nn2.G(q03Var5.b)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.top)) : null), i((cn2VarC == null || (q03Var4 = cn2VarC.d) == null) ? null : Float.valueOf(nn2.G(q03Var4.a)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.right)) : null), i((cn2VarC == null || (q03Var3 = cn2VarC.d) == null) ? null : Float.valueOf(nn2.G(q03Var3.b)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.bottom)) : null), i((cn2VarC == null || (q03Var2 = cn2VarC.c) == null) ? null : Float.valueOf(nn2.G(q03Var2.a)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.left)) : null), i((cn2VarC == null || (q03Var = cn2VarC.c) == null) ? null : Float.valueOf(nn2.G(q03Var.b)), rectFJ != null ? Float.valueOf(nn2.G(rectFJ.bottom)) : null)}, Path.Direction.CW);
        path3.offset(rect2.left, rect2.top);
        canvas.clipPath(path3);
    }

    public static p71 b(View view) {
        tl2 tl2VarE = e(view);
        p71 p71Var = tl2VarE.e;
        if (p71Var != null) {
            return p71Var;
        }
        Context context = view.getContext();
        context.getClass();
        p71 p71Var2 = new p71(context, tl2VarE.Z, tl2VarE.Y);
        view.setBackground(new tl2(tl2VarE.a, tl2VarE.b, tl2VarE.c, tl2VarE.d, p71Var2, tl2VarE.f, tl2VarE.V, tl2VarE.W, tl2VarE.X, tl2VarE.Y, tl2VarE.Z));
        return p71Var2;
    }

    public static ri1 c(View view) {
        tl2 tl2VarE = e(view);
        ri1 ri1Var = tl2VarE.f;
        if (ri1Var != null) {
            return ri1Var;
        }
        Context context = view.getContext();
        context.getClass();
        ri1 ri1Var2 = new ri1(context, new coe(0.0f), tl2VarE.Z, tl2VarE.Y);
        view.setBackground(new tl2(tl2VarE.a, tl2VarE.b, tl2VarE.c, tl2VarE.d, tl2VarE.e, ri1Var2, tl2VarE.V, tl2VarE.W, tl2VarE.X, tl2VarE.Y, tl2VarE.Z));
        return ri1Var2;
    }

    public static cs1 d(View view) {
        tl2 tl2VarE = e(view);
        cs1 cs1Var = tl2VarE.d;
        if (cs1Var != null) {
            return cs1Var;
        }
        cs1 cs1Var2 = new cs1(view.getContext());
        view.setBackground(new tl2(tl2VarE.a, tl2VarE.b, tl2VarE.c, cs1Var2, tl2VarE.e, tl2VarE.f, tl2VarE.V, tl2VarE.W, tl2VarE.X, tl2VarE.Y, tl2VarE.Z));
        return cs1Var2;
    }

    public static tl2 e(View view) {
        if (view.getBackground() instanceof tl2) {
            Drawable background = view.getBackground();
            background.getClass();
            return (tl2) background;
        }
        Context context = view.getContext();
        context.getClass();
        Drawable background2 = view.getBackground();
        zr4 zr4Var = zr4.a;
        tl2 tl2Var = new tl2(context, background2, zr4Var, null, null, null, null, zr4Var, null, null, null);
        view.setBackground(tl2Var);
        return tl2Var;
    }

    public static kwa f(View view) {
        tl2 tl2VarE = e(view);
        kwa kwaVar = tl2VarE.X;
        if (kwaVar != null) {
            return kwaVar;
        }
        aj1 aj1Var = ie7.g0.enableNewBackgroundAndBorderDrawables() ? tl2VarE.Z : d(view).y;
        Context context = view.getContext();
        context.getClass();
        kwa kwaVar2 = new kwa(context, aj1Var);
        view.setBackground(new tl2(tl2VarE.a, tl2VarE.b, tl2VarE.c, tl2VarE.d, tl2VarE.e, tl2VarE.f, tl2VarE.V, tl2VarE.W, kwaVar2, tl2VarE.Y, tl2VarE.Z));
        return kwaVar2;
    }

    public static final Integer g(View view) {
        if (ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            tl2 tl2VarH = h(view);
            p71 p71Var = tl2VarH != null ? tl2VarH.e : null;
            if (p71Var != null) {
                return Integer.valueOf(p71Var.h);
            }
        } else {
            tl2 tl2VarH2 = h(view);
            cs1 cs1Var = tl2VarH2 != null ? tl2VarH2.d : null;
            if (cs1Var != null) {
                return Integer.valueOf(cs1Var.v);
            }
        }
        return null;
    }

    public static tl2 h(View view) {
        Drawable background = view.getBackground();
        if (background instanceof tl2) {
            return (tl2) background;
        }
        return null;
    }

    public static float i(Float f, Float f2) {
        float fFloatValue = (f != null ? f.floatValue() : 0.0f) - (f2 != null ? f2.floatValue() : 0.0f);
        if (fFloatValue < 0.0f) {
            return 0.0f;
        }
        return fFloatValue;
    }

    public static final void j(View view, Integer num) {
        view.getClass();
        if ((num == null || num.intValue() == 0) && !(view.getBackground() instanceof tl2)) {
            return;
        }
        if (!ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            cs1 cs1VarD = d(view);
            cs1VarD.v = num != null ? num.intValue() : 0;
            cs1VarD.invalidateSelf();
            return;
        }
        p71 p71VarB = b(view);
        int iIntValue = num != null ? num.intValue() : 0;
        if (p71VarB.h != iIntValue) {
            p71VarB.h = iIntValue;
            p71VarB.l.setColor(iIntValue);
            p71VarB.invalidateSelf();
        }
    }

    public static final void k(tpc tpcVar, ArrayList arrayList) {
        tpcVar.getClass();
        if (!ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            cs1 cs1VarD = d(tpcVar);
            cs1VarD.w = arrayList;
            cs1VarD.invalidateSelf();
        } else {
            p71 p71VarB = b(tpcVar);
            if (wl7.b(p71VarB.k, arrayList)) {
                return;
            }
            p71VarB.k = arrayList;
            p71VarB.invalidateSelf();
        }
    }

    public static final void l(View view, o49 o49Var, Integer num) {
        view.getClass();
        o49Var.getClass();
        if (ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            ri1 ri1VarC = c(view);
            Integer[] numArr = ri1VarC.f;
            if (numArr == null) {
                numArr = new Integer[o49.values().length];
            }
            ri1VarC.f = numArr;
            numArr[o49Var.ordinal()] = num;
            ri1VarC.m = true;
            ri1VarC.invalidateSelf();
            return;
        }
        cs1 cs1VarD = d(view);
        int iA = o49Var.a();
        float fIntValue = num == null ? Float.NaN : num.intValue() & 16777215;
        float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        if (cs1VarD.b == null) {
            cs1VarD.b = new coe(0.0f);
        }
        if (!pyd.t(cs1VarD.b.b[iA], fIntValue)) {
            cs1VarD.b.b(fIntValue, iA);
            cs1VarD.invalidateSelf();
        }
        if (cs1VarD.c == null) {
            cs1VarD.c = new coe(255.0f);
        }
        if (!pyd.t(cs1VarD.c.b[iA], fIntValue2)) {
            cs1VarD.c.b(fIntValue2, iA);
            cs1VarD.invalidateSelf();
        }
        cs1VarD.t = true;
    }

    public static final void m(View view, zi1 zi1Var, ou8 ou8Var) {
        ou8 ou8Var2;
        view.getClass();
        zi1Var.getClass();
        tl2 tl2VarE = e(view);
        ri1 ri1Var = tl2VarE.f;
        aj1 aj1Var = tl2VarE.Z;
        if (aj1Var == null) {
            aj1Var = new aj1(0);
        }
        tl2VarE.Z = aj1Var;
        aj1Var.d(zi1Var, ou8Var);
        if (ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            if (view instanceof ImageView) {
                b(view);
            }
            p71 p71Var = tl2VarE.e;
            if (p71Var != null) {
                p71Var.b = tl2VarE.Z;
            }
            if (ri1Var != null) {
                ri1Var.c = tl2VarE.Z;
            }
            if (p71Var != null) {
                p71Var.invalidateSelf();
            }
            if (ri1Var != null) {
                ri1Var.invalidateSelf();
            }
        } else {
            cs1 cs1VarD = d(view);
            aj1 aj1Var2 = cs1VarD.y;
            aj1Var2.getClass();
            switch (zi1Var.ordinal()) {
                case 0:
                    ou8Var2 = aj1Var2.a;
                    break;
                case 1:
                    ou8Var2 = aj1Var2.b;
                    break;
                case 2:
                    ou8Var2 = aj1Var2.c;
                    break;
                case 3:
                    ou8Var2 = aj1Var2.e;
                    break;
                case 4:
                    ou8Var2 = aj1Var2.d;
                    break;
                case 5:
                    ou8Var2 = aj1Var2.f;
                    break;
                case 6:
                    ou8Var2 = aj1Var2.g;
                    break;
                case 7:
                    ou8Var2 = aj1Var2.h;
                    break;
                case 8:
                    ou8Var2 = aj1Var2.i;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    ou8Var2 = aj1Var2.m;
                    break;
                case 10:
                    ou8Var2 = aj1Var2.l;
                    break;
                case 11:
                    ou8Var2 = aj1Var2.k;
                    break;
                case 12:
                    ou8Var2 = aj1Var2.j;
                    break;
                default:
                    l.g();
                    return;
            }
            if (!Objects.equals(ou8Var, ou8Var2)) {
                aj1Var2.d(zi1Var, ou8Var);
                cs1VarD.t = true;
                cs1VarD.invalidateSelf();
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            List<Drawable> list = tl2VarE.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof exa) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((exa) it.next()).f = tl2VarE.Z;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> list2 = tl2VarE.W;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof if7) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((if7) it2.next()).h = tl2VarE.Z;
            }
        }
        kwa kwaVar = tl2VarE.X;
        if (kwaVar != null) {
            kwaVar.b = tl2VarE.Z;
        }
        tl2VarE.invalidateSelf();
    }

    public static final void n(View view, cj1 cj1Var) {
        view.getClass();
        if (ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            ri1 ri1VarC = c(view);
            ri1VarC.e.c(ri1.z[0], ri1VarC, cj1Var);
            return;
        }
        cs1 cs1VarD = d(view);
        if (cs1VarD.d != cj1Var) {
            cs1VarD.d = cj1Var;
            cs1VarD.t = true;
            cs1VarD.invalidateSelf();
        }
    }

    public static final void o(View view, o49 o49Var, Float f) {
        view.getClass();
        o49Var.getClass();
        tl2 tl2VarE = e(view);
        ri1 ri1Var = tl2VarE.f;
        r7i r7iVar = tl2VarE.Y;
        if (r7iVar == null) {
            r7iVar = new r7i(1);
        }
        tl2VarE.Y = r7iVar;
        ((Float[]) r7iVar.a)[o49Var.ordinal()] = f;
        if (ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            ri1 ri1VarC = c(view);
            int iA = o49Var.a();
            float fG = nn2.G(f.floatValue());
            coe coeVar = ri1VarC.b;
            Float fValueOf = coeVar != null ? Float.valueOf(coeVar.b[iA]) : null;
            if (!(fValueOf == null ? false : pyd.t(fValueOf.floatValue(), fG))) {
                if (coeVar != null) {
                    coeVar.b(fG, iA);
                }
                if (iA == 0 || iA == 1 || iA == 2 || iA == 3 || iA == 4 || iA == 5 || iA == 8) {
                    ri1VarC.m = true;
                }
                ri1VarC.invalidateSelf();
            }
            p71 p71Var = tl2VarE.e;
            if (p71Var != null) {
                p71Var.c = tl2VarE.Y;
            }
            if (ri1Var != null) {
                ri1Var.d = tl2VarE.Y;
            }
            if (p71Var != null) {
                p71Var.invalidateSelf();
            }
            if (ri1Var != null) {
                ri1Var.invalidateSelf();
            }
        } else {
            cs1 cs1VarD = d(view);
            int iA2 = o49Var.a();
            float fG2 = nn2.G(f.floatValue());
            if (cs1VarD.a == null) {
                cs1VarD.a = new coe(0.0f, new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN});
            }
            if (!pyd.t(cs1VarD.a.b[iA2], fG2)) {
                cs1VarD.a.b(fG2, iA2);
                if (iA2 == 0 || iA2 == 1 || iA2 == 2 || iA2 == 3 || iA2 == 4 || iA2 == 5 || iA2 == 8) {
                    cs1VarD.t = true;
                }
                cs1VarD.invalidateSelf();
            }
        }
        r7i r7iVar2 = tl2VarE.Y;
        if (r7iVar2 == null) {
            r7iVar2 = new r7i(1);
        }
        tl2VarE.Y = r7iVar2;
        ((Float[]) r7iVar2.a)[o49Var.ordinal()] = f;
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> list = tl2VarE.W;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof if7) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((if7) it.next()).g = tl2VarE.Y;
            }
        }
    }

    public static final void p(View view, List<nl1> list) {
        aj1 aj1Var;
        r7i r7iVar;
        view.getClass();
        if (msb.e(view.getId()) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        tl2 tl2VarE = e(view);
        r7i r7iVar2 = tl2VarE.Y;
        aj1 aj1Var2 = tl2VarE.Z;
        for (nl1 nl1Var : list) {
            float f = nl1Var.a;
            float f2 = nl1Var.b;
            Integer num = nl1Var.c;
            int iIntValue = num != null ? num.intValue() : -16777216;
            Float f3 = nl1Var.d;
            float fFloatValue = f3 != null ? f3.floatValue() : 0.0f;
            Float f4 = nl1Var.e;
            float fFloatValue2 = f4 != null ? f4.floatValue() : 0.0f;
            Boolean bool = nl1Var.f;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (!zBooleanValue || Build.VERSION.SDK_INT < 29) {
                aj1Var = aj1Var2;
                r7iVar = r7iVar2;
                if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                    Context context = view.getContext();
                    context.getClass();
                    arrayList2.add(new exa(context, iIntValue, f, f2, fFloatValue, fFloatValue2, aj1Var));
                }
            } else {
                Context context2 = view.getContext();
                context2.getClass();
                aj1 aj1Var3 = aj1Var2;
                r7i r7iVar3 = r7iVar2;
                if7 if7Var = new if7(context2, iIntValue, f, f2, fFloatValue, fFloatValue2, r7iVar3, aj1Var3);
                r7iVar = r7iVar3;
                aj1Var = aj1Var3;
                arrayList.add(if7Var);
            }
            r7iVar2 = r7iVar;
            aj1Var2 = aj1Var;
        }
        tl2 tl2VarE2 = e(view);
        view.setBackground(new tl2(tl2VarE2.a, tl2VarE2.b, arrayList2, tl2VarE2.d, tl2VarE2.e, tl2VarE2.f, tl2VarE2.V, arrayList, tl2VarE2.X, tl2VarE2.Y, tl2VarE2.Z));
    }

    public static final void q(tpc tpcVar, Drawable drawable) {
        tpcVar.getClass();
        if (ie7.g0.enableNewBackgroundAndBorderDrawables()) {
            tl2 tl2VarE = e(tpcVar);
            new tl2(tl2VarE.a, tl2VarE.b, tl2VarE.c, tl2VarE.d, tl2VarE.e, tl2VarE.f, drawable, tl2VarE.W, tl2VarE.X, tl2VarE.Y, tl2VarE.Z);
        } else {
            tl2 tl2VarE2 = e(tpcVar);
            tpcVar.setBackground(new tl2(tl2VarE2.a, tl2VarE2.b, tl2VarE2.c, tl2VarE2.d, tl2VarE2.e, tl2VarE2.f, drawable, tl2VarE2.W, tl2VarE2.X, tl2VarE2.Y, tl2VarE2.Z));
        }
    }
}
