package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qmd {
    public static final qmd a;
    public static final qmd b;
    public static final qmd c;
    public static final qmd d;
    public static final qmd e;
    public static final /* synthetic */ qmd[] f;

    static {
        qmd qmdVar = new qmd("TopBar", 0);
        a = qmdVar;
        qmd qmdVar2 = new qmd("MainContent", 1);
        b = qmdVar2;
        qmd qmdVar3 = new qmd("Snackbar", 2);
        c = qmdVar3;
        qmd qmdVar4 = new qmd("Fab", 3);
        d = qmdVar4;
        qmd qmdVar5 = new qmd("BottomBar", 4);
        e = qmdVar5;
        f = new qmd[]{qmdVar, qmdVar2, qmdVar3, qmdVar4, qmdVar5};
    }

    public qmd() {
        throw null;
    }

    public static qmd valueOf(String str) {
        return (qmd) Enum.valueOf(qmd.class, str);
    }

    public static qmd[] values() {
        return (qmd[]) f.clone();
    }
}
