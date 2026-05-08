package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ygi implements vgi {
    public static final hsh a;
    public static final hsh b;
    public static final hsh c;
    public static final hsh d;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = mteVar.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = mteVar.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = mteVar.c("measurement.sdk.collection.last_gclid_from_referrer2", false);
        mteVar.b(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    @Override // defpackage.vgi
    public final boolean zza() {
        return a.c().booleanValue();
    }

    @Override // defpackage.vgi
    public final boolean zzb() {
        return b.c().booleanValue();
    }

    @Override // defpackage.vgi
    public final boolean zzc() {
        return c.c().booleanValue();
    }

    @Override // defpackage.vgi
    public final boolean zzd() {
        return d.c().booleanValue();
    }
}
