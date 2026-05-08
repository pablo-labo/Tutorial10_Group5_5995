package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ik8 {
    public static final ik8 a;
    public static final ik8 b;
    public static final /* synthetic */ ik8[] c;
    public static final /* synthetic */ wv4 d;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        ik8 ik8Var = new ik8("LanguageName", 0, 1, R.string.language_label);
        a = ik8Var;
        ik8 ik8Var2 = new ik8("Proficiency", 1, 2, R.string.language_proficiency_label);
        b = ik8Var2;
        ik8[] ik8VarArr = {ik8Var, ik8Var2};
        c = ik8VarArr;
        d = new wv4(ik8VarArr);
    }

    public ik8(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static ik8 valueOf(String str) {
        return (ik8) Enum.valueOf(ik8.class, str);
    }

    public static ik8[] values() {
        return (ik8[]) c.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
