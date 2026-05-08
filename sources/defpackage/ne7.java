package defpackage;

import defpackage.le0;

/* JADX INFO: loaded from: classes.dex */
public final class ne7 {
    public static final void a(le0.b bVar, String str, String str2) {
        if (str2.length() <= 0) {
            de7.a("alternateText can't be an empty string.");
        }
        bVar.j("androidx.compose.foundation.text.inlineContent", str);
        bVar.g(str2);
        bVar.h();
    }
}
