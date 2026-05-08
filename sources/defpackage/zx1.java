package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zx1 {
    public final float a;
    public final float b;

    public zx1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final ese a(boolean z, d3a d3aVar, b bVar, int i) {
        zb0 zb0Var;
        bVar.L(-1763481333);
        bVar.L(-734838460);
        float f = 0.0f;
        Object obj = b.a.a;
        if (d3aVar == null) {
            Object objV = bVar.v();
            if (objV == obj) {
                objV = r.f(new j94(0.0f));
                bVar.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            bVar.F();
            bVar.F();
            return g4aVar;
        }
        bVar.F();
        Object objV2 = bVar.v();
        if (objV2 == obj) {
            objV2 = new SnapshotStateList();
            bVar.p(objV2);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objV2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && bVar.K(d3aVar)) || (i & 48) == 32;
        Object objV3 = bVar.v();
        Object obj2 = null;
        if (z3 || objV3 == obj) {
            objV3 = new xx1(d3aVar, snapshotStateList, null);
            bVar.p(objV3);
        }
        to4.d(bVar, d3aVar, (Function2) objV3);
        ci7 ci7Var = (ci7) z92.Z0(snapshotStateList);
        if (z && !(ci7Var instanceof hmb.b)) {
            if (ci7Var instanceof hk6) {
                f = this.a;
            } else if (!(ci7Var instanceof zl5) && (ci7Var instanceof la4)) {
                f = this.b;
            }
        }
        Object objV4 = bVar.v();
        if (objV4 == obj) {
            objV4 = new zb0(new j94(f), q92.e0, obj2, 12);
            bVar.p(objV4);
        }
        zb0 zb0Var2 = (zb0) objV4;
        j94 j94Var = new j94(f);
        boolean zX = bVar.x(zb0Var2) | bVar.c(f) | ((((i & 14) ^ 6) > 4 && bVar.a(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !bVar.K(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zX2 = zX | z2 | bVar.x(ci7Var);
        Object objV5 = bVar.v();
        if (zX2 || objV5 == obj) {
            zb0Var = zb0Var2;
            Object yx1Var = new yx1(zb0Var, f, z, this, ci7Var, null);
            bVar.p(yx1Var);
            objV5 = yx1Var;
        } else {
            zb0Var = zb0Var2;
        }
        to4.d(bVar, j94Var, (Function2) objV5);
        ese eseVar = zb0Var.c;
        bVar.F();
        return eseVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zx1)) {
            return false;
        }
        return j94.c(0.0f, 0.0f) && j94.c(0.0f, 0.0f) && j94.c(0.0f, 0.0f) && j94.c(this.a, ((zx1) obj).a) && j94.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + k6.c(k6.c(k6.c(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31), this.a, 31);
    }
}
