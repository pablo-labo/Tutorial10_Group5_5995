package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hgi implements igi {
    public static final hsh a;
    public static final hsh b;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        b = mteVar.c("measurement.collection.redundant_engagement_removal_enabled", false);
        mteVar.b(0L, "measurement.id.collection.redundant_engagement_removal_enabled");
    }

    @Override // defpackage.igi
    public final boolean zza() {
        return a.c().booleanValue();
    }

    @Override // defpackage.igi
    public final boolean zzb() {
        return b.c().booleanValue();
    }
}
