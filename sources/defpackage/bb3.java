package defpackage;

import android.net.Uri;
import com.indeed.android.myjobs.data.model.Response;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.hf3;
import defpackage.sp7;
import defpackage.ude;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bb3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bb3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ude.c.c0 c0Var;
        ude.a aVar;
        String strB;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                kk1 kk1Var = (kk1) obj3;
                Function2 function2 = (Function2) obj2;
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                if (kk1Var != null) {
                    List<fo7> list = kk1Var.d;
                    ls8Var.c(list.size(), null, new o0(list, i), new ah2(802480018, new fb3(list, kk1Var, function2), true));
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((g4a) obj2).setValue(str);
                ((iba) obj3).p("HOME");
                break;
            case 2:
                juc jucVar = (juc) obj3;
                juc jucVar2 = (juc) obj2;
                je9 je9Var = (je9) obj;
                if (jucVar.element == -1) {
                    jucVar.element = je9Var.b().a;
                }
                jucVar2.element = je9Var.b().b + 1;
                break;
            case 3:
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                j62.a(j62Var, "key", ((KSerializer) obj3).get$$serialDesc());
                j62.a(j62Var, "value", ((KSerializer) obj2).get$$serialDesc());
                break;
            case 4:
                y1e y1eVar = (y1e) obj3;
                iba ibaVar = (iba) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.h(4, "messagingAttachmentBanner", "attachmentSelect", new a3(uw0.a, 15)));
                    ie ieVar = new ie(ibaVar, 6);
                    y1eVar.getClass();
                    u63.Y(ee3.p(y1eVar), null, null, new g2e(y1eVar, uri, ieVar, null), 3);
                }
                break;
            case 5:
                ude.c cVar = (ude.c) obj3;
                ude udeVar = (ude) obj2;
                hf3 hf3Var = (hf3) obj;
                if (!(hf3Var instanceof hf3.c)) {
                    if (hf3Var instanceof hf3.a) {
                        udeVar.j(ude.c.e0.a);
                        udeVar.j(new ude.c.u(((ude.c.c0) cVar).a, false));
                    } else if (!(hf3Var instanceof hf3.b)) {
                        l.g();
                    } else {
                        udeVar.j(ude.c.e0.a);
                    }
                    break;
                } else if (((Response) ((hf3.c) hf3Var).a).getSuccess()) {
                    i = (i6a.h() && (((ude.c.c0) cVar).b instanceof ude.a.C0431a)) ? 1 : 0;
                    udeVar.j(ude.c.e0.a);
                    if (i == 0 && (aVar = (c0Var = (ude.c.c0) cVar).b) != null && (strB = aVar.b()) != null) {
                        udeVar.j(new ude.c.j0(strB, c0Var.b.a()));
                    }
                    if (i != 0) {
                        ude.a aVar2 = ((ude.c.c0) cVar).b;
                        aVar2.getClass();
                        SavedJobsDto savedJobsDto = ((ude.a.C0431a) aVar2).a;
                        String title = savedJobsDto.getTitle();
                        String description = savedJobsDto.getDescription();
                        UserJobStatus selfReportedStatus = savedJobsDto.getSelfReportedStatus();
                        Long lValueOf = selfReportedStatus != null ? Long.valueOf(selfReportedStatus.getTimestamp()) : null;
                        udeVar.i();
                        vde vdeVarA = vde.a(udeVar.i(), null, false, false, null, null, null, null, null, true, title, description, lValueOf, 255);
                        gse gseVar = udeVar.b;
                        gseVar.getClass();
                        gseVar.m(null, vdeVarA);
                    }
                    udeVar.j(new ude.c.u(((ude.c.c0) cVar).a, false));
                } else {
                    udeVar.j(ude.c.e0.a);
                    udeVar.j(new ude.c.u(((ude.c.c0) cVar).a, false));
                }
                break;
            case 6:
                ((String) obj).getClass();
                ((Function1) obj3).invoke((zie) obj2);
                break;
            case 7:
                zrd zrdVar = (zrd) obj3;
                e13 e13Var = (e13) obj2;
                dvf dvfVar = csd.a;
                zrdVar.getClass();
                e13Var.getClass();
                u63.Y(e13Var, null, null, new bsd(zrdVar, null), 3);
                break;
            default:
                s7g s7gVar = (s7g) obj3;
                ((Long) obj).getClass();
                float f = s7gVar.e;
                s7gVar.e = 0.0f;
                ((Function1) obj2).invoke(Float.valueOf(f));
                break;
        }
        return j6g.a;
    }
}
