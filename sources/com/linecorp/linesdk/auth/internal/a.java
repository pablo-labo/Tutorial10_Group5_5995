package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final LineAuthenticationStatus a;

    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.a$a, reason: collision with other inner class name */
    public static class C0186a {
        public final Intent a;
        public final Bundle b;
        public final boolean c;

        public C0186a(Intent intent, Bundle bundle, boolean z) {
            this.a = intent;
            this.b = bundle;
            this.c = z;
        }
    }

    public static class b {
        public final Intent a;
        public final Bundle b;
        public final String c;
        public final boolean d;

        public b(Intent intent, Bundle bundle, String str, boolean z) {
            this.a = intent;
            this.b = bundle;
            this.c = str;
            this.d = z;
        }
    }

    public static class c {
        public final String a;
        public final Boolean b;
        public final String c;
        public final String d;
        public final String e;

        public c(String str, String str2, String str3, String str4, Boolean bool) {
            this.a = str;
            this.b = bool;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final LineApiError a() {
            String str = this.e;
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.a)) {
                return new LineApiError(str);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.c).putOpt("error_description", this.d).toString());
            } catch (JSONException e) {
                return new LineApiError(e);
            }
        }
    }

    public a(LineAuthenticationStatus lineAuthenticationStatus) {
        this.a = lineAuthenticationStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.linecorp.linesdk.auth.internal.a.b a(android.content.Context r21, com.linecorp.linesdk.auth.LineAuthenticationConfig r22, com.linecorp.linesdk.internal.pkce.PKCECode r23, com.linecorp.linesdk.auth.LineAuthenticationParams r24) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.auth.internal.a.a(android.content.Context, com.linecorp.linesdk.auth.LineAuthenticationConfig, com.linecorp.linesdk.internal.pkce.PKCECode, com.linecorp.linesdk.auth.LineAuthenticationParams):com.linecorp.linesdk.auth.internal.a$b");
    }
}
