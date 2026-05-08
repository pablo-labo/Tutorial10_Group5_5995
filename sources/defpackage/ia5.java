package defpackage;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.ka5;
import expo.modules.filesystem.FileSystemDirectory;
import expo.modules.filesystem.FileSystemFile;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"WrongConstant"})
public final class ia5 implements ik0<ja5, ka5> {
    public final sx9 a;

    public ia5(sx9 sx9Var) {
        sx9Var.getClass();
        this.a = sx9Var;
    }

    @Override // defpackage.ik0
    public final Intent a(wi0 wi0Var, Serializable serializable) {
        Intent intent;
        ja5 ja5Var = (ja5) serializable;
        ja5Var.getClass();
        if (ja5Var.c() == eab.a) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            String strB = ja5Var.b();
            if (strB == null) {
                strB = "*/*";
            }
            intent.setType(strB);
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        }
        intent.putExtra("android.provider.extra.INITIAL_URI", ja5Var.a());
        return intent;
    }

    @Override // defpackage.ik0
    public final ka5 b(Serializable serializable, int i, Intent intent) {
        ja5 ja5Var = (ja5) serializable;
        if (i == 0 || intent == null) {
            return ka5.a.a;
        }
        Uri data = intent.getData();
        int flags = intent.getFlags() & 3;
        if (data != null) {
            ReactApplicationContext reactApplicationContextD = this.a.b().d();
            if (reactApplicationContextD == null) {
                l5.q("React Application Context is null");
                return null;
            }
            ContentResolver contentResolver = reactApplicationContextD.getContentResolver();
            contentResolver.getClass();
            contentResolver.takePersistableUriPermission(data, flags);
        }
        int iOrdinal = ja5Var.c().ordinal();
        if (iOrdinal == 0) {
            if (data == null) {
                data = Uri.EMPTY;
            }
            data.getClass();
            return new ka5.b(new FileSystemFile(data));
        }
        if (iOrdinal != 1) {
            l.g();
            return null;
        }
        if (data == null) {
            data = Uri.EMPTY;
        }
        data.getClass();
        return new ka5.b(new FileSystemDirectory(data));
    }
}
