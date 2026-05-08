package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.nn2;
import defpackage.r7d;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zziz extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzje zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzje zzjeVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzjeVar;
        this.zzc = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zziz(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            String str = this.zzc;
            this.zza = 1;
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        throw new zzeg(zzee.zzc, new zzed(httpURLConnection.getResponseCode()), null, null, 12, null);
                    }
                    try {
                        obj = nn2.y("gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                        g13 g13Var = g13.a;
                        if (obj == g13Var) {
                            return g13Var;
                        }
                    } catch (Exception unused) {
                        throw new zzeg(zzee.zzc, zzed.zzP, null, null, 12, null);
                    }
                } catch (Exception unused2) {
                    throw new zzeg(zzee.zzc, zzed.zzO, null, null, 12, null);
                }
            } catch (Exception unused3) {
                throw new zzeg(zzee.zzb, zzed.zzN, null, null, 12, null);
            }
        }
        return (String) obj;
    }
}
