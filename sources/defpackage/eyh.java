package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class eyh extends j3i {

    @VisibleForTesting
    public static final Pair<String, Long> s0 = new Pair<>("", 0L);
    public final uyh V;
    public final uyh W;
    public final uyh X;
    public final uyh Y;
    public final uyh Z;
    public final yyh a0;
    public String b0;
    public SharedPreferences c;
    public boolean c0;
    public bzh d;
    public long d0;
    public final uyh e;
    public final uyh e0;
    public final uyh f;
    public final uyh f0;
    public final pyh g0;
    public final yyh h0;
    public final pyh i0;
    public final uyh j0;
    public boolean k0;
    public final pyh l0;
    public final pyh m0;
    public final uyh n0;
    public final yyh o0;
    public final yyh p0;
    public final uyh q0;
    public final wyh r0;

    public eyh(i0i i0iVar) {
        super(i0iVar);
        this.e = new uyh(this, "last_upload", 0L);
        this.f = new uyh(this, "last_upload_attempt", 0L);
        this.V = new uyh(this, "backoff", 0L);
        this.W = new uyh(this, "last_delete_stale", 0L);
        this.e0 = new uyh(this, "time_before_start", 10000L);
        this.f0 = new uyh(this, "session_timeout", 1800000L);
        this.g0 = new pyh(this, "start_new_session", true);
        this.j0 = new uyh(this, "last_pause_time", 0L);
        this.h0 = new yyh(this, "non_personalized_ads");
        this.i0 = new pyh(this, "allow_remote_dynamite", false);
        this.X = new uyh(this, "midnight_offset", 0L);
        this.Y = new uyh(this, "first_open_time", 0L);
        this.Z = new uyh(this, "app_install_time", 0L);
        this.a0 = new yyh(this, "app_instance_id");
        this.l0 = new pyh(this, "app_backgrounded", false);
        this.m0 = new pyh(this, "deep_link_retrieval_complete", false);
        this.n0 = new uyh(this, "deep_link_retrieval_attempts", 0L);
        this.o0 = new yyh(this, "firebase_feature_rollouts");
        this.p0 = new yyh(this, "deferred_attribution_cache");
        this.q0 = new uyh(this, "deferred_attribution_cache_timestamp", 0L);
        this.r0 = new wyh(this);
    }

    @Override // defpackage.j3i
    public final boolean i() {
        return true;
    }

    public final Pair<String, Boolean> j(String str) {
        b();
        i0i i0iVar = this.a;
        i0iVar.c0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b0 != null && jElapsedRealtime < this.d0) {
            return new Pair<>(this.b0, Boolean.valueOf(this.c0));
        }
        this.d0 = i0iVar.V.g(str, djh.c) + jElapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(i0iVar.a);
            if (advertisingIdInfo != null) {
                this.b0 = advertisingIdInfo.getId();
                this.c0 = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.b0 == null) {
                this.b0 = "";
            }
        } catch (Exception e) {
            zzr().b0.a(e, "Unable to get advertising id");
            this.b0 = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.b0, Boolean.valueOf(this.c0));
    }

    public final boolean k(long j) {
        return j - this.f0.a() > this.j0.a();
    }

    public final String l(String str) {
        b();
        String str2 = (String) j(str).first;
        MessageDigest messageDigestK0 = yei.k0();
        if (messageDigestK0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestK0.digest(str2.getBytes())));
    }

    public final void m(boolean z) {
        b();
        zzr().c0.a(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = n().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @VisibleForTesting
    public final SharedPreferences n() {
        b();
        g();
        return this.c;
    }
}
