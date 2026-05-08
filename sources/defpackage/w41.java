package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.lx5;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w41(yf6 yf6Var, e13 e13Var, g4a g4aVar, hee heeVar, g4a g4aVar2) {
        this.a = 2;
        this.b = yf6Var;
        this.c = e13Var;
        this.e = g4aVar;
        this.d = heeVar;
        this.f = g4aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mif mifVar;
        int i = this.a;
        Object obj2 = null;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj6;
                ux6 ux6Var = (ux6) obj;
                ux6Var.getClass();
                String str = ux6Var.a;
                int length = str.length();
                ((g4a) obj4).setValue(new jhf(str, cr8.c(length, length), 4));
                ((Function1) obj7).invoke(str);
                ((g4a) obj3).setValue(Boolean.FALSE);
                Iterator it = ((List) obj5).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (wl7.b(((g51) next).c, str)) {
                            obj2 = next;
                        }
                    }
                }
                g51 g51Var = (g51) obj2;
                if (g51Var != null && function1 != null) {
                    function1.invoke(g51Var.d);
                }
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", "Applied", "previousAppStatus", (String) obj7);
                bVar.a("newAppStatus", (String) obj6);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", (String) obj5);
                bVar.a("myjobs_isnonIA", String.valueOf(!r5.getIndeedApplyable()));
                bVar.a("entityData", (String) obj3);
                bVar.a("jobKey", ((SavedJobsDto) obj4).getJobkey());
                break;
            case 2:
                ConversationRecord conversationRecord = (ConversationRecord) obj;
                conversationRecord.getClass();
                ((yf6) obj7).a(0);
                ((g4a) obj4).setValue(conversationRecord);
                u63.Y((e13) obj6, null, null, new t57((hee) obj5, (g4a) obj3, null), 3);
                break;
            default:
                roa roaVar = (roa) obj6;
                jhf jhfVar = (jhf) obj5;
                lu8 lu8Var = (lu8) obj4;
                kne kneVar = (kne) obj3;
                ss2 ss2Var = (ss2) obj;
                ss2Var.N1();
                float fG = ((cme) ((p93) obj7).c).g();
                if (fG != 0.0f) {
                    long j = jhfVar.b;
                    int i2 = kjf.c;
                    int iC = roaVar.c((int) (j >> 32));
                    nif nifVarD = lu8Var.d();
                    qtc qtcVar = (nifVarD == null || (mifVar = nifVarD.a) == null) ? new qtc(0.0f, 0.0f, 0.0f, 0.0f) : mifVar.c(iC);
                    float fFloor = (float) Math.floor(ss2Var.t1(2.0f));
                    float f = fFloor < 1.0f ? 1.0f : fFloor;
                    float f2 = f / 2.0f;
                    float f3 = qtcVar.a + f2;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (ss2Var.c() >> 32)) - f2;
                    if (f3 > fIntBitsToFloat) {
                        f3 = fIntBitsToFloat;
                    }
                    if (f3 >= f2) {
                        f2 = f3;
                    }
                    float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                    ss2Var.s1(kneVar, (((long) Float.floatToRawIntBits(qtcVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor2)) << 32), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(qtcVar.d)) & 4294967295L), f, (432 & 64) != 0 ? 1.0f : fG);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ w41(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ w41(Function1 function1, List list, g4a g4aVar, g4a g4aVar2, Function1 function12) {
        this.a = 0;
        this.b = function1;
        this.d = list;
        this.e = g4aVar;
        this.f = g4aVar2;
        this.c = function12;
    }
}
