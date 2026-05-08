package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zs9 extends xs9 {
    public static final zs9 c = new zs9(11, 12);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
