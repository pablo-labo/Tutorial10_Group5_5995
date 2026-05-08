package androidx.compose.ui.layout;

import defpackage.utc;
import defpackage.vtc;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements j0 {
    public final String b;
    public final vtc c;
    public final vtc d;

    public k0(String str) {
        this.b = str;
        this.c = new vtc(str);
        this.d = new vtc(str.concat(" maximum"));
    }

    @Override // androidx.compose.ui.layout.j0
    public final utc a() {
        return this.d;
    }

    @Override // androidx.compose.ui.layout.j0
    public final utc c() {
        return this.c;
    }

    public final String toString() {
        return this.b;
    }
}
