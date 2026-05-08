package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.a;
import defpackage.e47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wpf {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final a[] d;
    public int e;

    static {
        String str = vjg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public wpf(String str, a... aVarArr) {
        ka2.l(aVarArr.length > 0);
        this.b = str;
        this.d = aVarArr;
        this.a = aVarArr.length;
        int i = st9.i(aVarArr[0].n);
        this.c = i == -1 ? st9.i(aVarArr[0].m) : i;
        String str2 = aVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = aVarArr[0].f | 16384;
        for (int i3 = 1; i3 < aVarArr.length; i3++) {
            String str3 = aVarArr[i3].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c(i3, "languages", aVarArr[0].d, aVarArr[i3].d);
                return;
            } else {
                if (i2 != (aVarArr[i3].f | 16384)) {
                    c(i3, "role flags", Integer.toBinaryString(aVarArr[0].f), Integer.toBinaryString(aVarArr[i3].f));
                    return;
                }
            }
        }
    }

    public static wpf a(Bundle bundle) {
        qyc qycVarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            e47.b bVar = e47.b;
            qycVarA = qyc.e;
        } else {
            qycVarA = vp1.a(new j6(13), parcelableArrayList);
        }
        return new wpf(bundle.getString(g, ""), (a[]) qycVarA.toArray(new a[0]));
    }

    public static void c(int i, String str, String str2, String str3) {
        StringBuilder sbF = u40.f("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbF.append(str3);
        sbF.append("' (track ");
        sbF.append(i);
        sbF.append(")");
        zkd.x("TrackGroup", "", new IllegalStateException(sbF.toString()));
    }

    public final int b(a aVar) {
        int i = 0;
        while (true) {
            a[] aVarArr = this.d;
            if (i >= aVarArr.length) {
                return -1;
            }
            if (aVar == aVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        a[] aVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(aVarArr.length);
        for (a aVar : aVarArr) {
            List<byte[]> list = aVar.q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(a.R, aVar.a);
            bundle2.putString(a.S, aVar.b);
            String str = a.w0;
            e47<kj8> e47Var = aVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(e47Var.size());
            for (kj8 kj8Var : e47Var) {
                kj8Var.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = kj8Var.a;
                if (str2 != null) {
                    bundle3.putString(kj8.c, str2);
                }
                bundle3.putString(kj8.d, kj8Var.b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(a.T, aVar.d);
            bundle2.putInt(a.U, aVar.e);
            bundle2.putInt(a.V, aVar.f);
            int i = aVar.g;
            if (i != a.Q.g) {
                bundle2.putInt(a.x0, i);
            }
            bundle2.putInt(a.W, aVar.h);
            bundle2.putInt(a.X, aVar.i);
            bundle2.putString(a.Y, aVar.k);
            bundle2.putString(a.Z, aVar.m);
            bundle2.putString(a.a0, aVar.n);
            bundle2.putInt(a.b0, aVar.o);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(a.c0 + "_" + Integer.toString(i2, 36), list.get(i2));
            }
            bundle2.putParcelable(a.d0, aVar.r);
            bundle2.putLong(a.e0, aVar.s);
            bundle2.putInt(a.f0, aVar.u);
            bundle2.putInt(a.g0, aVar.v);
            bundle2.putInt(a.z0, aVar.w);
            bundle2.putInt(a.A0, aVar.x);
            bundle2.putFloat(a.h0, aVar.y);
            bundle2.putInt(a.i0, aVar.z);
            bundle2.putFloat(a.j0, aVar.A);
            bundle2.putByteArray(a.k0, aVar.B);
            bundle2.putInt(a.l0, aVar.C);
            ha2 ha2Var = aVar.D;
            if (ha2Var != null) {
                String str3 = a.m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(ha2.i, ha2Var.a);
                bundle4.putInt(ha2.j, ha2Var.b);
                bundle4.putInt(ha2.k, ha2Var.c);
                bundle4.putByteArray(ha2.l, ha2Var.d);
                bundle4.putInt(ha2.m, ha2Var.e);
                bundle4.putInt(ha2.n, ha2Var.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(a.y0, aVar.E);
            bundle2.putInt(a.n0, aVar.F);
            bundle2.putInt(a.o0, aVar.G);
            bundle2.putInt(a.p0, aVar.H);
            bundle2.putInt(a.q0, aVar.I);
            bundle2.putInt(a.r0, aVar.J);
            bundle2.putInt(a.s0, aVar.K);
            bundle2.putInt(a.u0, aVar.M);
            bundle2.putInt(a.v0, aVar.N);
            bundle2.putInt(a.t0, aVar.O);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wpf.class == obj.getClass()) {
            wpf wpfVar = (wpf) obj;
            if (this.b.equals(wpfVar.b) && Arrays.equals(this.d, wpfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + akb.d(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
