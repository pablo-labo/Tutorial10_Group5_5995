package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class lfe implements ot1 {
    public final String a;

    public lfe(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.ot1
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ot1
    public final boolean b(Uri uri) {
        return this.a.contains(uri.toString());
    }

    @Override // defpackage.ot1
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lfe) {
            return this.a.equals(((lfe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
