package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tci implements uci {
    public static final hsh a;
    public static final hsh b;
    public static final hsh c;
    public static final hsh d;
    public static final hsh e;
    public static final hsh f;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.gold.enhanced_ecommerce.format_logs", true);
        b = mteVar.c("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        c = mteVar.c("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        d = mteVar.c("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        e = mteVar.c("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f = mteVar.c("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }

    @Override // defpackage.uci
    public final boolean zzb() {
        return a.c().booleanValue();
    }

    @Override // defpackage.uci
    public final boolean zzc() {
        return b.c().booleanValue();
    }

    @Override // defpackage.uci
    public final boolean zzd() {
        return c.c().booleanValue();
    }

    @Override // defpackage.uci
    public final boolean zze() {
        return d.c().booleanValue();
    }

    @Override // defpackage.uci
    public final boolean zzf() {
        return e.c().booleanValue();
    }

    @Override // defpackage.uci
    public final boolean zzg() {
        return f.c().booleanValue();
    }
}
