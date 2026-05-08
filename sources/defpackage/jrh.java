package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class jrh {
    public static final ht0<String, Uri> a = new ht0<>();

    public static synchronized Uri a() {
        Uri uri;
        try {
            ht0<String, Uri> ht0Var = a;
            uri = ht0Var.get("com.google.android.gms.measurement");
            if (uri == null) {
                String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
                ht0Var.put("com.google.android.gms.measurement", uri);
            }
        } catch (Throwable th) {
            throw th;
        }
        return uri;
    }
}
