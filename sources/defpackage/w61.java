package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w61 {
    public static final w61 a;
    public static final w61 b;
    public static final w61 c;
    public static final /* synthetic */ w61[] d;
    public static final /* synthetic */ wv4 e;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        w61 w61Var = new w61("AwardTitle", 0, 1, R.string.title);
        a = w61Var;
        w61 w61Var2 = new w61("AwardDateAwarded", 1, 2, R.string.date_awarded);
        b = w61Var2;
        w61 w61Var3 = new w61("AwardDescription", 2, 3, R.string.description);
        c = w61Var3;
        w61[] w61VarArr = {w61Var, w61Var2, w61Var3};
        d = w61VarArr;
        e = new wv4(w61VarArr);
    }

    public w61(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static w61 valueOf(String str) {
        return (w61) Enum.valueOf(w61.class, str);
    }

    public static w61[] values() {
        return (w61[]) d.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
