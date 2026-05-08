package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sgi implements pgi {
    public static final hsh a;
    public static final hsh b;
    public static final hsh c;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.client.global_params.dev", false);
        b = mteVar.c("measurement.service.global_params_in_payload", true);
        c = mteVar.c("measurement.service.global_params", false);
    }

    @Override // defpackage.pgi
    public final boolean zzb() {
        return a.c().booleanValue();
    }

    @Override // defpackage.pgi
    public final boolean zzc() {
        return b.c().booleanValue();
    }

    @Override // defpackage.pgi
    public final boolean zzd() {
        return c.c().booleanValue();
    }
}
