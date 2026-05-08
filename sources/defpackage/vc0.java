package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vc0 {
    public static final vpe<Float> a = zd0.c(0.0f, null, 7);

    static {
        Map<lvf<?, ?>, Float> map = etg.a;
        new j94(0.1f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final ese a(float f, yd0 yd0Var, b bVar, int i) {
        return c(new j94(f), q92.e0, yd0Var, null, "DpAnimation", bVar, (i << 3) & 896, 8);
    }

    public static final ese b(float f, yd0 yd0Var, String str, b bVar, int i, int i2) {
        int i3 = i2 & 2;
        vpe<Float> vpeVar = a;
        if (i3 != 0) {
            yd0Var = vpeVar;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (yd0Var == vpeVar) {
            bVar.L(1144108831);
            boolean zC = bVar.c(0.01f);
            Object objV = bVar.v();
            if (zC || objV == b.a.a) {
                objV = zd0.c(0.0f, Float.valueOf(0.01f), 3);
                bVar.p(objV);
            }
            yd0Var = (vpe) objV;
            bVar.F();
        } else {
            bVar.L(1144218757);
            bVar.F();
        }
        return c(Float.valueOf(f), q92.c0, yd0Var, Float.valueOf(0.01f), str2, bVar, (i << 3) & 57344, 0);
    }

    public static final ese c(Object obj, lvf lvfVar, yd0 yd0Var, Float f, String str, b bVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objV = bVar.v();
        Object obj2 = b.a.a;
        if (objV == obj2) {
            objV = r.f(null);
            bVar.p(objV);
        }
        g4a g4aVar = (g4a) objV;
        Object objV2 = bVar.v();
        if (objV2 == obj2) {
            objV2 = new zb0(obj, lvfVar, f);
            bVar.p(objV2);
        }
        zb0 zb0Var = (zb0) objV2;
        g4a g4aVarG = r.g(null, bVar);
        if (f != null && (yd0Var instanceof vpe)) {
            vpe vpeVar = (vpe) yd0Var;
            if (!wl7.b(vpeVar.c, f)) {
                yd0Var = new vpe(vpeVar.a, vpeVar.b, f);
            }
        }
        g4a g4aVarG2 = r.g(yd0Var, bVar);
        Object objV3 = bVar.v();
        if (objV3 == obj2) {
            objV3 = h22.a(-1, 6, null);
            bVar.p(objV3);
        }
        u12 u12Var = (u12) objV3;
        boolean zX = bVar.x(u12Var) | bVar.x(obj);
        Object objV4 = bVar.v();
        if (zX || objV4 == obj2) {
            objV4 = new qv(1, u12Var, obj);
            bVar.p(objV4);
        }
        m74 m74Var = to4.a;
        bVar.E((gu5) objV4);
        boolean zX2 = bVar.x(u12Var) | bVar.x(zb0Var) | bVar.K(g4aVarG2) | bVar.K(g4aVarG);
        Object objV5 = bVar.v();
        if (zX2 || objV5 == obj2) {
            Object uc0Var = new uc0(u12Var, zb0Var, g4aVarG2, g4aVarG, null);
            bVar.p(uc0Var);
            objV5 = uc0Var;
        }
        to4.d(bVar, u12Var, (Function2) objV5);
        ese eseVar = (ese) g4aVar.getValue();
        return eseVar == null ? zb0Var.c : eseVar;
    }
}
