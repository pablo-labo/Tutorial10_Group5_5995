package defpackage;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;

/* JADX INFO: loaded from: classes3.dex */
public final class pz7 {
    public static final RequestBody$Companion$toRequestBody$2 a(String str) {
        MediaType mediaTypeA;
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType.e.getClass();
        try {
            mediaTypeA = MediaType.Companion.a("text/plain");
        } catch (IllegalArgumentException unused) {
            mediaTypeA = null;
        }
        companion.getClass();
        return RequestBody.Companion.a(str, mediaTypeA);
    }
}
