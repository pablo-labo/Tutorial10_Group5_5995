package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class vfd implements i1i {
    public static final long b(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = mrf.c;
        return jFloatToRawIntBits;
    }

    public static final ArrayList c(ArrayList arrayList, Collection collection, kv5 kv5Var) {
        ui8 ui8VarF;
        collection.getClass();
        arrayList.size();
        collection.size();
        ArrayList<Pair> arrayListH1 = z92.H1(arrayList, collection);
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayListH1, 10));
        for (Pair pair : arrayListH1) {
            ui8 ui8Var = (ui8) pair.a();
            rlg rlgVar = (rlg) pair.b();
            int index = rlgVar.getIndex();
            lf0 annotations = rlgVar.getAnnotations();
            n8a name = rlgVar.getName();
            name.getClass();
            boolean zZ0 = rlgVar.z0();
            boolean zQ0 = rlgVar.q0();
            boolean zP0 = rlgVar.p0();
            if (rlgVar.u0() != null) {
                int i = b04.a;
                xx9 xx9VarD = yz3.d(kv5Var);
                xx9VarD.getClass();
                ui8VarF = xx9VarD.l().f(ui8Var);
            } else {
                ui8VarF = null;
            }
            ui8 ui8Var2 = ui8VarF;
            qne qneVarG = rlgVar.g();
            qneVarG.getClass();
            arrayList2.add(new slg(kv5Var, null, index, annotations, name, ui8Var, zZ0, zQ0, zP0, ui8Var2, qneVarG));
        }
        return arrayList2;
    }

    public static final up8 d(t52 t52Var) {
        t52 t52Var2;
        v62 v62VarD;
        t52Var.getClass();
        int i = b04.a;
        Iterator<ui8> it = t52Var.o().M0().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t52Var2 = null;
                break;
            }
            ui8 next = it.next();
            if (!ei8.y(next)) {
                v62VarD = next.M0().d();
                if (yz3.n(v62VarD, c62.CLASS) || yz3.n(v62VarD, c62.ENUM_CLASS)) {
                    break;
                }
            }
        }
        v62VarD.getClass();
        t52Var2 = (t52) v62VarD;
        if (t52Var2 == null) {
            return null;
        }
        in9 in9VarL0 = t52Var2.l0();
        up8 up8Var = in9VarL0 instanceof up8 ? (up8) in9VarL0 : null;
        return up8Var == null ? d(t52Var2) : up8Var;
    }

    @Override // defpackage.i1i
    public byte[] a(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
