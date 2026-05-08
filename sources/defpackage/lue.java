package defpackage;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class lue extends x09<InputStream> {
    public static final UriMatcher d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // defpackage.ke3
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.x09
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // defpackage.x09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.content.ContentResolver r3, android.net.Uri r4) throws java.io.FileNotFoundException {
        /*
            r2 = this;
            android.content.UriMatcher r2 = defpackage.lue.d
            int r2 = r2.match(r4)
            r0 = 1
            if (r2 == r0) goto L19
            r1 = 3
            if (r2 == r1) goto L14
            r1 = 5
            if (r2 == r1) goto L19
            java.io.InputStream r2 = r3.openInputStream(r4)
            goto L23
        L14:
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r3, r4, r0)
            goto L23
        L19:
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.lookupContact(r3, r4)
            if (r2 == 0) goto L32
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r3, r2, r0)
        L23:
            if (r2 == 0) goto L26
            return r2
        L26:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "InputStream is null for "
            java.lang.String r3 = defpackage.p6.d(r4, r3)
            r2.<init>(r3)
            throw r2
        L32:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "Contact cannot be found"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lue.f(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }
}
