package defpackage;

import android.os.CancellationSignal;
import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import defpackage.mfd;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class eig implements aig {
    public final IndeedAppDatabase_Impl a;
    public final zx3 b;
    public final cig c;

    public eig(IndeedAppDatabase_Impl indeedAppDatabase_Impl) {
        this.a = indeedAppDatabase_Impl;
        this.b = new zx3(indeedAppDatabase_Impl, 1);
        new big(indeedAppDatabase_Impl);
        this.c = new cig(indeedAppDatabase_Impl);
    }

    @Override // defpackage.aig
    public final Object a(List list, oig oigVar) {
        return k13.a.a(this.a, true, new dig(this, list), oigVar);
    }

    @Override // defpackage.aig
    public final Object b(String str, oig oigVar) {
        return k13.a.a(this.a, true, new kda(str, 1, this), oigVar);
    }

    @Override // defpackage.aig
    public final Object c(String str, yo6 yo6Var) {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM urlregistryitem WHERE locale = ?");
        mfdVarA.n(1, str);
        return k13.a.b(this.a, new CancellationSignal(), new lda(this, mfdVarA, 1), yo6Var);
    }
}
