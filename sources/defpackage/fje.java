package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fje {
    public static final fje a;
    public static final fje b;
    public static final /* synthetic */ fje[] c;
    public static final /* synthetic */ wv4 d;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        fje fjeVar = new fje("SkillName", 0, 1, R.string.skill_name_label);
        a = fjeVar;
        fje fjeVar2 = new fje("Experience", 1, 2, R.string.skill_experience_label);
        b = fjeVar2;
        fje[] fjeVarArr = {fjeVar, fjeVar2};
        c = fjeVarArr;
        d = new wv4(fjeVarArr);
    }

    public fje(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static fje valueOf(String str) {
        return (fje) Enum.valueOf(fje.class, str);
    }

    public static fje[] values() {
        return (fje[]) c.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
