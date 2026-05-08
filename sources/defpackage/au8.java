package defpackage;

import android.os.Trace;
import com.bumptech.glide.a;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class au8 implements o96 {
    public boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public au8(nm0 nm0Var, String str, boolean z) {
        this.b = nm0Var;
        this.c = str;
        this.a = z;
    }

    public Object a(qf8 qf8Var, Object obj) {
        qf8Var.getClass();
        return Boolean.valueOf(((nm0) this.b).a((String) this.c, this.a));
    }

    public void b(qf8 qf8Var, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        qf8Var.getClass();
        ((nm0) this.b).i((String) this.c, zBooleanValue);
    }

    @Override // defpackage.o96
    public Object get() {
        if (this.a) {
            r6.g("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(jpf.g("Glide registry"));
        this.a = true;
        try {
            return nyc.a((a) this.b, (ArrayList) this.c);
        } finally {
            this.a = false;
            Trace.endSection();
        }
    }

    public au8(a aVar, ArrayList arrayList, uk0 uk0Var) {
        this.b = aVar;
        this.c = arrayList;
    }
}
