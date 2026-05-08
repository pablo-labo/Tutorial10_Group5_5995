package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import defpackage.lx5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gv2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        p2e p2eVarB;
        int i = this.a;
        Object obj2 = null;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return ConversationDao_Impl.findById$lambda$4("SELECT * FROM conversationrecord WHERE id = ?", (String) obj4, (ConversationDao_Impl) obj3, (zhd) obj);
            case 1:
                e13 e13Var = (e13) obj4;
                ss8 ss8Var = (ss8) obj3;
                if (((j6g) ((jz2) obj).a()) != null) {
                    u63.Y(e13Var, null, null, new ux2(ss8Var, null), 3);
                }
                return j6g.a;
            case 2:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("source", (String) obj4);
                ((Function1) obj3).invoke(bVar);
                return j6g.a;
            case 3:
                j4e j4eVar = (j4e) obj4;
                Context context = (Context) obj3;
                wcf wcfVar = (wcf) obj;
                wcfVar.a();
                p3a<xcf> p3aVar = wcfVar.a;
                fdf fdfVar = fdf.b;
                boolean zI = j4eVar.i();
                la laVar = new la(j4eVar, 25);
                Resources resources = context.getResources();
                int i2 = 7;
                zi ziVar = new zi(i2, laVar, obj2);
                if (zI) {
                    p3aVar.g(new edf(fdfVar.c(), fdfVar.e(resources), fdfVar.a(), ziVar));
                }
                fdf fdfVar2 = fdf.d;
                p4e p4eVar = j4eVar.a;
                ArrayList arrayListJ = p4eVar.j(j4eVar.k());
                if (arrayListJ.isEmpty()) {
                    z = true;
                } else {
                    int size = arrayListJ.size();
                    z = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        uzd uzdVar = (uzd) arrayListJ.get(i3);
                        le0 text = uzdVar.getText();
                        if (text.b.length() == 0 || ((p2eVarB = p4eVar.b().b(uzdVar.i())) != null && Math.abs(p2eVarB.a.b - p2eVarB.b.b) == text.b.length())) {
                        }
                    }
                    z = true;
                }
                ig igVar = new ig(j4eVar, 22);
                vv vvVar = new vv(j4eVar, 23);
                Resources resources2 = context.getResources();
                zi ziVar2 = new zi(i2, vvVar, igVar);
                if (!z) {
                    p3aVar.g(new edf(fdfVar2.c(), fdfVar2.e(resources2), fdfVar2.a(), ziVar2));
                }
                wcfVar.a();
                return j6g.a;
            case 4:
                Function1 function1 = (Function1) obj3;
                String str = (String) obj;
                str.getClass();
                Iterator it = ((List) obj4).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (wl7.b(((zie) next).a, str)) {
                            obj2 = next;
                        }
                    }
                }
                zie zieVar = (zie) obj2;
                if (zieVar == null) {
                    zieVar = new zie(null, null, null, null, false, null, null, null, null, null, 1023);
                }
                function1.invoke(zieVar);
                return j6g.a;
            default:
                csf csfVar = (csf) obj4;
                csf<?> csfVar2 = (csf) obj3;
                csfVar.j.add(csfVar2);
                return new hsf(csfVar, csfVar2);
        }
    }
}
