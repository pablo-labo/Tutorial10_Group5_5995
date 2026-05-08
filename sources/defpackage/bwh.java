package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzao;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bwh extends j3i {
    public static final AtomicReference<String[]> c = new AtomicReference<>();
    public static final AtomicReference<String[]> d = new AtomicReference<>();
    public static final AtomicReference<String[]> e = new AtomicReference<>();

    public static String m(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        fib.i(atomicReference);
        fib.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (yei.f0(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    @Override // defpackage.j3i
    public final boolean i() {
        return false;
    }

    public final String j(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!q()) {
            return bundle.toString();
        }
        StringBuilder sbG = q6.g("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbG.length() != 8) {
                sbG.append(", ");
            }
            sbG.append(o(str));
            sbG.append("=");
            oci.a();
            if (this.a.V.k(null, djh.D0)) {
                Object obj = bundle.get(str);
                sbG.append(obj instanceof Bundle ? n(new Object[]{obj}) : obj instanceof Object[] ? n((Object[]) obj) : obj instanceof ArrayList ? n(((ArrayList) obj).toArray()) : String.valueOf(obj));
            } else {
                sbG.append(bundle.get(str));
            }
        }
        sbG.append("}]");
        return sbG.toString();
    }

    public final String k(zzao zzaoVar) {
        if (!q()) {
            return zzaoVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzaoVar.c);
        sb.append(",name=");
        sb.append(l(zzaoVar.a));
        sb.append(",params=");
        zzan zzanVar = zzaoVar.b;
        sb.append(zzanVar == null ? null : !q() ? zzanVar.a.toString() : j(zzanVar.s0()));
        return sb.toString();
    }

    public final String l(String str) {
        if (str == null) {
            return null;
        }
        return !q() ? str : m(str, pg8.A0, pg8.z0, c);
    }

    public final String n(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbG = q6.g("[");
        for (Object obj : objArr) {
            String strJ = obj instanceof Bundle ? j((Bundle) obj) : String.valueOf(obj);
            if (strJ != null) {
                if (sbG.length() != 1) {
                    sbG.append(", ");
                }
                sbG.append(strJ);
            }
        }
        sbG.append("]");
        return sbG.toString();
    }

    public final String o(String str) {
        if (str == null) {
            return null;
        }
        return !q() ? str : m(str, ee3.c0, ee3.b0, d);
    }

    public final String p(String str) {
        if (str == null) {
            return null;
        }
        return !q() ? str : str.startsWith("_exp_") ? l5.m("experiment_id(", str, ")") : m(str, ak2.g0, ak2.f0, e);
    }

    public final boolean q() {
        i0i i0iVar = this.a;
        awd awdVar = i0iVar.f;
        if (!TextUtils.isEmpty(i0iVar.b)) {
            return false;
        }
        ewh ewhVar = i0iVar.X;
        i0i.i(ewhVar);
        return ewhVar.n(3);
    }
}
