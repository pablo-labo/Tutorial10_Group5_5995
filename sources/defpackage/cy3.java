package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class cy3 {
    public final IndeedAppDatabase a;

    public cy3(IndeedAppDatabase indeedAppDatabase) {
        this.a = indeedAppDatabase;
    }

    public final Object a(String str, lsc lscVar, rga rgaVar) {
        yx3 yx3VarY = this.a.y();
        String str2 = lscVar.a;
        jud judVar = lscVar.b;
        Object objA = yx3VarY.a(new xx3(str2, str, judVar.a, judVar.b, lscVar.c, System.currentTimeMillis()), rgaVar);
        return objA == g13.a ? objA : j6g.a;
    }
}
