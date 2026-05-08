package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class m5b extends q63 {
    public m5b(String str, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        if (str.length() > 0) {
            return;
        }
        l5.q("password should not be empty");
        throw null;
    }
}
