package defpackage;

import android.text.TextUtils;
import android.view.View;
import defpackage.epg;

/* JADX INFO: loaded from: classes.dex */
public final class bpg extends epg.b<CharSequence> {
    @Override // epg.b
    public final CharSequence a(View view) {
        return epg.h.a(view);
    }

    @Override // epg.b
    public final void b(View view, CharSequence charSequence) {
        epg.h.e(view, charSequence);
    }

    @Override // epg.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
