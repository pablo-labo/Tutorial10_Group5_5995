package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import defpackage.ho5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tyf {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static final to5 a(int i) {
        if (i >= 0 && i < 150) {
            to5 to5Var = to5.b;
            return to5.b;
        }
        if (150 <= i && i < 250) {
            to5 to5Var2 = to5.b;
            return to5.c;
        }
        if (250 <= i && i < 350) {
            to5 to5Var3 = to5.b;
            return to5.d;
        }
        if (350 <= i && i < 450) {
            to5 to5Var4 = to5.b;
            return to5.e;
        }
        if (450 <= i && i < 550) {
            to5 to5Var5 = to5.b;
            return to5.f;
        }
        if (550 <= i && i < 650) {
            to5 to5Var6 = to5.b;
            return to5.V;
        }
        if (650 <= i && i < 750) {
            to5 to5Var7 = to5.b;
            return to5.W;
        }
        if (750 <= i && i < 850) {
            to5 to5Var8 = to5.b;
            return to5.X;
        }
        if (850 > i || i >= 1000) {
            to5 to5Var9 = to5.b;
            return to5.e;
        }
        to5 to5Var10 = to5.b;
        return to5.Y;
    }

    public static long b(TypedArray typedArray, int i) {
        long j = da2.i;
        if (!typedArray.hasValue(i)) {
            return j;
        }
        pnb.r(typedArray, i);
        return pnb.d(typedArray.getColor(i, 0));
    }

    public static final t03 c(TypedArray typedArray, int i) {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i, typedValue2)) {
            return null;
        }
        int i2 = typedValue2.type;
        if (i2 == 5) {
            int complexUnit = typedValue2.getComplexUnit();
            return complexUnit != 0 ? complexUnit != 1 ? new y7b(typedArray.getDimensionPixelSize(i, 0)) : new k94(TypedValue.complexToFloat(typedValue2.data)) : new u8c(TypedValue.complexToFloat(typedValue2.data));
        }
        if (i2 != 6) {
            return null;
        }
        return new u8c(typedValue2.getFraction(1.0f, 1.0f));
    }

    public static final tn5 d(TypedArray typedArray, int i) {
        vn5 vn5Var;
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (typedArray.getValue(i, typedValue2) && typedValue2.type == 3) {
            CharSequence charSequence = typedValue2.string;
            if (wl7.b(charSequence, "sans-serif")) {
                return new tn5(pn5.b);
            }
            if (wl7.b(charSequence, "sans-serif-thin")) {
                return new tn5(pn5.b, to5.Z);
            }
            if (wl7.b(charSequence, "sans-serif-light")) {
                return new tn5(pn5.b, to5.a0);
            }
            if (wl7.b(charSequence, "sans-serif-medium")) {
                return new tn5(pn5.b, to5.c0);
            }
            if (wl7.b(charSequence, "sans-serif-black")) {
                return new tn5(pn5.b, to5.e0);
            }
            if (wl7.b(charSequence, "serif")) {
                return new tn5(pn5.c);
            }
            if (wl7.b(charSequence, "cursive")) {
                return new tn5(pn5.e);
            }
            if (wl7.b(charSequence, "monospace")) {
                return new tn5(pn5.d);
            }
            if (typedValue2.resourceId != 0) {
                CharSequence charSequence2 = typedValue2.string;
                charSequence2.getClass();
                if (zve.l0(charSequence2, "res/")) {
                    CharSequence charSequence3 = typedValue2.string;
                    charSequence3.getClass();
                    int i2 = 0;
                    if (!zve.N(charSequence3, ".xml")) {
                        List listAsList = Arrays.asList(zkd.n(typedValue2.resourceId, to5.b0, 0));
                        listAsList.getClass();
                        return new tn5(new vn5(listAsList));
                    }
                    Resources resources = typedArray.getResources();
                    resources.getClass();
                    XmlResourceParser xml = resources.getXml(typedValue2.resourceId);
                    xml.getClass();
                    try {
                        ho5.a aVarA = ho5.a(xml, resources);
                        if (aVarA instanceof ho5.b) {
                            ho5.c[] cVarArr = ((ho5.b) aVarA).a;
                            cVarArr.getClass();
                            ArrayList arrayList = new ArrayList(cVarArr.length);
                            int length = cVarArr.length;
                            while (i2 < length) {
                                ho5.c cVar = cVarArr[i2];
                                i2++;
                                arrayList.add(zkd.n(cVar.f, a(cVar.b), cVar.c ? 1 : 0));
                            }
                            vn5Var = new vn5(arrayList);
                            xml.close();
                        } else {
                            xml.close();
                            vn5Var = null;
                        }
                        if (vn5Var != null) {
                            return new tn5(vn5Var);
                        }
                    } catch (Throwable th) {
                        xml.close();
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public static final bkf e(TypedArray typedArray, int i, iy3 iy3Var) {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i, typedValue2) || typedValue2.type != 5) {
            return null;
        }
        int complexUnit = typedValue2.getComplexUnit();
        return complexUnit != 1 ? complexUnit != 2 ? new bkf(iy3Var.d0(typedArray.getDimension(i, 0.0f))) : new bkf(hh2.y(4294967296L, TypedValue.complexToFloat(typedValue2.data))) : new bkf(hh2.y(8589934592L, TypedValue.complexToFloat(typedValue2.data)));
    }

    public static final p03 f(Context context, int i, p03 p03Var, vl8 vl8Var) {
        p03 fgdVar;
        p03Var.getClass();
        t03 t03Var = p03Var.d;
        t03 t03Var2 = p03Var.c;
        t03 t03Var3 = p03Var.b;
        t03 t03Var4 = p03Var.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, mac.a);
        typedArrayObtainStyledAttributes.getClass();
        t03 t03VarC = c(typedArrayObtainStyledAttributes, 1);
        t03 t03VarC2 = c(typedArrayObtainStyledAttributes, 4);
        t03 t03VarC3 = c(typedArrayObtainStyledAttributes, 5);
        t03 t03VarC4 = c(typedArrayObtainStyledAttributes, 2);
        t03 t03VarC5 = c(typedArrayObtainStyledAttributes, 3);
        boolean z = vl8Var == vl8.b;
        t03 t03Var5 = z ? t03VarC3 : t03VarC2;
        if (!z) {
            t03VarC2 = t03VarC3;
        }
        t03 t03Var6 = z ? t03VarC5 : t03VarC4;
        if (!z) {
            t03VarC4 = t03VarC5;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i2 == 0) {
            if (t03Var5 == null) {
                t03Var5 = t03VarC;
            }
            if (t03Var5 != null) {
                t03Var4 = t03Var5;
            }
            if (t03VarC2 == null) {
                t03VarC2 = t03VarC;
            }
            if (t03VarC2 != null) {
                t03Var3 = t03VarC2;
            }
            if (t03VarC4 == null) {
                t03VarC4 = t03VarC;
            }
            if (t03VarC4 != null) {
                t03Var2 = t03VarC4;
            }
            if (t03Var6 != null) {
                t03VarC = t03Var6;
            }
            if (t03VarC != null) {
                t03Var = t03VarC;
            }
            fgdVar = new fgd(t03Var4, t03Var3, t03Var2, t03Var);
        } else {
            if (i2 != 1) {
                l5.q("Unknown cornerFamily set in ShapeAppearance");
                return null;
            }
            if (t03Var5 == null) {
                t03Var5 = t03VarC;
            }
            if (t03Var5 != null) {
                t03Var4 = t03Var5;
            }
            if (t03VarC2 == null) {
                t03VarC2 = t03VarC;
            }
            if (t03VarC2 != null) {
                t03Var3 = t03VarC2;
            }
            if (t03VarC4 == null) {
                t03VarC4 = t03VarC;
            }
            if (t03VarC4 != null) {
                t03Var2 = t03VarC4;
            }
            if (t03Var6 != null) {
                t03VarC = t03Var6;
            }
            if (t03VarC != null) {
                t03Var = t03VarC;
            }
            fgdVar = new cc3(t03Var4, t03Var3, t03Var2, t03Var);
        }
        typedArrayObtainStyledAttributes.recycle();
        return fgdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.tjf g(android.content.Context r26, defpackage.iy3 r27, int r28, boolean r29, defpackage.pn5 r30) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyf.g(android.content.Context, iy3, int, boolean, pn5):tjf");
    }
}
