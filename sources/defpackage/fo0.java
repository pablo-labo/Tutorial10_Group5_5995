package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fo0 {
    public static final /* synthetic */ fo0[] a = {new fo0("analyzing_job", 0), new fo0("ready_to_review", 1), new fo0("missing_required_info", 2), new fo0("auto_apply_failed", 3), new fo0("submission_failed", 4), new fo0("filling_out_application", 5), new fo0("submitting_application", 6), new fo0("applied", 7), new fo0("not_started", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    fo0 EF5;

    public fo0() {
        throw null;
    }

    public static fo0 valueOf(String str) {
        return (fo0) Enum.valueOf(fo0.class, str);
    }

    public static fo0[] values() {
        return (fo0[]) a.clone();
    }
}
