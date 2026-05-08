package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht9 extends xs9 {
    public static final ht9 c = new ht9(8, 9);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
