package defpackage;

import androidx.compose.runtime.h;
import defpackage.s8b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface t8b extends Map, ze8, sm2, mm2 {
    s8b.a builder();

    @Override // defpackage.mm2
    default Object c(h hVar) {
        return tm2.a(this, hVar);
    }

    s8b m(h hVar, olg olgVar);
}
