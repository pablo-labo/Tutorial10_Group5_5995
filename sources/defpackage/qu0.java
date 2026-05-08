package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qu0 {
    public static final qu0 a;
    public static final qu0 b;
    public static final qu0 c;
    public static final /* synthetic */ qu0[] d;
    public static final /* synthetic */ wv4 e;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        qu0 qu0Var = new qu0("AssociationTitle", 0, 1, R.string.title);
        a = qu0Var;
        qu0 qu0Var2 = new qu0("AssociationTimePeriod", 1, 2, R.string.label_time_period);
        b = qu0Var2;
        qu0 qu0Var3 = new qu0("AssociationDescription", 2, 3, R.string.description);
        c = qu0Var3;
        qu0[] qu0VarArr = {qu0Var, qu0Var2, qu0Var3};
        d = qu0VarArr;
        e = new wv4(qu0VarArr);
    }

    public qu0(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static qu0 valueOf(String str) {
        return (qu0) Enum.valueOf(qu0.class, str);
    }

    public static qu0[] values() {
        return (qu0[]) d.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
