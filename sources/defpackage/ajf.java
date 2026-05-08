package defpackage;

import app.rive.runtime.kotlin.fonts.Fonts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ajf {
    public static final ajf a;
    public static final ajf b;
    public static final /* synthetic */ ajf[] c;

    static {
        ajf ajfVar = new ajf(Fonts.Font.STYLE_NORMAL, 0);
        a = ajfVar;
        ajf ajfVar2 = new ajf(Fonts.Font.STYLE_ITALIC, 1);
        b = ajfVar2;
        c = new ajf[]{ajfVar, ajfVar2, new ajf("oblique", 2)};
    }

    public ajf() {
        throw null;
    }

    public static ajf valueOf(String str) {
        return (ajf) Enum.valueOf(ajf.class, str);
    }

    public static ajf[] values() {
        return (ajf[]) c.clone();
    }
}
