package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes.dex */
public final class mtf extends m84 {
    public final ReactApplicationContext a;
    public final Uri b;

    public mtf(ReactApplicationContext reactApplicationContext, Uri uri) {
        this.a = reactApplicationContext;
        this.b = uri;
    }

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
        Uri uriCreateDocument;
        ReactApplicationContext reactApplicationContext = this.a;
        try {
            uriCreateDocument = DocumentsContract.createDocument(reactApplicationContext.getContentResolver(), this.b, "vnd.android.document/directory", str);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new mtf(reactApplicationContext, uriCreateDocument);
        }
        return null;
    }

    @Override // defpackage.m84
    public final m84 d(String str, String str2) {
        Uri uriCreateDocument;
        ReactApplicationContext reactApplicationContext = this.a;
        try {
            uriCreateDocument = DocumentsContract.createDocument(reactApplicationContext.getContentResolver(), this.b, str, str2);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new mtf(reactApplicationContext, uriCreateDocument);
        }
        return null;
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[LOOP:1: B:25:0x006d->B:27:0x0070, LOOP_END] */
    @Override // defpackage.m84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.m84[] o() {
        /*
            r11 = this;
            com.facebook.react.bridge.ReactApplicationContext r1 = r11.a
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r11 = r11.b
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r11)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r11, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
        L24:
            boolean r0 = r10.moveToNext()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r0 == 0) goto L3c
            java.lang.String r0 = r10.getString(r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r11, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r8.add(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L24
        L36:
            r0 = move-exception
            r11 = r0
            goto L7d
        L39:
            r0 = move-exception
            r11 = r0
            goto L43
        L3c:
            defpackage.s40.h(r10)     // Catch: java.lang.RuntimeException -> L40 java.lang.Exception -> L62
            goto L62
        L40:
            r0 = move-exception
            r11 = r0
            throw r11
        L43:
            java.lang.String r0 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r2.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "Failed query: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            r2.append(r11)     // Catch: java.lang.Throwable -> L36
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.w(r0, r11)     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L62
            defpackage.s40.h(r10)     // Catch: java.lang.RuntimeException -> L5f java.lang.Exception -> L62
            goto L62
        L5f:
            r0 = move-exception
            r11 = r0
            throw r11
        L62:
            android.net.Uri[] r11 = new android.net.Uri[r9]
            java.lang.Object[] r11 = r8.toArray(r11)
            android.net.Uri[] r11 = (android.net.Uri[]) r11
            int r0 = r11.length
            m84[] r0 = new defpackage.m84[r0]
        L6d:
            int r2 = r11.length
            if (r9 >= r2) goto L7c
            mtf r2 = new mtf
            r3 = r11[r9]
            r2.<init>(r1, r3)
            r0[r9] = r2
            int r9 = r9 + 1
            goto L6d
        L7c:
            return r0
        L7d:
            if (r10 == 0) goto L86
            defpackage.s40.h(r10)     // Catch: java.lang.RuntimeException -> L83 java.lang.Exception -> L86
            goto L86
        L83:
            r0 = move-exception
            r11 = r0
            throw r11
        L86:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtf.o():m84[]");
    }
}
