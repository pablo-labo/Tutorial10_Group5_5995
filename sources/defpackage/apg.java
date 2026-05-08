package defpackage;

import android.view.View;
import defpackage.epg;

/* JADX INFO: loaded from: classes.dex */
public final class apg extends epg.b<Boolean> {
    @Override // epg.b
    public final Boolean a(View view) {
        return Boolean.valueOf(epg.h.c(view));
    }

    @Override // epg.b
    public final void b(View view, Boolean bool) {
        epg.h.f(view, bool.booleanValue());
    }

    @Override // epg.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
