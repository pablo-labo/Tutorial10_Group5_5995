package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uz1 extends ezg {
    public final ArrayList<ezg> k;
    public int l;

    public uz1(gq2 gq2Var, int i) {
        gq2 gq2Var2;
        super(gq2Var);
        ArrayList<ezg> arrayList = new ArrayList<>();
        this.k = arrayList;
        this.f = i;
        gq2 gq2Var3 = this.b;
        gq2 gq2VarK = gq2Var3.k(i);
        while (true) {
            gq2Var2 = gq2Var3;
            gq2Var3 = gq2VarK;
            if (gq2Var3 == null) {
                break;
            } else {
                gq2VarK = gq2Var3.k(this.f);
            }
        }
        this.b = gq2Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? gq2Var2.d : i2 == 1 ? gq2Var2.e : null);
        gq2 gq2VarJ = gq2Var2.j(this.f);
        while (gq2VarJ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? gq2VarJ.d : i3 == 1 ? gq2VarJ.e : null);
            gq2VarJ = gq2VarJ.j(this.f);
        }
        for (ezg ezgVar : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                ezgVar.b.b = this;
            } else if (i4 == 1) {
                ezgVar.b.c = this;
            }
        }
        if (this.f == 0 && ((hq2) this.b.U).v0 && arrayList.size() > 1) {
            this.b = ((ezg) ia.k(1, arrayList)).b;
        }
        int i5 = this.f;
        gq2 gq2Var4 = this.b;
        this.l = i5 == 0 ? gq2Var4.j0 : gq2Var4.k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    @Override // defpackage.ezg, defpackage.ny3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ny3 r28) {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.a(ny3):void");
    }

    @Override // defpackage.ezg
    public final void d() {
        ArrayList<ezg> arrayList = this.k;
        Iterator<ezg> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        gq2 gq2Var = arrayList.get(0).b;
        gq2 gq2Var2 = arrayList.get(size - 1).b;
        int i = this.f;
        ry3 ry3Var = this.i;
        ry3 ry3Var2 = this.h;
        if (i == 0) {
            wp2 wp2Var = gq2Var.I;
            wp2 wp2Var2 = gq2Var2.K;
            ry3 ry3VarI = ezg.i(wp2Var, 0);
            int iD = wp2Var.d();
            gq2 gq2VarM = m();
            if (gq2VarM != null) {
                iD = gq2VarM.I.d();
            }
            if (ry3VarI != null) {
                ezg.b(ry3Var2, ry3VarI, iD);
            }
            ry3 ry3VarI2 = ezg.i(wp2Var2, 0);
            int iD2 = wp2Var2.d();
            gq2 gq2VarN = n();
            if (gq2VarN != null) {
                iD2 = gq2VarN.K.d();
            }
            if (ry3VarI2 != null) {
                ezg.b(ry3Var, ry3VarI2, -iD2);
            }
        } else {
            wp2 wp2Var3 = gq2Var.J;
            wp2 wp2Var4 = gq2Var2.L;
            ry3 ry3VarI3 = ezg.i(wp2Var3, 1);
            int iD3 = wp2Var3.d();
            gq2 gq2VarM2 = m();
            if (gq2VarM2 != null) {
                iD3 = gq2VarM2.J.d();
            }
            if (ry3VarI3 != null) {
                ezg.b(ry3Var2, ry3VarI3, iD3);
            }
            ry3 ry3VarI4 = ezg.i(wp2Var4, 1);
            int iD4 = wp2Var4.d();
            gq2 gq2VarN2 = n();
            if (gq2VarN2 != null) {
                iD4 = gq2VarN2.L.d();
            }
            if (ry3VarI4 != null) {
                ezg.b(ry3Var, ry3VarI4, -iD4);
            }
        }
        ry3Var2.a = this;
        ry3Var.a = this;
    }

    @Override // defpackage.ezg
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<ezg> arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // defpackage.ezg
    public final void f() {
        this.c = null;
        Iterator<ezg> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // defpackage.ezg
    public final long j() {
        ArrayList<ezg> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ezg ezgVar = arrayList.get(i);
            j = ((long) ezgVar.i.f) + ezgVar.j() + j + ((long) ezgVar.h.f);
        }
        return j;
    }

    @Override // defpackage.ezg
    public final boolean k() {
        ArrayList<ezg> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final gq2 m() {
        int i = 0;
        while (true) {
            ArrayList<ezg> arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            gq2 gq2Var = arrayList.get(i).b;
            if (gq2Var.h0 != 8) {
                return gq2Var;
            }
            i++;
        }
    }

    public final gq2 n() {
        ArrayList<ezg> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gq2 gq2Var = arrayList.get(size).b;
            if (gq2Var.h0 != 8) {
                return gq2Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (ezg ezgVar : this.k) {
            sb.append("<");
            sb.append(ezgVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
