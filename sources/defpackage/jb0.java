package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 implements mhg {
    public final Context a;

    public jb0(Context context) {
        this.a = context;
    }

    @Override // defpackage.mhg
    public final void a(String str) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(ja.f(JwtParser.SEPARATOR_CHAR, "Can't open ", str), e);
        }
    }
}
