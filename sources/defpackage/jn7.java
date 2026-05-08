package defpackage;

import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$updateRedDotStatus$1", f = "InvitationTabViewModel.kt", l = {297, 297}, m = "invokeSuspend")
public final class jn7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ bn7 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ bn7 a;

        public a(bn7 bn7Var) {
            this.a = bn7Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            List<InvitedJobDto> invitedJobs;
            String upperCase;
            bn7 bn7Var = this.a;
            bn7Var.g0 = (Map) obj;
            EmployerInvitationDto employerInvitationDto = bn7Var.i().a;
            if (employerInvitationDto == null || (invitedJobs = employerInvitationDto.getInvitedJobs()) == null) {
                invitedJobs = zr4.a;
            }
            List<InvitedJobDto> list = invitedJobs;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InvitedJobDto invitedJobDto = (InvitedJobDto) it.next();
                    String status = invitedJobDto.getInvite().getStatus();
                    if (status != null) {
                        upperCase = status.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        upperCase = null;
                    }
                    if (wl7.b(upperCase, "INITIATED") && !bn7Var.g0.containsKey(invitedJobDto.getInvite().getId())) {
                        z = true;
                        break;
                    }
                }
            }
            boolean z2 = z;
            bn7Var.i().getClass();
            an7 an7VarA = an7.a(bn7Var.i(), null, false, null, z2, 0, 23);
            gse gseVar = bn7Var.b;
            gseVar.getClass();
            gseVar.m(null, an7VarA);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn7(bn7 bn7Var, lu2<? super jn7> lu2Var) {
        super(2, lu2Var);
        this.this$0 = bn7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new jn7(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((jn7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (((defpackage.vi5) r6).e(r0, r5) == r4) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r6)
            goto L48
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L17:
            defpackage.r7d.b(r6)
            goto L36
        L1b:
            defpackage.r7d.b(r6)
            bn7 r6 = r5.this$0
            c16 r6 = r6.d0
            j6g r0 = defpackage.j6g.a
            r5.label = r3
            r6.getClass()
            b16 r0 = new b16
            r0.<init>(r6, r1)
            kjd r6 = new kjd
            r6.<init>(r0)
            if (r6 != r4) goto L36
            goto L47
        L36:
            vi5 r6 = (defpackage.vi5) r6
            jn7$a r0 = new jn7$a
            bn7 r1 = r5.this$0
            r0.<init>(r1)
            r5.label = r2
            java.lang.Object r5 = r6.e(r0, r5)
            if (r5 != r4) goto L48
        L47:
            return r4
        L48:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
