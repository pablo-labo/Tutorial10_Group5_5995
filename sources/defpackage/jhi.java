package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jhi implements khi {
    public static final hsh a;
    public static final hsh b;
    public static final hsh c;

    static {
        mte mteVar = new mte(jrh.a());
        mteVar.b(0L, "measurement.id.lifecycle.app_in_background_parameter");
        a = mteVar.c("measurement.lifecycle.app_backgrounded_engagement", false);
        b = mteVar.c("measurement.lifecycle.app_backgrounded_tracking", true);
        c = mteVar.c("measurement.lifecycle.app_in_background_parameter", false);
        mteVar.b(0L, "measurement.id.lifecycle.app_backgrounded_tracking");
    }

    @Override // defpackage.khi
    public final boolean zza() {
        return a.c().booleanValue();
    }

    @Override // defpackage.khi
    public final boolean zzb() {
        return b.c().booleanValue();
    }

    @Override // defpackage.khi
    public final boolean zzc() {
        return c.c().booleanValue();
    }
}
