package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.e;
import defpackage.c3a;
import defpackage.dvf;
import defpackage.xo8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements xo8 {
    public c3a a;
    public c3a b;

    @Override // defpackage.xo8
    public final e a(dvf dvfVar, dvf dvfVar2, dvf dvfVar3) {
        return new LazyLayoutAnimateItemElement(dvfVar, dvfVar2, dvfVar3);
    }

    @Override // defpackage.xo8
    public final e b() {
        return new ParentSizeElement(this.a);
    }
}
