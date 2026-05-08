package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dzg {
    public static int f;
    public ArrayList<gq2> a;
    public int b;
    public int c;
    public ArrayList<a> d;
    public int e;

    public class a {
    }

    public final void a(ArrayList<dzg> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                dzg dzgVar = arrayList.get(i);
                if (this.e == dzgVar.b) {
                    c(this.c, dzgVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ox8 ox8Var, int i) {
        int iN;
        int iN2;
        ArrayList<gq2> arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        hq2 hq2Var = (hq2) arrayList.get(0).U;
        ox8Var.t();
        hq2Var.b(ox8Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).b(ox8Var, false);
        }
        if (i == 0 && hq2Var.z0 > 0) {
            sz1.a(hq2Var, ox8Var, arrayList, 0);
        }
        if (i == 1 && hq2Var.A0 > 0) {
            sz1.a(hq2Var, ox8Var, arrayList, 1);
        }
        try {
            ox8Var.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            gq2 gq2Var = arrayList.get(i3);
            a aVar = new a();
            new WeakReference(gq2Var);
            ox8.n(gq2Var.I);
            ox8.n(gq2Var.J);
            ox8.n(gq2Var.K);
            ox8.n(gq2Var.L);
            ox8.n(gq2Var.M);
            this.d.add(aVar);
        }
        if (i == 0) {
            iN = ox8.n(hq2Var.I);
            iN2 = ox8.n(hq2Var.K);
            ox8Var.t();
        } else {
            iN = ox8.n(hq2Var.J);
            iN2 = ox8.n(hq2Var.L);
            ox8Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, dzg dzgVar) {
        int i2 = dzgVar.b;
        for (gq2 gq2Var : this.a) {
            ArrayList<gq2> arrayList = dzgVar.a;
            if (!arrayList.contains(gq2Var)) {
                arrayList.add(gq2Var);
            }
            if (i == 0) {
                gq2Var.o0 = i2;
            } else {
                gq2Var.p0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : ViewUtilsKt.UNKNOWN_DESTINATION_URL);
        sb.append(" [");
        String strK = w20.k(sb, this.b, "] <");
        for (gq2 gq2Var : this.a) {
            StringBuilder sbG = h5.g(strK, " ");
            sbG.append(gq2Var.i0);
            strK = sbG.toString();
        }
        return strK.concat(" >");
    }
}
