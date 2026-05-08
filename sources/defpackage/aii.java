package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aii implements xhi {
    public static final hsh a;
    public static final orh b;
    public static final lrh c;
    public static final lrh d;
    public static final jsh e;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.test.boolean_flag", false);
        Object obj = hrh.f;
        b = new orh(mteVar, "measurement.test.double_flag", Double.valueOf(-3.0d));
        c = mteVar.b(-2L, "measurement.test.int_flag");
        d = mteVar.b(-1L, "measurement.test.long_flag");
        e = mteVar.d("measurement.test.string_flag", "---");
    }

    @Override // defpackage.xhi
    public final boolean zza() {
        return a.c().booleanValue();
    }

    @Override // defpackage.xhi
    public final double zzb() {
        return b.c().doubleValue();
    }

    @Override // defpackage.xhi
    public final long zzc() {
        return c.c().longValue();
    }

    @Override // defpackage.xhi
    public final long zzd() {
        return d.c().longValue();
    }

    @Override // defpackage.xhi
    public final String zze() {
        return e.c();
    }
}
