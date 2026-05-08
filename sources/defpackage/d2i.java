package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class d2i implements Runnable {
    public final /* synthetic */ zzao a;
    public final /* synthetic */ zzn b;
    public final /* synthetic */ h1i c;

    public d2i(h1i h1iVar, zzao zzaoVar, zzn zznVar) {
        this.c = h1iVar;
        this.a = zzaoVar;
        this.b = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fei feiVar = this.c.a;
        zzao zzaoVar = this.a;
        String str = zzaoVar.a;
        zzan zzanVar = zzaoVar.b;
        boolean zEquals = "_cmp".equals(str);
        zzn zznVar = this.b;
        if (zEquals && zzanVar != null) {
            Bundle bundle = zzanVar.a;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if (!TextUtils.isEmpty(string) && (("referrer broadcast".equals(string) || "referrer API".equals(string)) && feiVar.X.V.k(zznVar.a, djh.S))) {
                    feiVar.zzr().a0.a(zzaoVar.toString(), "Event has been filtered ");
                    zzaoVar = new zzao("_cmpx", zzaoVar.b, zzaoVar.c, zzaoVar.d);
                }
            }
        }
        feiVar.F();
        feiVar.c(zzaoVar, zznVar);
    }
}
