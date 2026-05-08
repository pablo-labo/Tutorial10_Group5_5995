package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationStatus;
import com.linecorp.linesdk.auth.internal.a;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import defpackage.ax8;
import defpackage.b0;
import defpackage.eo7;
import defpackage.h8f;
import defpackage.j6;
import defpackage.kua;
import defpackage.l22;
import defpackage.nn2;
import defpackage.p5;
import defpackage.qi7;
import defpackage.thg;
import defpackage.tpd;
import defpackage.ww8;
import defpackage.xw8;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static Intent i;
    public final LineAuthenticationActivity a;
    public final LineAuthenticationConfig b;
    public final ax8 c;
    public final h8f d;
    public final com.linecorp.linesdk.auth.internal.a e;
    public final p5 f;
    public final LineAuthenticationParams g;
    public final LineAuthenticationStatus h;

    public class a extends AsyncTask<a.c, Void, LineLoginResult> {
        public a() {
        }

        public final void a(LineIdToken lineIdToken, String str) {
            b bVar = b.this;
            ww8<kua> ww8VarA = bVar.c.a();
            if (!ww8VarA.d()) {
                StringBuilder sb = new StringBuilder("Failed to get OpenId Discovery Document.  Response Code: ");
                sb.append(ww8VarA.a);
                LineApiError lineApiError = ww8VarA.c;
                sb.append(" Error Data: ");
                sb.append(lineApiError);
                throw new RuntimeException(sb.toString());
            }
            String str2 = ww8VarA.c().a;
            String str3 = bVar.b.a;
            String str4 = bVar.h.d;
            String str5 = lineIdToken.b;
            Date date = lineIdToken.f;
            if (!str2.equals(str5)) {
                nn2.w("OpenId issuer does not match.", str2, str5);
                throw null;
            }
            String str6 = lineIdToken.c;
            if (str != null && !str.equals(str6)) {
                nn2.w("OpenId subject does not match.", str, str6);
                throw null;
            }
            String str7 = lineIdToken.d;
            if (!str3.equals(str7)) {
                nn2.w("OpenId audience does not match.", str3, str7);
                throw null;
            }
            String str8 = lineIdToken.W;
            if (!(str4 == null && str8 == null) && (str4 == null || !str4.equals(str8))) {
                nn2.w("OpenId nonce does not match.", str4, str8);
                throw null;
            }
            Date date2 = new Date();
            Date date3 = lineIdToken.e;
            if (date.getTime() > date2.getTime() + 300000) {
                j6.f(date, "OpenId issuedAt is after current time: ");
            } else {
                if (date3.getTime() >= date2.getTime() - 300000) {
                    return;
                }
                j6.f(date3, "OpenId expiresAt is before current time: ");
            }
        }

        @Override // android.os.AsyncTask
        public final LineLoginResult doInBackground(a.c[] cVarArr) {
            LineProfile lineProfile;
            String str;
            a.c cVar = cVarArr[0];
            if (TextUtils.isEmpty(cVar.a)) {
                b0.u("requestToken is null. Please check result by isSuccess before.");
                return null;
            }
            String str2 = cVar.a;
            b bVar = b.this;
            LineAuthenticationStatus lineAuthenticationStatus = bVar.h;
            PKCECode pKCECode = lineAuthenticationStatus.a;
            String str3 = lineAuthenticationStatus.b;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            xw8 xw8Var = xw8.f;
            if (zIsEmpty || pKCECode == null || TextUtils.isEmpty(str3)) {
                return LineLoginResult.a(xw8Var, new LineApiError("Requested data is missing."));
            }
            ax8 ax8Var = bVar.c;
            String str4 = bVar.b.a;
            Uri uriC = thg.c(ax8Var.a, "oauth2/v2.1", "token");
            LinkedHashMap linkedHashMapB = thg.b("grant_type", "authorization_code", "code", str2, "redirect_uri", str3, "client_id", str4, "code_verifier", pKCECode.a, "id_token_key_type", "JWK", "client_version", "LINE SDK Android v5.12.0");
            l22 l22Var = ax8Var.b;
            Map map = Collections.EMPTY_MAP;
            ww8 ww8VarG = l22Var.g(uriC, linkedHashMapB, ax8Var.c);
            if (!ww8VarG.d()) {
                return LineLoginResult.a(ww8VarG.a, ww8VarG.c);
            }
            eo7 eo7Var = (eo7) ww8VarG.c();
            qi7 qi7Var = eo7Var.a;
            List<tpd> list = eo7Var.b;
            if (list.contains(tpd.c)) {
                h8f h8fVar = bVar.d;
                ww8 ww8VarA = h8fVar.b.a(thg.c(h8fVar.a, "v2", "profile"), h8f.a(qi7Var), Collections.EMPTY_MAP, h8f.c);
                if (!ww8VarA.d()) {
                    return LineLoginResult.a(ww8VarA.a, ww8VarA.c);
                }
                lineProfile = (LineProfile) ww8VarA.c();
                str = lineProfile.a;
            } else {
                lineProfile = null;
                str = null;
            }
            p5 p5Var = bVar.f;
            p5Var.a.getSharedPreferences(p5Var.b, 0).edit().putString("accessToken", p5Var.b(qi7Var.a)).putString("expiresIn", p5Var.a(qi7Var.b)).putString("issuedClientTime", p5Var.a(qi7Var.c)).putString("refreshToken", p5Var.b(qi7Var.d)).apply();
            LineIdToken lineIdToken = eo7Var.c;
            if (lineIdToken != null) {
                try {
                    a(lineIdToken, str);
                } catch (Exception e) {
                    return LineLoginResult.a(xw8Var, new LineApiError(e.getMessage()));
                }
            }
            LineLoginResult.b bVar2 = new LineLoginResult.b();
            bVar2.b = lineAuthenticationStatus.d;
            bVar2.c = lineProfile;
            bVar2.d = lineIdToken;
            if (TextUtils.isEmpty(cVar.a)) {
                b0.u("requestToken is null. Please check result by isSuccess before.");
                return null;
            }
            bVar2.e = cVar.b;
            bVar2.f = new LineCredential(new LineAccessToken(qi7Var.b, qi7Var.a, qi7Var.c), list);
            return new LineLoginResult(bVar2);
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(LineLoginResult lineLoginResult) {
            b bVar = b.this;
            bVar.h.e = LineAuthenticationStatus.b.d;
            bVar.a.a(lineLoginResult);
        }
    }

    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.b$b, reason: collision with other inner class name */
    public class RunnableC0187b implements Runnable {
        public RunnableC0187b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            LineAuthenticationStatus lineAuthenticationStatus = bVar.h;
            LineAuthenticationActivity lineAuthenticationActivity = bVar.a;
            if (lineAuthenticationStatus.e == LineAuthenticationStatus.b.c || lineAuthenticationActivity.isFinishing()) {
                return;
            }
            Intent intent = b.i;
            if (intent == null) {
                lineAuthenticationActivity.a(LineLoginResult.a(xw8.b, LineApiError.d));
            } else {
                bVar.a(intent);
                b.i = null;
            }
        }
    }

    public b(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, LineAuthenticationStatus lineAuthenticationStatus, LineAuthenticationParams lineAuthenticationParams) {
        Context applicationContext = lineAuthenticationActivity.getApplicationContext();
        Uri uri = lineAuthenticationConfig.b;
        Uri uri2 = lineAuthenticationConfig.c;
        ax8 ax8Var = new ax8(applicationContext, uri, uri2);
        h8f h8fVar = new h8f(uri2, lineAuthenticationActivity.getApplicationContext());
        com.linecorp.linesdk.auth.internal.a aVar = new com.linecorp.linesdk.auth.internal.a(lineAuthenticationStatus);
        p5 p5Var = new p5(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.a);
        this.a = lineAuthenticationActivity;
        this.b = lineAuthenticationConfig;
        this.c = ax8Var;
        this.d = h8fVar;
        this.e = aVar;
        this.f = p5Var;
        this.h = lineAuthenticationStatus;
        this.g = lineAuthenticationParams;
    }

    public final void a(Intent intent) {
        a.c cVar;
        LineAuthenticationStatus.b bVar = LineAuthenticationStatus.b.c;
        LineAuthenticationStatus lineAuthenticationStatus = this.h;
        lineAuthenticationStatus.e = bVar;
        com.linecorp.linesdk.auth.internal.a aVar = this.e;
        aVar.getClass();
        Uri data = intent.getData();
        if (data == null) {
            cVar = new a.c(null, null, null, "Illegal redirection from external application.", null);
        } else {
            String str = aVar.a.c;
            String queryParameter = data.getQueryParameter("state");
            if (str == null || !str.equals(queryParameter)) {
                cVar = new a.c(null, null, null, "Illegal parameter value of 'state'.", null);
            } else {
                String queryParameter2 = data.getQueryParameter("code");
                String queryParameter3 = data.getQueryParameter("friendship_status_changed");
                cVar = !TextUtils.isEmpty(queryParameter2) ? new a.c(queryParameter2, null, null, null, !TextUtils.isEmpty(queryParameter3) ? Boolean.valueOf(Boolean.parseBoolean(queryParameter3)) : null) : new a.c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null, null);
            }
        }
        String str2 = cVar.a;
        if (!TextUtils.isEmpty(str2)) {
            new a().execute(cVar);
        } else {
            lineAuthenticationStatus.e = LineAuthenticationStatus.b.d;
            this.a.a("ACCESS_DENIED".equalsIgnoreCase(cVar.c) ? LineLoginResult.a(xw8.b, LineApiError.d) : (TextUtils.isEmpty(cVar.e) && TextUtils.isEmpty(str2)) ? LineLoginResult.a(xw8.e, cVar.a()) : LineLoginResult.a(xw8.f, cVar.a()));
        }
    }
}
