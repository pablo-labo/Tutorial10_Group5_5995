package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dci implements gci {
    public static final hsh a;
    public static final hsh b;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.service.configurable_service_limits", false);
        b = mteVar.c("measurement.client.configurable_service_limits", false);
        mteVar.b(0L, "measurement.id.service.configurable_service_limits");
    }

    @Override // defpackage.gci
    public final boolean zzb() {
        return a.c().booleanValue();
    }

    @Override // defpackage.gci
    public final boolean zzc() {
        return b.c().booleanValue();
    }
}
