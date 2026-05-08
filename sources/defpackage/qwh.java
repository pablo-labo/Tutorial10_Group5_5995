package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class qwh implements hai {
    public final zzev a;

    public qwh(zzev zzevVar) {
        Charset charset = mzh.a;
        if (zzevVar == null) {
            ja.k("output");
            throw null;
        }
        this.a = zzevVar;
        zzevVar.d = this;
    }

    public final void a(int i, fvh fvhVar) {
        this.a.O1(i, fvhVar);
    }

    public final void b(int i, Object obj, w5i w5iVar) {
        zzev zzevVar = this.a;
        zzevVar.L1(i, 3);
        w5iVar.g((l3i) obj, zzevVar.d);
        zzevVar.L1(i, 4);
    }
}
