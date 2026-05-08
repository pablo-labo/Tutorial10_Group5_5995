package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class i56 extends e06 {
    public final String d;
    public final String e;

    public static final class a {
        public static final Bundle a(String str, String str2) {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
            return bundle;
        }
    }

    public i56(String str, String str2) {
        super(a.a(str, str2), a.a(str, str2), is4.a);
        this.d = str;
        this.e = str2;
        if (str.length() > 0) {
            return;
        }
        l5.q("serverClientId should not be empty");
        throw null;
    }
}
