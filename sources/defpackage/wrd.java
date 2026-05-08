package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wrd implements sxa {
    public final int a;
    public final List<wrd> b;
    public Float c = null;
    public Float d = null;
    public lrd e = null;
    public lrd f = null;

    public wrd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.sxa
    public final boolean W0() {
        return this.b.contains(this);
    }
}
