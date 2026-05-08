package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class mte {
    public static final mte c;
    public final Object a;
    public final Object b;

    static {
        Object obj = null;
        c = new mte(obj, obj);
    }

    public mte(Uri uri) {
        this.a = uri;
        this.b = "";
    }

    public static mte a(mte mteVar, tia tiaVar, mif mifVar, int i) {
        sl8 sl8Var = tiaVar;
        if ((i & 1) != 0) {
            sl8Var = (sl8) mteVar.a;
        }
        if ((i & 2) != 0) {
            mifVar = (mif) mteVar.b;
        }
        return new mte(sl8Var, mifVar);
    }

    public lrh b(long j, String str) {
        Object obj = hrh.f;
        return new lrh(this, str, Long.valueOf(j));
    }

    public hsh c(String str, boolean z) {
        Object obj = hrh.f;
        return new hsh(this, str, Boolean.valueOf(z));
    }

    public jsh d(String str, String str2) {
        Object obj = hrh.f;
        return new jsh(this, str, str2);
    }

    public /* synthetic */ mte(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
