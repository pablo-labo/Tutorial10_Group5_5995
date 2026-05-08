package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzw;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class yei extends j3i {
    public static final String[] V = {"firebase_", "google_", "ga_"};
    public static final String[] W = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public Integer f;

    public yei(i0i i0iVar) {
        super(i0iVar);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static boolean J(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean K(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean L(String str) {
        fib.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean Q(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean R(String str, String[] strArr) {
        fib.i(strArr);
        for (String str2 : strArr) {
            if (f0(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean U(Context context) {
        ServiceInfo serviceInfo;
        fib.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static ArrayList<Bundle> X(List<zzw> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzw zzwVar : list) {
            Bundle bundle = new Bundle();
            String str = zzwVar.a;
            zzao zzaoVar = zzwVar.Z;
            zzao zzaoVar2 = zzwVar.V;
            bundle.putString("app_id", str);
            bundle.putString("origin", zzwVar.b);
            bundle.putLong("creation_timestamp", zzwVar.d);
            bundle.putString("name", zzwVar.c.b);
            mxg.g(bundle, zzwVar.c.s0());
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, zzwVar.e);
            String str2 = zzwVar.f;
            if (str2 != null) {
                bundle.putString("trigger_event_name", str2);
            }
            if (zzaoVar2 != null) {
                bundle.putString("timed_out_event_name", zzaoVar2.a);
                zzan zzanVar = zzaoVar2.b;
                if (zzanVar != null) {
                    bundle.putBundle("timed_out_event_params", zzanVar.s0());
                }
            }
            bundle.putLong("trigger_timeout", zzwVar.W);
            zzao zzaoVar3 = zzwVar.X;
            if (zzaoVar3 != null) {
                bundle.putString("triggered_event_name", zzaoVar3.a);
                zzan zzanVar2 = zzwVar.X.b;
                if (zzanVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzanVar2.s0());
                }
            }
            bundle.putLong("triggered_timestamp", zzwVar.c.c);
            bundle.putLong("time_to_live", zzwVar.Y);
            if (zzaoVar != null) {
                bundle.putString("expired_event_name", zzaoVar.a);
                zzan zzanVar3 = zzaoVar.b;
                if (zzanVar3 != null) {
                    bundle.putBundle("expired_event_params", zzanVar3.s0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean Y(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static Bundle[] b0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean f0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean h0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long k(zzan zzanVar) {
        long length = 0;
        if (zzanVar == null) {
            return 0L;
        }
        Bundle bundle = zzanVar.a;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) obj).length;
            }
        }
        return length;
    }

    public static MessageDigest k0() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @VisibleForTesting
    public static long l(byte[] bArr) {
        fib.i(bArr);
        long j = 0;
        if (bArr.length <= 0) {
            bg.h();
            return 0L;
        }
        int i = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static Bundle p(List<zzkq> list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            for (zzkq zzkqVar : list) {
                String str = zzkqVar.e;
                String str2 = zzkqVar.b;
                if (str != null) {
                    bundle.putString(str2, str);
                } else {
                    Long l = zzkqVar.d;
                    if (l != null) {
                        bundle.putLong(str2, l.longValue());
                    } else {
                        Double d = zzkqVar.V;
                        if (d != null) {
                            bundle.putDouble(str2, d.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static String t(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static void u(Bundle bundle, int i, String str, Object obj) {
        if (Y(i, bundle)) {
            bundle.putString("_ev", t(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public final void A(String str, gmi gmiVar) {
        try {
            gmiVar.a(l6.e("r", str));
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning string value to wrapper");
        }
    }

    public final void B(pwh pwhVar, int i) {
        Bundle bundle = pwhVar.d;
        int i2 = 0;
        for (String str : new TreeSet(bundle.keySet())) {
            if (L(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                zzr().W.c(sb.toString(), d().l(pwhVar.a), d().j(bundle));
                Y(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void C(gmi gmiVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning int value to wrapper");
        }
    }

    public final void D(gmi gmiVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning long value to wrapper");
        }
    }

    public final void E(gmi gmiVar, Bundle bundle) {
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning bundle value to wrapper");
        }
    }

    public final void F(gmi gmiVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning bundle list to wrapper");
        }
    }

    public final void G(gmi gmiVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning boolean value to wrapper");
        }
    }

    public final void H(gmi gmiVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning byte array to wrapper");
        }
    }

    public final boolean I(int i, String str, String str2) {
        if (str2 == null) {
            zzr().W.a(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzr().W.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    @SuppressLint({"ApplySharedPref"})
    public final boolean M(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = this.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong(NdkCrashLog.TIMESTAMP_KEY_NAME, Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (Exception e) {
            this.zzr().f.a(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean N(String str, String str2) {
        if (str2 == null) {
            zzr().W.a(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzr().W.a(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzr().W.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzr().W.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean O(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (strValueOf.codePointCount(0, strValueOf.length()) <= i) {
            return true;
        }
        zzr().Z.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
        return false;
    }

    public final boolean P(String str, String str2, String str3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        i0i i0iVar = this.a;
        if (zIsEmpty) {
            lgi.a();
            if (i0iVar.V.k(null, djh.n0) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (!TextUtils.isEmpty(str2)) {
                fib.i(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                zzr().W.a(ewh.l(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            if (TextUtils.isEmpty(i0iVar.b)) {
                zzr().W.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        } else {
            fib.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(i0iVar.b)) {
                zzr().W.a(ewh.l(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
        }
        return false;
    }

    public final boolean S(String[] strArr, String str, String str2) {
        if (str2 == null) {
            zzr().W.a(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(V[i])) {
                zzr().W.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !R(str2, strArr)) {
            return true;
        }
        zzr().W.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final int V(Object obj, String str) {
        return "_ldl".equals(str) ? O("user property referrer", str, m0(str), obj) : O("user property", str, m0(str), obj) ? 0 : 7;
    }

    public final int W(String str) {
        if (!a0("event", str)) {
            return 2;
        }
        if (S(pg8.z0, "event", str)) {
            return !I(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final boolean Z(String str, int i, Object obj) {
        int size;
        if (obj instanceof Parcelable[]) {
            size = ((Parcelable[]) obj).length;
        } else {
            if (!(obj instanceof ArrayList)) {
                return true;
            }
            size = ((ArrayList) obj).size();
        }
        if (size <= i) {
            return true;
        }
        zzr().Z.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str, Integer.valueOf(size));
        return false;
    }

    public final boolean a0(String str, String str2) {
        if (str2 == null) {
            zzr().W.a(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzr().W.a(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzr().W.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzr().W.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final int c0(String str) {
        if (!a0("user property", str)) {
            return 6;
        }
        if (S(ak2.f0, "user property", str)) {
            return !I(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object d0(Object obj, String str) {
        return "_ldl".equals(str) ? r(m0(str), obj, true, false) : r(m0(str), obj, false, false);
    }

    @VisibleForTesting
    public final boolean e0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = a5h.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.zzr().f.a(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            this.zzr().f.a(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean g0(String str) {
        b();
        if (a5h.a(this.a.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzr().b0.a(str, "Permission not granted");
        return false;
    }

    @Override // defpackage.j3i
    public final boolean i() {
        return true;
    }

    public final long i0() {
        long andIncrement;
        long j;
        long j2 = this.d.get();
        AtomicLong atomicLong = this.d;
        if (j2 != 0) {
            synchronized (atomicLong) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            this.a.c0.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List<java.lang.String> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yei.j(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final SecureRandom j0() {
        b();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final int l0() {
        if (this.f == null) {
            oa6 oa6Var = oa6.b;
            Context context = this.a.a;
            oa6Var.getClass();
            AtomicBoolean atomicBoolean = bb6.a;
            int i = 0;
            try {
                i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f = Integer.valueOf(i / 1000);
        }
        return this.f.intValue();
    }

    public final Bundle m(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter2 = uri.getQueryParameter("utm_campaign");
                queryParameter3 = uri.getQueryParameter("utm_source");
                queryParameter4 = uri.getQueryParameter("utm_medium");
                queryParameter = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("campaign", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("source", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("medium", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gclid", queryParameter);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("content", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("aclid", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("cp1", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.zzr().X.a(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final int m0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : (this.a.V.k(null, djh.k0) && "_lgclid".equals(str)) ? 100 : 36;
    }

    public final Bundle n(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objS = s(bundle.get(str), str);
                if (objS == null) {
                    zzr().Z.a(d().o(str), "Param value can't be null");
                } else {
                    x(bundle2, str, objS);
                }
            }
        }
        return bundle2;
    }

    public final String n0() {
        byte[] bArr = new byte[16];
        j0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle o(java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List<java.lang.String> r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yei.o(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    public final zzao q(String str, String str2, Bundle bundle, String str3, long j) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (W(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            return new zzao(str2, new zzan(n(o(str, str2, bundle2, Collections.singletonList("_o"), false, false))), str3, j);
        }
        zzr().f.a(d().p(str2), "Invalid conditional property event name");
        o6.h();
        return null;
    }

    public final Object r(int i, Object obj, boolean z, boolean z2) {
        if (obj != null) {
            if ((obj instanceof Long) || (obj instanceof Double)) {
                return obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return t(i, String.valueOf(obj), z);
            }
            oci.a();
            i0i i0iVar = this.a;
            if (i0iVar.V.k(null, djh.G0) && i0iVar.V.k(null, djh.F0) && z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle bundleN = n((Bundle) parcelable);
                        if (!bundleN.isEmpty()) {
                            arrayList.add(bundleN);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    public final Object s(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int i = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        if (zEquals) {
            return r(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, obj, true, true);
        }
        if (!h0(str)) {
            i = 100;
        }
        return r(i, obj, false, true);
    }

    public final void v(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            zzr().X.a(Long.valueOf(j2), "Params already contained engagement");
        }
        bundle.putLong("_et", j + j2);
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                e().x(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void x(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        oci.a();
        i0i i0iVar = this.a;
        if (i0iVar.V.k(null, djh.G0) && i0iVar.V.k(null, djh.F0) && (obj instanceof Bundle[])) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzr().Z.c("Not putting event parameter. Invalid value type. name, type", d().o(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void y(String str, int i, int i2, String str2) {
        Bundle bundle = new Bundle();
        Y(i, bundle);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        i0i i0iVar = this.a;
        i0iVar.getClass();
        m4i m4iVar = i0iVar.e0;
        i0i.h(m4iVar);
        m4iVar.r("auto", "_err", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r17, java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yei.z(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }
}
