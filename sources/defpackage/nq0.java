package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nq0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String string = context.getString(R.string.Older);
                    string.getClass();
                    qq0.f(string, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                gu5 gu5Var = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h82.a(gu5Var, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
            case 2:
                ConversationRecord conversationRecord = (ConversationRecord) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    by2.e(conversationRecord.getFolder(), bVar3, 0);
                } else {
                    bVar3.D();
                }
                break;
            default:
                o97 o97Var = (o97) obj4;
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strI = ak2.I(R.string.resume_preview_screen_header, bVar4);
                    tjf tjfVarA = tjf.a(o97Var.j.f, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                    Object objV = bVar4.v();
                    if (objV == b.a.a) {
                        objV = new he(13);
                        bVar4.p(objV);
                    }
                    cif.b(strI, b5e.b(e.a.b, false, (Function1) objV), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar4, 0, 0, 65532);
                } else {
                    bVar4.D();
                }
                break;
        }
        return j6g.a;
    }
}
