package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.DraftRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dx implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dx(b5g b5gVar, Function1 function1, g4a g4aVar, g4a g4aVar2) {
        this.a = 0;
        this.b = b5gVar;
        this.c = function1;
        this.d = g4aVar;
        this.e = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                b5g b5gVar = (b5g) obj6;
                Function1 function1 = (Function1) obj5;
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    Integer num = (Integer) g4aVar.getValue();
                    String string = num != null ? num.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    String str = string;
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new ef(1, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function12 = (Function1) objV;
                    String strI = ak2.I(R.string.skill_experience_label, bVar);
                    String strI2 = ak2.I(R.string.skill_experience_label, bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new ex(0, g4aVar);
                        bVar.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    fh8 fh8Var = fh8.e;
                    jyb.a(str, function12, strI, false, strI2, false, null, null, gu5Var, false, null, null, fh8.a(123), null, null, bVar, 100666416, 0, 28384);
                    bVar.q();
                    if (b5gVar == b5g.c) {
                        bVar.L(-1169927728);
                        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-skill", "error-toast", sp7.c.a.c, null, null, 24));
                        boolean zK = bVar.K(function1);
                        Object objV3 = bVar.v();
                        if (zK || objV3 == c0020a) {
                            objV3 = new fx(function1, g4aVar2, g4aVar);
                            bVar.p(objV3);
                        }
                        rg0.a((gu5) objV3, bVar, 0);
                    } else {
                        bVar.L(-1184462667);
                    }
                    bVar.F();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                jy2.a((ConversationRecord) obj6, (DraftRecord) obj5, (tjf) obj4, (e) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                jyg.d((zye) obj6, (String) obj5, (gu5) obj4, (String) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ dx(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
