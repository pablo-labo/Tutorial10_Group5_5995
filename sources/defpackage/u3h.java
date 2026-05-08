package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u3h extends ha1 {
    @Override // defpackage.ha1
    public final String d() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
