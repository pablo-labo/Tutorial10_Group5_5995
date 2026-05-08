package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u5b {
    public static final /* synthetic */ wv4 V;
    public static final u5b a;
    public static final u5b b;
    public static final u5b c;
    public static final u5b d;
    public static final u5b e;
    public static final /* synthetic */ u5b[] f;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        u5b u5bVar = new u5b("PatentTitle", 0, 1, R.string.title);
        a = u5bVar;
        u5b u5bVar2 = new u5b("PatentNumber", 1, 2, R.string.patent_number);
        b = u5bVar2;
        u5b u5bVar3 = new u5b("PatentURL", 2, 3, R.string.url_field_label);
        c = u5bVar3;
        u5b u5bVar4 = new u5b("PatentDateAwarded", 3, 4, R.string.date_awarded);
        d = u5bVar4;
        u5b u5bVar5 = new u5b("PatentDescription", 4, 5, R.string.description);
        e = u5bVar5;
        u5b[] u5bVarArr = {u5bVar, u5bVar2, u5bVar3, u5bVar4, u5bVar5};
        f = u5bVarArr;
        V = new wv4(u5bVarArr);
    }

    public u5b(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static u5b valueOf(String str) {
        return (u5b) Enum.valueOf(u5b.class, str);
    }

    public static u5b[] values() {
        return (u5b[]) f.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
