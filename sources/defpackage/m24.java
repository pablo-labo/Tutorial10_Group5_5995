package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.react.devsupport.InspectorFlags;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"StaticFieldLeak"})
public final class m24 {
    public final j24 a;
    public final Context b;
    public final yya c;
    public final OkHttpClient d;
    public final xp1 e;
    public final bza f;
    public final String g;
    public xo7 h;
    public CxxInspectorPackagerConnection i;

    public enum a {
        BUNDLE("bundle"),
        /* JADX INFO: Fake field, exist only in values array */
        MAP("map");

        private final String typeID;

        a(String str) {
            this.typeID = str;
        }

        public final String a() {
            return this.typeID;
        }
    }

    public m24(j24 j24Var, Context context, yya yyaVar) {
        context.getClass();
        yyaVar.getClass();
        this.a = j24Var;
        this.b = context;
        this.c = yyaVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.c(5000L, timeUnit);
        builder.z = Util.b(0L, timeUnit);
        builder.A = Util.b(0L, timeUnit);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        this.d = okHttpClient;
        this.e = new xp1(okHttpClient);
        this.f = new bza(okHttpClient);
        String packageName = context.getPackageName();
        packageName.getClass();
        this.g = packageName;
    }

    public static String a(m24 m24Var, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = m24Var.c.a();
        }
        String str3 = str2;
        j24 j24Var = m24Var.a;
        boolean zC = j24Var.c();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : m24Var.c.d.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (str5.length() != 0) {
                sb.append("&" + str4 + "=" + Uri.encode(str5));
            }
        }
        return String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", Arrays.copyOf(new Object[]{str3, str, a.BUNDLE.a(), Boolean.valueOf(zC), Boolean.valueOf(zC), Boolean.valueOf(j24Var.b.getBoolean("js_minify_debug", false)), m24Var.g, "false", "true"}, 9)) + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + ((Object) sb);
    }

    public final String b() {
        String str = String.format(Locale.US, "android-%s-%s-%s", Arrays.copyOf(new Object[]{this.g, Settings.Secure.getString(this.b.getContentResolver(), "android_id"), InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            try {
                Charset charsetForName = Charset.forName("UTF-8");
                charsetForName.getClass();
                byte[] bytes = str.getBytes(charsetForName);
                bytes.getClass();
                byte[] bArrDigest = messageDigest.digest(bytes);
                return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19])}, 20));
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError("This environment doesn't support UTF-8 encoding", e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError("Could not get standard SHA-256 algorithm", e2);
        }
    }
}
