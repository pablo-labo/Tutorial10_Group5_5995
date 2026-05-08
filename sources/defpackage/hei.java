package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hei implements jei {
    public static final hsh a;
    public static final hsh b;
    public static final hsh c;
    public static final hsh d;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = mteVar.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = mteVar.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = mteVar.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.jei
    public final boolean zzb() {
        return a.c().booleanValue();
    }

    @Override // defpackage.jei
    public final boolean zzc() {
        return b.c().booleanValue();
    }

    @Override // defpackage.jei
    public final boolean zzd() {
        return c.c().booleanValue();
    }

    @Override // defpackage.jei
    public final boolean zze() {
        return d.c().booleanValue();
    }
}
