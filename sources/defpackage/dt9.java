package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt9 extends xs9 {
    public static final dt9 c = new dt9(3, 4);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
