package defpackage;

import app.rive.runtime.kotlin.fonts.Fonts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bjf {
    public static final bjf a;
    public static final /* synthetic */ bjf[] b;

    static {
        bjf bjfVar = new bjf(Fonts.Font.STYLE_NORMAL, 0);
        a = bjfVar;
        b = new bjf[]{bjfVar, new bjf("none", 1)};
    }

    public bjf() {
        throw null;
    }

    public static bjf valueOf(String str) {
        return (bjf) Enum.valueOf(bjf.class, str);
    }

    public static bjf[] values() {
        return (bjf[]) b.clone();
    }
}
