package defpackage;

import com.indeed.android.rnviewjob.RNViewJobModule;
import defpackage.lx5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cpb implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cpb(int i, String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.b = i;
        this.e = str3;
        this.f = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Serializable serializable = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                e5g e5gVar = (e5g) obj4;
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                e5gVar.getClass();
                y3bVar.a.add(new kve("tk", e5gVar.toString()));
                y3bVar.a(this.b, "chunk_index");
                y3bVar.a(((ArrayList) serializable).size(), "chunk_total");
                y3bVar.b("screen_name", ((uob) obj3).c());
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    y3bVar.a(r0.getValue(), ((vn1) it.next()).a().name());
                }
                return j6g.a;
            default:
                return RNViewJobModule.logVJUnmount$lambda$0((String) obj4, (String) serializable, this.b, (String) obj3, (String) obj2, (lx5.b) obj);
        }
    }

    public /* synthetic */ cpb(e5g e5gVar, int i, ArrayList arrayList, uob uobVar, List list) {
        this.c = e5gVar;
        this.b = i;
        this.d = arrayList;
        this.e = uobVar;
        this.f = list;
    }
}
