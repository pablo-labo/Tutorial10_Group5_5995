package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum l8i implements tyh {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    private final int zzf;

    l8i(int i) {
        this.zzf = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    public final int zza() {
        return this.zzf;
    }
}
