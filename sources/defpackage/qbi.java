package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qbi implements rbi {
    public static final hsh a;
    public static final lrh b;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.sdk.attribution.cache", true);
        b = mteVar.b(604800000L, "measurement.sdk.attribution.cache.ttl");
    }

    @Override // defpackage.rbi
    public final boolean zza() {
        return a.c().booleanValue();
    }

    @Override // defpackage.rbi
    public final long zzb() {
        return b.c().longValue();
    }
}
