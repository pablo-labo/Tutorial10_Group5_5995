package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rmd {
    public static final rmd a;
    public static final rmd b;
    public static final rmd c;
    public static final rmd d;
    public static final rmd e;
    public static final /* synthetic */ rmd[] f;

    static {
        rmd rmdVar = new rmd("TopBar", 0);
        a = rmdVar;
        rmd rmdVar2 = new rmd("MainContent", 1);
        b = rmdVar2;
        rmd rmdVar3 = new rmd("Snackbar", 2);
        c = rmdVar3;
        rmd rmdVar4 = new rmd("Fab", 3);
        d = rmdVar4;
        rmd rmdVar5 = new rmd("BottomBar", 4);
        e = rmdVar5;
        f = new rmd[]{rmdVar, rmdVar2, rmdVar3, rmdVar4, rmdVar5};
    }

    public rmd() {
        throw null;
    }

    public static rmd valueOf(String str) {
        return (rmd) Enum.valueOf(rmd.class, str);
    }

    public static rmd[] values() {
        return (rmd[]) f.clone();
    }
}
