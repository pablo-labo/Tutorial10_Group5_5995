package defpackage;

import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public final class ecc implements g8b {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fcc c;

    public ecc(fcc fccVar, String str, String str2) {
        this.c = fccVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.g8b
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return false;
        }
        int length = iArr.length;
        fcc fccVar = this.c;
        if (length <= 0 || iArr[0] != 0) {
            Toast.makeText(fccVar.a, this.b, 1).show();
        } else if (fccVar.b != null) {
            fccVar.b(this.a);
        }
        return true;
    }
}
