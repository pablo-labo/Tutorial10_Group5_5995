package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzan;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class oih {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzan f;

    public oih(i0i i0iVar, String str, String str2, String str3, long j, Bundle bundle) {
        zzan zzanVar;
        fib.f(str2);
        fib.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = 0L;
        if (bundle.isEmpty()) {
            zzanVar = new zzan(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ewh ewhVar = i0iVar.X;
                    i0i.i(ewhVar);
                    ewhVar.f.b("Param name can't be null");
                    it.remove();
                } else {
                    yei yeiVar = i0iVar.a0;
                    i0i.c(yeiVar);
                    Object objS = yeiVar.s(bundle2.get(next), next);
                    if (objS == null) {
                        ewh ewhVar2 = i0iVar.X;
                        i0i.i(ewhVar2);
                        jwh jwhVar = ewhVar2.X;
                        bwh bwhVar = i0iVar.b0;
                        i0i.c(bwhVar);
                        jwhVar.a(bwhVar.o(next), "Param value can't be null");
                        it.remove();
                    } else {
                        yei yeiVar2 = i0iVar.a0;
                        i0i.c(yeiVar2);
                        yeiVar2.x(bundle2, next, objS);
                    }
                }
            }
            zzanVar = new zzan(bundle2);
        }
        this.f = zzanVar;
    }

    public final oih a(i0i i0iVar, long j) {
        return new oih(i0iVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f);
        String str = this.a;
        int iC = uz.c(33, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(strValueOf.length() + uz.c(iC, str2));
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }

    public oih(i0i i0iVar, String str, String str2, String str3, long j, long j2, zzan zzanVar) {
        fib.f(str2);
        fib.f(str3);
        fib.i(zzanVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            ewh ewhVar = i0iVar.X;
            i0i.i(ewhVar);
            ewhVar.X.c("Event created with reverse previous/current timestamps. appId, name", ewh.l(str2), ewh.l(str3));
        }
        this.f = zzanVar;
    }
}
