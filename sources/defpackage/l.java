package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.b;
import com.google.android.recaptcha.internal.zzagp;
import defpackage.e75;
import defpackage.emf;
import defpackage.gdb;
import defpackage.ij9;
import defpackage.lz8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements lz8.a, jg2, e75.b, wq2, ru5 {
    public final /* synthetic */ int a;

    public static int b(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static String e(b bVar, int i, int i2, b bVar2) {
        bVar.L(i);
        String strI = ak2.I(i2, bVar2);
        bVar.F();
        return strI;
    }

    public static ArrayList f(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static /* synthetic */ void g() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new qi8(str + obj);
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void k() throws zzagp {
        throw new zzagp("Protocol message tag had invalid wire type.");
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).c();
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = bundle.getBundle(emf.d.s);
        ij9 ij9VarA = bundle2 != null ? ij9.a(bundle2) : ij9.g;
        long j = bundle.getLong(emf.d.t, -9223372036854775807L);
        long j2 = bundle.getLong(emf.d.u, -9223372036854775807L);
        long j3 = bundle.getLong(emf.d.v, -9223372036854775807L);
        boolean z = bundle.getBoolean(emf.d.w, false);
        boolean z2 = bundle.getBoolean(emf.d.x, false);
        Bundle bundle3 = bundle.getBundle(emf.d.y);
        ij9.e eVarB = bundle3 != null ? ij9.e.b(bundle3) : null;
        boolean z3 = bundle.getBoolean(emf.d.z, false);
        long j4 = bundle.getLong(emf.d.A, 0L);
        long j5 = bundle.getLong(emf.d.B, -9223372036854775807L);
        int i = bundle.getInt(emf.d.C, 0);
        int i2 = bundle.getInt(emf.d.D, 0);
        long j6 = bundle.getLong(emf.d.E, 0L);
        emf.d dVar = new emf.d();
        dVar.b(emf.d.q, ij9VarA, null, j, j2, j3, z, z2, eVarB, j4, j5, i, i2, j6);
        dVar.j = z3;
        return dVar;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        Set setD = l7dVar.d(y8c.a(xu8.class));
        v96 v96Var = v96.b;
        if (v96Var == null) {
            synchronized (v96.class) {
                try {
                    v96Var = v96.b;
                    if (v96Var == null) {
                        v96Var = new v96();
                        v96.b = v96Var;
                    }
                } finally {
                }
            }
        }
        return new nr3(setD, v96Var);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        switch (this.a) {
            case 3:
                ((v20) obj).getClass();
                break;
            case 4:
                ((v20) obj).getClass();
                break;
            default:
                ((gdb.c) obj).s(1);
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        switch (this.a) {
            case 6:
                return Float.valueOf(ka6Var.V0());
            default:
                return Long.valueOf(ka6Var.W0());
        }
    }

    public /* synthetic */ l(int i) {
        this.a = i;
    }
}
