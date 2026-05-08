package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class phi implements qhi {
    public static final lrh a;

    static {
        mte mteVar = new mte(jrh.a());
        mteVar.b(0L, "measurement.id.max_bundles_per_iteration");
        a = mteVar.b(2L, "measurement.max_bundles_per_iteration");
    }

    @Override // defpackage.qhi
    public final long zza() {
        return a.c().longValue();
    }
}
