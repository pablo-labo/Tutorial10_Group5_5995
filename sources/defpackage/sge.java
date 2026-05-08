package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes.dex */
public final class sge extends m84 {
    public ReactApplicationContext a;
    public Uri b;

    @Override // defpackage.m84
    public final boolean a() {
        ReactApplicationContext reactApplicationContext = this.a;
        Uri uri = this.b;
        return reactApplicationContext.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(o84.e(reactApplicationContext, uri, "mime_type"));
    }

    @Override // defpackage.m84
    public final boolean b() {
        return o84.a(this.a, this.b);
    }

    @Override // defpackage.m84
    public final m84 c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.m84
    public final m84 d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.m84
    public final boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.a.getContentResolver(), this.b);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.m84
    public final boolean f() {
        return o84.c(this.a, this.b);
    }

    @Override // defpackage.m84
    public final String h() {
        return o84.e(this.a, this.b, "_display_name");
    }

    @Override // defpackage.m84
    public final String i() throws Throwable {
        String strE = o84.e(this.a, this.b, "mime_type");
        if ("vnd.android.document/directory".equals(strE)) {
            return null;
        }
        return strE;
    }

    @Override // defpackage.m84
    public final Uri j() {
        return this.b;
    }

    @Override // defpackage.m84
    public final boolean k() {
        return "vnd.android.document/directory".equals(o84.e(this.a, this.b, "mime_type"));
    }

    @Override // defpackage.m84
    public final boolean l() throws Throwable {
        String strE = o84.e(this.a, this.b, "mime_type");
        return ("vnd.android.document/directory".equals(strE) || TextUtils.isEmpty(strE)) ? false : true;
    }

    @Override // defpackage.m84
    public final long m() {
        return o84.d(this.a, this.b, "last_modified", 0L);
    }

    @Override // defpackage.m84
    public final long n() {
        return o84.d(this.a, this.b, "_size", 0L);
    }

    @Override // defpackage.m84
    public final m84[] o() {
        throw new UnsupportedOperationException();
    }
}
