package defpackage;

import com.indeed.android.myjobs.data.model.dto.ConversationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import defpackage.ude;
import defpackage.ym7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mx2 implements Function1 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mx2(InvitedJobDto invitedJobDto, e13 e13Var, ude udeVar, String str, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, hw9 hw9Var) {
        this.c = invitedJobDto;
        this.d = e13Var;
        this.e = udeVar;
        this.b = str;
        this.f = g4aVar;
        this.V = g4aVar2;
        this.W = g4aVar3;
        this.X = g4aVar4;
        this.Y = hw9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String conversationId;
        int i = this.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.W;
        Object obj5 = this.V;
        Object obj6 = this.f;
        String str = this.b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj9;
                gu5 gu5Var = (gu5) obj2;
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                ls8.e(ls8Var, "responsive_banner", new ah2(529814038, new r00(2, (i7d) obj8, (f7d) obj7), true), 2);
                int i2 = 0;
                ls8Var.c(list.size(), new vx2(new fn0(3, (byte) 0), list), new wx2(list, 0), new ah2(2039820996, new xx2(list, list, (jta) obj6, (Function1) obj5, (wu5) obj3, (Function1) obj4), true));
                if (str != null) {
                    ls8.e(ls8Var, null, new ah2(946920241, new ox2(i2, str, gu5Var), true), 3);
                }
                break;
            default:
                InvitedJobDto invitedJobDto = (InvitedJobDto) obj9;
                e13 e13Var = (e13) obj8;
                ude udeVar = (ude) obj7;
                g4a g4aVar = (g4a) obj5;
                g4a g4aVar2 = (g4a) obj4;
                g4a g4aVar3 = (g4a) obj3;
                hw9 hw9Var = (hw9) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((g4a) obj6).setValue(null);
                if (zBooleanValue) {
                    String employerName = invitedJobDto.getJob().getEmployerName();
                    String str2 = "";
                    if (employerName == null) {
                        employerName = "";
                    }
                    g4aVar.setValue(employerName);
                    ConversationDto conversation = invitedJobDto.getConversation();
                    if (conversation != null && (conversationId = conversation.getConversationId()) != null) {
                        str2 = conversationId;
                    }
                    g4aVar2.setValue(str2);
                    g4aVar3.setValue(invitedJobDto.getJob().getKey());
                    u63.Y(e13Var, null, null, new ym7.h(hw9Var, null), 3);
                } else {
                    udeVar.m(new ude.c.x(str));
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ mx2(List list, String str, i7d i7dVar, f7d f7dVar, jta jtaVar, Function1 function1, wu5 wu5Var, Function1 function12, gu5 gu5Var) {
        this.c = list;
        this.b = str;
        this.d = i7dVar;
        this.e = f7dVar;
        this.f = jtaVar;
        this.V = function1;
        this.X = wu5Var;
        this.W = function12;
        this.Y = gu5Var;
    }
}
