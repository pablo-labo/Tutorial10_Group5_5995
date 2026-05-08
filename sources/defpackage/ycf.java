package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ycf {
    public static final ycf b = new ycf(zr4.a);
    public final List<xcf> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ycf(List<? extends xcf> list) {
        this.a = list;
    }

    public final String toString() {
        return ja.f(')', "TextContextMenuData(components=", fz8.b(56, "\n\t", this.a, null));
    }
}
