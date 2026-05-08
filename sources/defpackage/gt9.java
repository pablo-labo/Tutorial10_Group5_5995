package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gt9 extends xs9 {
    public static final gt9 c = new gt9(7, 8);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
