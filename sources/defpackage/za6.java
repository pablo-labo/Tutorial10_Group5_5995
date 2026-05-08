package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;

/* JADX INFO: loaded from: classes2.dex */
public final class za6 extends ma3 {
    public final String c;

    public static final class a {
        public static za6 a(Bundle bundle) throws GoogleIdTokenParsingException {
            try {
                String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                string.getClass();
                string2.getClass();
                return new za6(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e) {
                throw new GoogleIdTokenParsingException(e);
            }
        }
    }

    public za6(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.c = str2;
        if (str.length() <= 0) {
            l5.q("id should not be empty");
            throw null;
        }
        if (str2.length() > 0) {
            return;
        }
        l5.q("idToken should not be empty");
        throw null;
    }
}
